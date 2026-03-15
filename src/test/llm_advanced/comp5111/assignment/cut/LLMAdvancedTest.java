package comp5111.assignment.cut;

import org.junit.Test;

import static org.junit.Assert.*;

import comp5111.assignment.cut.Subject;
import comp5111.assignment.cut.Subject.StringAlgorithms;
import comp5111.assignment.cut.Subject.DateTimeAlgorithms;
import comp5111.assignment.cut.Subject.GamePlace;

public class LLMAdvancedTest {

    // ---------------- StringAlgorithms.startsWithIgnoreCase ----------------

    @Test
    public void startsWithIgnoreCase_nullStr_returnsFalse() {
        assertFalse(StringAlgorithms.startsWithIgnoreCase(null, "a"));
    }

    @Test
    public void startsWithIgnoreCase_nullPrefix_returnsFalse() {
        assertFalse(StringAlgorithms.startsWithIgnoreCase("abc", null));
    }

    @Test
    public void startsWithIgnoreCase_bothNull_returnsFalse() {
        assertFalse(StringAlgorithms.startsWithIgnoreCase(null, null));
    }

    @Test
    public void startsWithIgnoreCase_strShorterThanPrefix_returnsFalse() {
        assertFalse(StringAlgorithms.startsWithIgnoreCase("ab", "abc"));
    }

    @Test
    public void startsWithIgnoreCase_exactMatchDifferentCase_returnsTrue() {
        assertTrue(StringAlgorithms.startsWithIgnoreCase("AbC", "aBc"));
    }

    @Test
    public void startsWithIgnoreCase_prefixDoesNotMatch_returnsFalse() {
        assertFalse(StringAlgorithms.startsWithIgnoreCase("abc", "abd"));
    }

    // ---------------- StringAlgorithms.trimArrayElements ----------------

    @Test
    public void trimArrayElements_nullArray_returnsEmptyArray() {
        String[] out = StringAlgorithms.trimArrayElements(null);
        assertNotNull(out);
        assertEquals(0, out.length);
    }

    @Test
    public void trimArrayElements_emptyArray_returnsEmptyArray() {
        String[] out = StringAlgorithms.trimArrayElements(new String[0]);
        assertNotNull(out);
        assertEquals(0, out.length);
    }

    @Test
    public void trimArrayElements_trimsElements_preservesNulls_andReturnsNewArray() {
        String[] in = new String[] { " a ", null, "\tb\t", "" };
        String[] out = StringAlgorithms.trimArrayElements(in);

        assertNotNull(out);
        assertEquals(in.length, out.length);
        assertNotSame(in, out);

        assertEquals("a", out[0]);
        assertNull(out[1]);
        assertEquals("b", out[2]);
        assertEquals("", out[3]);
    }

    // ---------------- StringAlgorithms.strToBoolean(String) ----------------

    @Test
    public void strToBoolean_null_returnsNull() {
        assertNull(StringAlgorithms.strToBoolean(null));
    }

