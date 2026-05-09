# Compile my LLM-use reports to PDF. I run it in the texlive Docker
# image so I don't need a host TeX install:
#
#     docker run --rm -v "$(PWD)":/work -w /work texlive/texlive make best
#
# `best` builds both Task 2 and Task 4 PDFs. pdflatex is run twice so
# any internal references resolve.

LATEX  ?= pdflatex
LFLAGS ?= -interaction=nonstopmode -halt-on-error -file-line-error

REPORTS = reports/LLM/Task2_Report reports/LLM/Task4_Report
PDFS    = $(addsuffix .pdf,$(REPORTS))

.PHONY: best clean clean-aux help

help:
	@echo "Targets:"
	@echo "  best       compile reports/LLM/Task2_Report.pdf and Task4_Report.pdf"
	@echo "  clean-aux  remove latex aux/log/out files"
	@echo "  clean      clean-aux + remove the generated PDFs"

best: $(PDFS)

%.pdf: %.tex
	cd $(dir $<) && $(LATEX) $(LFLAGS) $(notdir $<)
	cd $(dir $<) && $(LATEX) $(LFLAGS) $(notdir $<)

clean-aux:
	rm -f reports/LLM/*.aux reports/LLM/*.log reports/LLM/*.out \
	      reports/LLM/*.toc reports/LLM/*.bbl reports/LLM/*.blg \
	      reports/LLM/*.fls reports/LLM/*.fdb_latexmk reports/LLM/*.synctex.gz

clean: clean-aux
	rm -f $(PDFS)
