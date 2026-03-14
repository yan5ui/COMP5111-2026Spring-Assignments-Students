package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_4_Test3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1501");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-12));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-12 S" + "'", str1, "-12 S");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1502");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1503");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483583-10-01', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1504");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(-2147483583, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1505");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=365}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1506");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2147483645-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("4th");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4th");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1508");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(10, 2147483596, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1509");
        char[] charArray9 = new char[] { '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483334 S", charArray9);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 S" + "'", str11, "-1 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-214" + "'", str14, "-214");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(1, -214" + "'", str15, "(1, -214");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 366)", "1st", "#", "GamePlayer{name='(invalid)', score=-2147483642}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1511");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(414, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1512");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483549), 2147483645, (-2147483335));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1513");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483645);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1514");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0028-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1515");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(9, 59, (-2147483334), (-2147483334));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1516");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 S" + "'", str1, "52 S");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1517");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1518");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) -1, 2147483639, (int) (short) 1, 120, (int) 'a', (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1519");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-104), 2147483639);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1520");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(373, 2147483645, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1521");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray4, (-2147483335));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483335 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1522");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', (-104), 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1523");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, 52, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1525");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1526");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("####################################################################################################", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, " + "'", str10, "(1, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1527");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("########Ga", "      1st ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1528");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-10-01", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1529");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                                 Oct");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1530");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-04-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1531");
        java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-214");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Anonymous Player", "-2147483642 S", "9 S", "-1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1533");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, 52, (int) (byte) -1, (int) 'a', 30, 2147483549);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1534");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0365-09-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1535");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray6, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(28, byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1536");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(97, (int) (short) 0, 0, (-2147483335), (int) (short) 0, (-421));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1537");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1538");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483583-10-01", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483583-10-01" + "'", str3, "-2147483583-10-01");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1539");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        int[] intArray3 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray4 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration2.getPlayers();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = gameConfiguration2.isOccupied(gamePlace7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1540");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1541");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Jan 0", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Jan 0" + "'", str3, "10th Jan 0");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1542");
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
        gamePlace14.x(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ###################################################################################################", "0001-01-31", "(-1, -2147483648)", "(-2147483583, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1544");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(28, (int) (short) -1, (-421), 365, 0, (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1545");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0035-10-31" + "'", str2, "0035-10-31");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1546");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) -1, 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-001-03-31" + "'", str2, "-001-03-31");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1547");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483345), 2147483619);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=1}", "0000-10-01", "2147483619-01-31", "0100-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1549");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0365-01-01", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0365-01-01" + "'", str3, "0365-01-01");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1550");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, 365, (int) ' ', 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1551");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(365, 2147483639);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1552");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray4, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray4, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 120 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1553");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("7 ", "Anonymous ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(52, -1)44", "(366, 52)", "GamePlayer{name='aaaaaaaaaa', score=0}", "0010-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1555");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(30, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1556");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Apr" + "'", str1, "Apr");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1557");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1558");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(1, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1559");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Apr", "-001-03-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, (int) (short) 1, 59, 2147483605, 0, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1561");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GamePlayer{name='(invalid)', score=1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1562");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0035-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35, 0, 0, 0]");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1563");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0028-10-01", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0028-10-01" + "'", str3, "0028-10-01");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1564");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483334), (-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1565");
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
        int[] intArray16 = gameConfiguration2.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray17 = gameConfiguration2.getPlayers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1566");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) 'a', 30, (-2147483549), (int) (short) 100, 0, (-2147483549));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1567");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#############################################################################################(1, -1)", "(100, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1568");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-10-01", "4th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1569");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483642 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1570");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(373);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1571");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject16.new GamePlace((int) '4', 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1572");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(32, (-2147483549));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(35, 52)", "2147483605-01-31", "2nd", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1574");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 366, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1575");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray6, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(28, byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1576");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(10, 4)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1577");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0 S", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 S" + "'", str3, "0 S");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1578");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483583), (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1579");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.setScore((int) (byte) 0);
        java.lang.String str7 = gamePlayer4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str7, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1580");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, (int) (byte) 0, (-2147483648));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1581");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1582");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483647, (-2147483345), (-104), 2147483639, (-2147483334), (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1583");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, 2147483596, 2, 2147483639);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1584");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1585");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, (-1), 9, 10, 52, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1586");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, ", "GamePlayer{name='Anonymous Player', score=-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1587");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1588");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483605, 373);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("      1st ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:       1st ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1590");
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
        gamePlace16.x(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, -2147483648)" + "'", str17, "(0, -2147483648)");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1591");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(invalid)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1592");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483549, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1593");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(97, (-1), (int) ' ', 2147483549, (-6), 3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1594");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("31st");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[31, 0, 0, 0]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1595");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1596");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1597");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1598");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1599");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, (int) (short) -1, (int) '4', (-12));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1600");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(9, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1601");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        int[] intArray3 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray4 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration2.getInitialBoard();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1602");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(365, 32, (-2147483335), 0, (-6), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, ", "1st ", "10th Oct 1", "Ga");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1604");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-02-28", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-28" + "'", str3, "0010-02-28");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1605");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(366, 30)", "Sep");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1606");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList5 = gameConfiguration2.getEmptyPlaces();
        java.lang.String str6 = gameConfiguration2.toString();
        boolean boolean7 = gameConfiguration2.isBoardFull();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlaceList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str6, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1607");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray4 = gameConfiguration2.getInitialBoard();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration2.getInitialBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray4);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1608");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, -2147483648)", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, -2147483648)" + "'", str3, "(10, -2147483648)");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1609");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-421), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1610");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray5 = gameConfiguration2.getPlayers();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray5);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1611");
        byte[] byteArray4 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray4, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483335), byteArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-421), byteArray4, (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483549 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1612");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1613");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(4, -2147483648)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483549 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483549 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1615");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3rd" + "'", str1, "3rd");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1616");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='aaaaaaaaaa', score=0}", "2147483645-10-31", "(366, 52)", "GamePlayer{name='(invalid)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1618");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-04-01", "2147483596-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-001-09-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1620");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Anonymous Player", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=-2147483642}", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Anonymous Pla" + "'", str11, "Anonymous Pla");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1621");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', 9, 120);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1622");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer("GamePlayer{name='(invalid)', score=100}");
        java.lang.String str13 = gamePlayer12.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}" + "'", str13, "GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1623");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483596, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1624");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(31, 52, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='(1, 1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='(1, 1)', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1626");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(invalid)', score=1}", "(0, 28)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1627");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        gamePlace11.y((-104));
        org.junit.Assert.assertNotNull(gamePlace12);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1628");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483642), (int) ' ', 0, 414, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1629");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=59}", "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(4, -2147483648)", "(-1, ", "GamePlayer{name='', score=0}", "0001-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483647, (-2147483642), 0, (-6), (int) (short) 0, 2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1632");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(9, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1633");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(10, (int) (byte) 0, 0, (-2147483583));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1634");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(52, ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}", "(35, 52)", "31st");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1636");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1637");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-421), (-2147483583), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1638");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483335));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483335 S" + "'", str1, "-2147483335 S");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1639");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483647);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1640");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.Class<?> wildcardClass12 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', 0, 2147483549, (int) (short) 100, 2147483549, 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1642");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("                                                                                                    ", "GamePlayer{name='aaaaaaaaaa', score=-1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1643");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-421), 58, 31, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1644");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Anonymous Pla", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2147483606-01-01", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Anonymous " + "'", str13, "Anonymous ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, " + "'", str14, "(0, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "214" + "'", str15, "214");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1645");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483583-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1646");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(365, (-421), 2147483382, 365, 2147483619, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1647");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("2147483596-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2147483596, 0, 0, 0]");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1648");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483596, 30, 2147483619);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1650");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray2, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1651");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(35, 52)", "0010-02-28");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1652");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1653");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 0, 58, 2147483549, 32, 2147483647, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1654");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483549, 3, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1655");
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
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray16 = gameConfiguration2.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray17 = gameConfiguration2.getInitialBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gamePlayerArray16);
        org.junit.Assert.assertNotNull(gamePlayerArray17);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1656");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st ", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st " + "'", str3, "1st ");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1657");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(58, 2147483645, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1658");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1659");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject7.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject7.new GamePlace((int) 'a', (int) (short) 1);
        boolean boolean16 = gamePlace3.equals((java.lang.Object) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace3.clone();
        java.lang.String str19 = gamePlace3.toString();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1, -2147483648)" + "'", str19, "(1, -2147483648)");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1660");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        int int7 = gamePlace3.y();
        gamePlace3.y((int) (short) -1);
        int int10 = gamePlace3.x();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1661");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       0 S" + "'", str3, "       0 S");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1662");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1663");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='2 M', score=4}", "GamePlayer{name='####################################################################################################', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("      1st ", "GamePlayer{name='(invalid)', score=373}", "", "(1, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1665");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 3, (-6), 59, (-1), 9);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1666");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gameConfiguration5);
        org.junit.Assert.assertNotNull(gameConfiguration6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1667");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 366, (-6), (int) (byte) 1, (-2147483549), 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1668");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("(10, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1669");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483642), byteArray6, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 28 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1670");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(0, 28)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1671");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483549);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1672");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 S" + "'", str1, "52 S");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1673");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1674");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-1 S######");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1675");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0100-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1676");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        int int4 = gamePlace3.y();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("68 Y", "0100-10-31", "(366, 3)", "0000-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1678");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0366-09-30", "-2147483334 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1679");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483583), 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1680");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483647, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1681");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaa(0, 4)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1682");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483596, (-104), (int) (short) 0, 28, (-104), 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1683");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1684");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483382);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1685");
        byte[] byteArray5 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1686");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, (-421), (int) (short) -1, (-2147483549));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1687");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), (-6), 120, 2147483639, (-6), 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1688");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                          aaaaaaaaaa", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          aaaaaaaaaa" + "'", str3, "                                                                                          aaaaaaaaaa");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Feb", "####################################################################################################", "(-1, -2147483648)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1690");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1691");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Jan", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jan" + "'", str3, "Jan");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1692");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0365-09-30", "-2147483345 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1693");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, -2147483648)", "(52, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1694");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("59 S", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "59 S" + "'", str3, "59 S");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 M", "                                                                                          aaaaaaaaaa", "9 S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1696");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(1, -2147483648)", "7 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1697");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1698");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-104));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1699");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.y();
        int int9 = gamePlace7.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace7.clone();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(gamePlace10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1700");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 58 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1701");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, -2147483648)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01", "a", "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1702");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft(" ###################################################################################################", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ###################################################################################################" + "'", str3, " ###################################################################################################");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1703");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483639, 0, 2147483639, (-2147483334), 30, 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1704");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 2147483549, (int) (byte) 1, (-2147483345));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1705");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1706");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}", "1st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("       Oct", "GamePlayer{name='(invalid)', score=-2147483648}", "GamePlayer{name='Anonymous Player', score=0}", "(0, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1708");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1709");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-001-09-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1710");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10 S", "(10, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1711");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, (int) (byte) -1, (int) (short) 10, 2147483619, 31, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1712");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(10, 4)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1713");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1714");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0010-09-01", "#################################################################################################9th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1715");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, -1)", "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1716");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(414, (-2147483549), (-2147483648));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1717");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(414, 2147483605);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1718");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1719");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("       Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1720");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648 S", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################-2147483648 S" + "'", str3, "#######################################################################################-2147483648 S");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1721");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1722");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 S" + "'", str1, "32 S");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1723");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483334), (int) (byte) 10, (int) (short) 0, 0, 97, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1724");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 10)", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   (0, 10)" + "'", str3, "   (0, 10)");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1725");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, -2147483648)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1726");
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
        gamePlace16.x(2147483549);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0031-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1728");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray6, (-2147483345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483345 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1729");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2147483596-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483596 + "'", int1 == 2147483596);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1730");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(0, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1731");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "GamePlayer{name='                                                                                                    ', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483335 S", "GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}", "#############################################################################################(1, -1)", "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1733");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("          ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1734");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483345), (-2147483549));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1735");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10th");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = gamePlayer3.clone();
        org.junit.Assert.assertNotNull(gamePlayer4);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1736");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("#############################################################################################(1, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1737");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        gamePlace3.y((-2147483648));
        gamePlace3.x((-2147483642));
        int int8 = gamePlace3.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        gamePlace9.y(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483642) + "'", int8 == (-2147483642));
        org.junit.Assert.assertNotNull(gamePlace9);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1738");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Sep");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1739");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(31, 2147483605, 9, 2147483639, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1740");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, 100)", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("35 S", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1 S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, " + "'", str10, "(1, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(-1, " + "'", str11, "(-1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 " + "'", str12, "35 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 " + "'", str13, "1 ");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1741");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '4', 100, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1742");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(373, (-2147483613));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1743");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483613));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483613 S" + "'", str1, "-2147483613 S");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1744");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(365, 100, 0, (int) (byte) 10, (int) (short) 100, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1745");
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
        int[] intArray65 = gameConfiguration64.countPiecesPerPlayer();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList66 = gameConfiguration64.getEmptyPlaces();
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
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlaceList66);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1746");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', 1, 58, (-104));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1747");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483606);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1748");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, (-2147483335), (-2147483648), 1, 3, (-6));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1749");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-214", "Anonymous ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1750");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1751");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject0.new GamePlace(366, 30);
        int int14 = gamePlace13.x();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 366 + "'", int14 == 366);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1752");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1753");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483619, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1754");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Oct 1", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          10th Oct 1" + "'", str3, "                                                                                          10th Oct 1");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1755");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483605, 414);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1756");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-6));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 100, 2147483619, 52, 365, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1758");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483606, 2147483645, 366, (-2147483345));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1759");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='(invalid)', score=373}", "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 366, (-2147483642), 0, 2147483382, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1761");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 2147483605);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1762");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(58, -2147483648)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1763");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1764");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(0, 1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1765");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483583), 2147483382);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1766");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483642), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1767");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        java.lang.String str18 = gamePlace16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, -2147483648)" + "'", str18, "(0, -2147483648)");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1768");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, (int) (short) 100, (int) (byte) 10, (-104), 2147483596, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1769");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 4)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1770");
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
        boolean boolean17 = gameConfiguration16.isBoardFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1771");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483345), byteArray1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1772");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        boolean boolean7 = gameConfiguration6.isBoardFull();
        int int8 = gameConfiguration6.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1773");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(28, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0028-01-01" + "'", str2, "0028-01-01");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1774");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483606, (-6), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1775");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-001-09-01", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-001-09-01" + "'", str3, "-001-09-01");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1776");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        gamePlace3.y(1);
        java.lang.String str12 = gamePlace3.toString();
        gamePlace3.y((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, 1)" + "'", str12, "(1, 1)");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1777");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0031-10-01", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0031-10-01" + "'", str3, "0031-10-01");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1778");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th Jan 0", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Jan 0" + "'", str3, "10th Jan 0");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1779");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1780");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) 'a', (int) '#', (int) 'a', 2147483606, 373, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1781");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483382);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1782");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(373, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1783");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(373, byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1784");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        int int12 = gamePlace3.x();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace16.x(1);
        java.lang.String str19 = gamePlace16.toString();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (byte) 10, (-2147483648));
        int int24 = gamePlace16.manhattanDistance(gamePlace23);
        gamePlace23.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace23.clone();
        boolean boolean28 = gamePlace3.isAdjacent(gamePlace23);
        gamePlace23.y(2147483605);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1, -2147483648)" + "'", str19, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1785");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 10)", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1786");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray4 = gameConfiguration2.getInitialBoard();
        gameConfiguration2.clearInitialBoard();
        boolean boolean6 = gameConfiguration2.isBoardFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1787");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1788");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("6 M", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       6 M" + "'", str3, "       6 M");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='          ', score=0}", "aaaaaaaaaa                                                                                          ", "GamePlayer{name='                                                                                                    ', score=0}", "GamePlayer{name='(10, 52)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1790");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483613));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1791");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray7, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 366 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1792");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(invalid)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (invalid)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1794");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = subject0.new GameConfiguration((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1795");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1796");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1797");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), (int) (byte) 10, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1798");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1799");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0100-04-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1800");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=59}", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1801");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483645);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1802");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mar" + "'", str1, "Mar");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1803");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-10-01", "GamePlayer{name='(invalid)', score=-2147483583}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1804");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) 'a', (int) (short) 1);
        int int9 = gamePlace8.y();
        java.lang.Class<?> wildcardClass10 = gamePlace8.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1805");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, 32, 2147483647, 4, (-1), 30);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1806");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1807");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace3.x((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1808");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "1st", "0010-09-01", "GamePlayer{name='##(52, -1)', score=32}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1809");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1810");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(3, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1811");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Sep", "10th Jan 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1812");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -1)", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, -1)" + "'", str12, "(1, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0, " + "'", str13, "(0, ");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1813");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration2.getPlayers();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace11.x(1);
        java.lang.String str14 = gamePlace11.toString();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) (byte) 10, (-2147483648));
        int int19 = gamePlace11.manhattanDistance(gamePlace18);
        int int20 = gamePlace11.x();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = subject21.new GamePlace((int) '4', (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = subject21.new GamePlace((-1), (int) (short) 100);
        boolean boolean28 = gamePlace11.isAdjacent(gamePlace27);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace11.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace29.clone();
        boolean boolean31 = gameConfiguration2.isOccupied(gamePlace29);
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray32 = gameConfiguration2.getInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1, -2147483648)" + "'", str14, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray32);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1814");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(1, -1)", "4th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1815");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(invalid)', score=-2147483583}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1817");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483613), 58, 2, 4, 100, 2147483549);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0365-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1819");
        byte[] byteArray5 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1820");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1821");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 2147483549, 2147483549);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1822");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        java.lang.String str6 = gamePlayer5.getName();
        java.lang.Object obj7 = null;
        boolean boolean8 = gamePlayer5.equals(obj7);
        gamePlayer5.addScore(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, -2147483648)" + "'", str6, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1823");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray4 = gameConfiguration2.getInitialBoard();
        java.lang.Class<?> wildcardClass5 = gamePlayerArray4.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1824");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-12 S", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-12 Saaaaa" + "'", str3, "-12 Saaaaa");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0366-09-30", "2147483619-01-31", "(0, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1826");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483639);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1827");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 2147483549);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1828");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th", " ###################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1829");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1830");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-104), 2147483549, 0, 2147483606, (-2147483583), 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1831");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0030-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[30, 0, 0, 0]");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1832");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483549 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1833");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(32, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1834");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, -1)", "(52, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1835");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-12));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1836");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (-6));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1837");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, 4)", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 4)" + "'", str3, "(0, 4)");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1838");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-6), byteArray5, (-2147483335));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483335 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1839");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(414, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1840");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1841");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1842");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1843");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1844");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 366)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1845");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-001-03-31", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          -001-03-31" + "'", str3, "                                                                                          -001-03-31");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 2, 414, (-6), 32, 414);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1847");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1848");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1849");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1850");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483335), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1851");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#################################################################################################9th", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################9th" + "'", str3, "#################################################################################################9th");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1852");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1853");
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
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray18 = gameConfiguration17.getPlayers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertNotNull(gameConfiguration17);
        org.junit.Assert.assertNotNull(gamePlayerArray18);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1854");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483583), 2147483606);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1855");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 366, 120, 2147483596);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1856");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483642 S", "7 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1857");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-12 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(-1, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1858");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1859");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 2147483605);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1860");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', 10, (-421), 414);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1861");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0 ", "GamePlayer{name='Anonymous Player', score=59}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1862");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("##################################################################################################Ga", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1863");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##(52, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1864");
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
        java.lang.String str26 = gameConfiguration2.toString();
        int int27 = gameConfiguration2.getSize();
        boolean boolean28 = gameConfiguration2.isBoardSymmetric();
        java.lang.String str29 = gameConfiguration2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str26, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str29, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1865");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Feb", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Feb" + "'", str3, "Feb");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1866");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft(" ###################################################################################################", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ###################################################################################################" + "'", str3, " ###################################################################################################");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1867");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', 2147483639);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1868");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1869");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483605, (-12));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1870");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483596, (-2147483549), (-2147483613), 2147483596, 0, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1871");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        gamePlace16.y((int) '#');
        int int20 = gamePlace16.y();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1872");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(35, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1873");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483335), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1874");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483642), (int) 'a', (-2147483583));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1875");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(invalid)", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1876");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(366, 30)", "-1 S######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1877");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483335 S", "GamePlayer{name='aaaaaaaaaa', score=-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1878");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        int int12 = gamePlace3.x();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace16.x(1);
        java.lang.String str19 = gamePlace16.toString();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (byte) 10, (-2147483648));
        int int24 = gamePlace16.manhattanDistance(gamePlace23);
        gamePlace23.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace23.clone();
        boolean boolean28 = gamePlace3.isAdjacent(gamePlace23);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace23.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1, -2147483648)" + "'", str19, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(gamePlace29);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1879");
        char[] charArray7 = new char[] { '4', 'a', '#' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S#", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ga" + "'", str8, "Ga");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 S" + "'", str9, "-1 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 S#" + "'", str11, "-1 S#");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1880");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = subject4.new GameConfiguration(9);
        java.lang.String str7 = gameConfiguration6.toString();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) gameConfiguration6);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration6.getEmptyPlaces();
        boolean boolean10 = gameConfiguration6.isBoardSymmetric();
        int int11 = gameConfiguration6.getSize();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str7, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1881");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(1, -1)", "7 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1882");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483648-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1883");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) 'a', (-2147483345), 365, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("35 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35 ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1885");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1886");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 58, 58, 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1887");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483619);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1888");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 365, 366, (int) (short) 100, 9, (-6));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1889");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1890");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray5, 2147483549);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483549 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1891");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-12));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1892");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1893");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-1, ", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, " + "'", str3, "(-1, ");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1894");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-421), (-2147483345), 100, (int) '4', 2147483606, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1895");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483345), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1896");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1897");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("6 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1898");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace3.x((int) (short) 0);
        java.lang.String str14 = gamePlace3.toString();
        gamePlace3.y(9);
        int int17 = gamePlace3.x();
        gamePlace3.y(35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, -2147483648)" + "'", str14, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1899");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, 2147483596, (-104), 120, 28, 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1900");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1901");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (int) (short) 1, 9, (-6), 120, 2147483639);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1902");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(366, 3)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1903");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483382, (-2147483549));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1904");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}", "(52, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-001-03-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1906");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                          10th Oct 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1907");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 2147483596, (-2147483613), 30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1908");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483645, (-421));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1909");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, 100)", "9 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1910");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("35 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1911");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483583-10-01', score=0}", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483583-10-01', score=0}" + "'", str3, "GamePlayer{name='-2147483583-10-01', score=0}");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1912");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1913");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, -2147483648)", "0001-01-31", "32 S", "                                                                                                 Oct");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 10, 120, (-2147483335), 2147483602, 2147483645, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1916");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483334), 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1917");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S######", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S######", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 S#" + "'", str12, "-1 S#");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 S#" + "'", str13, "-1 S#");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1918");
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
        int int24 = gamePlayer23.getScore();
        boolean boolean26 = gamePlayer23.equals((java.lang.Object) 59);
        gamePlayer23.resetScore();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1919");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-1 S######", "(0, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1920");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(365);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1921");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Anonymous ", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          aaaaaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Anonymous " + "'", str12, "Anonymous ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                          a" + "'", str13, "                                                                                          a");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1922");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1 S", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1923");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, (-6), (-2147483583), 4, 365, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1924");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 100)", "2147483619-02-28", "(0, -2147483648)", "#################################################################################################9th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1925");
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
        int int18 = gameConfiguration17.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertNotNull(gameConfiguration17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1926");
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
        int[] intArray16 = gameConfiguration2.countPiecesPerPlayer();
        gameConfiguration2.clearInitialBoard();
        int int18 = gameConfiguration2.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration19 = gameConfiguration2.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration19);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1927");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483549, (-2147483335));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, -2147483648)####################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, -2147483648)####################################################################################");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1929");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(52, 2147483602, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1930");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0032-09-01" + "'", str2, "0032-09-01");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1931");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-6));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1932");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        gameConfiguration2.clearInitialBoard();
        int int7 = gameConfiguration2.getSize();
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1933");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(30, (int) (short) 0, 1, 4, 2147483549, 2147483602);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1934");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-421), (int) '#', (int) (short) 100, (-6), 97, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1935");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1936");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = subject0.new GameConfiguration(28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1937");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2147483605-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1938");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (int) (short) 10, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1939");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th", "-2147483335 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1940");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(366, 30)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1941");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Ga", "                                                                                          -001-03-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1942");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("214");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 214 + "'", int1 == 214);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1943");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=365}", "-2147483549 S", "-421 S", "0100-04-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1945");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1946");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        int[] intArray3 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray4 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        java.lang.String str7 = gameConfiguration6.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str7, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1947");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, 32, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1948");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer("(1, 1)");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1949");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(58, 59, (-2147483334), 2147483596, 2147483605, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1950");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483648), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1951");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Ga", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ga                                                                                                  " + "'", str3, "Ga                                                                                                  ");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1952");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, 28)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (0, 28)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1953");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(214, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1954");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1955");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 100, 373);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1956");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1957");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='', score=-2147483648}", "2147483619-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1958");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(59, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1959");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1960");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-001-09-01", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-001-09-01" + "'", str3, "-001-09-01");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1961");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        gamePlace3.y(1);
        int int12 = gamePlace3.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jan", "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0365-01-01", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1963");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, -1)", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, -1)" + "'", str3, "(10, -1)");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1964");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 2, (-2147483583));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1965");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1966");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4", "214");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1968");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-001-03-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1969");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        java.lang.String str4 = gamePlace3.toString();
        int int5 = gamePlace3.x();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, -1)" + "'", str4, "(52, -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1970");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(10, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1971");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1972");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 2147483647, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1973");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483605, (-2147483335));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1974");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0010-02-28");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10, 0, 0, 0]");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1975");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483334));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1976");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(366, 52)", "Apr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1977");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483335 S", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483335 S" + "'", str3, "-2147483335 S");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1978");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##########", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1979");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(414, 2147483645, (-2147483613), (int) (byte) 1, (-2147483583), (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1980");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 477214174 + "'", int1 == 477214174);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1981");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("       Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1982");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-12));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1983");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1984");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483606);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1985");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer24 = subject16.new GamePlayer("GamePlayer{name='(0, -2147483648)', score=0}");
        int int25 = gamePlayer24.getScore();
        java.lang.String str26 = gamePlayer24.toString();
        int int27 = gamePlayer24.getScore();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}" + "'", str26, "GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1986");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(373, 2147483639, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1987");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("########Ga", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########Ga" + "'", str3, "########Ga");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1988");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483583-10-01", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483583-10-01" + "'", str3, "-2147483583-10-01");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1989");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("9 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 9 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1991");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Mar", "(1, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1992");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "GamePlayer{name='                                                                                                    ', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1993");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483549);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1994");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-12), (-2147483642), (-2147483335));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1995");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = subject4.new GameConfiguration(9);
        java.lang.String str7 = gameConfiguration6.toString();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) gameConfiguration6);
        gamePlace3.x((int) 'a');
        int int11 = gamePlace3.y();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str7, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1996");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483648 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1997");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0028-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1998");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28th" + "'", str1, "28th");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test1999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9 ", "0365-09-30", "", "32 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test3.test2000");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(120, 0, 2147483549, (int) (byte) 10, 2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

