package comp5111.assignment.cut;

import org.junit.Test;

import static org.junit.Assert.*;

public class LLMSimpleTest {

    // ---------- StringAlgorithms.startsWithIgnoreCase ----------

    @Test
    public void testStartsWithIgnoreCase_basicTrueDifferentCase() {
        assertTrue(Subject.StringAlgorithms.startsWithIgnoreCase("HelloWorld", "heLLo"));
    }

    @Test
    public void testStartsWithIgnoreCase_basicFalse() {
        assertFalse(Subject.StringAlgorithms.startsWithIgnoreCase("HelloWorld", "world"));
    }

    @Test
    public void testStartsWithIgnoreCase_prefixEqualsString() {
        assertTrue(Subject.StringAlgorithms.startsWithIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testStartsWithIgnoreCase_emptyPrefix() {
        assertTrue(Subject.StringAlgorithms.startsWithIgnoreCase("abc", ""));
    }

    // ---------- StringAlgorithms.trimArrayElements ----------

    @Test
    public void testTrimArrayElements_trimsEachElement() {
        String[] in = new String[] { " a ", "\tb\t", "c" };
        String[] out = Subject.StringAlgorithms.trimArrayElements(in);
        assertArrayEquals(new String[] { "a", "b", "c" }, out);
        assertEquals("Result array should be same size", in.length, out.length);
    }

    @Test
    public void testTrimArrayElements_emptyArray() {
        String[] in = new String[0];
        String[] out = Subject.StringAlgorithms.trimArrayElements(in);
        assertNotNull(out);
        assertEquals(0, out.length);
    }

    // ---------- StringAlgorithms.strToBoolean(String) ----------

    @Test
    public void testStrToBoolean_supportedTrueTokens() {
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("true"));
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("TRUE"));
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("yes"));
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("on"));
        assertEquals(Boolean.TRUE, Subject.StringAlgorithms.strToBoolean("On"));
    }

    @Test
    public void testStrToBoolean_supportedFalseTokens() {
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("false"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("FALSE"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("no"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("off"));
        assertEquals(Boolean.FALSE, Subject.StringAlgorithms.strToBoolean("Off"));
    }

    @Test
    public void testStrToBoolean_invalidReturnsNull() {
        assertNull(Subject.StringAlgorithms.strToBoolean("maybe"));
        assertNull(Subject.StringAlgorithms.strToBoolean(""));
        assertNull(Subject.StringAlgorithms.strToBoolean("1"));
    }

    // ---------- StringAlgorithms.strToBoolean(String, String, String, String) ----------

    @Test
    public void testStrToBoolean_customMappingTrueFalseNull() {
        assertEquals(Boolean.TRUE,
                Subject.StringAlgorithms.strToBoolean("Y", "Y", "N", "-"));
        assertEquals(Boolean.FALSE,
                Subject.StringAlgorithms.strToBoolean("N", "Y", "N", "-"));
        assertNull(Subject.StringAlgorithms.strToBoolean("-", "Y", "N", "-"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStrToBoolean_customMappingThrowsOnUnexpected() {
        Subject.StringAlgorithms.strToBoolean("X", "Y", "N", "-");
    }

    // ---------- StringAlgorithms.extractIntInStr ----------

    @Test
    public void testExtractIntInStr_nullOrEmptyYieldsZero() {
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr(null));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr(""));
    }

    @Test
    public void testExtractIntInStr_allDigits() {
        assertEquals(1234, Subject.StringAlgorithms.extractIntInStr("1234"));
    }

    @Test
    public void testExtractIntInStr_nonDigitFirstYieldsZero() {
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("a"));
        assertEquals(0, Subject.StringAlgorithms.extractIntInStr("a123"));
    }

    @Test
    public void testExtractIntInStr_stopsAtFirstNonDigitAfterDigits() {
        // NOTE: docstring says "1234a123 -> 123" but actual implementation returns 1234
        assertEquals(123, Subject.StringAlgorithms.extractIntInStr("1234a123"));
        assertEquals(9, Subject.StringAlgorithms.extractIntInStr("9x9"));
    }

    // ---------- StringAlgorithms.getVersionNo ----------

    @Test
    public void testGetVersionNo_singleNumberPaddedToFour() {
        assertArrayEquals(new int[] { 4, 0, 0, 0 }, Subject.StringAlgorithms.getVersionNo("4"));
    }

    @Test
    public void testGetVersionNo_fourParts() {
        assertArrayEquals(new int[] { 4, 3, 2, 1 }, Subject.StringAlgorithms.getVersionNo("4.3.2.1"));
    }

    @Test
    public void testGetVersionNo_tooManyPartsReturnsNull() {
        assertNull(Subject.StringAlgorithms.getVersionNo("4.3.2.1.5"));
    }

    // ---------- StringAlgorithms.padLeft ----------

    @Test
    public void testPadLeft_padsToLength() {
        assertEquals("0007", Subject.StringAlgorithms.padLeft("7", (short) 4, '0'));
    }

    @Test
    public void testPadLeft_noPaddingWhenAlreadyLongEnough() {
        assertEquals("abcd", Subject.StringAlgorithms.padLeft("abcd", (short) 2, 'x'));
    }

    @Test
    public void testPadLeft_exactLengthNoChange() {
        assertEquals("ab", Subject.StringAlgorithms.padLeft("ab", (short) 2, '0'));
    }

    // ---------- StringAlgorithms.parseToken ----------

    @Test
    public void testParseToken_stopsAtTerminator() {
        // NOTE: docstring doesn't clarify if terminator char is included. LLM assumes it's NOT.
        assertEquals("abc", Subject.StringAlgorithms.parseToken("abc,def", new char[] { ',', ';' }));
    }

    @Test
    public void testParseToken_noTerminatorReturnsWholeString() {
        assertEquals("abcdef", Subject.StringAlgorithms.parseToken("abcdef", new char[] { ',', ';' }));
    }

    @Test
    public void testParseToken_terminatorFirstYieldsEmpty() {
        // NOTE: docstring doesn't clarify, LLM expects empty string, actual may return ","
        assertEquals("", Subject.StringAlgorithms.parseToken(",abc", new char[] { ',', ';' }));
    }

    // ---------- DateTimeAlgorithms.calcDaysInMonth ----------

    @Test
    public void testCalcDaysInMonth_invalidMonthReturnsMinusOne() {
        assertEquals(-1, Subject.DateTimeAlgorithms.calcDaysInMonth(2024, 0));
        assertEquals(-1, Subject.DateTimeAlgorithms.calcDaysInMonth(2024, 13));
    }

    @Test
    public void testCalcDaysInMonth_februaryLeapAndNonLeap() {
        assertEquals(29, Subject.DateTimeAlgorithms.calcDaysInMonth(2024, 2));
        assertEquals(28, Subject.DateTimeAlgorithms.calcDaysInMonth(2023, 2));
    }

    @Test
    public void testCalcDaysInMonth_thirtyAndThirtyOneDayMonths() {
        assertEquals(31, Subject.DateTimeAlgorithms.calcDaysInMonth(2023, 1));
        assertEquals(30, Subject.DateTimeAlgorithms.calcDaysInMonth(2023, 4));
        assertEquals(31, Subject.DateTimeAlgorithms.calcDaysInMonth(2023, 12));
    }

    // ---------- DateTimeAlgorithms.judgeLeapYear ----------

    @Test
    public void testJudgeLeapYear_commonRules() {
        assertTrue(Subject.DateTimeAlgorithms.judgeLeapYear(2000));
        assertFalse(Subject.DateTimeAlgorithms.judgeLeapYear(1900));
        assertTrue(Subject.DateTimeAlgorithms.judgeLeapYear(2024));
        assertFalse(Subject.DateTimeAlgorithms.judgeLeapYear(2023));
    }

    // ---------- DateTimeAlgorithms.roundSecondToString ----------

    @Test
    public void testRoundSecondToString_seconds() {
        // NOTE: docstring doesn't specify the output format (e.g., "59 S" vs "59 seconds")
        String s = Subject.DateTimeAlgorithms.roundSecondToString(59L);
        assertNotNull(s);
        assertTrue("Should mention seconds unit", s.toLowerCase().contains("sec") || s.contains("S"));
    }

    @Test
    public void testRoundSecondToString_minutes() {
        String s = Subject.DateTimeAlgorithms.roundSecondToString(60L);
        assertNotNull(s);
        assertTrue("Should mention minutes unit", s.toLowerCase().contains("min") || s.contains("M"));
    }

    @Test
    public void testRoundSecondToString_hours() {
        String s = Subject.DateTimeAlgorithms.roundSecondToString(3600L);
        assertNotNull(s);
        assertTrue("Should mention hour unit", s.toLowerCase().contains("h") || s.contains("H"));
    }

    // ---------- DateTimeAlgorithms.dayStr ----------

    @Test
    public void testDayStr_invalidRange() {
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(0));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.dayStr(32));
    }

    @Test
    public void testDayStr_suffixesTypicalCases() {
        assertEquals("1st", Subject.DateTimeAlgorithms.dayStr(1));
        assertEquals("2nd", Subject.DateTimeAlgorithms.dayStr(2));
        assertEquals("3rd", Subject.DateTimeAlgorithms.dayStr(3));
        assertEquals("4th", Subject.DateTimeAlgorithms.dayStr(4));
    }

    @Test
    public void testDayStr_teensUseTh() {
        assertEquals("11th", Subject.DateTimeAlgorithms.dayStr(11));
        assertEquals("12th", Subject.DateTimeAlgorithms.dayStr(12));
        assertEquals("13th", Subject.DateTimeAlgorithms.dayStr(13));
    }

    @Test
    public void testDayStr_21_22_23Suffixes() {
        assertEquals("21st", Subject.DateTimeAlgorithms.dayStr(21));
        assertEquals("22nd", Subject.DateTimeAlgorithms.dayStr(22));
        assertEquals("23rd", Subject.DateTimeAlgorithms.dayStr(23));
    }

    // ---------- DateTimeAlgorithms.getQuarter ----------

    @Test
    public void testGetQuarter_invalidMonth() {
        assertEquals(-1, Subject.DateTimeAlgorithms.getQuarter(0));
        assertEquals(-1, Subject.DateTimeAlgorithms.getQuarter(13));
    }

    @Test
    public void testGetQuarter_boundaries() {
        assertEquals(1, Subject.DateTimeAlgorithms.getQuarter(1));
        assertEquals(1, Subject.DateTimeAlgorithms.getQuarter(3));
        assertEquals(2, Subject.DateTimeAlgorithms.getQuarter(4));
        assertEquals(2, Subject.DateTimeAlgorithms.getQuarter(6));
        assertEquals(3, Subject.DateTimeAlgorithms.getQuarter(7));
        assertEquals(3, Subject.DateTimeAlgorithms.getQuarter(9));
        assertEquals(4, Subject.DateTimeAlgorithms.getQuarter(10));
        assertEquals(4, Subject.DateTimeAlgorithms.getQuarter(12));
    }

    // ---------- DateTimeAlgorithms.month2MonAbbr ----------

    @Test
    public void testMonth2MonAbbr_invalid() {
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.month2MonAbbr(0));
        assertEquals("(invalid)", Subject.DateTimeAlgorithms.month2MonAbbr(13));
    }

    @Test
    public void testMonth2MonAbbr_validThreeChars() {
        assertEquals("Jan", Subject.DateTimeAlgorithms.month2MonAbbr(1));
        assertEquals("Dec", Subject.DateTimeAlgorithms.month2MonAbbr(12));
    }

    // ---------- GamePlace.isAdjacent ----------

    @Test
    public void testGamePlace_isAdjacentWithNullOtherReturnsFalse() {
        Subject.GamePlace p = new Subject().new GamePlace(0, 0);
        assertFalse(p.isAdjacent(null));
    }

    @Test
    public void testGamePlace_isAdjacentToSelfIsFalse() {
        Subject.GamePlace p = new Subject().new GamePlace(1, 1);
        assertFalse("A place should not be adjacent to itself", p.isAdjacent(p));
    }
}
