package comp5111.assignment.cut;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

// Task 3: my four refinement tests, one per fault from Task 2.
// Each uses a minimal input so it does not over-cover unrelated code,
// which keeps Ochiai aef low for the non-buggy stmts.
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RefinedAssertions {

    // Fault @ Subject.java:205 (parseToken). Buggy: "a#" -> "a#".
    @Test
    public void refined_test_parseToken_excludesTerminator() {
        String s = comp5111.assignment.cut.Subject.StringAlgorithms
            .parseToken("a#", new char[]{'#'});
        org.junit.Assert.assertEquals("a", s);
    }

    // Fault @ Subject.java:344 (extractIntInStr). Buggy: "1a2" -> 1.
    @Test
    public void refined_test_extractIntInStr_lastDigitRun() {
        int v = comp5111.assignment.cut.Subject.StringAlgorithms
            .extractIntInStr("1a2");
        org.junit.Assert.assertEquals(2, v);
    }

    // Fault @ Subject.java:488 (checkValidDate). Buggy: rejects day=31.
    @Test
    public void refined_test_daysBetweenDates_lastDayIsValid() {
        int d = comp5111.assignment.cut.Subject.DateTimeAlgorithms
            .daysBetweenDates(2024, 1, 31, 2024, 1, 31);
        org.junit.Assert.assertEquals(0, d);
    }

    // Fault @ Subject.java:615 (monAbbr2month). Buggy: "Sep" -> -1.
    @Test
    public void refined_test_monAbbr2month_Sep() {
        int m = comp5111.assignment.cut.Subject.DateTimeAlgorithms
            .monAbbr2month("Sep");
        org.junit.Assert.assertEquals(9, m);
    }
}
