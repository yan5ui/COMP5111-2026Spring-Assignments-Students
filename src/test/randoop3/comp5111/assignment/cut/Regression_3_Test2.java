package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1001");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) 'a', 11, 0, (int) (byte) 1, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1002");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 100, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1003");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1004");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 68, 365, (-2147483627));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1005");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2, (-1), 2, (-2147483559), 22, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1006");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("10 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1007");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(22, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1008");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-24), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1009");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##########                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("4444444444");
        java.lang.String str15 = gamePlayer14.getName();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4444444444" + "'", str15, "4444444444");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 100, 2147483305, (int) '4', 333, 365, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1012");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray9, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 366 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1013");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483627));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1014");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1015");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("31st");
        java.lang.String str3 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31st" + "'", str3, "31st");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-1 S', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-1 S', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        gamePlace7.y(0);
        gamePlace7.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace7.clone();
        java.lang.String str16 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        int int22 = gamePlace21.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace21.clone();
        gamePlace21.x((int) '#');
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace29.clone();
        java.lang.String str31 = gamePlace30.toString();
        gamePlace30.x(100);
        java.lang.String str34 = gamePlace30.toString();
        java.lang.String str35 = gamePlace30.toString();
        gamePlace30.y((int) (short) 100);
        gamePlace30.x((int) (byte) 1);
        boolean boolean40 = gamePlace21.isAdjacent(gamePlace30);
        java.lang.String str41 = gamePlace21.toString();
        int int42 = gamePlace15.manhattanDistance(gamePlace21);
        java.lang.String str43 = gamePlace15.toString();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(-1, 0)" + "'", str16, "(-1, 0)");
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(32, -1)" + "'", str31, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(100, -1)" + "'", str34, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(100, -1)" + "'", str35, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(35, -1)" + "'", str41, "(35, -1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37 + "'", int42 == 37);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(-1, 0)" + "'", str43, "(-1, 0)");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1018");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 100, 365, (int) '4', (int) (byte) 0, 79, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) -1, (int) (short) 0, (-2147483348), 333, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "6 M", "10th Jan 100", "31 S################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1021");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-024-10-01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(31, 100)", "0004-02-29", "(10, -2147483648)", "GamePlayer{name='2 M', score=0}#####################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1023");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 S" + "'", str1, "-1 S");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1024");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("11th Apr 37");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1025");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(365, 99, 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1026");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(333);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1027");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483648), 386, (int) 'a', (int) (short) 10, (-1), 133);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1028");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1st Apr 10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1029");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(79);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1030");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 0, (int) (short) 10, (int) 'a', 333, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1031");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("Ga");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1032");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(386);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1033");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-24), 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10th', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10th', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1036");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1037");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2, 152, 152);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1038");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1039");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (short) 10, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1040");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(399, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1041");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1042");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-10-01", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-10-01" + "'", str3, "0010-10-01");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1043");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483348), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        java.lang.Class<?> wildcardClass13 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1045");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("                                                                                          22nd Oct 0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1046");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th" + "'", str3, "10th");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1047");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("Anonymous Player");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1048");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("31 S", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                31 S" + "'", str3, "                                                                                                31 S");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1049");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("32 S######");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32, 0, 0, 0]");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1050");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("4444444444");
        java.lang.Class<?> wildcardClass15 = gamePlayer14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1051");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1052");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(333, byteArray1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1053");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1054");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-01-01" + "'", str2, "0010-01-01");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1055");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483348));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1056");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(152, byteArray2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1057");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483559 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1058");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(133, byteArray7, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1059");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 22, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1060");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 10)a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1061");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (short) 1, 99, 1, 386, 2147483305);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("1st Apr 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"st Apr 10\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1063");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(399, 333, (-24), (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1064");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (-2147483648), 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1065");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 0)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1066");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483559 S", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483559 S" + "'", str3, "-2147483559 S");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1067");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft(" (100, -1)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################## (100, -1)" + "'", str3, "########################################################################################## (100, -1)");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1068");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483627), 188, (int) (short) 100, (-2147483348), 365, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1069");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1070");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("10th");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10, 0, 0, 0]");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1071");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        int int9 = gamePlace7.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1072");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, 68, 68, (int) (short) 1, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1073");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='2 M', score=365}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                           (100, 52)", "", "4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0001-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1075");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1076");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0052-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1077");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Apr" + "'", str1, "Apr");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1078");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(366, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1079");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 133, (int) ' ', (int) (short) 100, 0, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1080");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483627), 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Jan");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1082");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(152, 31, 100, 2147483305, 79, 399);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1083");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), 333, (-2147483627), (-1), (-2147483348), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1084");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 1]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1085");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(99);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1086");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore(366);
        int int7 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 366 + "'", int7 == 366);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1087");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483648-01-31", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1088");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 99);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1089");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1090");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1091");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        java.lang.String str4 = gamePlayer1.getName();
        gamePlayer1.setScore(4);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Anonymous Player" + "'", str4, "Anonymous Player");
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1092");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-10-01", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-10-01" + "'", str3, "0010-10-01");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1093");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1094");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0000-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1095");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483559 S", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483559 S" + "'", str3, "-2147483559 S");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1096");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', (int) '4', (int) '#', 32, 133, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1097");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 99, (-2147483559), 133, (-24), (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1098");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(22, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.y((int) (byte) 0);
        gamePlace4.x(10);
        org.junit.Assert.assertNotNull(gamePlace4);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(32, 333, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#####################################################################GamePlayer{name='2 M', score=0}", "0100-10-01", "31st", "0004-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1102");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 0, 37, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1103");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1104");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=100}", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10th Oct 366" + "'", str6, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1105");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 10)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 10)" + "'", str3, "(100, 10)");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1106");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1107");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483559 S", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483559 S" + "'", str3, "-2147483559 S");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1108");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='2 M', score=0}#####################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1109");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483348), (-2147483348), (int) (short) 100, (int) (byte) 1, (-2147483559), 399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1110");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(32, -2147483648)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1111");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483559));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1112");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0010-10-01", "22nd Oct 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='0010-10-01', score=0}", "GamePlayer{name='10 S', score=6}", "0052-01-31", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1114");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-24), 100, 4, 394, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1115");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1116");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(152, (int) (short) 0, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(365, -1)", "(100, 52)", "22nd", "(35, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1118");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11 S" + "'", str1, "11 S");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.resetScore();
        java.lang.String[] strArray10 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "hi!", "10 S", "hi!", "10 S" };
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        boolean boolean12 = gamePlayer2.equals((java.lang.Object) strArray10);
        gamePlayer2.resetScore();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1120");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1121");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1122");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) 10, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject4.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject4.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace3.x((int) '4');
        int int15 = gamePlace3.y();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        java.lang.String str21 = gamePlace20.toString();
        int int22 = gamePlace20.y();
        int int23 = gamePlace20.x();
        boolean boolean24 = gamePlace3.isAdjacent(gamePlace20);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(32, -1)" + "'", str21, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1124");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "0100-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1125");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-04-30" + "'", str2, "0000-04-30");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1126");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1127");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject0.new GamePlayer("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = gamePlayer16.clone();
        org.junit.Assert.assertNotNull(gamePlayer17);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1128");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1129");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4444444444", "68 Y");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1130");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-10-31" + "'", str2, "0010-10-31");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1131");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1132");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1133");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 10, (int) (byte) 1, (int) (byte) 10, 152, 2147483305, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1134");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(31, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1135");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 10)a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1136");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("35 S", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################35 S" + "'", str3, "################################################################################################35 S");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1137");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='0010-10-01', score=0}", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1138");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1139");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1140");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483627), byteArray6, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(333, byteArray6, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 365 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 0]");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1141");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1142");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        java.lang.String str6 = gamePlayer5.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer5.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, -1)" + "'", str6, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1143");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='2 M', score=365}", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='2 M', score=365}" + "'", str3, "GamePlayer{name='2 M', score=365}");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "(100, 10)", "                                                                                          22nd Oct 0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject10.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        int int18 = gamePlace9.manhattanDistance(gamePlace16);
        int int19 = gamePlace9.x();
        int int20 = gamePlace4.manhattanDistance(gamePlace9);
        java.lang.String str21 = gamePlace9.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(32, -1)" + "'", str21, "(32, -1)");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1146");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1147");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=365}", charArray3);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1st" + "'", str4, "1st");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='2 M', score=365}" + "'", str5, "GamePlayer{name='2 M', score=365}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str6, "-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1148");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-01-01", "##########                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1149");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(11, 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, -2147483648)", "GamePlayer{name='-1 S', score=0}", " ", "-1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1151");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("11 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1153");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 188);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1154");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, -2147483648)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1155");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1156");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer();
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1157");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ga");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1158");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(394, 35, 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1159");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString(10L);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 S" + "'", str1, "10 S");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1160");
        char[] charArray8 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          22nd Oct 0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                          22nd Oct 0" + "'", str11, "                                                                                          22nd Oct 0");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1161");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(11, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1162");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483559), 394);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1163");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(31, (int) (byte) 100, 68, 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1164");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 29, (int) (byte) -1, 37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1165");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483646));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483646), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1167");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483348));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1168");
        char[] charArray7 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, -2147483648)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, -214" + "'", str10, "(0, -214");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1170");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray7, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 89 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.addScore(365);
        gamePlayer4.addScore(333);
        gamePlayer4.setScore((int) (short) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = gamePlayer4.clone();
        org.junit.Assert.assertNotNull(gamePlayer11);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Ga");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Ga");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1173");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 0, 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1174");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 100, 2, 1, (int) '4', 394);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1175");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, (-1), (-2147483627), 35, 399, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1176");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, (-1), 10, (int) (byte) 100, (-2147483627), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ", "##########                                                                                          ", "0010-02-28", " (100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1178");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1179");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483627), 79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1180");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 100, 29, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1181");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-1), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1182");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer29 = subject25.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = subject25.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = gamePlace32.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = gamePlace33.clone();
        boolean boolean35 = gamePlace12.isAdjacent(gamePlace33);
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace33.clone();
        java.lang.Class<?> wildcardClass37 = gamePlace36.getClass();
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
        org.junit.Assert.assertNotNull(gamePlace33);
        org.junit.Assert.assertNotNull(gamePlace34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1183");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1184");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("(32, -2147483648)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1185");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(22, 333);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1186");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.resetScore();
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1187");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, -1)", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#(100, -1)" + "'", str3, "#(100, -1)");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1188");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -214", "Apr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1189");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(1, -1)", "GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1190");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#(100, -1)", "GamePlayer{name='aaaaaa10th', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1191");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1192");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10 S', score=6}", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=6}" + "'", str3, "GamePlayer{name='10 S', score=6}");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1193");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        int int7 = gamePlace4.x();
        gamePlace4.y(31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace4.clone();
        java.lang.Class<?> wildcardClass11 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1194");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y(0);
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject9.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject9.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        boolean boolean18 = gamePlace6.isAdjacent(gamePlace17);
        gamePlace6.y((int) (short) 100);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1195");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483559 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483559 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1197");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("6 M", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("22 S", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1st" + "'", str7, "1st");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str8, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-24 S" + "'", str9, "-24 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6 M" + "'", str10, "6 M");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "22 S" + "'", str12, "22 S");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1198");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10 S', score=6}", "GamePlayer{name='-1 S', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1199");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1200");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(188, 0, 11, 99, (int) ' ', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1201");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 100, 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1202");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483648), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483648-10-01" + "'", str2, "-2147483648-10-01");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1203");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=0}", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=0}" + "'", str3, "GamePlayer{name='', score=0}");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1204");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 0, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1205");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("6 M", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6 M" + "'", str3, "6 M");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1206");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1207");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483648), 2147483305, 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1208");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10 S', score=4}", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=4}" + "'", str3, "GamePlayer{name='10 S', score=4}");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1209");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1210");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='aaaaaa10th', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1211");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("########################################################################################## (100, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1212");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-1 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1213");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(29, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1214");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(10, -2147483648)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1215");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(386, (int) (byte) 10, 365, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-252) + "'", int4 == (-252));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1216");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0000-04-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-1 S', score=0}", "-2147483648 S", "(invalid)", "(100, 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1218");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 35, (-252), 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1219");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(37);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1220");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483305, 365, 366, 31, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1221");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1222");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(35, -1)", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, -1)" + "'", str3, "(35, -1)");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1223");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(37);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1224");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, -2147483648)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1225");
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
        java.lang.Class<?> wildcardClass40 = gamePlace35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        gamePlace4.x(4);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1227");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(68, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1228");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(37, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = subject0.new GameConfiguration((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1230");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 0, 152);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1232");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1staaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1233");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1234");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483384);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1235");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, 52)", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 52) " + "'", str3, "(100, 52) ");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1236");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("32 S######");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1237");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(37);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1238");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1239");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-024-10-01", "1staaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1240");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, -2147483648)", "2 M", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "10th Oct 366");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1242");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1243");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0010-01-01", "GamePlayer{name='2 M', score=0}#####################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        java.lang.String str16 = gamePlace15.toString();
        int int17 = gamePlace15.y();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        java.lang.String str23 = gamePlace22.toString();
        int int24 = gamePlace22.y();
        boolean boolean25 = gamePlace15.isAdjacent(gamePlace22);
        java.lang.String str26 = gamePlace15.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace15.clone();
        boolean boolean28 = gamePlayer2.equals((java.lang.Object) gamePlace27);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(32, -1)" + "'", str23, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(32, -1)" + "'", str26, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#####################################################################GamePlayer{name='2 M', score=0}", "0097-02-28", "-214", "0100-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1246");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(79, 79, (int) ' ', (-24), (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1247");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("#(100, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1248");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = subject0.new GameConfiguration((-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='2 M', score=0}#####################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='2 M', score=0}#####################################################################");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1250");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 152, (int) ' ', (int) (short) 10, (-2147483627), (-2147483559));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1251");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(366, 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1252");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1253");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(31, 2147483384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1254");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace14.clone();
        gamePlace17.y((int) (short) 100);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlace17);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1256");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray7, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483305, byteArray7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1257");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, (int) ' ', 32, (int) (byte) 100, 79, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1258");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483384, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1259");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0004-02-29");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1260");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaa10th", "(0, -2147483648)", "Jan", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1262");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 366, 0, 2147483305, (int) (short) 10, 22);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1263");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='10 S', score=6}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1264");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(22, (-2147483559));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1265");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, 31, 31, 366, (int) (short) 10, 2);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1266");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(79);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1267");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray10, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483348), byteArray10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1268");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483627), (-2147483627));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1269");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("52 S", "(100, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1270");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, (int) (short) -1, 188);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1271");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0000-01-01", "22 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1272");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(99);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1273");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(99);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1274");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483559), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483559-01-01" + "'", str2, "-2147483559-01-01");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1275");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483646), 89, (int) '4', (int) '#', 365, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1276");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1277");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 0, (int) '4', 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1278");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-24), (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1279");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1280");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='0010-10-01', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1281");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10 S', score=366}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1282");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483384, 133, 2147483305, (int) (short) 10, (int) '#', (-2147483348));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1283");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 S" + "'", str1, "1 S");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1284");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(invalid)", "(31, 100)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1285");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1286");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("35 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10 S", "(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "################################################################################################35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1288");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Oct" + "'", str1, "Oct");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(394);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1290");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1291");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1292");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1293");
        char[] charArray7 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 S" + "'", str10, "32 S");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1294");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("4444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 149477148 + "'", int1 == 149477148);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1295");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(365, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1296");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("31 S################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1297");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 89, 394, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1298");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "                                                                                           (100, 52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1299");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1300");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483348), 97, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1301");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#####################################################################GamePlayer{name='2 M', score=0}", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################GamePlayer{name='2 M', score=0}" + "'", str3, "#####################################################################GamePlayer{name='2 M', score=0}");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1302");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-02-01", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-01" + "'", str3, "0010-02-01");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1303");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("32 S######", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 S######" + "'", str3, "32 S######");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1304");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1305");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(35, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1306");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0097-02-28");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1307");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.resetScore();
        java.lang.String str14 = gamePlayer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str14, "GamePlayer{name='10 S', score=0}");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1308");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(22, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(29, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0029-10-31" + "'", str2, "0029-10-31");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1310");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("aaaaaa10th");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = subject0.new GameConfiguration(188);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1311");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1312");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1313");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483348));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1314");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-02-28", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-28" + "'", str3, "0010-02-28");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1315");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray2);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "52 S" + "'", str4, "52 S");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1316");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(35, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1317");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1318");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-252));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1319");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0004-02-29", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0004-02-29" + "'", str3, "0004-02-29");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1320");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 68, (-252), 188);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1321");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(79, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='10 S', score=366}", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}", "-024-10-01", "32 S######", "(100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1324");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        gamePlace3.x((int) (byte) 100);
        int int6 = gamePlace3.x();
        java.lang.String str7 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, -1)" + "'", str7, "(100, -1)");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1325");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Oct");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1326");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("#####################################################################GamePlayer{name='2 M', score=0}", "GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1327");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        gamePlayer12.resetScore();
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1328");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483559-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1329");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 37, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1330");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-252), 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-252-04-01" + "'", str2, "-252-04-01");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1331");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("6 M", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken(" (32, 365)", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1st" + "'", str7, "1st");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str8, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-24 S" + "'", str9, "-24 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6 M" + "'", str10, "6 M");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " (32, 365)" + "'", str12, " (32, 365)");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1332");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1333");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("11 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[11, 0, 0, 0]");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1334");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0 S", "68 Y");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1335");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 S" + "'", str1, "-1 S");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1336");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(22, 29, (int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1337");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject3.new GamePlayer();
        int int5 = gamePlayer4.getScore();
        gamePlayer4.setScore(0);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject8.new GamePlayer("-1 S");
        gamePlayer10.resetScore();
        gamePlayer10.addScore(35);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = new comp5111.assignment.cut.Subject.GamePlayer[] { gamePlayer4, gamePlayer10 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = subject0.new GameConfiguration((int) (short) 0, gamePlayerArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("##########                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ##########                                                                                          ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1339");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, 29, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1340");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(386, (int) (byte) 100, 29, (int) (short) 0, 149477148, 2147483305);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1341");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='0 S', score=0}", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################GamePlayer{name='0 S', score=0}" + "'", str3, "#####################################################################GamePlayer{name='0 S', score=0}");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1342");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1343");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("3 M", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3 M" + "'", str3, "3 M");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1344");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.addScore((-2147483648));
        gamePlayer2.addScore(22);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1345");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(79, 37, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1346");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1347");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 0, (-1), (-2147483648), (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1348");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        gamePlace7.y(0);
        gamePlace7.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace7.clone();
        java.lang.String str16 = gamePlace15.toString();
        java.lang.Class<?> wildcardClass17 = gamePlace15.getClass();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(-1, 0)" + "'", str16, "(-1, 0)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1349");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', 2, 10, 108, 97, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1350");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(100, 68, (int) '4', 1, (int) (byte) 1, 149477148);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1351");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject10.new GamePlayer();
        int int12 = gamePlayer11.getScore();
        java.lang.String str13 = gamePlayer11.toString();
        java.lang.String str14 = gamePlayer11.getName();
        gamePlayer11.setScore(4);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        int int21 = gamePlace20.x();
        int int22 = gamePlace20.x();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer25 = subject23.new GamePlayer("10 S");
        java.lang.String str26 = gamePlayer25.getName();
        gamePlayer25.addScore(4);
        gamePlayer25.resetScore();
        boolean boolean30 = gamePlace20.equals((java.lang.Object) gamePlayer25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray31 = new comp5111.assignment.cut.Subject.GamePlayer[] { gamePlayer11, gamePlayer25 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration32 = subject0.new GameConfiguration((int) (byte) 10, gamePlayerArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str13, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Anonymous Player" + "'", str14, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10 S" + "'", str26, "10 S");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray31);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1352");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, -214", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, -214" + "'", str3, "(0, -214");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1353");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(99, 149477148, (int) (short) 10, 22, 31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1354");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.x();
        int int5 = gamePlace3.x();
        int int6 = gamePlace3.x();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1355");
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
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1356");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483305, 100, (-2147483648), 37, (int) (short) 10, 188);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1357");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.addScore(188);
        gamePlayer2.addScore((int) (short) 10);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1358");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, (int) ' ', 100, 0, 31, (-2147483348));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1359");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1360");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaa10th", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa10th" + "'", str3, "aaaaaa10th");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1361");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1362");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace14.clone();
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlace17);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1363");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray10, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray10, (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483646 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1364");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1365");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', (int) (short) 0, 89, 394);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Apr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Apr");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1367");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#####################################################################GamePlayer{name='0 S', score=0}", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################GamePlayer{name='0 S', score=0}" + "'", str3, "#####################################################################GamePlayer{name='0 S', score=0}");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1368");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(100, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1369");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("GamePlayer{name='10 S', score=4}");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1370");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1371");
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
        java.lang.String str16 = gamePlace4.toString();
        int int17 = gamePlace4.x();
        java.lang.Class<?> wildcardClass18 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(32, -1)" + "'", str15, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1372");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(108, 99, 22, 89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-01", "1staaaaaaa", "0 S", "-2147483648-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("32 S######");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 32 S######");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1375");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, 386);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1376");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1377");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1378");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer("(32, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = gamePlayer5.clone();
        org.junit.Assert.assertNotNull(gamePlayer6);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0386-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1380");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Jan");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((-2147483646), 89);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1381");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 188, (int) (short) -1, 366, 99, 2147483305);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1382");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(133);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1383");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483648), 133, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0366-10-01", "1 S#######", "-2147483559-01-01", "0097-02-28");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1385");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1386");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='2 M', score=0}#####################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1387");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(386, (int) (short) -1, 0, 2147483305);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1388");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 97, 0, (int) (byte) 0, 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1389");
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
        java.lang.String str15 = gamePlace9.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(32, -1)" + "'", str10, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(100, -1)" + "'", str13, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(100, -1)" + "'", str15, "(100, -1)");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1390");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("10th######");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10, 0, 0, 0]");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1391");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("a");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1392");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(188);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1393");
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
        int int15 = gamePlace11.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1394");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1395");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 100, 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1396");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 0, (int) '#', 79);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1398");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='1 S#######', score=0}", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='1 S#######', score=0}" + "'", str3, "GamePlayer{name='1 S#######', score=0}");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1399");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483648 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1400");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483646), 37, 1, (-24));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1401");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0097-02-28", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1402");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10th Oct 366");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10t\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1404");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1405");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483627), 4, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1406");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(29, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1407");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) 100, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1408");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 365)");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1409");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1staaaaaaa", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1410");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 10, 366, 30, (int) 'a', 31, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1411");
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
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray33, (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483646 is negative");
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
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1412");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0366-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[366, 0, 0, 0]");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1413");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-252), 149477148, 79, 333, 2, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1414");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(386, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1415");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject10.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        int int18 = gamePlace9.manhattanDistance(gamePlace16);
        int int19 = gamePlace9.x();
        int int20 = gamePlace4.manhattanDistance(gamePlace9);
        gamePlace4.y((-2147483348));
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1416");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(68, 100, (int) 'a', (int) (short) 0, (int) ' ', (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1417");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("22 S", "1st Apr 10", "-214", "Jan4444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1419");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        int int3 = gamePlayer1.getScore();
        java.lang.String str4 = gamePlayer1.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer5);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(100, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (100, 52)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1421");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(68, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1422");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(365, -1)", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(365, -1)" + "'", str3, "(365, -1)");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1423");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(394);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1424");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1425");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1426");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', (-252), 37, 1, 366, 149477148);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1427");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 100, 149477148, 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1428");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(365, 11, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "29th Nov 365" + "'", str3, "29th Nov 365");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1429");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483348), 2, 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1430");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 149477148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1431");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1 S#######");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1432");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1433");
        java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("a");
        org.junit.Assert.assertNull(number1);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1434");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1435");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477148, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1436");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 S" + "'", str1, "35 S");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1437");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1438");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th Oct 366", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Oct 366" + "'", str3, "10th Oct 366");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1439");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483384, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1440");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-24), (-2147483627), 365, 399, (int) (short) -1, 29);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1441");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer("(32, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("GamePlayer{name='10th', score=0}");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1442");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='0 S', score=0}", "", "(-1, 0)", "(10, -2147483648)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("31 S", "GamePlayer{name='Anonymous Player', score=32}", "31st", "(32, -2147483648)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1445");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########                                                                                          ", "(1, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1446");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray9, (-252));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -252 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1447");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########", "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1448");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (int) (byte) 10, (-2147483348), (-2147483646), 68, 30);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1449");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(97, (int) (short) 1, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1450");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        java.lang.String str10 = gamePlace8.toString();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace15.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace15.clone();
        boolean boolean18 = gamePlace8.isAdjacent(gamePlace15);
        int int19 = gamePlace15.y();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, -2147483648)" + "'", str10, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1451");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        java.lang.String str9 = gamePlayer8.toString();
        gamePlayer8.addScore(365);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = gamePlayer8.clone();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str9, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer12);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1452");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(30, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1453");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1454");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 31)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1455");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 1, 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='10th', score=0}", "0100-10-01", "32 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-01-01", "0004-02-29", "GamePlayer{name='0010-10-01', score=0}", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1458");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore(366);
        java.lang.String str7 = gamePlayer2.getName();
        gamePlayer2.setScore(4);
        int int10 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 S" + "'", str7, "10 S");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1459");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (-2147483648), 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1460");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("52 S", "35 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1461");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(89, byteArray1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1462");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.addScore(365);
        gamePlayer4.addScore(333);
        gamePlayer4.addScore((-2147483627));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1463");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y((int) (byte) 10);
        gamePlace6.x(100);
        int int11 = gamePlace6.x();
        gamePlace6.y(2147483305);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1464");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(188, 0, (-2147483627), (-2147483648), 22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1465");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray8, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 0, 10]");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1466");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483384, (int) (byte) 1, 32, 152, 4, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1467");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("################################################################################################35 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1468");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        gamePlace7.y(0);
        gamePlace7.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace7.clone();
        java.lang.String str16 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        int int22 = gamePlace21.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace21.clone();
        gamePlace21.x((int) '#');
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace29.clone();
        java.lang.String str31 = gamePlace30.toString();
        gamePlace30.x(100);
        java.lang.String str34 = gamePlace30.toString();
        java.lang.String str35 = gamePlace30.toString();
        gamePlace30.y((int) (short) 100);
        gamePlace30.x((int) (byte) 1);
        boolean boolean40 = gamePlace21.isAdjacent(gamePlace30);
        java.lang.String str41 = gamePlace21.toString();
        int int42 = gamePlace15.manhattanDistance(gamePlace21);
        gamePlace15.x((int) (short) 0);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(-1, 0)" + "'", str16, "(-1, 0)");
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(32, -1)" + "'", str31, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(100, -1)" + "'", str34, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(100, -1)" + "'", str35, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(35, -1)" + "'", str41, "(35, -1)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 37 + "'", int42 == 37);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1469");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.x();
        java.lang.String str9 = gamePlace7.toString();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, -1)" + "'", str9, "(1, -1)");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1470");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1st" + "'", str5, "1st");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str6, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-24 S" + "'", str7, "-24 S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1471");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(37, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1472");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), 89, (-2147483627), (int) (short) 10, (int) 'a', 399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1473");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-24));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1474");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-252), 1, (-24), 30, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1475");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483627));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1476");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(133, (-252));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1477");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("a", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1478");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        java.lang.String str5 = gamePlayer4.getName();
        gamePlayer4.setScore(0);
        gamePlayer4.addScore(68);
        gamePlayer4.addScore((-2147483348));
        gamePlayer4.resetScore();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1479");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(22, 11, 68, 99, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1480");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, (int) (byte) 10, 99, 29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1481");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10 S', score=100}", "-2147483648-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1482");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace7.clone();
        char[] charArray12 = new char[] {};
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray12);
        boolean boolean15 = gamePlace9.equals((java.lang.Object) charArray12);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10th Oct 366" + "'", str14, "10th Oct 366");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1483");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1 M", "Jan");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1484");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0052-01-31", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1485");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0004-02-29");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1486");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(152, 386, (int) (byte) 0, (int) '#', (int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1487");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("6 M", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-31", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1st" + "'", str7, "1st");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str8, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-24 S" + "'", str9, "-24 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "6 M" + "'", str10, "6 M");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0052-01-31" + "'", str12, "0052-01-31");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1488");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "################################################################################################35 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1489");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 0, 0, 68, 99, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1490");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483646));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483646 S" + "'", str1, "-2147483646 S");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1491");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 S", "0 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1492");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace((int) (byte) 10, (int) (byte) 0);
        gamePlace7.x(31);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1493");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, 1)", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)444" + "'", str3, "(10, 1)444");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1494");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 2147483305);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1495");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0000-01-01", "(100, 10)a", "0000-01-01", "31 S################################################################################################");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1496");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(394, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1497");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0097-02-28", "Jan", " ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1498");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-252-04-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1499");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("a", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test2.test1500");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', 108, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }
}

