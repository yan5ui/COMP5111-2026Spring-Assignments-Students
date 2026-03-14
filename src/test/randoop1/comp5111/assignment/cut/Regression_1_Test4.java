package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_1_Test4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2001");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-10-01" + "'", str2, "0010-10-01");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2002");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) 'a', (-2147483648), (int) '4', 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2003");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("52 ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2004");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(143, (int) (byte) 10, 187);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2005");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483648), 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2006");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', (int) ' ', (int) (byte) 0, (-3747));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2007");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2008");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 477218844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477218844 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 10, 100]");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2009");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2010");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(3, 9, 477218588, 366, 187, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=32}", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(100, 97)", "GamePlayer{name='Anonymous Player', score=10}", "1st ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2012");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(142, 41, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2013");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("aaaaaaa2nd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2014");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(18, 143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2015");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(365, 0)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2016");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 1, (int) (byte) 10, (-3747));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2017");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-3747 S", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-3747 S###" + "'", str3, "-3747 S###");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2018");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S4444444", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 S4444444" + "'", str3, "0 S4444444");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2019");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, 96, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2020");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 109);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2021");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(41, 35, (int) (short) 0, (-2147483648), 187, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2022");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2023");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray2);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                30th", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                30th" + "'", str4, "                                                                                                30th");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2024");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "30th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2025");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, -1)", "4th Oct -1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2026");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2027");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(52, 187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2028");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -1)", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2029");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4th Oct -1", "#", "0 S4444444", "3 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2032");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(366, 0, 1, 3, 477218844, (-1));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2033");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-387), 187, 187);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2034");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("          ", "GamePlayer{name='1st', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2035");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2036");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483648), 142);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2037");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='Anonymous Player', score=9}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='0143-01-31', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='0143-01-31', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2039");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("hi!", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2040");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-387), 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2041");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(52, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2042");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(143);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2043");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 41, 109, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2044");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(1, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("4 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2046");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4th Oct -1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4th Oct -1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4th Oct -1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2047");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0000-10-01", "(invalid)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2048");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0004-09-30");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[4, 0, 0, 0]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2049");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-3747 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -3747 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2051");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("31st", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0004-10-31", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 S" + "'", str10, "10 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31st" + "'", str11, "31st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                          0004-10-31" + "'", str12, "                                                                                          0004-10-31");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4 S" + "'", str14, "4 S");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2052");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2053");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) (short) -1, 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2054");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-001-03-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2055");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                                30th");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2056");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2057");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(366);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2058");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0003-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2059");
        char[] charArray1 = null;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2060");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray10, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 10, byteArray10, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(71, byteArray10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2061");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483648), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2062");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(9, 1, 187, 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2063");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477218588, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2064");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2065");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0035-01-01", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-01-01" + "'", str3, "0035-01-01");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2066");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2067");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=31}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2068");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2nd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2069");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2070");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-04-01", "39 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2071");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(365, 0)", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(365, 0)" + "'", str3, "(365, 0)");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2072");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, (-387), 31, 477218588, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2073");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2074");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) '4', (-1));
        gamePlace8.x(31);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2075");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2076");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-2147483648, 9)", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Oct -1", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 S" + "'", str10, "10 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(invalid)" + "'", str12, "(invalid)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(-2147483648, 9)" + "'", str13, "(-2147483648, 9)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st Oct -1" + "'", str14, "1st Oct -1");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2077");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0032-01-01", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2078");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477218844);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2079");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 100, 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2080");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-3747, 100)", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-3747, 100)" + "'", str3, "(-3747, 100)");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2081");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("9th", "4th Oct -1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2082");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2083");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(100, 97)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(100, 97)" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(100, 97)");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2084");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        boolean boolean3 = gamePlayer1.equals((java.lang.Object) (short) -1);
        int int4 = gamePlayer1.getScore();
        gamePlayer1.resetScore();
        java.lang.String str6 = gamePlayer1.getName();
        gamePlayer1.setScore((-2147483648));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Anonymous Player" + "'", str6, "Anonymous Player");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2085");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(31, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2086");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2087");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, (-345), 109, 477218844, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2088");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, 143, 4, 97, 0, 2147483589);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2089");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(1, 2147483589);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2090");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-001-01-31" + "'", str2, "-001-01-31");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2091");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (-2147483648), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2092");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(142, (-3747));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2093");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483589);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='0143-01-31', score=0}", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", "", "0097-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2095");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, 9, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9th Sep 35" + "'", str3, "9th Sep 35");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2096");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2097");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='30th', score=35}", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='30th', score=35}" + "'", str3, "GamePlayer{name='30th', score=35}");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2098");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-2147483648, 9)", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-2147483648, 9)" + "'", str3, "(-2147483648, 9)");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2099");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) -1, (int) (byte) 0, 90, (int) (short) 100, (-1), 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2100");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0143-01-31", "0143-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2101");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='52 S', score=0}", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0041-04-01", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 S" + "'", str9, "10 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Jan" + "'", str10, "Jan");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='52 S', score=0}" + "'", str11, "GamePlayer{name='52 S', score=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0041-04-01" + "'", str12, "0041-04-01");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2102");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 100, 32, (int) (short) 10, (-2147483648), 28, (-345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2103");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '4', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0052-10-31" + "'", str2, "0052-10-31");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2104");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(4, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2105");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=100}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2106");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        gamePlayer1.addScore((int) ' ');
        java.lang.String str6 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        gamePlayer1.setScore((int) (short) 10);
        java.lang.String str10 = gamePlayer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='Anonymous Player', score=32}" + "'", str6, "GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2107");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30 S", "41 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2108");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) -1, 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2109");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray11, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-345), byteArray11, 2147483589);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483589 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2110");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2111");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2112");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-345), 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2113");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) '4', (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(366, 4);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace((int) (byte) 10, (int) (byte) 100);
        gamePlace14.x(2);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2114");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0365-01-01                                                                                          ", "1st ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2115");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(9, (int) ' ', 100, 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2116");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(71, (int) (byte) 1, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9th Jan 71" + "'", str3, "9th Jan 71");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2117");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(52, 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2118");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, (int) '#', (int) (byte) 0, (int) (short) 100, (int) (short) 100, 2147483589);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2119");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(96);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2120");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(143, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, -1, 0, 1]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2121");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 52)", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 52)" + "'", str3, "(100, 52)");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-3747-04-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2123");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 100, 31, (-345));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2124");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(41);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2125");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("GamePlayer{name='Anonymous Player', score=71}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2126");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) -1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2127");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(143, 39, 2, 365, 28947, 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2128");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 71, (int) (byte) -1, 4, 143, (-387));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2129");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2130");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-09-01", "Oct");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2131");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 0)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 0)" + "'", str3, "(0, 0)");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2132");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(109, byteArray7, 187);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 187 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1]");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2133");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-345), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-345-01-31" + "'", str2, "-345-01-31");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2134");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=1}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2135");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(366, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2136");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(109, 477218588);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2137");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = gamePlace3.equals(obj4);
        gamePlace3.y((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2139");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-10-31", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0100-10-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-1 S', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-1 S', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2141");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0035-10-01", "-2147483648 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2142");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2143");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=52}", "(-3747, 100)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2144");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(35, 52)", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 52)" + "'", str3, "(35, 52)");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2145");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 S" + "'", str1, "35 S");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2146");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(9, (int) 'a', 96, 28, (-387), 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(477218588, 366)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (477218588, 366)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2148");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("477218588-10-31", "0100-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2149");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(187, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2150");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("                                                                                                 9 S", "-3747 S###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2151");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 477218844);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "15 Y" + "'", str1, "15 Y");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2152");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(71, 9, (int) '4', (int) '#', (int) (byte) 100, 143);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2153");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(143, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2154");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, 97, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2155");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, (-3747));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2156");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(35, 52)", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 52)" + "'", str3, "(35, 52)");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2157");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2158");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 10, 477218844, 2147483589, (-1), (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='1st', score=52}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='1st', score=52}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        int int9 = gamePlayer1.getScore();
        gamePlayer1.setScore((int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaa10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaa10 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2162");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(142);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2163");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 9, (int) (short) -1, 187, (int) (short) 1, 41);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2164");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2165");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(97, 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2166");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, 1)", "0143-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2167");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(365, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2168");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(32, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("####################################################################################################", "GamePlayer{name='0143-01-31', score=0}                                                              ", "GamePlayer{name='1st', score=0}", "GamePlayer{name='(10, ', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 0)", "  (365, 0)", "-2147483648 S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2171");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483589, 71, 2147483589, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, 187);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0001-10-01", "9th Sep 35", "30th", "GamePlayer{name='0143-01-31', score=0}                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2174");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("41 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2175");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-2147483648, 9)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2176");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        int int3 = gamePlayer1.getScore();
        int int4 = gamePlayer1.getScore();
        gamePlayer1.resetScore();
        gamePlayer1.addScore((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2177");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-04-01", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-04-01" + "'", str3, "0100-04-01");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2178");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2 S", "0004-02-29");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2179");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(187, byteArray9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2180");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0010-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10, 0, 0, 0]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2181");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 477218588, 30, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2182");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("18 S", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################18 S" + "'", str3, "################################################################################################18 S");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2183");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("15 Y");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[15, 0, 0, 0]");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2184");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2185");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483589);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(90, 52)", "32 S", "                                                                                          0004-10-31", "(invalid)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2187");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(71);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2188");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2189");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483648 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2190");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(3, 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2191");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(109, (-387), 0, 0, 1, 30);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2192");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(143, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray8, 142);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 142 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, -1, 0, 1]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2193");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 100, (int) ' ', 28947);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2194");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2195");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-387), (-387));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2196");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2197");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("4th Oct -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2199");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(41, 9, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2200");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(109);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2201");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483589, 109, 365, (int) '#', (-345), 2147483589);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace(10, (int) (short) 100);
        int int5 = gamePlace4.x();
        int int6 = gamePlace4.y();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2203");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2204");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-001-03-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2205");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(97, 97)", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 97)" + "'", str3, "(97, 97)");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2206");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', 143, 31, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-04-01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st ", "(100, 143)", "aaaaaa10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2208");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 S" + "'", str1, "-1 S");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2209");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(28, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2210");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-345-01-31", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-345-01-31" + "'", str3, "-345-01-31");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = gamePlace3.equals(obj4);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        gamePlace6.y(10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace6.clone();
        gamePlace6.x((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertNotNull(gamePlace9);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2212");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("9th", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################9th" + "'", str3, "#################################################################################################9th");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2213");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2214");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(35, (int) (short) -1, 28947, 109, (-2147483648), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2215");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=32}", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444GamePlayer{name='', score=0}", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52 S" + "'", str9, "52 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!#######" + "'", str10, "hi!#######");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str11, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str12, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='Anonymous Player', score=32}" + "'", str13, "GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444GamePlayer{name='', score=0}" + "'", str14, "444444444444444444444444444444444444444444444444444444444444444444444444GamePlayer{name='', score=0}");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2216");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0143-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(invalid)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(90, 0);
        gamePlace8.y(30);
        gamePlace8.y(97);
        int int13 = gamePlace8.x();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject14.new GamePlace((int) (byte) 1, (int) (byte) -1);
        java.lang.Object obj18 = new java.lang.Object();
        boolean boolean19 = gamePlace17.equals(obj18);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace17.clone();
        int int21 = gamePlace8.manhattanDistance(gamePlace20);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace20.clone();
        gamePlace22.x(2147483589);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 90 + "'", int13 == 90);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 187 + "'", int21 == 187);
        org.junit.Assert.assertNotNull(gamePlace22);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2218");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-345), (int) (short) 100, 90, 97, 10, 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='31st', score=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='31st', score=-1}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2220");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2221");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-3747), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(100, 97)", "10th Jan 90", "", "10 S                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-001-01-31", "30th Oct 97", "31 S", "(0, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2224");
        char[] charArray10 = new char[] { '4', '4', '4', ' ', '4', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Oct -1", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("39 S", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "444 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "444 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, 4,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st " + "'", str11, "1st ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52 " + "'", str12, "52 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39 " + "'", str13, "39 ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GameConfiguration " + "'", str14, "GameConfiguration ");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2225");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(10, ', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2226");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(30, (-387), 35, (int) (byte) 10, 4, (-3747));
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2227");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(96, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        int int3 = gamePlayer1.getScore();
        int int4 = gamePlayer1.getScore();
        int int5 = gamePlayer1.getScore();
        java.lang.String str6 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str6, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(90, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (90, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2230");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, 187, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2231");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray10, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 10, byteArray10, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-387), byteArray10, 477218844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477218844 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2232");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(96, 0, 32, (int) (short) 10, (-2147483648), (-345));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2233");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(96, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2234");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(28, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0028-10-31" + "'", str2, "0028-10-31");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2235");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, 4, 30, 3, 2147483589, 477218588);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2236");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(9, 477218588, (int) (short) 0, (int) (short) 100, 0, (int) '4');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(90, 0)", "0142-04-01", "0001-10-01", "(3, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = gamePlace3.equals(obj4);
        gamePlace3.x((int) '#');
        boolean boolean9 = gamePlace3.equals((java.lang.Object) "4th");
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        java.lang.String str11 = gamePlace10.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(35, -1)" + "'", str11, "(35, -1)");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2239");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(9, 2147483589);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2240");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 477218588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477218588 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2241");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0 S", "0097-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2242");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("32 Saaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2243");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(39, 2, (int) '#', 90, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2244");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("52 S", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52 S" + "'", str3, "52 S");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0365-01-01                                                                                          ", "0032-01-01                                                                                          ", "31st      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='(97, 1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2246");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(39);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2247");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 142);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(109, 477218588);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        int int9 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2250");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 1, 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2251");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 S" + "'", str1, "52 S");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2252");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st ", "(0, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2253");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2254");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(39, 477218844, 28, (-3747), 187, 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                30th", "8 H", "(32, 52)", "2 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(477218588, 366)", "(1, -1)", "GamePlayer{name='31st', score=-1}", "(90, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2257");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(90, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2258");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483589);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) 'a', (-3747), 9, (-2147483648), (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2260");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 10, 90, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2261");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(97, 97)############################################################################################", "GamePlayer{name='Anonymous Player', score=-1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("477218588-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2263");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0143-10-31", "35 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2264");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jan" + "'", str1, "Jan");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2265");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2266");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2267");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(97, 1)', score=0}", "GamePlayer{name='Anonymous Player', score=100}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2268");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-387));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-387 S" + "'", str1, "-387 S");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2269");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2270");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(90, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2271");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-387), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2272");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(366, (int) '#', 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2273");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-345), 35, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2274");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 9, (-345), (int) (byte) 100, 2, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2275");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2276");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(96, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2277");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6 M", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6 M" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6 M");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='30th', score=0}", " ", "1st Apr 35", "(-2147483648, 9)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (short) 100, 96, 3, 2, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2280");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, (int) (short) 100, 2147483589, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2281");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 142, (int) (short) 10, 96, 52, 2147483589);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2282");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0100-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2283");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2284");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), (int) (short) 0, (-387), (int) (byte) 0, 32, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2285");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(28947, 9, 100, 30, (-2147483648), 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2286");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=100}", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=100}" + "'", str3, "GamePlayer{name='Anonymous Player', score=100}");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2287");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(invalid)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(90, 30)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2288");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(142, 28947, 18, (int) (byte) 1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2289");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(3, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0003-01-01" + "'", str2, "0003-01-01");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2290");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(143, 3, 187, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2291");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2292");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("18 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[18, 0, 0, 0]");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 31)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 31)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2294");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0004-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2295");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-09-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2296");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(97, -1)", "(100, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2297");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(18, byteArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 9 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2298");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-3747), (-3747));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2299");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='31st', score=0}", "Apr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2300");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, (int) '#', (-345), 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2301");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='1st', score=52}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2302");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-387));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2303");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2304");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 1, 366, (-345), 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2305");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "9 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2306");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("52 S", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2307");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', 52, 10, 365, 365, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2308");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(143, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2310");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-10-31" + "'", str2, "0000-10-31");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2311");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-1, 1)", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 1)" + "'", str3, "(-1, 1)");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2312");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-345), 31, 365, 10, 187, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2313");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("39 ", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "39 " + "'", str3, "39 ");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2314");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, 96, 477218588, (int) (byte) 100, 2, (-387));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2315");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='0 S4444444', score=0}", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0 S4444444', score=0}" + "'", str3, "GamePlayer{name='0 S4444444', score=0}");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2316");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2317");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(97, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2318");
        java.lang.String[] strArray1 = new java.lang.String[] { "52 S" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2319");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2320");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        gamePlayer1.setScore(35);
        gamePlayer1.resetScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2321");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("15 Y");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) ' ', 31, (-387));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2323");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray10, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(71, byteArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2324");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(3, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2325");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 10, 52, (int) (byte) 100, (int) 'a', 143);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2326");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(10, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2327");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440032-01-01", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2328");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28 S" + "'", str1, "28 S");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 100)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2330");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Oct", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################Oct" + "'", str3, "#################################################################################################Oct");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2331");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483648), 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2332");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(9, 28947, (int) (byte) 100, (-2147483648));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2333");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=-345}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2334");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 2, (int) (short) 0, 18, 366, 142);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2335");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(0, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2336");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(100, 35, 10, (-387), (int) (short) 10, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2337");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-3747 S", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-3747 S" + "'", str3, "-3747 S");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2338");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(52, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2339");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-10-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0100-10-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2340");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 18)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2341");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(3, 0)", "-3747 S###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2342");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("444444-1 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 444444 + "'", int1 == 444444);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2343");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-345));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2344");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("31st");
        gamePlayer7.addScore(97);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2345");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2346");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("          ", "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2347");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray8, (-387));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -387 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2348");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(35, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2349");
        java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2350");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 3, (-2147483648), 444444);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2351");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(109, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0109-10-01" + "'", str2, "0109-10-01");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2352");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaa30 S", "0100-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2353");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 2, 71, 90, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2354");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0097-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2355");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, 97, (-345), (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2356");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(187, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2357");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='(365, 4)', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2358");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(96, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2359");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2360");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-3747), 18, (int) (byte) -1, 35, 18, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2361");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) -1, 109, 0, 187, (int) ' ', (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2362");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 2, 143);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2363");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-1), 96, (int) (byte) 10, 90, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2364");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, (int) (byte) 10, 0, 96, (int) (short) 10, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2365");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, (int) (short) 1, 18, 52, (-3747), 97);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2366");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("1st Jan -1");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        int int4 = gamePlayer3.getScore();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2367");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(444444);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2368");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483648), 477218844);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2369");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(365, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2370");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, 477218844, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2371");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44, 30, (-1), 2147483589);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2372");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("68 Y");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[68, 0, 0, 0]");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2373");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(366, 1, 187);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2374");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(142, (int) '4', 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2375");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 28947, (-345), (int) '#', (int) (byte) 100, (-2147483648));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2nd", "31st      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='(97, 1)', score=0}", "(90, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2377");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 142);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2378");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("3 S", "4th Oct -1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2379");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("31 S      ", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31 S      " + "'", str3, "31 S      ");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2380");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        gamePlayer1.addScore((int) ' ');
        java.lang.String str6 = gamePlayer1.toString();
        gamePlayer1.setScore(0);
        int int9 = gamePlayer1.getScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='Anonymous Player', score=32}" + "'", str6, "GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2381");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(366, 100, 143, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2382");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(3, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2383");
        char[] charArray5 = new char[] { 'a', '4' };
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#################################################################################################Oct", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, 4]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#################################################################################################Oct" + "'", str8, "#################################################################################################Oct");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2384");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("(0, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2385");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2386");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (short) 1, 0, (-1), 3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2387");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', (int) (byte) 1, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2388");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='31st', score=-1}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2389");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "30th ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2390");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2391");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0365-01-01                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2392");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477218844);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2393");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=-345}", "4 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2394");
        java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber(" ");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2395");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=10}", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=10}" + "'", str3, "GamePlayer{name='Anonymous Player', score=10}");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2396");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0142-04-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2397");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(143, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2398");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(9, 477218844, 2147483589, 143, 142, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2399");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("41 S", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "41 S" + "'", str3, "41 S");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2400");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray10, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 71 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2401");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(10, 31)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2402");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, 109, 52, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(97, 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (97, 97)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2404");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2405");
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(18, byteArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2406");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(39, 0, 31, 0, 477218844, 366);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2407");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477218588, 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2408");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st" + "'", str3, "1st");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2409");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-387), 32, 52, (int) 'a', (-387), (-3747));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2410");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(10, (int) (byte) 0, (int) (short) 100, (int) ' ', 0, 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2411");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0097-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("30th Oct 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"th Oct 97\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2413");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("#################################################################################################1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2414");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 52)", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 52)" + "'", str3, "(100, 52)");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2415");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0142-04-01", "(97, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2416");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477218844, (int) (short) 0, (-387), 35, 100, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2417");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(142, (-3747), (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2418");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2419");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, (int) (short) -1, 2147483589, 44, 30, (-3747));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2420");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, 477218588, (int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2421");
        char[] charArray12 = new char[] { '4', '4', '4', ' ', '4', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Oct -1", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0365-01-01", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, -1)", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("8 H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "444 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "444 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, 4,  , 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st " + "'", str13, "1st ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(invalid)4" + "'", str14, "(invalid)4");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0365-01-01" + "'", str15, "0365-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(97, " + "'", str17, "(97, ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "8 " + "'", str18, "8 ");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2422");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2423");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) 'a', 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2424");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (int) (byte) -1, (-345), 35, (int) 'a', 41);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2425");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(28, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2426");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0003-10-01", "-387 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2427");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject0.new GamePlace((int) '4', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = subject0.new GameConfiguration(444444);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2428");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(41, 3, 52, (-2147483648), 366, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2429");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1 M", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 M" + "'", str3, "1 M");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2430");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-387), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2431");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0004-09-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2432");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4th", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4th" + "'", str3, "4th");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2433");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 444444);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2434");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("  (365, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2435");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, 100)", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 100)" + "'", str3, "(10, 100)");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2436");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray8, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 365 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2437");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (int) (byte) 100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2438");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', (int) (short) 1, (int) '#', 0, (-3747), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2439");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2440");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(3, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("41 S", "GamePlayer{name='Anonymous Player', score=52}", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440032-01-01", "(10, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2442");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2443");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 41, (int) (byte) 1, (-387));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2444");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) '4', (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = subject0.new GameConfiguration((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-01-31", "0000-10-01", "GamePlayer{name='Anonymous Player', score=-2}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2446");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 365, 44, 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2447");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 100, 187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2448");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (int) ' ', 30, 365, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0001-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2450");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("52 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "52 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2451");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(142, 52, (-2147483648), (int) (short) -1, 44, 444444);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2452");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(invalid)", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(invalid)" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(invalid)");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2453");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) 'a', (int) (byte) 0, 2147483589, 0, 1, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2454");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(9, 2147483589, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2455");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 44, 30, 477218588, 44, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2456");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) '4', 3, 142, 9, 31, 29);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2457");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        java.lang.String str9 = gamePlayer1.getName();
        java.lang.String str10 = gamePlayer1.toString();
        java.lang.String str11 = gamePlayer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Anonymous Player" + "'", str9, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str10, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str11, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-09-01", "1st Oct -1", "0001-10-01", "18th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (byte) 10, 142, 143, 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2460");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GameConfiguration ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2461");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, (int) (byte) 0, 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2462");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='0 S4444444', score=0}", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0 S4444444', score=0}" + "'", str3, "GamePlayer{name='0 S4444444', score=0}");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10 S                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10 S                                                                                                ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("####################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ####################################################################################################");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2465");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#################################################################################################9th", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################9th" + "'", str3, "#################################################################################################9th");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2466");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(invalid)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(90, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        java.lang.String str10 = gamePlayer9.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2467");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(39, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2468");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, (int) (short) 0, 365, 28947, (int) (short) 1, 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2469");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30 S", "52 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2470");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(52, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2471");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("30 S", "0100-04-01", "(-3747, 100)", "(0, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(477218588, 366)", "0000-01-01", "9th Sep 35", "(97, 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2474");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0 S4444444", "GamePlayer{name='(365, 4)', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2475");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("3rd");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2476");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='', score=0}", "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2477");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(109);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2478");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), (int) (short) 0, 140, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-2147483648, 32)", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-2147483648, 32)" + "'", str3, "(-2147483648, 32)");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2480");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(187, 444444, 366, 2, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2481");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("0010-10-31");
        gamePlayer8.resetScore();
        java.lang.String str10 = gamePlayer8.getName();
        gamePlayer8.resetScore();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0010-10-31" + "'", str10, "0010-10-31");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2482");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, (int) (byte) 1, (-1), (int) (short) 10, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2483");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2484");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        int int3 = gamePlayer1.getScore();
        java.lang.String str4 = gamePlayer1.getName();
        java.lang.String str5 = gamePlayer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Anonymous Player" + "'", str4, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2485");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2486");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483589, 4, 96, 142);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2487");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2488");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0097-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97, 0, 0, 0]");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2489");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(109, byteArray9, 28947);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 28947 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2490");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(invalid)', score=31}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2491");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 18)", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           (100, 18)" + "'", str3, "                                                                                           (100, 18)");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1), 44, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2493");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-09-01", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("2nd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character n is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2495");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=100}", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=100}" + "'", str3, "GamePlayer{name='Anonymous Player', score=100}");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2496");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2497");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477218588, byteArray9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2498");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='(97, 52)', score=0}", "GamePlayer{name='0143-01-31', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2499");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(9, 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test4.test2500");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, -1)", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " (100, -1)" + "'", str3, " (100, -1)");
    }
}

