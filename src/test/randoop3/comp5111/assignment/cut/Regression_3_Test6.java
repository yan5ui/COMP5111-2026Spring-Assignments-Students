package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 2147483096)", "", "(188, -1)", "0052-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3002");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("6 S", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6 S" + "'", str3, "6 S");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3003");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("#         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("5 Y");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 5 Y");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3005");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) 'a', 11, 37, 2147483647, (-24), (-2147483559));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3006");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        java.lang.String str6 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0108-01-01", "GamePlayer{name='31 S', score=0}", "(32, -2147483348)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("29 S", "#(100, -1)##########################################################################################", "0000-01-01", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#", "GamePlayer{name='Anonymous Player', score=32}", "GamePlayer{name='Anonymous Player', score=-2147483559}", "-2147483617 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3010");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(11, 388, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3011");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(4, 399, 149477148);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3012");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        gamePlace8.y((int) 'a');
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3013");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(79, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3014");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10 S', score=15}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3015");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 2147483640);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3016");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(1, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3017");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 333);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3018");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(-1, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.addScore(365);
        gamePlayer4.addScore(333);
        gamePlayer4.setScore((int) (short) 100);
        java.lang.String str11 = gamePlayer4.toString();
        java.lang.Object obj12 = null;
        boolean boolean13 = gamePlayer4.equals(obj12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=100}" + "'", str11, "GamePlayer{name='Anonymous Player', score=100}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3020");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, -1)44", "68 Y");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3021");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3022");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483640, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3023");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3024");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 100)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3025");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3026");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("32 S######", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444", "(32, 10)", "GamePlayer{name='Anonymous Player', score=99}", "GamePlayer{name='10 S', score=15}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(149477148, 225, 99, 168, (int) (byte) 10, 169);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3029");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(31, 100)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################(31, 100)" + "'", str3, "###########################################################################################(31, 100)");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3030");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3031");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(213);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3032");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(399, (-2147483627));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3033");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.y();
        int int7 = gamePlace4.x();
        int int8 = gamePlace4.y();
        int int9 = gamePlace4.x();
        java.lang.String str10 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(32, -1)" + "'", str10, "(32, -1)");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3034");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3035");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(30, 2147483647, (int) (short) -1, 0, 335, 79);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3036");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (short) 10, (-2147483648));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject7.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject7.new GamePlace(10, (-2147483648));
        int int15 = gamePlace14.y();
        java.lang.String str16 = gamePlace14.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace14.clone();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        java.lang.String str23 = gamePlace22.toString();
        gamePlace22.x(100);
        java.lang.String str26 = gamePlace22.toString();
        int int27 = gamePlace14.manhattanDistance(gamePlace22);
        int int28 = gamePlace6.manhattanDistance(gamePlace22);
        boolean boolean30 = gamePlace22.equals((java.lang.Object) "(32, 10)");
        gamePlace22.x(213);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2147483648) + "'", int15 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(10, -2147483648)" + "'", str16, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(32, -1)" + "'", str23, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(100, -1)" + "'", str26, "(100, -1)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2147483559) + "'", int27 == (-2147483559));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-2147483559) + "'", int28 == (-2147483559));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483549 S', score=0}", "(365, -1)", "", "-024-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3038");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.addScore((int) (byte) 1);
        java.lang.String str13 = gamePlayer8.toString();
        java.lang.String str14 = gamePlayer8.toString();
        gamePlayer8.addScore(30);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='2 M', score=366}" + "'", str13, "GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='2 M', score=366}" + "'", str14, "GamePlayer{name='2 M', score=366}");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3039");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("################################################################################################35 S", "10 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3040");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace7.clone();
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
        gamePlace19.y((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace19.clone();
        int int28 = gamePlace7.manhattanDistance(gamePlace27);
        int int29 = gamePlace7.x();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(32, -1)" + "'", str20, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(100, -1)" + "'", str23, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 99 + "'", int28 == 99);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3042");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("22nd", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22nd" + "'", str3, "22nd");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3043");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483627 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3044");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("a", "3 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3045");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3046");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, 2)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3047");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648-10-01", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-2147483648-10-01" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-2147483648-10-01");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3048");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477148, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3049");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo(" (100, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3050");
        char[] charArray7 = new char[] { '#', ' ', ' ', 'a', ' ', '#' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#  a #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#  a #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#,  ,  , a,  , #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.x();
        gamePlace4.y(333);
        java.lang.Class<?> wildcardClass8 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3052");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.resetScore();
        java.lang.String str10 = gamePlayer8.toString();
        gamePlayer8.addScore(97);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = gamePlayer8.clone();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str10, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer13);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3054");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3055");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1 S#######", "-001-06-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3056");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        java.lang.Class<?> wildcardClass9 = gamePlace7.getClass();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3057");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3058");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3059");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        java.lang.Class<?> wildcardClass8 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3060");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("68 Y");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3061");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, 365, 2147483305);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3062");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483617), 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3063");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483638 S", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483638 S" + "'", str3, "-2147483638 S");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, 365)", "GamePlayer{name='10 S', score=4}", "GamePlayer{name='31 S', score=0}", "1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3065");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3066");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(51, byteArray6, (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483646 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10]");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3067");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(387, 763);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3068");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 0, 335);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3069");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(101, byteArray9, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 108 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3070");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("68 Y", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3071");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='Anonymous Player', score=759}", "-2147483627 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3072");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(99, 387);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3073");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("7 M", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7 M" + "'", str3, "7 M");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3074");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-252), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3075");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        int int8 = gamePlayer7.getScore();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3076");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='0 S', score=0}", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0 S', score=0}" + "'", str3, "GamePlayer{name='0 S', score=0}");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3077");
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
        int int21 = gamePlace9.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3078");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483647);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3079");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483617), (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3080");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        gamePlace4.y(10);
        java.lang.String str12 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 10)" + "'", str12, "(100, 10)");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3081");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', 37, 152);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", " (100, -1)", "(10, 1)444", "GamePlayer{name='10th', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3083");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483638, (-2147483627));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3084");
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
        int int19 = gamePlace6.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace6.clone();
        int int21 = gamePlace6.x();
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3085");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        gamePlace4.y((int) (short) 100);
        gamePlace4.x((int) (byte) 1);
        int int14 = gamePlace4.y();
        gamePlace4.x(333);
        java.lang.Class<?> wildcardClass17 = gamePlace4.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3086");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("6 M", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1st" + "'", str8, "1st");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str9, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-24 S" + "'", str10, "-24 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6 M" + "'", str11, "6 M");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str13, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3087");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2, 79, 32, (-252), 335, 37);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3088");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.resetScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = gamePlayer4.clone();
        org.junit.Assert.assertNotNull(gamePlayer6);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3089");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "hi!", "10 S", "hi!", "10 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3090");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(188, (-2147483348), 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3091");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483483), 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3092");
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
        int int39 = gamePlace35.y();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3093");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th Jan 100", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Jan 100" + "'", str3, "10th Jan 100");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, 22, (int) (short) 10, (-3555), 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3095");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        java.lang.String str10 = gamePlace8.toString();
        gamePlace8.y((int) (short) 1);
        gamePlace8.x(4);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, -2147483648)" + "'", str10, "(10, -2147483648)");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3096");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(32, -214", "-2147483617 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("##########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ##########");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3098");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(51);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3099");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(188, 99, 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Ga", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ga" + "'", str3, "Ga");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3101");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.resetScore();
        gamePlayer4.setScore((int) (byte) 10);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "(32, 10)", "(32, 365)", "GamePlayer{name='aaaaaa10th', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 M", "", "aaaaaaa0 S", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3104");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (short) -1, (int) 'a', (-2147483648), (-3555), 2147483384);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########", "-2147483646 S", "GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}", "0394-06-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3106");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, 99, 2147483305, (-2147483559), 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3107");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, (int) (byte) -1, 133, (-2147483559));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3108");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483617));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3109");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483348 S", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483348 S" + "'", str3, "-2147483348 S");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3110");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483638, 213);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(149477148, 45, (-2147483348), (-1), 79, 2147483640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3112");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1staaaaaaa", "GamePlayer{name='(100, -1)', score=-1}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10 S', score=15}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10 S', score=15}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3114");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 149477148)", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 149477148)" + "'", str3, "(0, 149477148)");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3115");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("29 S", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######29 S" + "'", str3, "######29 S");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3116");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='11 S', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3117");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("Jan4444444");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer();
        gamePlayer10.addScore(37);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3118");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3119");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(58, byteArray9, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3120");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(763, 366, 335);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3121");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(31, (-2147483600));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3122");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483483));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3123");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3124");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(32, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3125");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483640);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3126");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(720, byteArray7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                          1 S#######");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                           1 S#######");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3128");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(149477049, 101, 2, 387, 225, 366);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3129");
        char[] charArray11 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-31", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=32}", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Apr", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ga", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10th" + "'", str12, "10th");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Apr" + "'", str16, "Apr");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ga" + "'", str17, "Ga");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3130");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (int) (short) 100, 97, 4, 287, 6);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3131");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(37, 2147483640, 763, 0, 51, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        java.lang.String str6 = gamePlace5.toString();
        gamePlace5.x((int) (short) 1);
        int int9 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace5.clone();
        int int11 = gamePlace5.x();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3133");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483096, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 100, 10, 101, 720, 2147483638, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        java.lang.String str22 = gamePlace21.toString();
        gamePlace21.x(100);
        java.lang.String str25 = gamePlace21.toString();
        java.lang.String str26 = gamePlace21.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace21.clone();
        boolean boolean28 = gamePlace14.isAdjacent(gamePlace21);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace14.clone();
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, -1)" + "'", str22, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(100, -1)" + "'", str25, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(100, -1)" + "'", str26, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gamePlace29);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3136");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483483));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483483 S" + "'", str1, "-2147483483 S");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        gamePlace14.y((int) ' ');
        int int19 = gamePlace14.y();
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3138");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray2 = new comp5111.assignment.cut.Subject.GamePlayer[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration3 = subject0.new GameConfiguration(1, gamePlayerArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray2);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3139");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3140");
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
        gamePlace4.y(152);
        int int17 = gamePlace4.x();
        gamePlace4.y((-24));
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3141");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) -1, 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3142");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(149477514, 2147483638);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3143");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483348 S", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483348 S" + "'", str3, "-2147483348 S");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3144");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0394-06-30", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0394-06-30" + "'", str3, "0394-06-30");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3145");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray1, 333);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        java.lang.String str22 = gamePlace21.toString();
        gamePlace21.x(100);
        java.lang.String str25 = gamePlace21.toString();
        java.lang.String str26 = gamePlace21.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace21.clone();
        boolean boolean28 = gamePlace14.isAdjacent(gamePlace21);
        gamePlace14.y((int) '4');
        gamePlace14.x(188);
        java.lang.String str33 = gamePlace14.toString();
        gamePlace14.y((-2147483646));
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, -1)" + "'", str22, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(100, -1)" + "'", str25, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(100, -1)" + "'", str26, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(188, 52)" + "'", str33, "(188, 52)");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.getName();
        gamePlayer1.resetScore();
        java.lang.String str5 = gamePlayer1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Anonymous Player" + "'", str3, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3148");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th Jan 100", "0089-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3149");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(213, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3150");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft(" (32, 365)", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " (32, 365)" + "'", str3, " (32, 365)");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("Jan4444444");
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject0.new GamePlace(2147483384, (int) (short) -1);
        int int13 = gamePlace12.y();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3152");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-1 S', score=0}", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-214", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Ga" + "'", str6, "Ga");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-214" + "'", str7, "-214");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3153");
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
        int int19 = gamePlace6.y();
        int int20 = gamePlace6.x();
        int int21 = gamePlace6.y();
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3154");
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
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace22.clone();
        java.lang.String str24 = gamePlace23.toString();
        gamePlace23.x(100);
        java.lang.String str27 = gamePlace23.toString();
        java.lang.String str28 = gamePlace23.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace23.clone();
        boolean boolean30 = gamePlace15.isAdjacent(gamePlace29);
        gamePlace15.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = gamePlace15.clone();
        int int34 = gamePlace10.manhattanDistance(gamePlace15);
        int int35 = gamePlace15.x();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(10, -2147483648)" + "'", str9, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(32, -1)" + "'", str24, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(100, -1)" + "'", str27, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(100, -1)" + "'", str28, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(gamePlace33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-2147483638) + "'", int34 == (-2147483638));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3155");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2 S", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3156");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-001-11-01", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-001-11-01" + "'", str3, "-001-11-01");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3157");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(720);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3158");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-2147483648-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3159");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3160");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-24), (int) (short) 1, 97, (-2147483638), 333, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3161");
        char[] charArray11 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 32)", charArray11);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, 1)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-214" + "'", str15, "-214");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, 32)" + "'", str17, "(100, 32)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(10, 1)" + "'", str18, "(10, 1)");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########                                                                                          ", "GamePlayer{name='10 S', score=4}                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3163");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(149477138, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3164");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(369, 6, 763, 133, 149477138, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3165");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(101, 2147483647, 2147483384, 399, (int) 'a', 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        gamePlayer12.setScore((int) 'a');
        gamePlayer12.resetScore();
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3167");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483096, 30, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3168");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(79, 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3169");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, -1)", "0022-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3170");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("#(100, -1)", "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3171");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', (-2147483617), (-2147483646));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3172");
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
        gamePlace4.x(366);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        gamePlace20.y(0);
        boolean boolean24 = gamePlace4.isAdjacent(gamePlace20);
        gamePlace4.x(1);
        boolean boolean28 = gamePlace4.equals((java.lang.Object) "10th Oct 366");
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        java.lang.String str7 = gamePlace3.toString();
        int int8 = gamePlace3.y();
        gamePlace3.y(2147483096);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32, -1)" + "'", str7, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace6.manhattanDistance(gamePlace11);
        int int13 = gamePlace6.x();
        int int14 = gamePlace6.x();
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3175");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=4}", "10th Jan 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3176");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-252), 133, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3177");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', 99, 149477138, (int) (short) 10, (int) (byte) 10, 225);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3178");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='10 S', score=100}", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str3, "GamePlayer{name='10 S', score=100}");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3179");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483640, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3180");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                68 Y");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3181");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(30, (-2147483626), (int) 'a', 388, 90, (-2147483627));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3182");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y(0);
        gamePlace6.x((-2147483627));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace6.clone();
        org.junit.Assert.assertNotNull(gamePlace11);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3183");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(110, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=0}", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3185");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), (int) (byte) 10, 366, 188, 333, 22);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3186");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(364);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3187");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(149477148, byteArray7, (-2147483646));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483646 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3188");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(101, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3189");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray6, (-2147483617));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483617 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, -1, 1]");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='2 M', score=366}", "2 S4444444", "2 S", "32 S######");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3191");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483638), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3192");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483549));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3193");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-024-02-29");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3194");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Apr", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Apr" + "'", str3, "Apr");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3195");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 10, 720, 2147483384);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3196");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Apr", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Apr" + "'", str3, "Apr");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3197");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483348), 0, (-24));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, -2147483648)", "GamePlayer{name='Anonymous Player', score=32}", "3 M", "-2147483627 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3199");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(51);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3200");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) 'a', 90, 365, 387, (-2147483618), 169);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3201");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0034-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3202");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3203");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray8, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -24 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3204");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(388, byteArray6, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 0, -1]");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3205");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Jan");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer();
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(-1, -2147483648)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (-1, -2147483648)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "(32, 1)", "32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "31 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3208");
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(333, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(22, byteArray11, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 168 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3209");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3210");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3211");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483646), 0, 2147483384, 100, 2147483638, 89);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3212");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=366}", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3213");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("44444441st", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444441st" + "'", str3, "44444441st");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3214");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 29, 2147483096, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.addScore(2147483305);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3216");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483646), 68, 89, 1, 168, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, 31)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (0, 31)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3218");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34 S" + "'", str1, "34 S");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3219");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-001-11-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3220");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2 M#################################################################################################", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 M#################################################################################################" + "'", str3, "2 M#################################################################################################");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(32, -1)44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3222");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(34, 31, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3223");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) -1, (-3555), (-2147483638), 169);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3224");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(6, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3225");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483559-01-01", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483559-01-01" + "'", str3, "-2147483559-01-01");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3226");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11th" + "'", str1, "11th");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3227");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483638, 388, (-24), 108, (-2147483638), 2147483640);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3228");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        int int9 = gamePlace7.y();
        java.lang.Class<?> wildcardClass10 = gamePlace7.getClass();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        boolean boolean10 = gamePlace7.equals((java.lang.Object) 0.0d);
        gamePlace7.y(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace7.clone();
        int int14 = gamePlace7.y();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3230");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3231");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("6 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3232");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='10 S', score=2147483384}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3233");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, 10)", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 10)   " + "'", str3, "(1, 10)   ");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3234");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3235");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        java.lang.String str6 = gamePlayer2.toString();
        gamePlayer2.addScore(2);
        java.lang.String str9 = gamePlayer2.toString();
        gamePlayer2.addScore(108);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='10 S', score=4}" + "'", str6, "GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='10 S', score=6}" + "'", str9, "GamePlayer{name='10 S', score=6}");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3236");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        int int6 = gamePlayer2.getScore();
        int int7 = gamePlayer2.getScore();
        gamePlayer2.setScore(37);
        java.lang.String str10 = gamePlayer2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='10 S', score=37}" + "'", str10, "GamePlayer{name='10 S', score=37}");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3237");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3238");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 149477049);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5 Y" + "'", str1, "5 Y");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3239");
        char[] charArray9 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, -2147483648)", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-1 S', score=0}", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4" + "'", str11, "4");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2 M" + "'", str12, "2 M");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -214" + "'", str13, "(32, -214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject0.new GamePlayer("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer18 = subject0.new GamePlayer("-2147483559-01-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer19 = subject0.new GamePlayer();
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3241");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        java.lang.String str6 = gamePlace5.toString();
        gamePlace5.x((int) (short) 1);
        gamePlace5.x(0);
        gamePlace5.y(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("2 M#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 2 M#");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3243");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', (int) (short) 10, 2147483305);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3244");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = subject0.new GameConfiguration(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3245");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3246");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(51, 386, 45, 110, 22, (-2147483638));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3247");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3248");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483618), 0, 30, 51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3249");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(188, 52)", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################(188, 52)" + "'", str3, "###########################################################################################(188, 52)");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3250");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("#(100, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3251");
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
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3252");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(58, (-2147483646), 30, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3253");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0034-10-01", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0034-10-01                                                                                          " + "'", str3, "0034-10-01                                                                                          ");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3254");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(37, (-3555));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3255");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("a", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3256");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(133);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-10-31", "-24 S", "-2147483638 S", "-2147483483 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3258");
        char[] charArray9 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(32, -1)', score=0}", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, 2)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th" + "'", str10, "10th");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, 2)" + "'", str13, "(32, 2)");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.addScore((int) (byte) 1);
        java.lang.String str13 = gamePlayer8.toString();
        java.lang.String str14 = gamePlayer8.toString();
        int int15 = gamePlayer8.getScore();
        java.lang.Class<?> wildcardClass16 = gamePlayer8.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='2 M', score=366}" + "'", str13, "GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='2 M', score=366}" + "'", str14, "GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 366 + "'", int15 == 366);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3260");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, (int) (short) 10, 2147483647, (-2147483549), 4, 387);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.x();
        gamePlace3.y((int) (short) 100);
        int int7 = gamePlace3.x();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3262");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0335-06-30");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[335, 0, 0, 0]");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3263");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1 S#######", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 S#######" + "'", str3, "1 S#######");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3264");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 386);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3265");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3266");
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
        gamePlace4.x(366);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        gamePlace20.y(0);
        boolean boolean24 = gamePlace4.isAdjacent(gamePlace20);
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace20.clone();
        int int26 = gamePlace25.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3267");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-24, 394)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3268");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='2 M', score=0}", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str3, "GamePlayer{name='2 M', score=0}");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3269");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, 1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=116}", "GamePlayer{name='10 S', score=15}", "(100, 22)", "GamePlayer{name='1 S#######', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3271");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        gamePlace9.y((int) (byte) 0);
        boolean boolean12 = gamePlayer2.equals((java.lang.Object) (byte) 0);
        int int13 = gamePlayer2.getScore();
        gamePlayer2.setScore(10);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3272");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("11th Apr 37#########################################################################################", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11th Apr 37#########################################################################################" + "'", str3, "11th Apr 37#########################################################################################");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3273");
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
        java.lang.String str42 = gamePlace35.toString();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(366, -1)" + "'", str42, "(366, -1)");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3274");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(32, -1)', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3275");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("11th Apr 37", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11th Apr 37" + "'", str3, "11th Apr 37");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3276");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(10, 1)444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3277");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3278");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
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
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3279");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        gamePlace8.x((int) (byte) 1);
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
        gamePlace15.x(366);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = subject28.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = gamePlace31.clone();
        gamePlace31.y(0);
        boolean boolean35 = gamePlace15.isAdjacent(gamePlace31);
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = subject36.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject36.new GamePlace((int) (byte) 1, (-1));
        boolean boolean43 = gamePlace31.isAdjacent(gamePlace42);
        gamePlace31.y(2);
        comp5111.assignment.cut.Subject.GamePlace gamePlace46 = gamePlace31.clone();
        boolean boolean47 = gamePlace8.isAdjacent(gamePlace31);
        java.lang.String str48 = gamePlace31.toString();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(32, -1)" + "'", str23, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(gamePlace46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(32, 2)" + "'", str48, "(32, 2)");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(29, -2147483559)", "6 M", "################################################################################################35 S", "10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3281");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(10, 30, 51, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3282");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("34 S", "(100, 32)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3284");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-252-04-01", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-252-04-01" + "'", str3, "-252-04-01");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3285");
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
        gamePlace4.x(366);
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        gamePlace20.y(0);
        boolean boolean24 = gamePlace4.isAdjacent(gamePlace20);
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = subject25.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = subject25.new GamePlace((int) (byte) 1, (-1));
        boolean boolean32 = gamePlace20.isAdjacent(gamePlace31);
        gamePlace31.y((int) 'a');
        gamePlace31.y((-1));
        int int37 = gamePlace31.x();
        boolean boolean39 = gamePlace31.equals((java.lang.Object) "(0, -1)");
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3286");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(31, (-2147483559), 100, 2147483305, 52, (-2147483348));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3288");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483549 S', score=0}", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483549 S', score=0}" + "'", str3, "GamePlayer{name='-2147483549 S', score=0}");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3289");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, (-2147483627));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3290");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray10, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(108, byteArray10, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 168 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3291");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2147483640-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483640 + "'", int1 == 2147483640);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3292");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483648), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3293");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jan", "", "4444444444", "Jan4444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3295");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483549));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3296");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483559), 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483559-01-31" + "'", str2, "-2147483559-01-31");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3297");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(335, 149477514);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3298");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(10, 1)444", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)444" + "'", str3, "(10, 1)444");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3299");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(97, 4, 68, 79, 287, 399);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.setScore(0);
        java.lang.String[] strArray10 = new java.lang.String[] { "aaaaaa10th", "0366-10-01", "-24 S", "Ga", " (32, 365)" };
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        boolean boolean13 = gamePlayer1.equals((java.lang.Object) strArray11);
        gamePlayer1.resetScore();
        gamePlayer1.addScore((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3301");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0022-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[22, 0, 0, 0]");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3302");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("################################################################################################35 S", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################35 S" + "'", str3, "################################################################################################35 S");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3303");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 149477049, 34, (-2147483617));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3304");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3305");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, 2)", "1 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3306");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("13 M", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13 M" + "'", str3, "13 M");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3307");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("11th Apr 37#########################################################################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3308");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2 M#################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3309");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.addScore((-2147483648));
        gamePlayer2.addScore(68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "0000-10-01", "Jan", "22nd Oct 0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3311");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(79, 364, 100, 149477514, (-2147483549), 22);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3312");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str9 = gamePlayer2.getName();
        gamePlayer2.resetScore();
        gamePlayer2.resetScore();
        java.lang.String str12 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 S" + "'", str9, "10 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 S" + "'", str12, "10 S");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3313");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3314");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(399, (-2147483646));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3315");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483559), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3316");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(720, (-2147483348));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3317");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='0097-02-28', score=0}", "(1, 10)   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3318");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='0010-10-01', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3319");
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
        gamePlayer2.addScore(51);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer20 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str10, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str11, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(gamePlayer20);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3320");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 0, 213, 133, (int) 'a', 34, (-2147483626));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3321");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = subject0.new GameConfiguration(29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3322");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("###########################################################################################(31, 100)", "                                                                                          1 S#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3323");
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
        boolean boolean24 = gamePlace18.equals((java.lang.Object) "1st Apr 10");
        java.lang.String str25 = gamePlace18.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace18.clone();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(32, -1)" + "'", str25, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace26);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3324");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(89, 366, (int) (short) 10, 37, 32, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3325");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.getName();
        java.lang.String str4 = gamePlayer1.toString();
        char[] charArray9 = new char[] {};
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, -1)", charArray9);
        boolean boolean14 = gamePlayer1.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Anonymous Player" + "'", str3, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1st" + "'", str10, "1st");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th Oct 366" + "'", str11, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 S" + "'", str12, "10 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3326");
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
        int int22 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace4.clone();
        java.lang.Class<?> wildcardClass24 = gamePlace23.getClass();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3327");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(22, byteArray10, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 168 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3328");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30th", "-3555 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3329");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(89, (int) (byte) 1, 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3330");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(52, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3331");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483600));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3332");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) ' ', (int) (byte) -1);
        int int24 = gamePlace23.x();
        int int25 = gamePlace19.manhattanDistance(gamePlace23);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace23.clone();
        java.lang.Object obj27 = null;
        boolean boolean28 = gamePlace23.equals(obj27);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, -2147483648)" + "'", str10, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-2147483627) + "'", int25 == (-2147483627));
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3333");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0032-02-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3334");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.x();
        gamePlace3.y((int) (short) 100);
        gamePlace3.x(31);
        java.lang.String str9 = gamePlace3.toString();
        java.lang.Class<?> wildcardClass10 = gamePlace3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(31, 100)" + "'", str9, "(31, 100)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3335");
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
        java.lang.String str25 = gamePlace18.toString();
        int int26 = gamePlace18.y();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(32, -1)" + "'", str25, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483559 S", "7 M", "0010-02-01", "(31, 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3337");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, 11, (-2147483483), 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 779 + "'", int4 == 779);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3338");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483638);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3339");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483640, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3340");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(101, (-252));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3341");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 0, (int) '4', (-2147483559), 2147483305, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3342");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483483));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3343");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '4', 388, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3344");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(287, 335);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3345");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '4', 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3346");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 2, 149477514, 68);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3347");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace17.clone();
        gamePlace19.y((int) (byte) 100);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3348");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 2147483096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3349");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (byte) 10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        java.lang.Class<?> wildcardClass7 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3350");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#######################################################################################-2147483648 S", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################-2147483648 S" + "'", str3, "#######################################################################################-2147483648 S");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3351");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.resetScore();
        gamePlayer8.setScore(0);
        gamePlayer8.setScore((int) (byte) 1);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3352");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(108, 366, (-2147483600), 11, 779, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3353");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10 S', score=116}", "-2147483638 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3354");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = new comp5111.assignment.cut.Subject.GamePlayer[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = subject0.new GameConfiguration((-2147483627), gamePlayerArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3355");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaa10th", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa10th" + "'", str3, "aaaaaa10th");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3356");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483647, 2147483305, 2147483384, 152, 369, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3357");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-252));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3358");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(99, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3359");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(4, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3360");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477514, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483638 S", "2 S4444444", "31 S", "0399-04-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3362");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        java.lang.String str6 = gamePlayer5.getName();
        gamePlayer5.setScore((int) (byte) 1);
        gamePlayer5.setScore(22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, -1)" + "'", str6, "(100, -1)");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3363");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', 31, 2, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("13 M");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 13 M");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3365");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(387, (-2147483483), 2147483384, 335);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3366");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0108-01-01", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0108-01-01" + "'", str3, "0108-01-01");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3367");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='GamePlayer{name='2 M', score=366}', score=0}", "#(100, -1)##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3368");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(149477138, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3369");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(225);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3370");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(28, (-252));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(149477148, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (149477148, 0)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3372");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(108, (int) (byte) 0, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=399}", "68 Y", "GamePlayer{name='10 S', score=37}", "-2147483348 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3374");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        java.lang.String str8 = gamePlace7.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, -1)" + "'", str8, "(32, -1)");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#(100, -1)##########################################################################################", "##########", "Apr", "0108-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3376");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) -1, (-2147483618));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3377");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483647, 213, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3378");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(335, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3379");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483600), 34, 335);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3380");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(108, 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3381");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(89);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3382");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(99, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3383");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(386, 388, (int) (short) 1, (int) (short) 0, 1, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "29 S", "0004-02-29", "GamePlayer{name='Anonymous Player', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3385");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("22nd", "0010-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483638 S", "##########                                                                                          ", "(188, -1)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(34, 366, (-2147483618), 149477049, 31, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("29th Nov 365", "-2147483638 S", "######29 S", "32 S######");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3389");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483384);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3390");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(366, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3391");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2 S", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 S" + "'", str3, "2 S");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3392");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, -2147483648)", "1 S#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3393");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("5 Y");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3394");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', (-2147483648), 149477148, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3395");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("######29 S", "(32, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3396");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(51);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-24), 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3398");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3399");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(133, 0, (-2147483617), 29, (-2147483348), 99);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3400");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("                                                                                      (149477148, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3401");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(225, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3402");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        java.lang.String str9 = gamePlayer8.getName();
        gamePlayer8.addScore((-2147483600));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2 M" + "'", str9, "2 M");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3403");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3404");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        int int3 = gamePlayer1.getScore();
        java.lang.String str4 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3405");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject0.new GamePlayer("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int17 = gamePlayer16.getScore();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3406");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483549 S', score=0}", "                                                                                                68 Y");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3407");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477049, 720);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3408");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(37, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3409");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(68, 149477148);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3410");
        char[] charArray10 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-31", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=32}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th" + "'", str11, "10th");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 S" + "'", str15, "-1 S");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3411");
        char[] charArray8 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken(" (32, 365)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th Oct 366" + "'", str10, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " (32, 365)" + "'", str11, " (32, 365)");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3412");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, (-2147483559), 30, 169, 369, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3413");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 333, 68, (int) '#', (-2147483549), 333);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3414");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 10)   ", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 10)   " + "'", str3, "(1, 10)   ");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3415");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(22, 45, 29, 32, 108, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3416");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("###########################################################################################(188, 52)", "(-1, 0)                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3417");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(89, 188, (int) 'a', 79, 4, 110);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3418");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(90, 365, 287, (int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3419");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(58, (-2147483600), 99, 68, 2147483638, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3420");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, (-2147483646), 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3421");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(100, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3422");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "11th Apr 37");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3423");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-01-31", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-01-31                                                                                          " + "'", str3, "0010-01-31                                                                                          ");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3424");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483483 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3425");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-1 S', score=0}", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ga" + "'", str5, "Ga");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3426");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(6, byteArray7, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 399 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3427");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(364);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3428");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(110, (-24), 720);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3429");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, 100)", "GamePlayer{name='aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3430");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', (-24), 149477049, 0, 213, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3431");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='1 S#######', score=0}", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='1 S#######', score=0}" + "'", str3, "GamePlayer{name='1 S#######', score=0}");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3432");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) (byte) 0, 333, 149477514, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3433");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483638), 149477138, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3434");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0010-01-31                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3435");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, (-2147483618), (int) (short) 1, 28, 333, (int) (short) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3436");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(99, (-2147483348));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3437");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 364);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3438");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1 Maaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3439");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(79, 52, (-1), 333);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3440");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10 S', score=0}", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str3, "GamePlayer{name='10 S', score=0}");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "(100, 32)", "22nd", "0 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3442");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(333, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3443");
        char[] charArray9 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, 0)", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th" + "'", str10, "10th");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(10, 0)" + "'", str13, "(10, 0)");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3444");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        gamePlayer2.setScore(0);
        gamePlayer2.setScore(51);
        gamePlayer2.addScore(149477514);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3445");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3446");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, (int) ' ', 28, 34, 89, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3447");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.x();
        java.lang.String str7 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32, -1)" + "'", str7, "(32, -1)");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3448");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.setScore(0);
        gamePlayer1.addScore(365);
        gamePlayer1.addScore(394);
        java.lang.String str9 = gamePlayer1.toString();
        gamePlayer1.setScore((-2147483348));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=759}" + "'", str9, "GamePlayer{name='Anonymous Player', score=759}");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4", "GamePlayer{name='0010-10-01', score=0}", "31 S", "2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3450");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str9 = gamePlayer2.getName();
        gamePlayer2.setScore(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 S" + "'", str9, "10 S");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3451");
        java.lang.String[] strArray4 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", "GamePlayer{name='Anonymous Player', score=365}", "(100, 100)", "-2147483559-01-31" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3452");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483647, 11, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3453");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[149477148, 0, 0, 0]");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3454");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("Jan4444444");
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject0.new GamePlace(2147483384, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("GamePlayer{name='Anonymous Player', score=0}");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject0.new GameConfiguration((-3555));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3455");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483621, 779, 214, 386, 369, (-2147483483));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3456");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483618), 214);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3457");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 169);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3458");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(213);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3459");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("22nd");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3460");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3461");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483600), 32, 333, 214);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3462");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Apr");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3463");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(11, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3464");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=168}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3465");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 168, (-2147483600), 110);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3466");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483625));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-024-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3468");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          Jan4444444", "GamePlayer{name='10 S', score=-1}", "                                                                                          Jan4444444", "GamePlayer{name='', score=0}");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3469");
        char[] charArray9 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='1 S#######', score=0}", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=0}", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th" + "'", str10, "10th");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th Oct 366" + "'", str11, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3470");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(32, -214", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################(32, -214" + "'", str3, "###########################################################################################(32, -214");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3471");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483646), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3472");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        gamePlayer3.setScore(2147483647);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3473");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483621);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("30th");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 30th");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3475");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(79, 2147483384, 11, 149477514, 333, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3476");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(214, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3477");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("22nd Oct 0", "34 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3478");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483617 S", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483617 S" + "'", str3, "-2147483617 S");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3480");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.addScore(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3481");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(366, -1)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(366, -1)" + "'", str3, "(366, -1)");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3482");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("####################################################################GamePlayer{name='10 S', score=6}", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################GamePlayer{name='10 S', score=6}" + "'", str3, "####################################################################GamePlayer{name='10 S', score=6}");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3483");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray9, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3484");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(779);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3485");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3486");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th Oct 100", "2 M#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3487");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        java.lang.String str8 = gamePlace7.toString();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(1, -1)" + "'", str8, "(1, -1)");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3488");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3489");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace17.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace20);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3490");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 S" + "'", str3, "0 S");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3491");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), 108, 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3492");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0034-10-01                                                                                          ", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3493");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(6, 2147483096, 2147483096);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3494");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, -2147483648)", "6 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3495");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(28, 366, 213, (int) (byte) 10, (-2147483625), 149477049);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3496");
        comp5111.assignment.cut.Subject subject1 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject1.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        java.lang.String str6 = gamePlace5.toString();
        int int7 = gamePlace5.y();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace11.clone();
        java.lang.String str13 = gamePlace12.toString();
        int int14 = gamePlace12.y();
        boolean boolean15 = gamePlace5.isAdjacent(gamePlace12);
        gamePlace5.x(366);
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        gamePlace21.y(0);
        boolean boolean25 = gamePlace5.isAdjacent(gamePlace21);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = subject26.new GamePlace((int) (byte) 1, (-1));
        boolean boolean33 = gamePlace21.isAdjacent(gamePlace32);
        gamePlace21.y(2);
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace21.clone();
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray46, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray46, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray46, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray46, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray46, (int) (byte) 1);
        boolean boolean57 = gamePlace36.equals((java.lang.Object) byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(149477514, byteArray46, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3497");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        gamePlace3.x(31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace3.clone();
        int int9 = gamePlace8.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3498");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(0, 31)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3499");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-252-04-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test6.test3500");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', 2147483096, 2, (int) (short) 1, 11, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }
}

