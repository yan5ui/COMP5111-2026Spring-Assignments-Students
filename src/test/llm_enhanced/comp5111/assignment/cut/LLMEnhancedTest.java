package comp5111.assignment.cut;

import static org.junit.Assert.*;
import org.junit.Test;

public class LLMEnhancedTest {

    // -------------------- extractIntInStr --------------------

    @Test
    public void testExtractIntInStr_NullAndEmptyAndNonDigitStart() {
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr(null));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr(""));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("a"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr(" a"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("-1"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("+1"));
    }

    @Test
    public void testExtractIntInStr_AllDigitsAndStopsAtFirstNonDigit() {
        assertEquals(1234, Subject.StringAlgorithms.extractIntInStr("1234"));
        assertEquals(1234, Subject.StringAlgorithms.extractIntInStr("1234a123"));
        assertEquals(7, Subject.StringAlgorithms.extractIntInStr("007x"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("0x"));
        assertEquals(9, Subject.StringAlgorithms.extractIntInStr("9-9"));
        assertEquals(1, Subject.StringAlgorithms.extractIntInStr("1 "));
        assertEquals(42, Subject.StringAlgorithms.extractIntInStr("42\tzzz"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("x123"));
    }

    @Test
    public void testExtractIntInStr_LeadingZerosAndSingleDigit() {
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("0"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("00"));
        assertEquals(5, Subject.StringAlgorithms.extractIntInStr("0005"));
        assertEquals(8, Subject.StringAlgorithms.extractIntInStr("8"));
    }

    // -------------------- parseToken --------------------

    @Test
    public void testParseToken_TerminatorFound_IncludesTerminator() {
        assertEquals("abc,", Subject.StringAlgorithms.parseToken("abc,def", new char[]{','}));
        assertEquals(",", Subject.StringAlgorithms.parseToken(",def", new char[]{','}));
        assertEquals("a;", Subject.StringAlgorithms.parseToken("a;bc", new char[]{',', ';'}));
        assertEquals("ab;", Subject.StringAlgorithms.parseToken("ab;cd,ef", new char[]{',', ';'}));
        assertEquals("ab,", Subject.StringAlgorithms.parseToken("ab,cd;ef", new char[]{',', ';'}));
        assertEquals(";", Subject.StringAlgorithms.parseToken(";tail", new char[]{';'}));
    }

    @Test
    public void testParseToken_NoTerminator_ReturnsWholeString() {
        assertEquals("abcdef", Subject.StringAlgorithms.parseToken("abcdef", new char[]{',', ';'}));
        assertEquals("", Subject.StringAlgorithms.parseToken("", new char[]{',', ';'}));
        assertEquals("a", Subject.StringAlgorithms.parseToken("a", new char[]{','}));
        assertEquals("abc", Subject.StringAlgorithms.parseToken("abc", new char[]{}));
    }

    @Test
    public void testParseToken_TerminatorAtEnd() {
        assertEquals("abc,", Subject.StringAlgorithms.parseToken("abc,", new char[]{','}));
        assertEquals("abc;", Subject.StringAlgorithms.parseToken("abc;", new char[]{';'}));
    }

    // -------------------- roundSecondToString --------------------

    @Test
    public void testRoundSecondToString_SecondsUnitBoundariesAndExamples() {
        assertEquals("0 S", Subject.DateTimeAlgorithms.roundSecondToString(0));
        assertEquals("59 S", Subject.DateTimeAlgorithms.roundSecondToString(59));
        assertEquals("1 M", Subject.DateTimeAlgorithms.roundSecondToString(60));
        assertEquals("2 M", Subject.DateTimeAlgorithms.roundSecondToString(90));
    }

    @Test
    public void testRoundSecondToString_MinutesUnitRounding() {
        assertEquals("1 M", Subject.DateTimeAlgorithms.roundSecondToString(61));
        assertEquals("1 M", Subject.DateTimeAlgorithms.roundSecondToString(89));
        assertEquals("2 M", Subject.DateTimeAlgorithms.roundSecondToString(119));
        assertEquals("2 M", Subject.DateTimeAlgorithms.roundSecondToString(120));
        assertEquals("60 M", Subject.DateTimeAlgorithms.roundSecondToString(3599));
    }

    @Test
    public void testRoundSecondToString_HoursDaysWeeksYearsExamplesAndBoundaries() {
        assertEquals("1 H", Subject.DateTimeAlgorithms.roundSecondToString(3600));
        assertEquals("1 D", Subject.DateTimeAlgorithms.roundSecondToString(86400));
        assertEquals("1 W", Subject.DateTimeAlgorithms.roundSecondToString(604800));
        assertEquals("1 Y", Subject.DateTimeAlgorithms.roundSecondToString(31536000));
    }

    @Test
    public void testRoundSecondToString_UnitSelectionLargestApplicable() {
        assertEquals("24 H", Subject.DateTimeAlgorithms.roundSecondToString(86399));
        assertEquals("7 D", Subject.DateTimeAlgorithms.roundSecondToString(604799));
        assertEquals("52 W", Subject.DateTimeAlgorithms.roundSecondToString(31535999));
    }

    // -------------------- dayStr --------------------

    @Test
    public void testDayStr_InvalidValues() {
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(0));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(32));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(-1));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(Integer.MIN_VALUE));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(Integer.MAX_VALUE));
    }

    @Test
    public void testDayStr_SuffixRules_BasicAndTeens() {
        assertEquals("1st", Subject.DateTimeAlgorithms.dayStr(1));
        assertEquals("2nd", Subject.DateTimeAlgorithms.dayStr(2));
        assertEquals("3rd", Subject.DateTimeAlgorithms.dayStr(3));
        assertEquals("4th", Subject.DateTimeAlgorithms.dayStr(4));
        assertEquals("10th", Subject.DateTimeAlgorithms.dayStr(10));
        assertEquals("11th", Subject.DateTimeAlgorithms.dayStr(11));
        assertEquals("12th", Subject.DateTimeAlgorithms.dayStr(12));
        assertEquals("13th", Subject.DateTimeAlgorithms.dayStr(13));
        assertEquals("14th", Subject.DateTimeAlgorithms.dayStr(14));
    }

    @Test
    public void testDayStr_SuffixRules_LastDigitDriven() {
        assertEquals("20th", Subject.DateTimeAlgorithms.dayStr(20));
        assertEquals("21st", Subject.DateTimeAlgorithms.dayStr(21));
        assertEquals("22nd", Subject.DateTimeAlgorithms.dayStr(22));
        assertEquals("23rd", Subject.DateTimeAlgorithms.dayStr(23));
        assertEquals("24th", Subject.DateTimeAlgorithms.dayStr(24));
        assertEquals("30th", Subject.DateTimeAlgorithms.dayStr(30));
        assertEquals("31st", Subject.DateTimeAlgorithms.dayStr(31));
    }

    // -------------------- strToBoolean (4 params) --------------------

    @Test
    public void testStrToBoolean_NonNullStr_ExactMatchesAndCaseSensitive() {
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("Y", "Y", "N", "-"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("N", "Y", "N", "-"));
        assertNull(Subject.StringAlgorithms.strToBoolean("-", "Y", "N", "-"));

        try {
            Subject.StringAlgorithms.strToBoolean("yes", "Y", "N", "-");
            fail("Expected IllegalArgumentException for unmatched non-null str");
        } catch (IllegalArgumentException expected) { }

        try {
            Subject.StringAlgorithms.strToBoolean("y", "Y", "N", "-");
            fail("Expected IllegalArgumentException due to case-sensitive mismatch");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testStrToBoolean_NonNullStr_MatchingAgainstNullTrueFalseStrings() {
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("T", "T", null, null));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("F", null, "F", null));
        assertNull(Subject.StringAlgorithms.strToBoolean("NULL", null, null, "NULL"));
    }

    @Test
    public void testStrToBoolean_NullStr_RulesAndExamples() {
        assertNull(Subject.StringAlgorithms.strToBoolean(null, "Y", "N", null));
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean(null, null, "N", "X"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean(null, "Y", null, "X"));
    }

    @Test
    public void testStrToBoolean_NullStr_AllNonNullStrings_ShouldThrowNPE() {
        try {
            Subject.StringAlgorithms.strToBoolean(null, "Y", "N", "X");
            fail("Expected NullPointerException when str is null and no parameter is null");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testStrToBoolean_NullStr_PriorityOrder() {
        // nullString is checked first: if nullString==null, return null immediately
        assertNull(Subject.StringAlgorithms.strToBoolean(null, null, null, null));
        assertNull(Subject.StringAlgorithms.strToBoolean(null, "T", "F", null));
        // when nullString != null, trueString is checked next
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean(null, null, "F", "X"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean(null, "T", null, "X"));
    }
}
