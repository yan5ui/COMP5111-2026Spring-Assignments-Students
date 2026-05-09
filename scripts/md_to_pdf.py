#!/usr/bin/env python3
# md_to_pdf: cheap markdown->PDF via the markdown + weasyprint libs.
# Usage: scripts/md_to_pdf.py <input.md> <output.pdf>

import sys
from pathlib import Path
import markdown
from weasyprint import HTML, CSS

CSS_TEXT = """
@page { size: A4; margin: 1.8cm 1.8cm 2.0cm 1.8cm; }
body { font-family: "DejaVu Sans", "Helvetica", sans-serif; font-size: 10.5pt;
       line-height: 1.45; color: #1a1a1a; }
h1 { font-size: 19pt; margin-top: 0; }
h2 { font-size: 14pt; margin-top: 1.2em; border-bottom: 1px solid #ccc; padding-bottom: 2pt; }
h3 { font-size: 11.5pt; margin-top: 1em; }
h4 { font-size: 10.8pt; }
p, li { text-align: justify; }
ul, ol { margin: 0.4em 0 0.6em 0; padding-left: 1.5em; }
li { margin-bottom: 2pt; }
pre, code { font-family: "DejaVu Sans Mono", monospace; }
pre { background: #f5f5f5; padding: 8pt 10pt; border-radius: 4pt; font-size: 8.6pt;
      line-height: 1.32; overflow: hidden; white-space: pre-wrap; word-break: break-word;
      page-break-inside: auto; }
code { background: #f5f5f5; padding: 1pt 3pt; font-size: 9pt; border-radius: 2pt; }
pre code { background: transparent; padding: 0; font-size: inherit; }
table { border-collapse: collapse; margin: 0.6em 0; width: 100%; font-size: 9.5pt; }
th, td { border: 1px solid #aaa; padding: 4pt 6pt; text-align: left; vertical-align: top; }
th { background: #efefef; }
blockquote { color: #555; border-left: 3px solid #bbb; padding: 0.2em 0 0.2em 0.8em;
             margin: 0.6em 0; }
hr { border: none; border-top: 1px solid #bbb; margin: 1em 0; }
"""


def main():
    if len(sys.argv) != 3:
        sys.exit("Usage: md_to_pdf.py <input.md> <output.pdf>")
    src = Path(sys.argv[1])
    dst = Path(sys.argv[2])
    md = src.read_text(encoding="utf-8")
    html = markdown.markdown(md, extensions=["fenced_code", "tables", "toc"])
    html_doc = f"""<html><head><meta charset='utf-8'><title>{src.stem}</title></head>
<body>{html}</body></html>"""
    HTML(string=html_doc, base_url=str(src.parent)).write_pdf(
        target=str(dst), stylesheets=[CSS(string=CSS_TEXT)],
    )
    print(f"Wrote {dst}  ({dst.stat().st_size} bytes)")


if __name__ == "__main__":
    main()
