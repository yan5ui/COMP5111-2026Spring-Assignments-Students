package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_2_Test5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2501");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2502");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483627), (-2147483597), 1670265086, (-1670265028), (int) ' ', 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2503");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(366, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2504");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace(0, 10);
        int int14 = gamePlace9.manhattanDistance(gamePlace13);
        boolean boolean15 = gamePlace5.isAdjacent(gamePlace9);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject16.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = subject16.new GamePlace((int) (byte) -1, 31);
        gamePlace24.y((-1670265028));
        boolean boolean27 = gamePlace5.isAdjacent(gamePlace24);
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace24.clone();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gamePlace28);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2505");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(1, 10)", "0052-04-30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2506");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-001-04-30", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          -001-04-30" + "'", str3, "                                                                                          -001-04-30");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2507");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 320, (int) ' ', (int) (short) 1, 51, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2508");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1]");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2509");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(30, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0030-06-01" + "'", str2, "0030-06-01");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2510");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject4.new GamePlace(0, 10);
        int int8 = gamePlace3.manhattanDistance(gamePlace7);
        gamePlace3.x((-1));
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        gamePlace14.x((int) 'a');
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = subject22.new GamePlace(0, 10);
        int int26 = gamePlace21.manhattanDistance(gamePlace25);
        int int27 = gamePlace21.y();
        gamePlace21.y(0);
        boolean boolean30 = gamePlace14.isAdjacent(gamePlace21);
        boolean boolean31 = gamePlace3.isAdjacent(gamePlace14);
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = subject34.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer39 = subject34.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject34.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer43 = subject34.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer45 = subject34.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace48 = subject34.new GamePlace(87, 42);
        comp5111.assignment.cut.Subject.GamePlace gamePlace51 = subject34.new GamePlace(397, (-2147483648));
        int int52 = gamePlace3.manhattanDistance(gamePlace51);
        comp5111.assignment.cut.Subject.GamePlace gamePlace53 = gamePlace3.clone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2147483262) + "'", int52 == (-2147483262));
        org.junit.Assert.assertNotNull(gamePlace53);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2511");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(29, 11, 11, 52, (-2147483550), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2512");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2513");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Octaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0000-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2514");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2515");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(74, (int) (byte) 10, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Oct 74" + "'", str3, "1st Oct 74");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2516");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Ga", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########Ga" + "'", str3, "########Ga");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2517");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(373, (-2147483637));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483648 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483648 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2519");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='', score=0}", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=0}                                                                        " + "'", str3, "GamePlayer{name='', score=0}                                                                        ");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2520");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-05-31" + "'", str2, "0010-05-31");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2521");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 S", "1st ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2522");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-11-30");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2523");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(102, 31, 62, (int) ' ', 12, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2524");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 320, 63, 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2525");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(32, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jun", "-001-06-01", "-2147483648-06-01", "6th Jan 459");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2527");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=31}", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=31}" + "'", str3, "GamePlayer{name='', score=31}");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2528");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2529");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 11, 1, 387, 31, 35);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2530");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=365}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2531");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='', score=-2147483625}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2532");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(53);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2533");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(102);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2534");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (-2147483597), (int) (byte) -1, 397);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2535");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0001-10-01", "0032-04-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11140 + "'", int2 == 11140);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2536");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(87, 31, (int) 'a', (int) (byte) -1, 2147483638, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2537");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 1, (-2147483550));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("11th Nov 74");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"th Nov 74\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2539");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, 31)", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 31)" + "'", str3, "(0, 31)");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2540");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=10}", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=10}" + "'", str3, "GamePlayer{name='', score=10}");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2541");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2542");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(102);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2543");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483283), 0, (-1), 2, 387, (-1));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2544");
        char[] charArray12 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, 10)', score=0}", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-04-01", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=0}", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-2147483648, 0)", charArray12);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=-2147483625}", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0032-10-01" + "'", str13, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52 " + "'", str14, "52 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 " + "'", str15, "10 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0052-04-01" + "'", str17, "0052-04-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ga" + "'", str18, "Ga");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(-2147483648, " + "'", str19, "(-2147483648, ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ga" + "'", str20, "Ga");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2545");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483551));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2546");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=365}", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=365}" + "'", str3, "GamePlayer{name='', score=365}");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2547");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-001-06-01", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-001-06-01" + "'", str3, "-001-06-01");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0012-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2549");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(1670265086, (-2147483637));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2550");
        java.lang.String[] strArray2 = new java.lang.String[] { "GamePlayer{name='', score=-2147483616}", "GamePlayer{name='', score=0}########################################################################" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2551");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("######31st", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######31st                                                                                          " + "'", str3, "######31st                                                                                          ");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2552");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(12, 1431656074, (-2147483648), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2553");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6th" + "'", str1, "6th");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2554");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(320, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0320-10-01" + "'", str2, "0320-10-01");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2555");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 366);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2556");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 S", "-001-04-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2557");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(459, (int) 'a', (-2147483550), (-2147483627), 477218588, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2558");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 97, 20, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2559");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 114, (int) ' ', (-264));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2560");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483262));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 397)", "-1 S", "11th ", "6 M       ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2562");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0032-02-01" + "'", str2, "0032-02-01");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 373, 74, 365, 35, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2564");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=0}44444444444444444444444444444444444444444444444444444444", "(0, 10)", "0000-12-01", "0000-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2565");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-715828007), (int) 'a', 0, (-1670265028), 5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2566");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("42 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10 S", "", "0100-11-30", "(inva");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2568");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.x((int) (short) 1);
        gamePlace4.x((int) (byte) 10);
        int int9 = gamePlace4.y();
        java.lang.String str10 = gamePlace4.toString();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace(0, 10);
        int int19 = gamePlace14.manhattanDistance(gamePlace18);
        int int20 = gamePlace14.y();
        int int21 = gamePlace14.x();
        gamePlace14.x((int) '4');
        gamePlace14.y(0);
        int int26 = gamePlace14.y();
        boolean boolean27 = gamePlace4.isAdjacent(gamePlace14);
        gamePlace14.x(2147483607);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 10)" + "'", str10, "(10, 10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2569");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(152, 1670265039, 459);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444", "-1 ", "1st Jun 10", "GamePlayer{name='###(0, -1)', score=97}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2571");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(5, 1670265039, 366, (-2147483637));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2572");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2573");
        char[] charArray13 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, 10)', score=0}", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-04-01", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=0}", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1670265028 S", charArray13);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=-2147483616}", charArray13);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0032-10-01" + "'", str14, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52 " + "'", str15, "52 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 " + "'", str16, "10 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ga" + "'", str17, "Ga");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0052-04-01" + "'", str18, "0052-04-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ga" + "'", str19, "Ga");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1670265028 " + "'", str20, "-1670265028 ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ga" + "'", str21, "Ga");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2574");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(320, (-715828007));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2575");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(10, 459);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2576");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(62, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2577");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 0, (-2147483544), 1431656074, 1431656074);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2578");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='', score=31}", "0100-02-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2579");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(6, (-2147483637));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2580");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2581");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (-2147483633), (int) 'a', 320, 12, 152);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2582");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("4th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2583");
        char[] charArray9 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-01-01", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0032-10-01" + "'", str10, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52 " + "'", str11, "52 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 " + "'", str12, "10 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0100-01-01" + "'", str14, "0100-01-01");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2584");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483607, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2585");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(42, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("(52, -1)");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2586");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2587");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(87, 42);
        int int15 = gamePlace14.x();
        java.lang.String str16 = gamePlace14.toString();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(87, 42)" + "'", str16, "(87, 42)");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2588");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-2147483648, 0)", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-2147483648, 0)444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(-2147483648, 0)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2589");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(52, 10)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2590");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483633));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2591");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2592");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483544));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2593");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483548), 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2594");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) -1, (int) '4', 2147483607, 63, (-2147483627), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2595");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(131, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2596");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("########0 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2597");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(52, 0)", "(32, 52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2598");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                          0097-10-01", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0097-10-01" + "'", str3, "                                                                                          0097-10-01");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2599");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1670265039, 131, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2600");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-01-31", "6th Jan 459");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2601");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-2147483648, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2602");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(373, 10, (int) '#', (-2147483544), 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2603");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1), 42, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2604");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(87, 10)", "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2605");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 11140);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2606");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11th", "(-1, 100)###########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2607");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("31 aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 31 aaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2609");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2610");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(inva", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(inva" + "'", str3, "(inva");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2611");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1431656074, (int) (byte) -1, 102, 477218588, 1670265039, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2612");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(20, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2613");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(102, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0102-05-31" + "'", str2, "0102-05-31");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2614");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Nov", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}########################################################################", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Nov" + "'", str6, "Nov");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='', score=0}########################################################################" + "'", str7, "GamePlayer{name='', score=0}########################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1st " + "'", str8, "1st ");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2615");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483597), 1431656074, 1431656074, 366, 12, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2616");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 152 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1]");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2617");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-2147483648, 0)", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-2147483648, 0)" + "'", str3, "(-2147483648, 0)");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2618");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', (-2147483283));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2619");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(87, 53)aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2620");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-11-30", "4 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2621");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, 53, 0, (-2147483597));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2622");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(459, 1670265086, 114, (int) (short) 100, 0, 1670265086);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2623");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483550 S", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483550 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "-2147483550 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2624");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483638, 0, 5, 52, 51, (-2147483262));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2625");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("477218588-06-30", "8 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2626");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2627");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.x((int) (byte) 100);
        java.lang.String str7 = gamePlace4.toString();
        gamePlace4.x((int) (short) 10);
        gamePlace4.x(477218588);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 10)" + "'", str7, "(100, 10)");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2628");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("51 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2629");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(42, 6, (-715828007));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2630");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1212), 6, 0, 1670265086, 1670265086, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2631");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st Jun 10", "35 ", "6th", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2632");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(87, 53)aa", "-1 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2633");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 397, (int) (byte) 0, 366, (-2147483648), 2147483638);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2634");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483548), 30, (-2147483262), 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2635");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(29, 397);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2636");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-1212));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2637");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 10, 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-05-01" + "'", str2, "0010-05-01");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2638");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(373, 387);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2639");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("      52 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2640");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2641");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='', score=53}#######################################################################", "(-1, 100)###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2642");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(100, (-1431655631), 366, 6, (-1212), 459);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2643");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0 ", "GamePlayer{name='', score=100}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2644");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(366, 10)", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Janaaaaaaa", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1431655631 S", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(366, 10)" + "'", str6, "(366, 10)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Janaaaaaaa" + "'", str7, "Janaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1431655631 S" + "'", str8, "-1431655631 S");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2645");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("35 S      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2646");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(0, -264)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2647");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("11th");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2648");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0032-02-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2649");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-264), (int) ' ', 0, 62, 366, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2650");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483544), (-715828007));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2651");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483597), (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2652");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(31, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2653");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1431655631), 477218588, (-2147483283), (-2147483551));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2654");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(387);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2655");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(11140, (-715828007));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2656");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='', score=365}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='', score=365}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2657");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(320, (-1431655631), 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2658");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 42, 10, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2659");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray3);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4th ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0032-10-01" + "'", str5, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4th " + "'", str6, "4th ");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2660");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(87, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2661");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='###(0, -1)', score=97}", "0001-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2662");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2663");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(102, (int) 'a', (-2147483550), 11140, (int) 'a', 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2664");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2665");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(31, (-264));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2666");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(31, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2667");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("11th Nov 74", "aaa(0, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2668");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 397)", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 397)" + "'", str3, "(1, 397)");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2669");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483648-06-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2670");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-715828007), 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-715828007-04-01" + "'", str2, "-715828007-04-01");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2671");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1212), (int) (short) 10, 0, 97, (-2147483283), (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2672");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=0}44444444444444444444444444444444444444444444444444444444", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}44444444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2673");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2, (-1), 1431656074, (int) (short) 0, 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2674");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject0.new GamePlace((-264), (-1431655631));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11th");
        gamePlayer14.addScore(477218588);
        gamePlayer14.resetScore();
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2675");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-264));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2676");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(373, (int) '#', (int) ' ', (-1212), (-1670265028), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2677");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(11140, byteArray8, (-1212));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1212 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2678");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, (-1670265028));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2679");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(87, 42);
        int int15 = gamePlace14.x();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        comp5111.assignment.cut.Subject subject22 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = subject22.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace(0, 10);
        int int30 = gamePlace25.manhattanDistance(gamePlace29);
        boolean boolean31 = gamePlace21.isAdjacent(gamePlace25);
        java.lang.String str32 = gamePlace25.toString();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject33.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = gamePlace36.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = gamePlace37.clone();
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject39.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject43 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace46 = subject43.new GamePlace(0, 10);
        int int47 = gamePlace42.manhattanDistance(gamePlace46);
        boolean boolean48 = gamePlace38.isAdjacent(gamePlace42);
        int int49 = gamePlace25.manhattanDistance(gamePlace38);
        comp5111.assignment.cut.Subject.GamePlace gamePlace50 = gamePlace25.clone();
        comp5111.assignment.cut.Subject subject51 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace54 = subject51.new GamePlace(10, 31);
        gamePlace54.x(32);
        int int57 = gamePlace25.manhattanDistance(gamePlace54);
        comp5111.assignment.cut.Subject.GamePlace gamePlace58 = gamePlace54.clone();
        boolean boolean59 = gamePlace14.isAdjacent(gamePlace54);
        comp5111.assignment.cut.Subject.GamePlace gamePlace60 = gamePlace14.clone();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0, 10)" + "'", str32, "(0, 10)");
        org.junit.Assert.assertNotNull(gamePlace37);
        org.junit.Assert.assertNotNull(gamePlace38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(gamePlace50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 53 + "'", int57 == 53);
        org.junit.Assert.assertNotNull(gamePlace58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(gamePlace60);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2680");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(74, (-1670265028));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2681");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=-2147483616}", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=-2147483616}" + "'", str3, "GamePlayer{name='', score=-2147483616}");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2682");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 1, 97, 459, 2147483607, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2683");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-1 S", "1st Oct 74");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2684");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29th" + "'", str1, "29th");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2685");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(87, 42);
        int int15 = gamePlace14.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace14.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        java.lang.Class<?> wildcardClass18 = gamePlace16.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2686");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray8, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 6 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2687");
        byte[] byteArray5 = new byte[] { (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1431655631), byteArray5, 1670265086);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1670265086 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2688");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2689");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("                                                                     GamePlayer{name='2 M', score=0}", "15 Y");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2690");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483607, 32, (-2147483550));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2691");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483262), (int) (short) 100, (int) (byte) 100, 114);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2692");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(131, 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2693");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483551 S", "1st Oct 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "11th", "a", "(62, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2695");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2696");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("2 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2, 0, 0, 0]");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-04-30", " ", "", "       Oct");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2698");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaa(0, -1)", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa(0, -1)" + "'", str3, "aaa(0, -1)");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2699");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483551), 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2700");
        char[] charArray11 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaa(0, -1)", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 ", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4th ", charArray11);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0012-10-31", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0032-10-01" + "'", str12, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "52 " + "'", str16, "52 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4th " + "'", str17, "4th ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0012-10-31" + "'", str18, "0012-10-31");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2701");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0030-01-31", "0 S#################################################################################################", "(100, 10)", "GamePlayer{name='', score=-2147483648}##############################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2702");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, 29, (-2147483648));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2703");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0001-01-01", "31 aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2704");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-715828007));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2705");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(52, (-1670265028));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(87, 53)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (87, 53)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2707");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=1}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4th ", "Nov", "1 M", "0 S#################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2709");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        gamePlace5.y((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        java.util.List<java.lang.String> strList15 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (int) ' ', (int) (byte) 1, 62, (int) (byte) 1, 365);
        boolean boolean16 = gamePlace8.equals((java.lang.Object) 62);
        gamePlace8.y((int) (short) -1);
        java.lang.String str19 = gamePlace8.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, -1)" + "'", str19, "(0, -1)");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2710");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (int) (byte) 100, 52, 6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2711");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jun");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2712");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483548), 366, 12, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2713");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483283));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2714");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(131);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2715");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(1431656074);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2716");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 1, 1670265086);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2717");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483627), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2718");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(11, 2147483638);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2719");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("1st Jan 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2720");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1670265039, (-1670265028));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2721");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2722");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("4th ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4th ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2723");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(6, 477218588, 12, 373, 29, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2724");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1670265039, 11, 29, 6, 53, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2725");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, ", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, aaaa" + "'", str3, "(100, aaaa");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2726");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, 167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 167 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1]");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2727");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("31 aaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2728");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(10, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2729");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "GamePlayer{name='', score=373}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2730");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        java.lang.Object obj6 = null;
        boolean boolean7 = gamePlace4.equals(obj6);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2731");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-10-01", "GamePlayer{name='', score=0}########################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2732");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(397, (int) (byte) 10, 32, 2147483607, 35, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2733");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(373, 2147483607);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2734");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        gamePlace5.y((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace5.clone();
        int int10 = gamePlace9.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2735");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaa", "5 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2736");
        char[] charArray10 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='35 S', score=0}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=53}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-001-11-30", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("11 S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0032-10-01" + "'", str11, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52 " + "'", str12, "52 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-001-11-30" + "'", str15, "-001-11-30");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "11 " + "'", str16, "11 ");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2737");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.y(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        java.lang.String str8 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0, 0)" + "'", str8, "(0, 0)");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2738");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4 S", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4 S" + "'", str3, "4 S");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2739");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0000-02-29", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-02-29" + "'", str3, "0000-02-29");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2740");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0062-06-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[62, 0, 0, 0]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2741");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='', score=-2147483648}##############################################################", "(52, 32)  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2742");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, (int) (short) 1, (int) (short) 100, (-2147483544));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2743");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Ga', score=0}", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                      GamePlayer{name='Ga', score=0}" + "'", str3, "                                                                      GamePlayer{name='Ga', score=0}");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2744");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 62, 0, (-264), 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2745");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2746");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(387, 114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2747");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(52, 0)   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2748");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(62, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2749");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483597), 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2750");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        gamePlayer11.resetScore();
        gamePlayer11.resetScore();
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2751");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483597, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2752");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2753");
        char[] charArray8 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Janaaaaaaa", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0032-10-01" + "'", str9, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ja" + "'", str11, "Ja");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2 " + "'", str12, "2 ");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2754");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4444444444", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2755");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) ' ', 5, (-2147483262));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2756");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 366, 320, (-2147483551));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2757");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483262), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2758");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(11140, byteArray8, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 74 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2759");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                          ###(0, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2760");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483283), 53, (-2147483550), 361);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2761");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483597), 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2762");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("32 ", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 " + "'", str3, "32 ");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2763");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("52 Saaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2764");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("32 ", "GamePlayer{name='', score=1}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2765");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("52 S", "0000-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("11th ", "#", "0052-04-01", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2767");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-2147483648, 0)", "(0, -264)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2768");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("11 ", "0 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2769");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.x((int) (short) 1);
        gamePlace4.x((int) (byte) 10);
        int int9 = gamePlace4.x();
        gamePlace4.x((-1));
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2770");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(167, 459);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2771");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("######31st                                                                                          ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2772");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "(52, 0)   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2773");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(6, 1670265086);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2774");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray8, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 5 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2775");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0100-10-01", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-01" + "'", str3, "0100-10-01");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2776");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(53, 10, (-2147483551), 152, 20, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2778");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(102, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2779");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, 6, 114, (int) '4', (-715828007), (-264));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2780");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(1670265039, 361);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2781");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2 ", "0100-11-30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2782");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("32 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32, 0, 0, 0]");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2783");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', 167, 2, 2147483638, 152, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2784");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='', score=31}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2785");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace(0, 10);
        int int14 = gamePlace9.manhattanDistance(gamePlace13);
        boolean boolean15 = gamePlace5.isAdjacent(gamePlace9);
        java.lang.String str16 = gamePlace9.toString();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject23.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject27.new GamePlace(0, 10);
        int int31 = gamePlace26.manhattanDistance(gamePlace30);
        boolean boolean32 = gamePlace22.isAdjacent(gamePlace26);
        int int33 = gamePlace9.manhattanDistance(gamePlace22);
        int int34 = gamePlace9.y();
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = subject35.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject39.new GamePlace(0, 10);
        int int43 = gamePlace38.manhattanDistance(gamePlace42);
        gamePlace38.x((-1));
        boolean boolean46 = gamePlace9.isAdjacent(gamePlace38);
        comp5111.assignment.cut.Subject.GamePlace gamePlace47 = gamePlace9.clone();
        gamePlace9.x(167);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0, 10)" + "'", str16, "(0, 10)");
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(gamePlace47);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2786");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='###(0, -1)', score=97}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2787");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(320, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0320-10-01" + "'", str2, "0320-10-01");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2788");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(1670265086);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2789");
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
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2790");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(12, byteArray6, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1]");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2791");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, 477218588, (-1670265028), 104);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2792");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st Oct 1#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2793");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0012-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2794");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(53, 114);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2795");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Ga', score=0}", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Ga', score=0}" + "'", str3, "GamePlayer{name='Ga', score=0}");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2796");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("7 M", "(31, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2797");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 0, 12, (-2147483597), 104, 30, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(0, 10)', score=0}", "aaa(0, -1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(100, 10)", "GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2799");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("52 ", "(4, 10)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2800");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0100-01-01", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0100-01-01" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0100-01-01");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2801");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483544), byteArray8, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483648 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2802");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(11140);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2803");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483262), 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483648, 0)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "20th Oct 42", "1st Jun 10", "0032-02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2805");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='Anonymous Player', score=31}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2806");
        byte[] byteArray4 = new byte[] { (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(6, byteArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10]");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2807");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.y(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        int int8 = gamePlace7.x();
        java.lang.String str9 = gamePlace7.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, 0)" + "'", str9, "(0, 0)");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2808");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1431656074, 51, 1670265086, (-2147483627), 63, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2809");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483548), 31, 100, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2810");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("32 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2811");
        char[] charArray7 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=-2147483625}", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0032-10-01" + "'", str8, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2812");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(366, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2813");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0010-06-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2814");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483607, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2815");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(10, 31);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.setScore(32);
        gamePlayer4.resetScore();
        java.lang.String str8 = gamePlayer4.toString();
        gamePlayer4.setScore((-2147483627));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = gamePlayer4.clone();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str8, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer11);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2816");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(35, 373);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2817");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0010-11-30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 ", "", "GamePlayer{name='###(0, -1)', score=97}", "52 Saaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2819");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-1431655631 ", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1431655631 " + "'", str3, "-1431655631 ");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2820");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483627), (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2821");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2822");
        char[] charArray13 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, 10)', score=0}", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-04-01", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=0}", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("7 M", charArray13);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 10)", charArray13);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("8 M", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0032-10-01" + "'", str14, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52 " + "'", str15, "52 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 " + "'", str16, "10 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ga" + "'", str17, "Ga");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0052-04-01" + "'", str18, "0052-04-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ga" + "'", str19, "Ga");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "7 " + "'", str20, "7 ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "8 " + "'", str22, "8 ");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2823");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-06-30" + "'", str2, "0000-06-30");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2824");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1212), 1670265086, (int) (short) -1, 387, (-264), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2825");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 1, (-2147483550), 0, 477218588, 2147483607);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2826");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(361);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2827");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(20, 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2829");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2 ", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 " + "'", str3, "2 ");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2830");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(12, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2831");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                     GamePlayer{name='2 M', score=0}", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2832");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(11140, 1431656074, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2833");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 373);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(42, 0)", "1st Oct 365", "7 M", "GamePlayer{name='', score=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2835");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', 1670265086, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2836");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483283), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2837");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Janaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2838");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("8 ", "477218588-04-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2839");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), (int) ' ');
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject0.new GamePlace(42, (-2147483633));
        int int16 = gamePlace15.y();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2147483633) + "'", int16 == (-2147483633));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2840");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("8 ", "GamePlayer{name='', score=100}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2841");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2842");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(53, 52, 21, 2147483607, 111, 114);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2843");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(114, 74, (-264), 361, 320, (-264));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2844");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0397-10-31", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2845");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2846");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-2147483648, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2847");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("###(0, -1)", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###(0, -1)" + "'", str3, "###(0, -1)");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2848");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='(52, 10)', score=365}", "7 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2849");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 87, (int) (short) 1, (int) (short) 0, 397, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2850");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "52 Saaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2851");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2852");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2853");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483597), 0, (int) (byte) 10, 111, 52, (-1670265028));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2854");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2855");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483283));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2856");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2nd", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2nd" + "'", str3, "2nd");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2857");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(1431656074);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2858");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, 131, 365, 1431656074);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2859");
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
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2860");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483548), 366, (-2147483548));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2861");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=10}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2862");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray6, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 102 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1]");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2863");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483607);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2864");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483548-11-30");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2865");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=0}", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=0}" + "'", str3, "GamePlayer{name='', score=0}");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2866");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Nov", "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2867");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2868");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(87, 42)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2869");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("6 S", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6 S" + "'", str3, "6 S");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='0052-04-01', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='0052-04-01', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2871");
        char[] charArray12 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, 10)', score=0}", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-04-01", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=0}", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("7 M", charArray12);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=52}", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0032-10-01" + "'", str13, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52 " + "'", str14, "52 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 " + "'", str15, "10 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0052-04-01" + "'", str17, "0052-04-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ga" + "'", str18, "Ga");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7 " + "'", str19, "7 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ga" + "'", str20, "Ga");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2872");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2873");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("11 S", "0010-05-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2874");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(87);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444", "-001-01-31", "0100-10-01", "(-1, 100)###########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=100}", "(42, 0)", "5 M", "4444444hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2877");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(87, 42);
        int int15 = gamePlace14.y();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 42 + "'", int15 == 42);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2878");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2879");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0100-01-01", "7 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2880");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(398, 104, (int) (short) 100, 1431656074);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2881");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0032-02-01", "(4, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2882");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483638);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2883");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "GamePlayer{name='###(0, -1)', score=97}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2884");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0032-10-01", "(0, -1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2885");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(366, (-2147483551), 0, 373, 42, (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2886");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace4.clone();
        gamePlace5.y((-1));
        java.lang.String str8 = gamePlace5.toString();
        java.lang.String[] strArray15 = new java.lang.String[] { "0001-01-01", "(100, 10)", "###(0, -1)", "10 S", "-1 S", "-1 S" };
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray15);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray16);
        boolean boolean18 = gamePlace5.equals((java.lang.Object) strArray17);
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray17);
        java.lang.String[] strArray20 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray17);
        java.lang.String[] strArray21 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray17);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(0, -1)" + "'", str8, "(0, -1)");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2887");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(387, 104, 387, 31, 365, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2888");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(10, 31);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.setScore(32);
        int int7 = gamePlayer4.getScore();
        java.lang.String str8 = gamePlayer4.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer4.clone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Anonymous Player" + "'", str8, "Anonymous Player");
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2889");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(74, byteArray8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2890");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (-264), 91, 5, (int) (short) 10, 63);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2891");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483551), (-2147483283));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2892");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2893");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(87, (-2147483627), (int) (short) 100, 373, 74, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2894");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(102, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2895");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(6, (-1212), (int) (short) 0, 114, 102, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2896");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1670265039, 104, (-2147483633), (-2147483597), 6, 102);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2897");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("31st", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "31st444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "31st444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2898");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(21, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2899");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-2147483544), (-1), 477218588, 1431656074, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2900");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(361, (int) (byte) 1, 1670265086);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2901");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2902");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(373, 398);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2903");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=477218588}", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=477218588}" + "'", str3, "GamePlayer{name='Anonymous Player', score=477218588}");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("31 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 31 ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2905");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1670265028), 21, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2906");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477218588, 91, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2907");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4 S", "(0, -1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2908");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(91, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2909");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(91);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2910");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4444444hi!", "4th ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2911");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("a", "(-1, 100)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2912");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.x((int) (byte) 100);
        java.lang.String str7 = gamePlace4.toString();
        gamePlace4.x((int) (short) 10);
        gamePlace4.y(5);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(100, 10)" + "'", str7, "(100, 10)");
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2913");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483283), (int) '#', 11, 152, (-2147483544), 2147483607);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2914");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1431655631), 2, (int) (short) 10, 320);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2915");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("11th Nov 7444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2916");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0004-04-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[4, 0, 0, 0]");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2917");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1]");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2918");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(459);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2919");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0052-10-01", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0052-10-01" + "'", str3, "0052-10-01");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2920");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2921");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, (-2147483633));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2922");
        java.lang.String[] strArray2 = new java.lang.String[] { "GamePlayer{name='', score=-2147483616}", "GamePlayer{name='', score=0}########################################################################" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2923");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(152, (-2147483637), 365, (-1212));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2924");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483262));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2925");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaa", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2926");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(62, 11, 91, 87, 1431656074, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2927");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477218588, byteArray9, (-2147483633));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483633 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1]");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2928");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='0052-04-01', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2929");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray11, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(87, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(53, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 10, byteArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(387, byteArray11, (-2147483548));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483548 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 100, 0, 1]");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', (int) (short) 100, 1670265086, 0, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2931");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483638);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2932");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(131, (-2147483550), 1, (int) (byte) -1, (-2147483283), 398);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2933");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-1431655631 ", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1431655631 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "-1431655631 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2934");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483607);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2935");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0397-10-31", "20th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2936");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-02-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2937");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 387, 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2938");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483637), 373);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2939");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(91);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2940");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0320-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 320 + "'", int1 == 320);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2941");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#######hi!", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######hi!" + "'", str3, "#######hi!");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2942");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483648 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2943");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483262), byteArray9, 373);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 373 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1]");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2944");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace4.x((int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        int int8 = gamePlace4.x();
        int int9 = gamePlace4.y();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace(0, 10);
        int int24 = gamePlace19.manhattanDistance(gamePlace23);
        boolean boolean25 = gamePlace15.isAdjacent(gamePlace19);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer31 = subject26.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = subject26.new GamePlace((int) (byte) -1, 31);
        gamePlace34.y((-1670265028));
        boolean boolean37 = gamePlace15.isAdjacent(gamePlace34);
        int int38 = gamePlace4.manhattanDistance(gamePlace34);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1670265040 + "'", int38 == 1670265040);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2945");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("6 S");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = subject0.new GameConfiguration((-2147483637));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2946");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1670265039, byteArray7, 1670265039);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1670265039 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1]");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2947");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, 397)", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 397)" + "'", str3, "(1, 397)");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2948");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("6 M");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[6, 0, 0, 0]");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2949");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Jan");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2950");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(51, (int) ' ', 32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2951");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-2147483648, 0)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0001-10-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2952");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 10, (int) (byte) 10, 74, (-715828007), 373, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2953");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(5, (int) '4', (-1212), (-2147483633));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2954");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=-2147483544}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2955");
        char[] charArray10 = new char[] { 'a', ' ', ' ', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0032-10-01", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaa(0, -1)", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 ", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-001-01-31', score=1}", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  ,  ,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0032-10-01" + "'", str11, "0032-10-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52 " + "'", str15, "52 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2956");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, 91);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2957");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(62, (int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("(0, -1)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(87, 42);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject0.new GamePlace(397, (-2147483648));
        java.lang.Class<?> wildcardClass18 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2958");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4th", "0001-11-30", "GamePlayer{name='', score=52}", "(100, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("5th", "20th", "10th", "GamePlayer{name='-001-01-31', score=1}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2960");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(63, (-264));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2961");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, 31)", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 31)" + "'", str3, "(0, 31)");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0001-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2963");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=-2147483648}", "42 S", "(366, 10)", "0000-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2965");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-05-01", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-05-01" + "'", str3, "0010-05-01");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2966");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("20th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2967");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("");
        gamePlayer5.addScore(365);
        gamePlayer5.resetScore();
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2968");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483262), (int) '4', (-264), 0, 30, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2969");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(91);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2970");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##########################################################################################0397-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2971");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(invalid)", "GamePlayer{name='###(0, -1)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2972");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(87, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(320, byteArray10, (-1212));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1212 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1]");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2973");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("######31st");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2974");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, aaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2975");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=1}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2976");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-001-06-01", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          ###(0, -1)", "0100-10-01", "(20, -2147483597)", "-1670265028 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2978");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(10, 31);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        java.lang.String str5 = gamePlayer4.toString();
        java.lang.String str6 = gamePlayer4.getName();
        int int7 = gamePlayer4.getScore();
        java.lang.String str8 = gamePlayer4.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer4.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str5, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Anonymous Player" + "'", str6, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str8, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2979");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Jan", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jan4444444" + "'", str3, "Jan4444444");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2980");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2981");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-715828007));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2982");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(87, 53)", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(87, 53)" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(87, 53)");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2983");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(87, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(20, byteArray10, (-1431655631));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1431655631 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2984");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace((int) (byte) -1, (int) ' ');
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("GamePlayer{name='', score=31}");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer();
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2985");
        byte[] byteArray5 = new byte[] { (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray5, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray5, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10]");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2986");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='', score=53}#######################################################################");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2987");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(21, byteArray9, 114);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 114 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1]");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2988");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("20th Oct 42", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20th Oct 42" + "'", str3, "20th Oct 42");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "GamePlayer{name='', score=0}", "(-2147483597, 10)", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2990");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("6 S", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6 S" + "'", str3, "6 S");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2991");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(111, 373, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, ", "(inva", "################################################################################################11th", "-2147483550 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2993");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(1670265040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2994");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "0011-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2995");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(10, 31);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("-001-01-31");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("GamePlayer{name='', score=53}");
        gamePlayer10.resetScore();
        java.lang.String str12 = gamePlayer10.getName();
        gamePlayer10.resetScore();
        gamePlayer10.setScore((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='', score=53}" + "'", str12, "GamePlayer{name='', score=53}");
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2996");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483548));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483548 S" + "'", str1, "-2147483548 S");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2997");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 176);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2998");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (-2147483648), 35, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test2999");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(10, 131, 63, 52, 131, 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_2_Test5.test3000");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483637), 51, 100, (-2147483627));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }
}

