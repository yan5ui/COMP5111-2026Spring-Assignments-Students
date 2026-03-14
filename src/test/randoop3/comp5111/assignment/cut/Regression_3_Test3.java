package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1501");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(10, (int) '4', 2147483305, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1502");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, 0, 188);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1503");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        int int10 = gamePlace8.x();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1504");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-24));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1505");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 S", "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1506");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(32, -1)", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)" + "'", str3, "(32, -1)");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1507");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483627), byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(399, byteArray6, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -24 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 0]");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1508");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0386-10-01", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0386-10-01" + "'", str3, "0386-10-01");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1509");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1510");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-1 S", "GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1511");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(394);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1512");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1513");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        java.lang.String str6 = gamePlayer2.toString();
        boolean boolean8 = gamePlayer2.equals((java.lang.Object) "0100-10-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str6, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1514");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject0.new GamePlayer("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        gamePlayer16.setScore(0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer19 = gamePlayer16.clone();
        org.junit.Assert.assertNotNull(gamePlayer19);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1515");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1516");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa0 S" + "'", str3, "aaaaaaa0 S");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1517");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1518");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray1, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1519");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10 S', score=4}                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1520");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(30, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1521");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(394, byteArray4, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 152 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0]");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1522");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(100, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (100, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1523");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1524");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(32, 31)", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 31)" + "'", str3, "(32, 31)");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1525");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0029-10-31", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0029-10-31" + "'", str3, "                                                                                          0029-10-31");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1526");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(152, 333);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1527");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1528");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-24), 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-024-02-29" + "'", str2, "-024-02-29");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1529");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(110, byteArray4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1530");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1531");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0004-02-29", "GamePlayer{name='aaaaaa10th', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1532");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 152);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1533");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                                31 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1534");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}" + "'", str3, "GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1535");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-02-28", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-28" + "'", str3, "0010-02-28");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1536");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1537");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("                                                                                           (100, 52)", "GamePlayer{name='10 S', score=366}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1538");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, (-2147483646));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1539");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(133, 394, (int) '4', 37, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1540");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 108, (int) (byte) 100, 394, (int) (byte) -1, 366);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1541");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(89, 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1542");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-252), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1543");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(29, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1544");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray8, 386);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 386 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1545");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483646 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1546");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(31, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-2147483627), (int) (byte) 100, 0, (int) (byte) 0, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1548");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("6 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1549");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483559), (int) ' ', 100, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1550");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=6}", "0000-04-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1551");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(29, byteArray9, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 108 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1552");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-10-01");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1553");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0097-02-28", "0010-02-28");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1554");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 2, 100, 0, 2147483305, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1555");
        char[] charArray8 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M#################################################################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th Oct 366" + "'", str10, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2 M#" + "'", str11, "2 M#");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1556");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(110, 149477148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1557");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("11th Apr 37");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1558");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Apr", "################################################################################################35 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1559");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(386);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1560");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(133, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1561");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, 2147483384, 99, (-2147483648), 22, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1562");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(11, 1, 0, 2147483384, 366, 386);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1563");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1564");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1565");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1566");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483559), 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1567");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-024-10-01", "0100-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1568");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-024-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1569");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2nd");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1570");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1571");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-04-30", "11th Apr 37");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1572");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, 52) ", "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1573");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(149477148);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1574");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("#####################################################################GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1575");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(108, (int) '#', 365, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1576");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(invalid)", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1577");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        gamePlace12.x(100);
        java.lang.String str16 = gamePlace12.toString();
        java.lang.String str17 = gamePlace12.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace12.clone();
        boolean boolean19 = gamePlace4.isAdjacent(gamePlace18);
        gamePlace4.x((-1));
        gamePlace4.x((int) (short) 1);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1578");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, (int) '4', 30, 68);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1579");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        int int7 = gamePlace4.x();
        gamePlace4.y((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = gamePlace4.equals(obj10);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1580");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(394, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0394-06-30" + "'", str2, "0394-06-30");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1581");
        char[] charArray7 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1582");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0001-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1583");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1584");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.resetScore();
        java.lang.String str10 = gamePlayer8.toString();
        java.lang.String str11 = gamePlayer8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str10, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str11, "GamePlayer{name='2 M', score=0}");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1585");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        java.lang.String str10 = gamePlace4.toString();
        java.lang.String str11 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, -1)" + "'", str10, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, -1)" + "'", str11, "(100, -1)");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1586");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.Object obj8 = null;
        boolean boolean9 = gamePlayer2.equals(obj8);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        java.lang.String str20 = gamePlace19.toString();
        gamePlace19.x(100);
        java.lang.String str23 = gamePlace19.toString();
        boolean boolean24 = gamePlace14.isAdjacent(gamePlace19);
        gamePlace14.x(4);
        boolean boolean27 = gamePlayer2.equals((java.lang.Object) 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(32, -1)" + "'", str20, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(100, -1)" + "'", str23, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1587");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1588");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        java.lang.String str7 = gamePlace3.toString();
        java.lang.String str8 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32, -1)" + "'", str7, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, -1)" + "'", str8, "(32, -1)");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1589");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1590");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        java.lang.String str14 = gamePlace13.toString();
        int int15 = gamePlace13.y();
        int int16 = gamePlace13.x();
        gamePlace13.y(31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace13.clone();
        boolean boolean20 = gamePlace5.equals((java.lang.Object) gamePlace19);
        int int21 = gamePlace19.x();
        java.lang.String str22 = gamePlace19.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, -1)" + "'", str14, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, 31)" + "'", str22, "(32, 31)");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1591");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(31, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1592");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(399, 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1593");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(100, 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0100-11-30" + "'", str2, "0100-11-30");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1594");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 0, 10]");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1595");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-252), 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1596");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483627));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1597");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(333);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1598");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) -1, 31, 31, 188, 2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1599");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0100-11-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1600");
        comp5111.assignment.cut.Subject subject1 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject1.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject1.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        java.lang.String str14 = gamePlace13.toString();
        int int15 = gamePlace13.y();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        java.lang.String str21 = gamePlace20.toString();
        int int22 = gamePlace20.y();
        boolean boolean23 = gamePlace13.isAdjacent(gamePlace20);
        int int24 = gamePlace13.x();
        boolean boolean25 = gamePlace7.isAdjacent(gamePlace13);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace7.clone();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray33, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray33, (int) (byte) 0);
        boolean boolean38 = gamePlace7.equals((java.lang.Object) byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(29, byteArray33, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, -1)" + "'", str14, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(32, -1)" + "'", str21, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1601");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(394, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1602");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483305, (-2147483559), 79, 0, 10, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1603");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("##########", "                                                                                          0029-10-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1604");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(10, (-2147483627), 2147483305, (int) (short) 100, 0, 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1605");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', (-2147483627), 79, 333);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1606");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483646));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1607");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th######", "GamePlayer{name='Anonymous Player', score=0}", "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Jan4444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1608");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(399, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0399-04-30" + "'", str2, "0399-04-30");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1609");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("                                                                                          0029-10-31", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0029-10-31" + "'", str3, "                                                                                          0029-10-31");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1610");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(366, 108, (int) (short) 1, 333, (-252), 394);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1611");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(365, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0365-01-01" + "'", str2, "0365-01-01");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1612");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings(" (32, 365)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1613");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1614");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2nd", "31st");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 0)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1616");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1617");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(32, 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1618");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, (-2147483627), 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1619");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, (int) (short) -1, 2, (int) (byte) 100, (int) ' ', (-252));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1620");
        comp5111.assignment.cut.Subject subject1 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject1.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject1.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        java.lang.String str14 = gamePlace13.toString();
        int int15 = gamePlace13.y();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        java.lang.String str21 = gamePlace20.toString();
        int int22 = gamePlace20.y();
        boolean boolean23 = gamePlace13.isAdjacent(gamePlace20);
        int int24 = gamePlace13.x();
        boolean boolean25 = gamePlace7.isAdjacent(gamePlace13);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace7.clone();
        byte[] byteArray33 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray33, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray33, (int) (byte) 0);
        boolean boolean38 = gamePlace7.equals((java.lang.Object) byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483627), byteArray33, 2147483384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483384 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, -1)" + "'", str14, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(32, -1)" + "'", str21, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1621");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.y((int) (byte) -1);
        java.lang.String str11 = gamePlace4.toString();
        java.lang.Class<?> wildcardClass12 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, -1)" + "'", str11, "(100, -1)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1622");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(133, byteArray8, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 152 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 0, 10]");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1623");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Jan");
        gamePlayer5.addScore(0);
        gamePlayer5.addScore(6);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1624");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jan4444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1625");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-252), byteArray7, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 366 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1626");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483348 S", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1627");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='0 S', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1628");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("11 S", "##########                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1629");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        int int11 = gamePlace7.y();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1630");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.resetScore();
        gamePlayer2.setScore((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1631");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(399, 22, 0, 0, 0, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1632");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th######", "10th######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1633");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" (32, 365)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1634");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(99, 0, 2, 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1635");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 386);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1636");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483646), 365, (int) (byte) 10, (-2147483646), (-2147483627), 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1637");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, 0)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1638");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        gamePlace7.y(0);
        gamePlace7.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace7.clone();
        gamePlace15.y((int) (short) 100);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1639");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}", "#####################################################################GamePlayer{name='0 S', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1640");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1641");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483348 S", "                                                                                          0029-10-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1642");
        char[] charArray3 = new char[] { '4', '#' };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4, #]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0052-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1644");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1645");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(32, 31)", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 31)" + "'", str3, "(32, 31)");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1646");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                31 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0010-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1648");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(188, 79, 4, (-2147483348), 100, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1649");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#####################################################################GamePlayer{name='0 S', score=0}", "(32, 365)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1650");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" (100, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1651");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(11, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1652");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0000-10-01", "0029-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1653");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-1 S', score=0}", "(100, 10)a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" (100, -1)", "31 S################################################################################################", "hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1655");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(394);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1656");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        gamePlace12.x(100);
        java.lang.String str16 = gamePlace12.toString();
        java.lang.String str17 = gamePlace12.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace12.clone();
        boolean boolean19 = gamePlace4.isAdjacent(gamePlace18);
        gamePlace4.x((-1));
        java.lang.String str22 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(-1, -1)" + "'", str22, "(-1, -1)");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1657");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='aaaaaa10th', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1658");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1659");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483549), 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1660");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(333, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1661");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(399, 0, 333, (-2147483559));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1663");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='aaaaaa10th', score=0}", "aaaaaaa0 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1664");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace6.clone();
        gamePlace6.y((int) (short) 100);
        gamePlace6.y((int) '4');
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1665");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#(100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #(100, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1666");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(394, 1, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3555) + "'", int4 == (-3555));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1667");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        java.lang.String str12 = gamePlace11.toString();
        int int13 = gamePlace11.y();
        boolean boolean14 = gamePlace4.isAdjacent(gamePlace11);
        gamePlace11.y((-2147483648));
        int int17 = gamePlace11.y();
        java.lang.String str18 = gamePlace11.toString();
        java.lang.String str19 = gamePlace11.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(32, -2147483648)" + "'", str18, "(32, -2147483648)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(32, -2147483648)" + "'", str19, "(32, -2147483648)");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1668");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(37, 30, 2147483384);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1669");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483559));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1670");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(22, 31, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1671");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer();
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1672");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        java.lang.String str12 = gamePlace11.toString();
        int int13 = gamePlace11.y();
        boolean boolean14 = gamePlace4.isAdjacent(gamePlace11);
        java.lang.String str15 = gamePlace4.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace4.clone();
        java.lang.Class<?> wildcardClass18 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(32, -1)" + "'", str15, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1673");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(10, (int) (byte) 10, (-2147483646), (-2147483559));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1674");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1675");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y((int) (byte) 10);
        gamePlace6.x(100);
        int int11 = gamePlace6.x();
        java.lang.String str12 = gamePlace6.toString();
        int int13 = gamePlace6.y();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 10)" + "'", str12, "(100, 10)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1676");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace6.manhattanDistance(gamePlace11);
        java.lang.Class<?> wildcardClass13 = gamePlace11.getClass();
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1677");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace(188, 2147483305);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer();
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1678");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("11 S", "2 M#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1679");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(97, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1680");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1681");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(149477148, 149477148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1682");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1683");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(37, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1684");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483627), (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1685");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, (int) ' ', 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1686");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1687");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 29, 100, 333);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1688");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2, 100, (int) (byte) 0, (int) (short) -1, (-2147483646), 35);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1689");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483549), 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1690");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.y((int) (byte) -1);
        java.lang.String str11 = gamePlace4.toString();
        gamePlace4.y((int) '4');
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, -1)" + "'", str11, "(100, -1)");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1691");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(133, 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1692");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#(100, -1)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#(100, -1)##########################################################################################" + "'", str3, "#(100, -1)##########################################################################################");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1693");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Jan4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1694");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(37, (int) ' ', (int) (byte) 100, 394, 399, 188);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1695");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(29, 399, 37, (int) (byte) -1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1696");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483305, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1698");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 35, (int) ' ', 97, (-2147483627), 2147483384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1699");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-024-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1700");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-3555));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1701");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(37, (-3555), 188, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1702");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 0, (-3555));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1703");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1704");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483305, 10, 97, (int) 'a', 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1705");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1staaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1706");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jun" + "'", str1, "Jun");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1707");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "hi!", "10 S", "hi!", "10 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10th");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10th");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1709");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-11-30", "GamePlayer{name='(32, -1)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1710");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 399, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1711");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-24), 100, 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1712");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("########################################################################################## (100, -1)", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################## (100, -1)" + "'", str3, "########################################################################################## (100, -1)");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1713");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 0, 0, (int) (byte) 10, 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10 S', score=366}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10 S', score=366}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1715");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("3 M");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1716");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10 S', score=4}                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10 S', score=4}                                                                    ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1717");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1718");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 M#################################################################################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1719");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', 100, (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1720");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(99, 366, 0, (-3555));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1721");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 152, (int) (short) 10, 10, (-252), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1722");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-24 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1723");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) -1, 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1724");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Apr", "0399-04-30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                           (100, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                            (100, 52)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1726");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(invalid)", "32 S######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1727");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Oct 100" + "'", str3, "10th Oct 100");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1728");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1729");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr(" (100, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1730");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 10, 22, 149477148);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1731");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1732");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, 35, 399, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(31, 100)", "GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}", "11th Apr 37", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-01-31", "GamePlayer{name='(32, -1)', score=0}", "GamePlayer{name='2 M', score=0}", "-2147483559-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(89, 22, 152, (int) (short) 0, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1736");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-3555));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1737");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, 31)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1738");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1739");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1740");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-24), 152, 2147483305, (int) ' ', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1741");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0052-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1742");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='(32, -1)', score=0}", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='(32, -1)', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='(32, -1)', score=0}");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-01", "22nd Oct 0", "(100, 10)a", "0000-04-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1744");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(29, 133, (-252), 2147483384, (int) 'a', 133);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1745");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0010-10-31", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1746");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483559), 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483559-02-01" + "'", str2, "-2147483559-02-01");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1747");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("7 M                                                                                                 ", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7 M                                                                                                 " + "'", str3, "7 M                                                                                                 ");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1748");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-3555), byteArray10, (-2147483627));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483627 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1749");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaa0 S", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='0 S', score=0}", "0010-02-01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S", "(-1, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1751");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1752");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-3555));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-3555 S" + "'", str1, "-3555 S");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1753");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, 2147483384, 10, (int) (short) 1, 79, 52);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1754");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(399);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='2 M', score=365}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='2 M', score=365}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1756");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) (short) 100, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1757");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-01-01" + "'", str2, "0010-01-01");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1758");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 100, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1759");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=100}", "6 M", "0010-10-31", "0366-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1760");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(6, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1761");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("32 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32, 0, 0, 0]");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1762");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.y((int) (byte) 0);
        gamePlace4.y((-2147483627));
        org.junit.Assert.assertNotNull(gamePlace4);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1763");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 0, (-2147483627), (-252), 133, (int) (byte) 100, (-2147483648));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1764");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0029-10-31", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0029-10-31" + "'", str3, "0029-10-31");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1765");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("52 S", "(32, -214");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1766");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        gamePlayer7.addScore(68);
        gamePlayer7.setScore((-2147483348));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1767");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-214", "2nd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1768");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th######", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10th Oct 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10t\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1771");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, 365)", "GamePlayer{name='-1 S', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1772");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(188, (-2147483559), 394);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1773");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        java.lang.String str6 = gamePlace5.toString();
        gamePlace5.x((int) (short) 1);
        int int9 = gamePlace5.y();
        java.lang.String str10 = gamePlace5.toString();
        java.lang.String str11 = gamePlace5.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, -1)" + "'", str10, "(1, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -1)" + "'", str11, "(1, -1)");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1774");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1, 6, (-24), 32, 133, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1775");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1st", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st" + "'", str3, "1st");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1776");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(188);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1777");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(110, (-2147483627));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1778");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(0, 2);
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject6.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        int int15 = gamePlace14.x();
        boolean boolean16 = gamePlace5.isAdjacent(gamePlace14);
        int int17 = gamePlace5.x();
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1779");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("##########");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1780");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483305, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1781");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1782");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(149477148, (-24), 149477148);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1783");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1 S#######", "0000-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1784");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace4.clone();
        gamePlace4.x((int) '#');
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        int int13 = gamePlace12.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace12.clone();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace18.clone();
        int int21 = gamePlace14.manhattanDistance(gamePlace18);
        boolean boolean22 = gamePlace4.equals((java.lang.Object) gamePlace18);
        int int23 = gamePlace18.x();
        int int24 = gamePlace18.x();
        int int25 = gamePlace18.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1785");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("                                                                                          22nd Oct 0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1786");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1787");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("7 M                                                                                                 ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[7, 0, 0, 0]");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1788");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "32 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1789");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Apr", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Apr" + "'", str3, "Apr");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1790");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1791");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(6, 149477148, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1792");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=100}", "-2147483559-02-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1793");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(97, (int) (short) 1, 100, 97, 108, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1794");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483559 S", "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1795");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("11th Apr 37", "0001-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1796");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Oct", "(32, -1)44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1797");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0000-04-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1798");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='2 M', score=0}", "35 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1799");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30 S" + "'", str1, "30 S");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1800");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-001-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1801");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-001-06-30" + "'", str2, "-001-06-30");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1802");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0386-10-01", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0386-10-01" + "'", str3, "0386-10-01");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1803");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(188, (int) (byte) 0, (-24));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1804");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 79);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1805");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(110, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1806");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1807");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          22nd Oct 0", "                                                                                                31 S", "                                                                                           (100, 52)", "(10, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1808");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        int int8 = gamePlace7.y();
        java.lang.String str9 = gamePlace7.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace7.clone();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        java.lang.String str16 = gamePlace15.toString();
        gamePlace15.x(100);
        java.lang.String str19 = gamePlace15.toString();
        int int20 = gamePlace7.manhattanDistance(gamePlace15);
        java.lang.String str21 = gamePlace15.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace15.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(10, -2147483648)" + "'", str9, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(100, -1)" + "'", str19, "(100, -1)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2147483559) + "'", int20 == (-2147483559));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(100, -1)" + "'", str21, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace22);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(365, -1)", "2nd", "#", "(32, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1810");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, 99, 399);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1811");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 0, 333, 152, 133, (int) (byte) -1, (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1812");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, 10)", "(100, 10)a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1813");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(31, 100)", " (32, 365)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1814");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 100)", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 100)" + "'", str3, "(100, 100)");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1815");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("################################################################################################35 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1816");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        java.lang.String str14 = gamePlace13.toString();
        int int15 = gamePlace13.y();
        int int16 = gamePlace13.x();
        gamePlace13.y(31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace13.clone();
        boolean boolean20 = gamePlace5.equals((java.lang.Object) gamePlace19);
        int int21 = gamePlace19.x();
        int int22 = gamePlace19.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, -1)" + "'", str14, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0052-01-31", "-2147483648-01-31", "(100, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1818");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("35 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[35, 0, 0, 0]");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1819");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1820");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1821");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Nov" + "'", str1, "Nov");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1822");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483305, (-3555), 37, (int) ' ', 188, (-252));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1823");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483549), 108, 100, 1, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1824");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0100-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1825");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace4.clone();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject11.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject11.new GamePlayer("GamePlayer{name='10 S', score=4}");
        gamePlayer14.addScore(1);
        gamePlayer14.setScore(399);
        boolean boolean19 = gamePlace4.equals((java.lang.Object) gamePlayer14);
        gamePlayer14.setScore((-2147483348));
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1826");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("                                                                                           (100, 52)", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           (100, 52)" + "'", str3, "                                                                                           (100, 52)");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1827");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1828");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-01-01", "(32, -1)44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1829");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1830");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight(" (100, -1)", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " (100, -1)" + "'", str3, " (100, -1)");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1831");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(99, (-2147483646), 333, 99, 0, 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1832");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(22, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0022-10-31" + "'", str2, "0022-10-31");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1833");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='10 S', score=6}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1834");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = gamePlace3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(-1, -1)" + "'", str4, "(-1, -1)");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1835");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        int int7 = gamePlace4.x();
        gamePlace4.y(31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace4.clone();
        gamePlace4.y((int) (byte) 100);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(gamePlace10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1836");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 S", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1837");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483559-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1838");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1839");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1840");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-024-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1841");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(32, 365)", "31 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1842");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        java.lang.String str6 = gamePlayer5.getName();
        gamePlayer5.setScore((int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer5.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, -1)" + "'", str6, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1843");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', 110, 0, 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1844");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, (int) (short) -1, (int) (short) 10, 152);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1845");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483648), (-3555));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1846");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10 S', score=100}", "10th######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1847");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='(32, -1)', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1848");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        java.lang.String str18 = gamePlace17.toString();
        gamePlace17.x(100);
        java.lang.String str21 = gamePlace17.toString();
        boolean boolean22 = gamePlace12.isAdjacent(gamePlace17);
        int int23 = gamePlace5.manhattanDistance(gamePlace17);
        java.lang.String str24 = gamePlace5.toString();
        java.lang.String str25 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = null;
        boolean boolean27 = gamePlace5.isAdjacent(gamePlace26);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(32, -1)" + "'", str18, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(100, -1)" + "'", str21, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 68 + "'", int23 == 68);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(32, -1)" + "'", str24, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(32, -1)" + "'", str25, "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1849");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0052-01-31", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0052-01-31" + "'", str3, "0052-01-31");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1850");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483549));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483549 S" + "'", str1, "-2147483549 S");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1851");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2, 45, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1852");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483646), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1853");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483559 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1854");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1855");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(365, 100, (-2147483348), 29, 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1856");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(79, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1857");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject3.new GamePlayer("10 S");
        java.lang.String str6 = gamePlayer5.getName();
        int int7 = gamePlayer5.getScore();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        gamePlace12.y((int) (byte) 0);
        boolean boolean15 = gamePlayer5.equals((java.lang.Object) (byte) 0);
        boolean boolean16 = gamePlayer1.equals((java.lang.Object) (byte) 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlayer17);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1858");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("31 S################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1859");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        java.lang.String str6 = gamePlayer2.getName();
        int int7 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 S" + "'", str5, "10 S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1860");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("22 S", "32 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1861");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(89, 0, (-2147483559), 386);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1862");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 149477148)", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 149477148)" + "'", str3, "(0, 149477148)");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1863");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='2 M', score=0}", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str3, "GamePlayer{name='2 M', score=0}");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1864");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray11, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 31 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 10]");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1865");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-01-01", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-01-01" + "'", str3, "0100-01-01");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1866");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483646), (-3555), 399, 79, (-2147483627), 35);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1867");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        int int14 = gamePlace12.y();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        java.lang.String str20 = gamePlace19.toString();
        int int21 = gamePlace19.y();
        boolean boolean22 = gamePlace12.isAdjacent(gamePlace19);
        int int23 = gamePlace12.x();
        boolean boolean24 = gamePlace6.isAdjacent(gamePlace12);
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = subject25.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = subject29.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace35 = subject29.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace35.clone();
        int int37 = gamePlace28.manhattanDistance(gamePlace35);
        int int38 = gamePlace12.manhattanDistance(gamePlace35);
        java.lang.String str39 = gamePlace35.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace40 = gamePlace35.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace41 = gamePlace40.clone();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(32, -1)" + "'", str20, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 31 + "'", int37 == 31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(1, -1)" + "'", str39, "(1, -1)");
        org.junit.Assert.assertNotNull(gamePlace40);
        org.junit.Assert.assertNotNull(gamePlace41);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1868");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("29th Nov 365", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "29th Nov 365" + "'", str3, "29th Nov 365");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1869");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483627), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1870");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 10, 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1871");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-24), 52, 4, 365, (-24), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1872");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', 149477148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1873");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, -2147483648)", "#####################################################################GamePlayer{name='2 M', score=0}", "0010-02-28", "31st");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1874");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='31 S', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1875");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(100, 333, 110, 89, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1876");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(22, (-252));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1877");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(386, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1878");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, (int) ' ', 365, (int) (byte) 0, 149477148, 52);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1879");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1880");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 149477148)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaa10th", "1st", "(100, -1)", "GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1882");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.addScore(399);
        gamePlayer1.addScore(30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1883");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer("(32, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(32, 0);
        java.lang.String str8 = gamePlace7.toString();
        java.lang.String str9 = gamePlace7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, 0)" + "'", str8, "(32, 0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(32, 0)" + "'", str9, "(32, 0)");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1884");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(133, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1885");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        java.lang.String str10 = gamePlace9.toString();
        gamePlace9.x(100);
        java.lang.String str13 = gamePlace9.toString();
        boolean boolean14 = gamePlace4.isAdjacent(gamePlace9);
        gamePlace4.y(4);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(32, -1)" + "'", str10, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(100, -1)" + "'", str13, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1886");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=15}", "0386-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1887");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-252));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-252 S" + "'", str1, "-252 S");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1888");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(152, 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1889");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(2, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1890");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(399, (-2147483549));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1891");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject0.new GamePlace((-24), 32);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject0.new GamePlace((int) (byte) 10, (int) (short) 100);
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = subject21.new GamePlace((int) ' ', (int) (byte) -1);
        int int25 = gamePlace24.x();
        gamePlace24.y((int) (short) 100);
        gamePlace24.x(31);
        boolean boolean30 = gamePlace20.isAdjacent(gamePlace24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1892");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace6.manhattanDistance(gamePlace11);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = null;
        int int15 = gamePlace13.manhattanDistance(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1893");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        gamePlayer2.resetScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = gamePlayer2.clone();
        org.junit.Assert.assertNotNull(gamePlayer4);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1894");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1895");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0097-02-28", "0004-02-29");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1896");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 0, 30, (-1), 99, (-24), 45);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1897");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaa10th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1898");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore(366);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1899");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        java.lang.String str18 = gamePlace17.toString();
        gamePlace17.x(100);
        java.lang.String str21 = gamePlace17.toString();
        boolean boolean22 = gamePlace12.isAdjacent(gamePlace17);
        int int23 = gamePlace5.manhattanDistance(gamePlace17);
        java.lang.String str24 = gamePlace5.toString();
        java.lang.String str25 = gamePlace5.toString();
        gamePlace5.y((-2147483646));
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(32, -1)" + "'", str18, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(100, -1)" + "'", str21, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 68 + "'", int23 == 68);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(32, -1)" + "'", str24, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(32, -1)" + "'", str25, "(32, -1)");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1900");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0000-01-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1901");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-3555), 394);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1902");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        gamePlace12.x(100);
        java.lang.String str16 = gamePlace12.toString();
        java.lang.String str17 = gamePlace12.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace12.clone();
        boolean boolean19 = gamePlace4.isAdjacent(gamePlace18);
        gamePlace4.x((-1));
        java.lang.Object obj22 = null;
        boolean boolean23 = gamePlace4.equals(obj22);
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = subject24.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject24.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace30.clone();
        int int32 = gamePlace31.x();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject33.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = gamePlace36.clone();
        java.lang.String str38 = gamePlace37.toString();
        gamePlace37.x(100);
        java.lang.String str41 = gamePlace37.toString();
        java.lang.String str42 = gamePlace37.toString();
        boolean boolean43 = gamePlace31.isAdjacent(gamePlace37);
        int int44 = gamePlace37.y();
        int int45 = gamePlace4.manhattanDistance(gamePlace37);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(gamePlace31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(gamePlace37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(32, -1)" + "'", str38, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(100, -1)" + "'", str41, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(100, -1)" + "'", str42, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 101 + "'", int45 == 101);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444", "GamePlayer{name='0 S', score=0}", "(32, -1)", "##########                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1904");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        int int14 = gamePlace12.y();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        java.lang.String str20 = gamePlace19.toString();
        int int21 = gamePlace19.y();
        boolean boolean22 = gamePlace12.isAdjacent(gamePlace19);
        int int23 = gamePlace12.x();
        boolean boolean24 = gamePlace6.isAdjacent(gamePlace12);
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = subject25.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject29 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = subject29.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace35 = subject29.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace35.clone();
        int int37 = gamePlace28.manhattanDistance(gamePlace35);
        int int38 = gamePlace12.manhattanDistance(gamePlace35);
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = gamePlace35.clone();
        gamePlace35.x(366);
        int int42 = gamePlace35.y();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(32, -1)" + "'", str20, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 31 + "'", int37 == 31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
        org.junit.Assert.assertNotNull(gamePlace39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1905");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore(366);
        int int7 = gamePlayer2.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 366 + "'", int7 == 366);
        org.junit.Assert.assertNotNull(gamePlayer8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1906");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, 2, 97, (int) ' ', (-2147483648), (-2147483627));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1907");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        java.lang.Class<?> wildcardClass9 = gamePlace7.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1908");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.addScore(32);
        gamePlayer1.resetScore();
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1909");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1910");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        gamePlace3.x(31);
        int int8 = gamePlace3.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        boolean boolean11 = gamePlace3.equals((java.lang.Object) "0010-02-01");
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1911");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=6}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1912");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace9.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace9.clone();
        int int12 = gamePlace5.manhattanDistance(gamePlace9);
        int int13 = gamePlace5.x();
        gamePlace5.x(386);
        java.lang.Class<?> wildcardClass16 = gamePlace5.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1913");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, -214");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1914");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(133, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1915");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer("(32, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(32, 0);
        java.lang.String str8 = gamePlace7.toString();
        gamePlace7.x(97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, 0)" + "'", str8, "(32, 0)");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1916");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 399, (-252), 2147483305, 101, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1917");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(22, 2, 152, 37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1918");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(133);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1919");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1920");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(188, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1921");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(388, byteArray4, (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483549 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0]");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1922");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(366, 29, (-2147483549), (-2147483646));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1923");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1924");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject8.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace15.clone();
        int int17 = gamePlace7.manhattanDistance(gamePlace15);
        java.lang.String str18 = gamePlace7.toString();
        int int19 = gamePlace7.x();
        gamePlace7.y(2147483305);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -1)" + "'", str18, "(1, -1)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1925");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477148, 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1926");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(108, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1927");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, 149477148, (int) (short) 100, 365, 2147483647, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1928");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483559-02-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1929");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.resetScore();
        gamePlayer2.addScore(32);
        java.lang.Object obj9 = null;
        boolean boolean10 = gamePlayer2.equals(obj9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1930");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (short) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1931");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='0010-10-01', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1932");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(101, 99, 394, 22, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1933");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("22nd Oct 0");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[22, 0, 0, 0]");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1934");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='31 S', score=0}", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='31 S', score=0}" + "'", str3, "GamePlayer{name='31 S', score=0}");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1935");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (-252), 2, 366, (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444", "GamePlayer{name='10 S', score=100}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "(32, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1937");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 34 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 10]");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1938");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0394-06-30", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0394-06-30" + "'", str3, "0394-06-30");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1939");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483384, (int) (byte) 1, 99, 110, 101, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1940");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 S", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1941");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(333, byteArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(149477148, byteArray10, 386);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 386 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1942");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1943");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-252), (int) '4', (int) (short) -1, (-24), 2147483647, 2147483305);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1944");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("################################################################################################35 S", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################35 S" + "'", str3, "################################################################################################35 S");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1945");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 29, 399);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(32, 31)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (32, 31)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1947");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#         " + "'", str3, "#         ");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1948");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483648), 394, (int) (short) 100, 152, (-2147483559), (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1949");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648-10-01", "################################################################################################35 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1950");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 100, (int) (byte) 100, (int) (byte) 100, (-24), 29, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1951");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483559), (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1952");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(89, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1953");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='(32, -1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='(32, -1)', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1954");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject7.new GamePlayer();
        int int9 = gamePlayer8.getScore();
        java.lang.String str10 = gamePlayer8.toString();
        java.lang.String str11 = gamePlayer8.toString();
        boolean boolean12 = gamePlayer2.equals((java.lang.Object) str11);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) (byte) 1, 386);
        boolean boolean17 = gamePlayer2.equals((java.lang.Object) (byte) 1);
        int int18 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str10, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str11, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1955");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (int) (short) 1, 2, (-2147483549));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1956");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(110, (-2147483559));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1957");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject0.new GamePlayer("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        gamePlayer16.setScore(0);
        gamePlayer16.addScore(0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = gamePlayer16.clone();
        org.junit.Assert.assertNotNull(gamePlayer21);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1958");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("68 Y", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                68 Y" + "'", str3, "                                                                                                68 Y");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1959");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Jan", "(32, -214");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1960");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, 2147483384, 2147483384, (-24), 30, 388);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1961");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, -1)44");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1962");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(108, (-2147483559), 29, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1963");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0399-04-30", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1964");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1965");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray11, 386);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 386 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 10]");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1966");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        int int7 = gamePlace3.x();
        java.lang.String str8 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, -1)" + "'", str8, "(32, -1)");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1967");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1), (-2147483348), 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1968");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, -2147483648)", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, -2147483648)" + "'", str3, "(-1, -2147483648)");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1969");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1970");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("11 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1971");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), (int) '#', 68, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1972");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(386, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-01-01", "GamePlayer{name='Anonymous Player', score=32}", "0 S", "Anonymous Player");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1974");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(152, (int) (short) 1, (int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1975");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 1, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1976");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 S#######");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1977");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483384, byteArray9, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 22 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1978");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483549), byteArray1, 2147483384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483384 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1979");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(79, byteArray10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1980");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("3 M", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3 M" + "'", str3, "3 M");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1981");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1982");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(34, (int) (byte) 1, 333, 386);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1983");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483647, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1984");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0 S", "22nd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1985");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (-24), 10, 394, 2147483647, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1986");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("52 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("29th Nov 365", "GamePlayer{name='10 S', score=4}", "(32, 365)", "(100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1988");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.setScore((-24));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("22 S", "31st", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1990");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(90, 29, 366);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1991");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(386);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1992");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1993");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1994");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1995");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(101, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-10-31", "aaaaaaa0 S", "(32, 31)", "0010-02-28");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1997");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, (int) (short) 1, 108, 110, (-2147483627), (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1998");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test1999");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st Apr 10", "0001-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test3.test2000");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

