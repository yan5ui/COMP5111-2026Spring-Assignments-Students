package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_4_Test2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1001");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483606, 2147483619, 100, (int) (byte) 10, (int) (byte) 100, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1002");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, ", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0366-09-30", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(-1, " + "'", str11, "(-1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0366-09-30" + "'", str13, "0366-09-30");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1003");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (short) 1, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1004");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray4, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray4, 373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 373 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1005");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 28, 97, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1006");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, ", "##########################################################################################0100-10-31", "Anonymous Pla", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1008");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1009");
        java.lang.String[] strArray2 = new java.lang.String[] { "0100-10-31", "Ga" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1010");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', 2147483639, (int) (byte) 0, (int) '#', (-2147483334), (-2147483642));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject4.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace7.x(1);
        java.lang.String str10 = gamePlace7.toString();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) (byte) 10, (-2147483648));
        int int15 = gamePlace7.manhattanDistance(gamePlace14);
        gamePlace14.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace18.clone();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = gameConfiguration2.getPlayerAt(gamePlace20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, -2147483648)" + "'", str10, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace20);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1012");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)####################################################################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1, " + "'", str15, "(1, ");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1013");
        char[] charArray5 = new char[] { '4', 'a', '#' };
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ga" + "'", str6, "Ga");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1014");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1015");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, -2147483648)", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1016");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0365-09-30");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1017");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Sep");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1018");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483605);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1019");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1020");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='          ', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1021");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483647);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1022");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1023");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483642), 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1024");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483639);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1025");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-01-31", "GamePlayer{name='', score=0}", "9th", "aaaa(0, 4)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1027");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-09-01" + "'", str2, "0010-09-01");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1028");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##########################################################################################0100-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1029");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(28, (int) (short) 100, 2147483596, (int) (short) 100, (-2147483334), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1030");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=0}", "GamePlayer{name='', score=365}", "##(52, -1)", "Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1032");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1033");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(59, (int) '#', 2147483596);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1034");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(58, 4, 58, (-2147483648), (-2147483334), (-421));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1036");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483648), (-2147483648), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1037");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, ", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("31st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 31st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1039");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483647, (int) '4', 365, 2147483645);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1040");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration3 = subject0.new GameConfiguration(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(100, (int) (short) 10, (int) (short) 1, (int) (short) 0, 58, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1042");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, (int) (short) -1, 2, (int) (byte) 10, (int) (byte) 10, 2147483645);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1043");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray5, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 30 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1044");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("31st", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31st" + "'", str3, "31st");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1045");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-421), 2147483606, 100, 30, 2147483639, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1046");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace14.clone();
        java.lang.String str17 = gamePlace16.toString();
        java.lang.String str18 = gamePlace16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, -2147483648)" + "'", str17, "(0, -2147483648)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, -2147483648)" + "'", str18, "(0, -2147483648)");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1047");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Oct", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Oct" + "'", str3, "       Oct");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1048");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray4, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 58 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1049");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1050");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648-01-01", "(0, 4)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='####################################################################################################', score=0}", "hi!", "       Oct", "GamePlayer{name='(0, -2147483648)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1052");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(30);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        int int6 = gameConfiguration2.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1054");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 1, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-12) + "'", int4 == (-12));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1055");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(59, (int) (short) 1, (-2147483583), 2147483549, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1056");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 S######");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1057");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        int[] intArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(0, -2147483648)', score=0}");
        boolean boolean13 = gamePlayer10.equals((java.lang.Object) "GamePlayer{name='(0, -2147483648)', score=0}");
        gamePlayer10.setScore(4);
        java.lang.String str16 = gamePlayer10.toString();
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GamePlayer{name='2 M', score=4}" + "'", str16, "GamePlayer{name='2 M', score=4}");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1058");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaa", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaaaaa" + "'", str3, "                                                                                          aaaaaaaaaa");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          aaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01", "0001-01-31", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1060");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 100, (-2147483345));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1061");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, -2147483648)", "0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1062");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Ga");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1063");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        int[] intArray3 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean4 = gameConfiguration2.isBoardSymmetric();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1064");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        java.lang.String str15 = gamePlace14.toString();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject16.new GamePlayer("(0, -2147483648)");
        boolean boolean22 = gamePlace14.equals((java.lang.Object) subject16);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = subject16.new GamePlayer();
        gamePlayer23.resetScore();
        gamePlayer23.addScore(30);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = gamePlayer23.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gamePlayer27);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1065");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0001-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1066");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 2147483619);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1067");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(52, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1068");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483334));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483334 S" + "'", str1, "-2147483334 S");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1069");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 S" + "'", str1, "-1 S");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1070");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483605, 30, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1071");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Anonymous Player", "(invalid)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1072");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-421));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1073");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        int[] intArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(0, -2147483648)', score=0}");
        boolean boolean13 = gamePlayer10.equals((java.lang.Object) "GamePlayer{name='(0, -2147483648)', score=0}");
        int int14 = gamePlayer10.getScore();
        gamePlayer10.addScore(2147483639);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1074");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(0, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1075");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483639, 2147483619, (int) '4', (int) (short) 1, (int) ' ', 373);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1076");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(414);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1077");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, -1)", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1078");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject5.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject5.new GamePlace((int) 'a', (int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject5.new GamePlace(0, (int) (byte) 1);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace20.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace20.clone();
        int int24 = gamePlace16.manhattanDistance(gamePlace20);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer25 = gameConfiguration2.getPlayerAt(gamePlace16);
        int int26 = gameConfiguration2.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1079");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(31, 2147483605, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1080");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("       Oct", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Oct" + "'", str3, "       Oct");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1081");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483335), (-421));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(365, 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1083");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483619, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1084");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-1 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483549-04-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1086");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("9th", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################9th" + "'", str3, "#################################################################################################9th");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1087");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray4, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483335), byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483334), byteArray4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1088");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0365-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1089");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("          ", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1090");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483583));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1091");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1092");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 0, 30, 2147483619, 9, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1093");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        gamePlayer10.setScore((int) (byte) 1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1094");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(97, 0, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1095");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("59 S", "0030-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), (-2147483549), (int) 'a', (int) (short) 100, 100, 2147483606);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1097");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(58, 2147483639, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1098");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, (int) (byte) 1, 31, 59, (-2147483335), (-2147483583));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace10.x(1);
        java.lang.String str13 = gamePlace10.toString();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject14.new GamePlace((int) (byte) 10, (-2147483648));
        int int18 = gamePlace10.manhattanDistance(gamePlace17);
        gamePlace17.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace17.clone();
        int int22 = gamePlace6.manhattanDistance(gamePlace21);
        int int23 = gamePlace6.x();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, -2147483648)" + "'", str13, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1100");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GamePlayer{name='(invalid)', score=-2147483583}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1101");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0365-01-01", "0010-02-28");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1102");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483549, (int) (byte) 100, (-2147483549), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1103");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, ", "#################################################################################################9th", "GamePlayer{name='(invalid)', score=365}", "(10, ");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1104");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = subject0.new GameConfiguration((-2147483345));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1106");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(31, 0, 2147483596, (int) (byte) 10, 28, (-2147483334));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1107");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("10th Jan 0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1108");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483334), 2147483606);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1109");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483645);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1110");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("35 ", "4th", "", "GamePlayer{name='Anonymous Player', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        java.lang.String str4 = gamePlace3.toString();
        int[] intArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("10th");
        boolean boolean7 = gamePlace3.equals((java.lang.Object) "10th");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, -1)" + "'", str4, "(52, -1)");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1113");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(58, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1114");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(10, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1115");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483642), 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1116");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("2147483619-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2147483619, 0, 0, 0]");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0010-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1118");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 414);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 100, 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1120");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 2147483596, 2147483645, (int) (byte) -1, 2147483645, (-2147483642));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1121");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4th", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################4th" + "'", str3, "#################################################################################################4th");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1122");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##########################################################################################0100-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1123");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='(invalid)', score=373}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1124");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, ", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(-1, " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(-1, ");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1125");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1 S", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 S" + "'", str3, "1 S");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1126");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 1, 30, 28, 2147483549, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1127");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 414, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1128");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(59, (-2147483334), 97, 58);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1129");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483335), 366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1130");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483648-01-01", "35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1131");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483639);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1132");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(52, 2147483605, 59, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1133");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483345), (int) (short) -1, 0, (int) (byte) 100, (-2147483335), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1134");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 10, 2, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1135");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483345));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483345 S" + "'", str1, "-2147483345 S");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1136");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483549), (-2147483549), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='(invalid)', score=-2147483583}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='(invalid)', score=-2147483583}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1138");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1139");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("########Ga");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1140");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 S" + "'", str1, "1 S");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1141");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("      1st ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1142");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483549));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1143");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(invalid)', score=-2147483583}", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=-2147483583}" + "'", str3, "GamePlayer{name='(invalid)', score=-2147483583}");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483647, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1145");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("########Ga", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################Ga" + "'", str3, "##################################################################################################Ga");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1146");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1147");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 373, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1148");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0000-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1149");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("0365-09-30");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1150");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(31, 2147483605);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1151");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483605);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1152");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        java.lang.String str15 = gamePlace14.toString();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject16.new GamePlayer("(0, -2147483648)");
        boolean boolean22 = gamePlace14.equals((java.lang.Object) subject16);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = subject16.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer25 = subject16.new GamePlayer("-2147483583-10-01");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration27 = subject16.new GameConfiguration(2147483549);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1154");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483642));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483642 S" + "'", str1, "-2147483642 S");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1155");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, (-2147483345), 2147483645, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1156");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th Jan 0", "4th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1157");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st ", "(-1, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ja", "0000-10-01", "(1, -1)", "0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1159");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 1, 1, 30, 2147483605, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1160");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483605, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1161");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(10, -2147483648)", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, -2147483648)" + "'", str3, "(10, -2147483648)");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1162");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 100, (-2147483334));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1163");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483345 S", "-2147483648-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1164");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 30, (-12), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1165");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertNotNull(gamePlace13);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1167");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-421));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1168");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("       Oct", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 Oct" + "'", str3, "                                                                                                 Oct");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1169");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        java.lang.String str6 = gamePlayer5.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer5.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, -2147483648)" + "'", str6, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1170");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("      1st ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        java.lang.String str15 = gamePlace14.toString();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject16.new GamePlayer("(0, -2147483648)");
        boolean boolean22 = gamePlace14.equals((java.lang.Object) subject16);
        java.lang.String str23 = gamePlace14.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace14.clone();
        java.lang.String str25 = gamePlace24.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0, -2147483648)" + "'", str23, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(0, -2147483648)" + "'", str25, "(0, -2147483648)");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, ", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, " + "'", str3, "(-1, ");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1173");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(invalid)', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1174");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, -1)", "-1 S######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1175");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Feb" + "'", str1, "Feb");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1176");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='aaaaaaaaaa', score=-1}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("##########################################################################################0100-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1178");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 1, (-12));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1179");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        boolean boolean7 = gameConfiguration6.isBoardFull();
        gameConfiguration6.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1180");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 365);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1181");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, (int) (short) 100, (int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1182");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(97, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1183");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1st");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483583), 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ga", "(100, 366)", "GamePlayer{name='', score=0}", "35 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1186");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2147483605-01-31", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2147483605-01-31" + "'", str3, "2147483605-01-31");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##(52, -1)", "", "6 M", "-2147483648 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1188");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483596, 0, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1189");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1190");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GamePlayer{name='####################################################################################################', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1191");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483549);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1192");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray5, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 59 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1193");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0 ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1194");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483549, byteArray5, 373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 373 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1195");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 S" + "'", str1, "1 S");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1196");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(366);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1197");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0 ", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 " + "'", str3, "0 ");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1198");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1199");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0028-10-01", "-2147483549 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1200");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-12), 2147483549, (-2147483583), 58);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1201");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(9, (int) '#', 2147483606, 2, 2147483549, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        boolean boolean15 = gameConfiguration2.isBoardFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1203");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0000-10-01", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-10-01" + "'", str3, "0000-10-01");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1204");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='', score=365}", "Anonymous Pla");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1205");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Feb");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1206");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2147483596-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(-1, 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (-1, 100)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1208");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1209");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483642), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1210");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, (-2147483549), (int) (short) -1, (-2147483549), 1, 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1211");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 1, 2147483606, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1212");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaaaaaa', score=-1}", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaa', score=-1}" + "'", str3, "GamePlayer{name='aaaaaaaaaa', score=-1}");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1213");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='(invalid)', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1214");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        java.lang.String str15 = gamePlace14.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace14.clone();
        int int17 = gamePlace14.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1215");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2147483619-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1216");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 S######", "(1, -1)", "0030-10-01", "GamePlayer{name='', score=365}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("35 ", "-2147483648-01-01", "Feb", "GamePlayer{name='', score=365}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1218");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1219");
        char[] charArray11 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                    ", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("####################################################################################################", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "#" + "'", str16, "#");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1220");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483596);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1221");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 414);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7 M" + "'", str1, "7 M");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1222");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2, 2147483619, 3, 30, 414, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1223");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st" + "'", str3, "1st");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1225");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0366-09-30", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0366-09-30" + "'", str3, "0366-09-30");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1226");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 414, (int) ' ', 2147483605);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1227");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2147483619-02-28", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2147483619-02-28" + "'", str3, "2147483619-02-28");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1228");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 366)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1229");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483619);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1230");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("0366-09-30");
        int int3 = gamePlayer2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1231");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1232");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2, (-2147483335), (-2147483642), (int) '#', (int) (byte) 0, (-2147483642));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1233");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483549 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("6 M", "GamePlayer{name='(invalid)', score=-2147483642}", "Anonymous ", "-421 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1235");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, -1)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################(1, -1)" + "'", str3, "#############################################################################################(1, -1)");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1236");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("59 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1237");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483549, (-421), (int) (byte) 1, 28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1238");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        gamePlace8.y(30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1239");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0031-10-01", "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='Anonymous Player', score=-1}", "31st", "GamePlayer{name='Anonymous Player', score=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1241");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(414, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1242");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1243");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaaaaaa', score=-1}", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaa', score=-1}" + "'", str3, "GamePlayer{name='aaaaaaaaaa', score=-1}");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1244");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1245");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1, 0, (int) (byte) 0, (int) '#', 3, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1246");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("########Ga", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1247");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483345), 2147483605, (-12));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        int[] intArray15 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray16 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray17 = gameConfiguration2.countPiecesPerPlayer();
        int int18 = gameConfiguration2.getSize();
        boolean boolean19 = gameConfiguration2.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1249");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1250");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 2147483596, 366, 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1251");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1252");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) -1, 2147483639, 3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1253");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Sep", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Sep" + "'", str3, "Sep");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1254");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(52, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0052-10-01" + "'", str2, "0052-10-01");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1255");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(52, 1, (-2147483334));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1256");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483334), 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1257");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1258");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1259");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-421), (-2147483335));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1260");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, ", "Jan");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1261");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483645, (-2147483642), (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1262");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, ", "#################################################################################################4th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        java.lang.String str4 = gamePlace3.toString();
        java.lang.String str5 = gamePlace3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, -1)" + "'", str4, "(52, -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, -1)" + "'", str5, "(52, -1)");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1264");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483619 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 1]");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(52, ", "-1 ", "(0, 4)", "-2147483334 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1266");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1267");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-1, ", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, " + "'", str3, "(-1, ");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1268");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483549), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1269");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(58, 365, 28, (-12));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("1st Sep 365");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character s is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1271");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-12), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1272");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("##(52, -1)");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1273");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(invalid)', score=-2147483642}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1274");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1275");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(373, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1276");
        char[] charArray13 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0 S", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, -2147483648)", charArray13);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("7 M", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1, " + "'", str14, "(1, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ja" + "'", str18, "Ja");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 " + "'", str19, "0 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(10, " + "'", str20, "(10, ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7 " + "'", str21, "7 ");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1277");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=0}", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1278");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 373);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1279");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(414, 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1280");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray4, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1281");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483619);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1282");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 366)", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, (-2147483642), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1284");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray5, (-2147483335));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483335 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1285");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=0}", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1286");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-12));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1287");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483334), (int) ' ', (int) (short) 0, 52, 2147483639, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1288");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(373, 97, 59, (-2147483648));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1289");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483345), (int) (byte) 0, (int) (byte) -1, 2147483605, 365, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1290");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1291");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0028-10-01", "GamePlayer{name='(invalid)', score=373}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1292");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st ", "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1293");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(365);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1294");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483619, 414);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1295");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -1)", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1296");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        java.lang.String str4 = gamePlace3.toString();
        gamePlace3.y(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(10, -2147483648)" + "'", str4, "(10, -2147483648)");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1297");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-12), (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1298");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-12), 2147483647, (-2147483549), (int) (short) 10, 366, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1299");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace14.clone();
        java.lang.Class<?> wildcardClass17 = gamePlace14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1300");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 ", "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1301");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(1, ", "2147483606-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1302");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(414);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1303");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("9th", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1304");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        int int12 = gamePlace3.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace3.clone();
        int[] intArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("hi!");
        boolean boolean16 = gamePlace3.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1305");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        int int15 = gameConfiguration2.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration17 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) (byte) 10, (-2147483648));
        java.lang.String str22 = gamePlace21.toString();
        boolean boolean23 = gameConfiguration17.isOccupied(gamePlace21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertNotNull(gameConfiguration17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(10, -2147483648)" + "'", str22, "(10, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1306");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=0}", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=0}" + "'", str3, "GamePlayer{name='', score=0}");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1307");
        char[] charArray9 = new char[] { 'a', '4', 'a', 'a', '4' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483345 S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, a, a, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#" + "'", str12, "#");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1308");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Oct", "(100, 366)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1309");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 31, (-2147483648), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1310");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList5 = gameConfiguration2.getEmptyPlaces();
        int int6 = gameConfiguration2.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration2.getPlayers();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlaceList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1311");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        int int15 = gameConfiguration2.getSize();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace19.x(1);
        java.lang.String str22 = gamePlace19.toString();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject23.new GamePlace((int) (byte) 10, (-2147483648));
        int int27 = gamePlace19.manhattanDistance(gamePlace26);
        int int28 = gamePlace19.x();
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = subject29.new GamePlace((int) '4', (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace35 = subject29.new GamePlace((-1), (int) (short) 100);
        boolean boolean36 = gamePlace19.isAdjacent(gamePlace35);
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = gamePlace19.clone();
        comp5111.assignment.cut.Subject subject38 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace41 = subject38.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace41.x(1);
        java.lang.String str44 = gamePlace41.toString();
        comp5111.assignment.cut.Subject subject45 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace48 = subject45.new GamePlace((int) (byte) 10, (-2147483648));
        int int49 = gamePlace41.manhattanDistance(gamePlace48);
        gamePlace48.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace52 = gamePlace48.clone();
        java.lang.String str53 = gamePlace52.toString();
        comp5111.assignment.cut.Subject subject54 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace57 = subject54.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer59 = subject54.new GamePlayer("(0, -2147483648)");
        boolean boolean60 = gamePlace52.equals((java.lang.Object) subject54);
        boolean boolean61 = gamePlace37.equals((java.lang.Object) boolean60);
        comp5111.assignment.cut.Subject.GamePlace gamePlace62 = gamePlace37.clone();
        boolean boolean63 = gameConfiguration2.isOccupied(gamePlace37);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration64 = gameConfiguration2.clone();
        boolean boolean65 = gameConfiguration2.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(1, -2147483648)" + "'", str22, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(gamePlace37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(1, -2147483648)" + "'", str44, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertNotNull(gamePlace52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(0, -2147483648)" + "'", str53, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(gamePlace62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(gameConfiguration64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1312");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483583-10-01", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, 52)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(10, 52)" + "'", str13, "(10, 52)");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1313");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 100)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1314");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1315");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 10, (-2147483642), (int) (short) 10, (-2147483345), (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1316");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-12), (-2147483549), (-12), 366, 0, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1317");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("#################################################################################################9th");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1318");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = subject0.new GameConfiguration((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1319");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483639, 2147483647, (-2147483334));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1320");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(52, -1)44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1321");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483619, 2147483619, 4, (-2147483335), (-12), (int) 'a');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648-01-01", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-01-01" + "'", str3, "-2147483648-01-01");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1323");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 2147483596);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1324");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, 30, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1325");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("35 ", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 " + "'", str3, "35 ");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1326");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("Oct");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1327");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("214");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1328");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1329");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("hi!", "1st Sep 365");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1330");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1331");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='          ', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1332");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.setScore((int) (byte) 0);
        gamePlayer4.addScore(373);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1333");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1334");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483549, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01", "GamePlayer{name='2 M', score=4}", "(10, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1336");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 100, 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1337");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 S" + "'", str1, "10 S");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1338");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2147483605-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1339");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(59);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1340");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, (int) '4', 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1341");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList4 = gameConfiguration2.getEmptyPlaces();
        java.lang.String str5 = gameConfiguration2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlaceList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str5, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1342");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 3, (int) (byte) 1, 2147483645, 2147483619, (-2147483345));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1343");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483647, 0, (-2147483642), 4, 10, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1344");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-1 S", "1st Sep 365");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1345");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(invalid)', score=100}", "aaaa(0, 4)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1346");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-001-09-01" + "'", str2, "-001-09-01");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1347");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, (-2147483549), 373, (-2147483642), 3, 97);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1348");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("35 ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35, 0, 0, 0]");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1349");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0001-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1350");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(30, (int) '#', (int) (byte) 1, (int) (short) 1, (int) (short) 0, 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1351");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-214");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1352");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=-1}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1353");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1354");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483642 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1355");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Anonymous Pla");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1356");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-12), 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1357");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(58, (int) '4', 366);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1358");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483334), 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1359");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        int int4 = gamePlace3.y();
        gamePlace3.y((int) (short) 0);
        gamePlace3.x(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1360");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483596, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1361");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1362");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1363");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "       Oct");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1364");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483606);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1365");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(3, 2147483639);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1366");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 2147483619, (int) (byte) 1, 2147483605, 1, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1367");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, (int) ' ', 100, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1368");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='2 M', score=4}", "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1369");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1370");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, 10)", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 10)" + "'", str3, "(10, 10)");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1371");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace10.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace10.clone();
        java.lang.String str15 = gamePlace14.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace14.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1372");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(414);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1373");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483345 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaa(0, 4)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaa(0, 4)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1375");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(366, 30)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1376");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483335), (-2147483583));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1377");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("6 M");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[6, 0, 0, 0]");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1378");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483583), 2147483549, 2147483605);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1379");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray2, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1380");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483645, (int) (short) 100, 373, (-2147483334), 0, 2147483605);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1381");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, 10)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0100-10-01" + "'", str14, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(10, " + "'", str15, "(10, ");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1382");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        int int15 = gameConfiguration2.getSize();
        int int16 = gameConfiguration2.getSize();
        int int17 = gameConfiguration2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1383");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 366)", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 366)" + "'", str3, "(100, 366)");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1384");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        java.lang.String str11 = gamePlace8.toString();
        int int12 = gamePlace8.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        boolean boolean14 = gameConfiguration2.isOccupied(gamePlace8);
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray16 = gameConfiguration2.getInitialBoard();
        java.lang.Class<?> wildcardClass17 = gamePlayerArray16.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1385");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483596, 31, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1386");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        int int12 = gamePlace3.x();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) '4', (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject13.new GamePlace((-1), (int) (short) 100);
        boolean boolean20 = gamePlace3.isAdjacent(gamePlace19);
        gamePlace3.y(4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1387");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1388");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaaaaaa', score=-1}", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaa', score=-1}" + "'", str3, "GamePlayer{name='aaaaaaaaaa', score=-1}");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1389");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1390");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483647, 52, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                                 Oct");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                  Oct");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1392");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1393");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("59 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[59, 0, 0, 0]");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1394");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1395");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0001-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1396");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', 0, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) -1, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "0 S", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01", "Anonymous ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1399");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0000-10-01", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-10-01" + "'", str3, "0000-10-01");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1400");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2147483596-01-31", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2147483596-01-31" + "'", str3, "2147483596-01-31");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1401");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='-2147483583-10-01', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1402");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) 0, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1403");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, (-2147483648), (int) ' ', 2147483619);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1404");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), (int) (byte) 1, 9, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120 + "'", int4 == 120);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1405");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, 58, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483345 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483345 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1407");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jan" + "'", str1, "Jan");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1408");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(58, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1409");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########################################################################################0100-10-31", "10th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1410");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1411");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.resetScore();
        gamePlayer4.setScore((int) (byte) 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = gamePlayer4.clone();
        org.junit.Assert.assertNotNull(gamePlayer8);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1412");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(52, (-1), (-6), 0, (int) (short) 10, 2147483645);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1413");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = subject4.new GameConfiguration(9);
        java.lang.String str7 = gameConfiguration6.toString();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) gameConfiguration6);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration6.getPlayers();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str7, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1414");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        int int4 = gamePlace3.y();
        java.lang.String str5 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-2147483648) + "'", int4 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, -2147483648)" + "'", str5, "(10, -2147483648)");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1415");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='(invalid)', score=1}", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=1}" + "'", str3, "GamePlayer{name='(invalid)', score=1}");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1416");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "1st");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1417");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, (-2147483642));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1418");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483345 S", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483345 S" + "'", str3, "-2147483345 S");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1419");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        gamePlace3.y((-2147483648));
        int int6 = gamePlace3.y();
        gamePlace3.y(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1420");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1421");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(373, 0, 2147483619, 120, (-12), 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1422");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1423");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483605, (int) (short) 0, 9, (int) (short) 100, 3, 2147483596);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1424");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='(invalid)', score=373}", "GamePlayer{name='(invalid)', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1425");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1426");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483642), (int) (byte) 0, 3, 58, (-2147483648), (-2147483642));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1427");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483605, (-421), 414, 2147483645, 2147483549, 2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1428");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, (int) (short) 10, 2147483596, (int) '4', 414, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1429");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='2 M', score=4}", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1430");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1431");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 1, (-2147483583));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1432");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='          ', score=0}", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='          ', score=0}" + "'", str3, "GamePlayer{name='          ', score=0}");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1433");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(30, (-2147483334), 59, (int) '4', 4, 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1434");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, 120, (-2147483335), 2147483549);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1435");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2, (int) 'a', (int) ' ', 2, 9, 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1436");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483345));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("      1st ", "0001-01-31", "(0, 10)", "aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1438");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1439");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(invalid)', score=373}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1440");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='(invalid)', score=-2147483583}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1441");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-04-01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1442");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        int int5 = gameConfiguration2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1443");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1444");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray6, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1445");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1446");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2147483606-01-01", "-1 S######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1447");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString(1L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 S" + "'", str1, "1 S");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1448");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.y();
        int int8 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = null;
        int int10 = gamePlace3.manhattanDistance(gamePlace9);
        int int11 = gamePlace3.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='aaaaaaaaaa', score=-1}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}", "(1, ", "10th Oct 1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1450");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483619, (-6));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1451");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483583-10-01", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483583-10-01" + "'", str3, "-2147483583-10-01");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1452");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight(" ", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ###################################################################################################" + "'", str3, " ###################################################################################################");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1453");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        java.lang.String str6 = gamePlayer5.getName();
        java.lang.String str7 = gamePlayer5.toString();
        java.lang.String str8 = gamePlayer5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, -2147483648)" + "'", str6, "(0, -2147483648)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='(0, -2147483648)', score=0}" + "'", str7, "GamePlayer{name='(0, -2147483648)', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0, -2147483648)" + "'", str8, "(0, -2147483648)");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1454");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(120, byteArray4, (-2147483345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483345 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0]");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1455");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("7 ", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7 " + "'", str3, "7 ");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1456");
        char[] charArray7 = new char[] { '4', 'a', '#' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=100}", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ga" + "'", str8, "Ga");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 S" + "'", str9, "-1 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=-2147483642}", "(0, ", "(0, 4)", "-2147483648-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1458");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("214");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[214, 0, 0, 0]");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1459");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaa", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa                                                                                          " + "'", str3, "aaaaaaaaaa                                                                                          ");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1460");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, 414, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1461");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2147483619-01-31", "0365-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1462");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483334), (-421));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1463");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, 59, (int) '#', 2147483619, (-104), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1464");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483639, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1465");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.addScore(1);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1466");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 10, (-2147483642));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1467");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483549));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1468");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='####################################################################################################', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1469");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-09-01", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-09-01" + "'", str3, "0010-09-01");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1470");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, (-1), (-2147483334), 30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1471");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=4}", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1472");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483606, byteArray1, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1473");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1474");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, -2147483648)", "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1475");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-12), byteArray5, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -12 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1476");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=59}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1477");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2, (-2147483583), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1478");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0365-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1479");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483645, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2147483645-10-31" + "'", str2, "2147483645-10-31");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1480");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483606, 414, 373, 414);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1481");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Ga", "-2147483549-04-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1482");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0000-10-01", "########Ga");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1483");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2147483619-02-28");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1484");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1485");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9 S" + "'", str1, "9 S");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1486");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("########Ga", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########Ga" + "'", str3, "########Ga");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1487");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483549), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1488");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1489");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(0, -2147483648)', score=0}", "#################################################################################################9th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1490");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-104));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1491");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-001-09-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-02-28", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1493");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), 365, (int) 'a', (int) (byte) -1, (-2147483648), 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1494");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("Jan");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1495");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, -2147483648)", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, -2147483648)" + "'", str3, "(10, -2147483648)");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1496");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, 1, 2147483619, 0, 2147483645, 2147483549);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1497");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10th");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration4 = subject0.new GameConfiguration((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1498");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st Sep 365", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1499");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("35 S", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 S" + "'", str3, "35 S");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test2.test1500");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#################################################################################################4th", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################4th" + "'", str3, "#################################################################################################4th");
    }
}