    @Test
    public void strToBoolean_trueTokens_caseInsensitive() {
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("y"));
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("T"));
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("on"));
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("YES"));
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("true"));
    }

    @Test
    public void strToBoolean_falseTokens_caseInsensitive() {
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("n"));
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("F"));
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("NO"));
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("off"));
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("false"));
    }

    @Test
    public void strToBoolean_unsupportedToken_returnsNull() {
        assertNull(StringAlgorithms.strToBoolean("maybe"));
        assertNull(StringAlgorithms.strToBoolean(""));
        assertNull(StringAlgorithms.strToBoolean("tru"));
    }

    // ---------------- StringAlgorithms.strToBoolean(String, String, String, String) ----------------

    @Test
    public void strToBooleanCustom_strNull_andNullStringNull_returnsNull() {
        assertNull(StringAlgorithms.strToBoolean(null, "T", "F", null));
    }

    @Test
    public void strToBooleanCustom_strNull_andTrueStringNull_returnsTrue() {
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean(null, null, "F", "N"));
    }

    @Test
    public void strToBooleanCustom_strNull_andFalseStringNull_returnsFalse() {
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean(null, "T", null, "N"));
    }

    @Test
    public void strToBooleanCustom_strEqualsTrueString_returnsTrue() {
        assertEquals(Boolean.TRUE, StringAlgorithms.strToBoolean("YES", "YES", "NO", "NULL"));
    }

    @Test
    public void strToBooleanCustom_strEqualsFalseString_returnsFalse() {
        assertEquals(Boolean.FALSE, StringAlgorithms.strToBoolean("NO", "YES", "NO", "NULL"));
    }

    @Test
    public void strToBooleanCustom_strEqualsNullString_returnsNull() {
        assertNull(StringAlgorithms.strToBoolean("NULL", "YES", "NO", "NULL"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void strToBooleanCustom_strDoesNotMatchAny_throwsIllegalArgumentException() {
        StringAlgorithms.strToBoolean("MAYBE", "YES", "NO", "NULL");
    }

    // ---------------- StringAlgorithms.extractIntInStr ----------------

    @Test
    public void extractIntInStr_null_returns0() {
        assertEquals(0, StringAlgorithms.extractIntInStr(null));
    }

    @Test
    public void extractIntInStr_empty_returns0() {
        assertEquals(0, StringAlgorithms.extractIntInStr(""));
    }

    @Test
    public void extractIntInStr_startsWithNonDigit_returns0() {
        assertEquals(0, StringAlgorithms.extractIntInStr("a"));
        assertEquals(0, StringAlgorithms.extractIntInStr("a123"));
    }

    @Test
    public void extractIntInStr_examples_matchDoc() {
        assertEquals(1234, StringAlgorithms.extractIntInStr("1234"));
        assertEquals(1234, StringAlgorithms.extractIntInStr("1234a5"));
        assertEquals(9, StringAlgorithms.extractIntInStr("9x9"));
    }

    // ---------------- StringAlgorithms.getVersionNo ----------------

    @Test
    public void getVersionNo_null_returnsNull() {
        assertNull(StringAlgorithms.getVersionNo(null));
    }

    @Test
    public void getVersionNo_empty_returnsNull() {
        assertNull(StringAlgorithms.getVersionNo(""));
    }

    @Test
    public void getVersionNo_moreThan4Components_returnsNull() {
        assertNull(StringAlgorithms.getVersionNo("1.2.3.4.5"));
    }

    @Test
    public void getVersionNo_emptySegment_returnsNull() {
        assertNull(StringAlgorithms.getVersionNo("4..2"));
    }

    @Test
    public void getVersionNo_missingTrailingComponents_defaultTo0() {
        assertArrayEquals(new int[] { 4, 0, 0, 0 }, StringAlgorithms.getVersionNo("4"));
        assertArrayEquals(new int[] { 4, 3, 0, 0 }, StringAlgorithms.getVersionNo("4.3"));
        assertArrayEquals(new int[] { 4, 3, 2, 1 }, StringAlgorithms.getVersionNo("4.3.2.1"));
    }

    // ---------------- StringAlgorithms.padLeft ----------------

    @Test
    public void padLeft_nullTreatedAsEmpty_padsToLength() {
        assertEquals("000", StringAlgorithms.padLeft(null, (short) 3, '0'));
    }

    @Test
    public void padLeft_lengthLessOrEqualToStrLength_returnsStrUnchanged() {
        assertEquals("abc", StringAlgorithms.padLeft("abc", (short) 3, '0'));
        assertEquals("abc", StringAlgorithms.padLeft("abc", (short) 2, '0'));
    }

    @Test
    public void padLeft_padsOnLeft_toReachTotalLength() {
        assertEquals("00abc", StringAlgorithms.padLeft("abc", (short) 5, '0'));
    }

    // ---------------- StringAlgorithms.padRight ----------------

    @Test
    public void padRight_nullTreatedAsEmpty_padsToLength() {
        assertEquals("000", StringAlgorithms.padRight(null, (short) 3, '0'));
    }

    @Test
    public void padRight_lengthLessOrEqualToStrLength_returnsStrUnchanged() {
        assertEquals("abc", StringAlgorithms.padRight("abc", (short) 3, '0'));
        assertEquals("abc", StringAlgorithms.padRight("abc", (short) 2, '0'));
    }

    @Test
    public void padRight_padsOnRight_toReachTotalLength() {
        assertEquals("abc00", StringAlgorithms.padRight("abc", (short) 5, '0'));
    }

    // ---------------- StringAlgorithms.parseToken ----------------

    @Test
    public void parseToken_terminatorFound_includesTerminator_examplesMatchDoc() {
        assertEquals("abc,", StringAlgorithms.parseToken("abc,def", new char[] { ',' }));
        assertEquals(",", StringAlgorithms.parseToken(",abc", new char[] { ',' }));
    }

    @Test
    public void parseToken_noTerminatorFound_returnsEntireString() {
        assertEquals("abc", StringAlgorithms.parseToken("abc", new char[] { ',' }));
    }

    // ---------------- DateTimeAlgorithms.calcDaysInMonth ----------------

    @Test
    public void calcDaysInMonth_invalidMonth_returnsMinus1() {
        assertEquals(-1, DateTimeAlgorithms.calcDaysInMonth(2024, 0));
        assertEquals(-1, DateTimeAlgorithms.calcDaysInMonth(2024, 13));
    }

    @Test
    public void calcDaysInMonth_february_leapYear29_nonLeap28() {
        assertEquals(29, DateTimeAlgorithms.calcDaysInMonth(2024, 2));
        assertEquals(28, DateTimeAlgorithms.calcDaysInMonth(2023, 2));
    }

    @Test
    public void calcDaysInMonth_30DayMonths() {
        assertEquals(30, DateTimeAlgorithms.calcDaysInMonth(2023, 4));
        assertEquals(30, DateTimeAlgorithms.calcDaysInMonth(2023, 6));
        assertEquals(30, DateTimeAlgorithms.calcDaysInMonth(2023, 9));
        assertEquals(30, DateTimeAlgorithms.calcDaysInMonth(2023, 11));
    }

    @Test
    public void calcDaysInMonth_31DayMonths() {
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 1));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 3));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 5));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 7));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 8));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 10));
        assertEquals(31, DateTimeAlgorithms.calcDaysInMonth(2023, 12));
    }

    // ---------------- DateTimeAlgorithms.judgeLeapYear ----------------

    @Test
    public void judgeLeapYear_divisibleBy4NotBy100_isLeap() {
        assertTrue(DateTimeAlgorithms.judgeLeapYear(2024));
    }

    @Test
    public void judgeLeapYear_divisibleBy100NotBy400_notLeap() {
        assertFalse(DateTimeAlgorithms.judgeLeapYear(1900));
    }

    @Test
    public void judgeLeapYear_divisibleBy400_isLeap() {
        assertTrue(DateTimeAlgorithms.judgeLeapYear(2000));
    }

    @Test
    public void judgeLeapYear_notDivisibleBy4_notLeap() {
        assertFalse(DateTimeAlgorithms.judgeLeapYear(2023));
    }

    // ---------------- DateTimeAlgorithms.roundSecondToString ----------------

    @Test
    public void roundSecondToString_seconds_under60_usesSecondsUnit() {
        assertEquals("30 S", DateTimeAlgorithms.roundSecondToString(30L));
        assertEquals("0 S", DateTimeAlgorithms.roundSecondToString(0L));
    }

    @Test
    public void roundSecondToString_boundary60_usesMinutesUnit() {
        assertEquals("1 M", DateTimeAlgorithms.roundSecondToString(60L));
    }

    @Test
    public void roundSecondToString_boundary3600_usesHoursUnit() {
        assertEquals("1 H", DateTimeAlgorithms.roundSecondToString(3600L));
    }

    @Test
    public void roundSecondToString_boundaryDay_usesDaysUnit() {
        assertEquals("1 D", DateTimeAlgorithms.roundSecondToString(24L * 3600L));
    }

    @Test
    public void roundSecondToString_boundaryWeek_usesWeeksUnit() {
        assertEquals("1 W", DateTimeAlgorithms.roundSecondToString(7L * 24L * 3600L));
    }

    @Test
    public void roundSecondToString_boundaryYear_usesYearsUnit() {
        assertEquals("1 Y", DateTimeAlgorithms.roundSecondToString(365L * 24L * 3600L));
    }

    // ---------------- DateTimeAlgorithms.dayStr ----------------

    @Test
    public void dayStr_invalidLow_returnsInvalid() {
        assertEquals("(invalid)", DateTimeAlgorithms.dayStr(0));
        assertEquals("(invalid)", DateTimeAlgorithms.dayStr(-1));
    }

    @Test
    public void dayStr_invalidHigh_returnsInvalid() {
        assertEquals("(invalid)", DateTimeAlgorithms.dayStr(32));
    }

    @Test
    public void dayStr_examples_matchDoc() {
        assertEquals("1st", DateTimeAlgorithms.dayStr(1));
        assertEquals("2nd", DateTimeAlgorithms.dayStr(2));
        assertEquals("3rd", DateTimeAlgorithms.dayStr(3));
        assertEquals("4th", DateTimeAlgorithms.dayStr(4));
        assertEquals("11th", DateTimeAlgorithms.dayStr(11));
        assertEquals("21st", DateTimeAlgorithms.dayStr(21));
        assertEquals("31st", DateTimeAlgorithms.dayStr(31));
    }

    @Test
    public void dayStr_teensAreThSuffix_12And13() {
        assertEquals("12th", DateTimeAlgorithms.dayStr(12));
        assertEquals("13th", DateTimeAlgorithms.dayStr(13));
    }

    // ---------------- DateTimeAlgorithms.getQuarter ----------------

    @Test
    public void getQuarter_invalidMonth_returnsMinus1() {
        assertEquals(-1, DateTimeAlgorithms.getQuarter(0));
        assertEquals(-1, DateTimeAlgorithms.getQuarter(13));
    }

    @Test
    public void getQuarter_boundaries_mapCorrectly() {
        assertEquals(1, DateTimeAlgorithms.getQuarter(1));
        assertEquals(1, DateTimeAlgorithms.getQuarter(3));
        assertEquals(2, DateTimeAlgorithms.getQuarter(4));
        assertEquals(2, DateTimeAlgorithms.getQuarter(6));
        assertEquals(3, DateTimeAlgorithms.getQuarter(7));
        assertEquals(3, DateTimeAlgorithms.getQuarter(9));
        assertEquals(4, DateTimeAlgorithms.getQuarter(10));
        assertEquals(4, DateTimeAlgorithms.getQuarter(12));
    }

    // ---------------- DateTimeAlgorithms.month2MonAbbr ----------------

    @Test
    public void month2MonAbbr_allValidMonths_matchDocMapping() {
        assertEquals("Jan", DateTimeAlgorithms.month2MonAbbr(1));
        assertEquals("Feb", DateTimeAlgorithms.month2MonAbbr(2));
        assertEquals("Mar", DateTimeAlgorithms.month2MonAbbr(3));
        assertEquals("Apr", DateTimeAlgorithms.month2MonAbbr(4));
        assertEquals("May", DateTimeAlgorithms.month2MonAbbr(5));
        assertEquals("Jun", DateTimeAlgorithms.month2MonAbbr(6));
        assertEquals("Jul", DateTimeAlgorithms.month2MonAbbr(7));
        assertEquals("Aug", DateTimeAlgorithms.month2MonAbbr(8));
        assertEquals("Sep", DateTimeAlgorithms.month2MonAbbr(9));
        assertEquals("Oct", DateTimeAlgorithms.month2MonAbbr(10));
        assertEquals("Nov", DateTimeAlgorithms.month2MonAbbr(11));
        assertEquals("Dec", DateTimeAlgorithms.month2MonAbbr(12));
    }

    @Test
    public void month2MonAbbr_invalidMonth_returnsInvalid() {
        assertEquals("(invalid)", DateTimeAlgorithms.month2MonAbbr(0));
        assertEquals("(invalid)", DateTimeAlgorithms.month2MonAbbr(13));
        assertEquals("(invalid)", DateTimeAlgorithms.month2MonAbbr(-5));
    }

    // ---------------- GamePlace.isAdjacent ----------------

    @Test
    public void isAdjacent_otherNull_returnsFalse() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(0, 0);
        assertFalse(a.isAdjacent(null));
    }

    @Test
    public void isAdjacent_samePosition_returnsFalse() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(1, 1);
        GamePlace b = outer.new GamePlace(1, 1);
        assertFalse(a.isAdjacent(b));
    }

    @Test
    public void isAdjacent_orthogonallyAdjacent_returnsTrue() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(0, 0);
        assertTrue(a.isAdjacent(outer.new GamePlace(1, 0)));
        assertTrue(a.isAdjacent(outer.new GamePlace(-1, 0)));
        assertTrue(a.isAdjacent(outer.new GamePlace(0, 1)));
        assertTrue(a.isAdjacent(outer.new GamePlace(0, -1)));
    }

    @Test
    public void isAdjacent_diagonalOrFar_returnsFalse() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(0, 0);
        assertFalse(a.isAdjacent(outer.new GamePlace(1, 1)));
        assertFalse(a.isAdjacent(outer.new GamePlace(2, 0)));
    }

    // ---------------- GamePlace.manhattanDistance ----------------

    @Test
    public void manhattanDistance_otherNull_returnsMinus1() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(0, 0);
        assertEquals(-1, a.manhattanDistance(null));
    }

    @Test
    public void manhattanDistance_computesAbsDxPlusAbsDy() {
        Subject outer = new Subject();
        GamePlace a = outer.new GamePlace(0, 0);
        assertEquals(0, a.manhattanDistance(outer.new GamePlace(0, 0)));
        assertEquals(1, a.manhattanDistance(outer.new GamePlace(1, 0)));
        assertEquals(5, a.manhattanDistance(outer.new GamePlace(2, -3)));
        assertEquals(7, a.manhattanDistance(outer.new GamePlace(-4, 3)));
    }
}
