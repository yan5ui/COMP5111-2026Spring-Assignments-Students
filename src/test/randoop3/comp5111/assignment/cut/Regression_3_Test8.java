package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4001");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483621, 488, 1, (-2147483617), 11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4002");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase(" (100, -1)", "0034-10-01                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4003");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace4.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace4.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject8.new GamePlayer("(100, -1)");
        boolean boolean14 = gamePlace4.equals((java.lang.Object) gamePlayer13);
        int int15 = gamePlace4.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4004");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace6.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject9.new GamePlayer("10 S");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject9.new GamePlace(0, 2);
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject15.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace22.clone();
        int int24 = gamePlace23.x();
        boolean boolean25 = gamePlace14.isAdjacent(gamePlace23);
        gamePlace23.x(152);
        boolean boolean28 = gamePlace6.equals((java.lang.Object) 152);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4005");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(11, 394);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4006");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "45 S" + "'", str1, "45 S");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4007");
        char[] charArray7 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0398-04-01", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32 S" + "'", str9, "32 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0398-04" + "'", str10, "0398-04");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4008");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-024-10-01", "11th Apr 37");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4009");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483638), (-2147483646), (-3555), 22, 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        java.lang.String str10 = gamePlayer9.getName();
        java.lang.String str11 = gamePlayer9.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Anonymous Player" + "'", str11, "Anonymous Player");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.resetScore();
        java.lang.String str10 = gamePlayer8.toString();
        gamePlayer8.resetScore();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str10, "GamePlayer{name='2 M', score=0}");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4012");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0029-02-01", "-2147483483 S", "", "(1, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4014");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28 S" + "'", str1, "28 S");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4015");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0034-10-01                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4016");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (short) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("Oct");
        java.lang.String str9 = gamePlayer8.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Oct" + "'", str9, "Oct");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4017");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(10, -1)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject14.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject14.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = subject21.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace24.clone();
        int int26 = gamePlace20.manhattanDistance(gamePlace25);
        boolean boolean27 = gamePlace13.isAdjacent(gamePlace25);
        comp5111.assignment.cut.Subject subject28 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = subject28.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = subject28.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace35 = gamePlace34.clone();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = subject36.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject36.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace43 = gamePlace42.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace44 = gamePlace43.clone();
        int int45 = gamePlace35.manhattanDistance(gamePlace43);
        boolean boolean46 = gamePlace25.isAdjacent(gamePlace35);
        boolean boolean47 = gamePlace7.isAdjacent(gamePlace25);
        java.lang.String str48 = gamePlace7.toString();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gamePlace35);
        org.junit.Assert.assertNotNull(gamePlace43);
        org.junit.Assert.assertNotNull(gamePlace44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(10, -2147483648)" + "'", str48, "(10, -2147483648)");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4019");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        java.lang.String str9 = gamePlayer8.toString();
        gamePlayer8.addScore(365);
        int int12 = gamePlayer8.getScore();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str9, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 365 + "'", int12 == 365);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4020");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 295, 2147483640, (-2147483549));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4021");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='aaaaaa10th', score=0}", "2 S4444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4022");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(169, byteArray6, 149477049);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 149477049 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10]");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4023");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, 0)                                                                                             ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4024");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483483 S", "2 M#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4025");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan4444444", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1st" + "'", str6, "1st");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str7, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-24 S" + "'", str8, "-24 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Jan4444444" + "'", str9, "Jan4444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4026");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(110, 22, (-2147483627), (-2147483618), 366, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4027");
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
        boolean boolean30 = gamePlace22.equals((java.lang.Object) 295);
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
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4028");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("################################################################################################35 S", "(29, -2147483559)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4029");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483348 S", "GamePlayer{name='(32, -1)', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4030");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0034-10-01", "(10, 1)444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        java.lang.Object obj4 = null;
        boolean boolean5 = gamePlayer3.equals(obj4);
        java.lang.String str6 = gamePlayer3.getName();
        gamePlayer3.addScore((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Anonymous Player" + "'", str6, "Anonymous Player");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4032");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(333, 2147483164);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4033");
        char[] charArray9 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 10)", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0010-02-01", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10th" + "'", str10, "10th");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th Oct 366" + "'", str11, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(100, 10)" + "'", str12, "(100, 10)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0010-02-01" + "'", str13, "0010-02-01");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4034");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(89, 100)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4035");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=168}", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=168}                                                      " + "'", str3, "GamePlayer{name='Anonymous Player', score=168}                                                      ");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4036");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10 S', score=4}                                                                    ", "-2147483559-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4037");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0001-01-31", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31" + "'", str3, "0001-01-31");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4038");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 398);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4039");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, -2147483348)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4040");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-01-01", "(32, 31)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4041");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        int int9 = gamePlayer2.getScore();
        java.lang.String str10 = gamePlayer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='10 S', score=32}" + "'", str10, "GamePlayer{name='10 S', score=32}");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4042");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(67, 388, 3887, 149477148, (-2147483626), 67);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4043");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4044");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(333, 386);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4045");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483353, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4046");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace40 = null;
        boolean boolean41 = gamePlace35.isAdjacent(gamePlace40);
        int int42 = gamePlace35.x();
        java.lang.String str43 = gamePlace35.toString();
        int int44 = gamePlace35.x();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(1, -1)" + "'", str43, "(1, -1)");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4047");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483617), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(32, -1)', score=0}", "(1, -1)", "10th Oct 100", "-1 Saaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4049");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("31st", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4050");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483348), 1, 52, 720, 149477514, 398);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4051");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#         ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4052");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(51, (int) (byte) -1, 214, 210);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4053");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.x();
        java.lang.Object obj5 = null;
        boolean boolean6 = gamePlace3.equals(obj5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4054");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-3555), 149477138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4055");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        gamePlayer7.addScore(68);
        gamePlayer7.addScore(763);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4056");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("                                                                                                68 Y", "GamePlayer{name='2 M', score=365}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4057");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(387, 169);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4058");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.resetScore();
        java.lang.String str7 = gamePlayer2.toString();
        java.lang.String str8 = gamePlayer2.toString();
        int int9 = gamePlayer2.getScore();
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str7, "GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str8, "GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4059");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray7, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 30 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4060");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(369);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4061");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(99, 394);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4062");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(34, 68, 0, 34, (int) ' ', 99);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4063");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=4}", "34 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4064");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("31 S################################################################################################", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4065");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, 52)", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 52)a" + "'", str3, "(100, 52)a");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4066");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0022-01-01", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0022-01-01" + "'", str3, "0022-01-01");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4067");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 Saaaaaa", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1st" + "'", str5, "1st");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10th Oct 366" + "'", str6, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 Saaaaaa" + "'", str8, "-1 Saaaaaa");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4068");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4069");
        char[] charArray8 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("3 M", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483617 S", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3 M" + "'", str11, "3 M");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject0.new GamePlace((-24), 32);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject0.new GamePlace((int) (byte) 10, (int) (short) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer22 = subject0.new GamePlayer("                                                                                                68 Y");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration24 = subject0.new GameConfiguration(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4071");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(110, 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0110-11-30" + "'", str2, "0110-11-30");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4072");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("-1 Saaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject0.new GameConfiguration(44444441);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4073");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0364-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[364, 0, 0, 0]");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4074");
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
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = subject30.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject30.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = gamePlace36.clone();
        int int38 = gamePlace29.manhattanDistance(gamePlace36);
        boolean boolean39 = gamePlace20.isAdjacent(gamePlace29);
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
        org.junit.Assert.assertNotNull(gamePlace37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4075");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray10, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(369, byteArray10, 2147483384);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483384 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 0, 0, 10]");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4076");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-1 S', score=0}", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-1 S', score=0}" + "'", str3, "GamePlayer{name='-1 S', score=0}");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4077");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4078");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-01-31", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-01-31" + "'", str3, "0010-01-31");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4079");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(398, 2147483096, 1, 29, 51, 369);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4080");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4081");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (-2147483648), 79, 0, 2147483640, 22);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4082");
        char[] charArray8 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(365, -2147483648)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(365, -214" + "'", str12, "(365, -214");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4083");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483646), 108, 763, 89, (-2147483627), 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4084");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(149477049, 210, (-2147483625));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4085");
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
        java.lang.Class<?> wildcardClass15 = strArray12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4086");
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
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = subject19.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace25.clone();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject27.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace30.clone();
        java.lang.String str32 = gamePlace31.toString();
        int int33 = gamePlace31.y();
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = subject34.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = gamePlace37.clone();
        java.lang.String str39 = gamePlace38.toString();
        int int40 = gamePlace38.y();
        boolean boolean41 = gamePlace31.isAdjacent(gamePlace38);
        int int42 = gamePlace31.x();
        boolean boolean43 = gamePlace25.isAdjacent(gamePlace31);
        comp5111.assignment.cut.Subject subject44 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace47 = subject44.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject48 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace51 = subject48.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace54 = subject48.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace55 = gamePlace54.clone();
        int int56 = gamePlace47.manhattanDistance(gamePlace54);
        int int57 = gamePlace31.manhattanDistance(gamePlace54);
        comp5111.assignment.cut.Subject.GamePlace gamePlace58 = gamePlace54.clone();
        gamePlace54.x(366);
        boolean boolean61 = gamePlace11.isAdjacent(gamePlace54);
        int int62 = gamePlace11.y();
        java.lang.String str63 = gamePlace11.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(32, -2147483648)" + "'", str18, "(32, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(gamePlace31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(32, -1)" + "'", str32, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(gamePlace38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(32, -1)" + "'", str39, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(gamePlace55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 31 + "'", int56 == 31);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 31 + "'", int57 == 31);
        org.junit.Assert.assertNotNull(gamePlace58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-2147483648) + "'", int62 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(32, -2147483648)" + "'", str63, "(32, -2147483648)");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4087");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(763);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4088");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0029-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[29, 0, 0, 0]");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4089");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(70, 488, 35, (int) (short) 1, (-2147483549), 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-01-01", "(1, 0)", "2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(1, 10)   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4091");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483353);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4092");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(108, 2147483305);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("11th Apr 37");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"th Apr 37\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4094");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(369, byteArray1, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4095");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 35)", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 35)" + "'", str3, "(0, 35)");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4096");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(149477150);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4097");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "(1, 365)", "0399-04-30", "(-2147483617, 58)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4098");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
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
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4099");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(1, 387);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4100");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(29, byteArray6, 2147483621);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483621 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 0, 1]");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4101");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(67, 0, 369);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 0)                                                                                             ", "(399, 188)", "-2147483348 S", "(1, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.addScore((int) '#');
        gamePlayer4.addScore(399);
        java.lang.String str9 = gamePlayer4.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Anonymous Player" + "'", str9, "Anonymous Player");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4104");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=365}", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1st" + "'", str5, "1st");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='2 M', score=365}" + "'", str6, "GamePlayer{name='2 M', score=365}");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='', score=0}" + "'", str8, "GamePlayer{name='', score=0}");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.x(10);
        gamePlace4.x(334);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4106");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st Apr 10", "Apr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        java.lang.String str6 = gamePlayer2.toString();
        gamePlayer2.resetScore();
        gamePlayer2.resetScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str6, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4108");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration3 = subject0.new GameConfiguration(779);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4109");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(149477148, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4110");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 58, 730);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4111");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-3555), 399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        java.lang.String str5 = gamePlayer4.getName();
        gamePlayer4.setScore(0);
        java.lang.String str8 = gamePlayer4.getName();
        java.lang.String str9 = gamePlayer4.getName();
        int int10 = gamePlayer4.getScore();
        gamePlayer4.resetScore();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Anonymous Player" + "'", str8, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Anonymous Player" + "'", str9, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4113");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Feb", "#(100, -1)##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4114");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(108);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4115");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483307), (-2147483625), (-2147483559));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4116");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1 S", "GamePlayer{name='11 S', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4117");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0037-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4119");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        gamePlayer2.resetScore();
        java.lang.String str7 = gamePlayer2.toString();
        java.lang.String str8 = gamePlayer2.toString();
        gamePlayer2.addScore(4);
        gamePlayer2.setScore(720);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str7, "GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='10 S', score=0}" + "'", str8, "GamePlayer{name='10 S', score=0}");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4120");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483618));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        java.lang.Object obj7 = null;
        boolean boolean8 = gamePlace6.equals(obj7);
        gamePlace6.y(99);
        int int11 = gamePlace6.y();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 99 + "'", int11 == 99);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4122");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(133, byteArray11, 149477049);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 149477049 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 10]");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4123");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483549 S", "10th Jan 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4124");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("###########################################################################################(31, 100)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4125");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483627), 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483627-03-31" + "'", str2, "-2147483627-03-31");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4126");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject0.new GamePlace((int) (byte) -1, 152);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject0.new GamePlace(394, 45);
        java.lang.Class<?> wildcardClass13 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4127");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(169, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4128");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("#         ", "32 S######444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4129");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(779, 70, 31, (-2147483549), 287, 34);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-11-30", "#####################################################################GamePlayer{name='0 S', score=0}", "                                                                                                31 S", "0394-06-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4131");
        char[] charArray7 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 35)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32 S" + "'", str9, "32 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 35)" + "'", str10, "(0, 35)");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4132");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Jan");
        java.lang.Class<?> wildcardClass6 = gamePlayer5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4133");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, 10)a                                                                                          ", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 10)a                                                                                          " + "'", str3, "(100, 10)a                                                                                          ");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4134");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(3, 0, 1, 0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4135");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.setScore((int) (byte) 0);
        gamePlayer2.setScore(2);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4136");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 2147483640, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4137");
        char[] charArray6 = new char[] { '4', '4', 'a', '4' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=168}", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "44a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "44a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, 4, a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 S" + "'", str7, "-1 S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ga" + "'", str8, "Ga");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4138");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4139");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483600 S", "22nd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4140");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483646), (int) (byte) 1, (int) (short) -1, 100, 79, 214);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4141");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(90, 169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4142");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-24 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4143");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483307));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4144");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(335);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483549 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483549 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0037-10-01", "GamePlayer{name='Anonymous Player', score=32}", "                                                                                          22nd Oct 0", "0032-02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4147");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(168, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-10-01", "6 M", "(-1, 0)                                                                                             ", "GamePlayer{name='(32, -1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4149");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 0)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4150");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray7, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 34 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4151");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(3887, 2147483638, (-2147483626), 45, (-2147483638), (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4152");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483384);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4153");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483096, 2147483096, 110, 4, 488, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4154");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("29th Oct 365");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[29, 0, 0, 0]");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4155");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29th" + "'", str1, "29th");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4156");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483559 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4157");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483549));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4158");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", "(-2147483626, 149477148)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4159");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483559), 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4160");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace4.clone();
        gamePlace4.x((int) '#');
        java.lang.String str9 = gamePlace4.toString();
        gamePlace4.y(89);
        int int12 = gamePlace4.x();
        int int13 = gamePlace4.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace4.clone();
        int int15 = gamePlace14.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(35, -1)" + "'", str9, "(35, -1)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 89 + "'", int15 == 89);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4161");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(214);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4162");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        int int8 = gamePlace7.y();
        int int9 = gamePlace7.x();
        int int10 = gamePlace7.y();
        int int11 = gamePlace7.y();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(32, 32)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (32, 32)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4164");
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
        java.lang.Class<?> wildcardClass48 = gamePlace31.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4165");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483096);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 0, 2147483621);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4167");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace6.clone();
        int int27 = gamePlace26.y();
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
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4168");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0029-10-31", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0029-10-31" + "'", str3, "0029-10-31");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4169");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th Oct 100", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Oct 100                                                                                        " + "'", str3, "10th Oct 100                                                                                        ");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4170");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-24), 335, 99, (-252), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4171");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.setScore(0);
        gamePlayer1.addScore(2147483640);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#####-24 S", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####-24 S" + "'", str3, "#####-24 S");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4173");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace5.clone();
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
        org.junit.Assert.assertNotNull(gamePlace26);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4174");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=4}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        java.lang.String str10 = gamePlace8.toString();
        java.util.List<java.lang.String> strList17 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 31, (-1), (int) (byte) -1, (-2147483648), (-2147483559));
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        boolean boolean19 = gamePlace8.equals((java.lang.Object) wildcardClass18);
        boolean boolean21 = gamePlace8.equals((java.lang.Object) "GamePlayer{name='Anonymous Player', score=-2147483559}");
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, -2147483648)" + "'", str10, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4176");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, -1)44", "GamePlayer{name='-2147483549 S', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.setScore(0);
        java.lang.String[] strArray10 = new java.lang.String[] { "aaaaaa10th", "0366-10-01", "-24 S", "Ga", " (32, 365)" };
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        boolean boolean13 = gamePlayer1.equals((java.lang.Object) strArray11);
        java.lang.String str14 = gamePlayer1.toString();
        java.lang.String str15 = gamePlayer1.toString();
        java.lang.String str16 = gamePlayer1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str14, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str15, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Anonymous Player" + "'", str16, "Anonymous Player");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4178");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, (-2147483627));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4179");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(365, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4180");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10th Oct 366");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4181");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4182");
        char[] charArray5 = new char[] { 'a' };
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-1 S', score=0}", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 M", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, 10)", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4 M" + "'", str8, "4 M");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(32, 10)" + "'", str9, "(32, 10)");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4183");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(188, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4186");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2 S4444444", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          2 S4444444" + "'", str3, "                                                                                          2 S4444444");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4187");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', 394, 386, (int) (byte) 10, (-2147483617), 2147483305);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4188");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(11, 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4189");
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(763, byteArray11, 149477138);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 149477138 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4190");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("#####################################################################GamePlayer{name='0 S', score=0}", "                                                                                          0029-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4191");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0364-10-31", "(366, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4192");
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
        java.lang.String str20 = gamePlace8.toString();
        gamePlace8.x(2147483638);
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject23.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer28 = subject23.new GamePlayer("(100, -1)");
        java.lang.Class<?> wildcardClass29 = gamePlayer28.getClass();
        boolean boolean30 = gamePlace8.equals((java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, -2147483648)" + "'", str10, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(10, -2147483648)" + "'", str20, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4193");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("28 S", "(100, 22)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4194");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(398);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4195");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4196");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(3887);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4197");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483646), 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-024-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4199");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace(188, 2147483305);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("");
        java.lang.String str7 = gamePlayer6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='', score=0}" + "'", str7, "GamePlayer{name='', score=0}");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4200");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 0)", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              (1, 0)" + "'", str3, "                                                                                              (1, 0)");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4201");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483353, 214);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4202");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0052-02-01" + "'", str2, "0052-02-01");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4203");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(364, 99, (-2147483625), 388);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4204");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(149477138, 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4205");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 10)   ", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 10)   " + "'", str3, "(1, 10)   ");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4206");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, -1)4");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4207");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(68, 2147483617, (-2147483307), (-2147483617), 779, 394);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("6th", "4 M", "(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(32, 32)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 M", "0000-01-01", "GamePlayer{name='10 S', score=2147483384}", "GamePlayer{name='Anonymous Player', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4210");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace4.clone();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject11.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace17.clone();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace22.clone();
        java.lang.String str24 = gamePlace23.toString();
        int int25 = gamePlace23.y();
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace29.clone();
        java.lang.String str31 = gamePlace30.toString();
        int int32 = gamePlace30.y();
        boolean boolean33 = gamePlace23.isAdjacent(gamePlace30);
        int int34 = gamePlace23.x();
        boolean boolean35 = gamePlace17.isAdjacent(gamePlace23);
        int int36 = gamePlace10.manhattanDistance(gamePlace23);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(32, -1)" + "'", str24, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(32, -1)" + "'", str31, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 68 + "'", int36 == 68);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4211");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("32 S4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4212");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, 388);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4213");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 369, 214, 730);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 Saaaaaa", "                                                                                          22nd Oct 0", "GamePlayer{name='10 S', score=2147483384}", "-2147483626-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4215");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject0.new GamePlayer("aaaaaa10th");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(386, 0);
        gamePlace14.x(10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace14.clone();
        org.junit.Assert.assertNotNull(gamePlace17);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4216");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(287, 149477150, 2147483638, 2147483096);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        gamePlace4.x((int) (short) 0);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject12.new GamePlayer();
        java.lang.String str17 = gamePlayer16.getName();
        gamePlayer16.setScore(0);
        java.lang.String str20 = gamePlayer16.getName();
        java.lang.String str21 = gamePlayer16.getName();
        boolean boolean22 = gamePlace4.equals((java.lang.Object) str21);
        int int23 = gamePlace4.y();
        java.lang.String str24 = gamePlace4.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Anonymous Player" + "'", str17, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Anonymous Player" + "'", str20, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Anonymous Player" + "'", str21, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(0, -1)" + "'", str24, "(0, -1)");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4218");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace12.clone();
        gamePlace36.y(366);
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = gamePlace36.clone();
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
        org.junit.Assert.assertNotNull(gamePlace39);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4219");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0010-02-01", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("22nd Oct 0", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0010-02-01" + "'", str4, "0010-02-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "22nd Oct 0" + "'", str5, "22nd Oct 0");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4220");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483353);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4221");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483646), 2147483164, 52, 225);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4222");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-02-28", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-024-01-31", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1st" + "'", str8, "1st");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str9, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-24 S" + "'", str10, "-24 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0097-02-28" + "'", str11, "0097-02-28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 S" + "'", str13, "-1 S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-024-01-31" + "'", str14, "-024-01-31");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4223");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', (int) (short) 10, (-2147483549), 0, (-3555), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4224");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 152, 10, 34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4225");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 100, byteArray9, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='Anonymous Player', score=365}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='Anonymous Player', score=365}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4227");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 225);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 M" + "'", str1, "4 M");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0398-04", "-1 Saaaaaa", "", "0100-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(365);
        int int8 = gamePlace4.y();
        gamePlace4.x(0);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4230");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0364-10-31", "#         ", "#(100, -1)", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4232");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(37, (-2147483483));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-001-06-30", "11th Apr 37", "(32, 100)", "2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4234");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("10th######");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4235");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0010-01-01", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-01-01                                                                                          " + "'", str3, "0010-01-01                                                                                          ");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4236");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4237");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th Oct 366", "(-1, 0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("###########################################################################################(188, 52)", "10 S", "2 S", "52 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4239");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483307));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4240");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        int int15 = gamePlace14.x();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace19.clone();
        java.lang.String str21 = gamePlace20.toString();
        gamePlace20.x(100);
        java.lang.String str24 = gamePlace20.toString();
        java.lang.String str25 = gamePlace20.toString();
        boolean boolean26 = gamePlace14.isAdjacent(gamePlace20);
        int int27 = gamePlace5.manhattanDistance(gamePlace20);
        gamePlace20.x(79);
        java.lang.String str30 = gamePlace20.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(32, -1)" + "'", str21, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(100, -1)" + "'", str24, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(100, -1)" + "'", str25, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 68 + "'", int27 == 68);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(79, -1)" + "'", str30, "(79, -1)");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4241");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(3887);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483646 S", "28th", "1 Maaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(inva");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4243");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(1, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4244");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(213, 388);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4245");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(366, 225, 297, 364);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4246");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) -1, 387, 4, 2147483305);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4247");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.resetScore();
        java.lang.String str4 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10 S" + "'", str4, "10 S");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4248");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(779, 2147483164, 297, 22, 31, 2147483164);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4249");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483483 S", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################-2147483483 S" + "'", str3, "#######################################################################################-2147483483 S");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4250");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.x();
        gamePlace3.y((int) (short) 100);
        gamePlace3.x(31);
        java.lang.String str9 = gamePlace3.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(31, 100)" + "'", str9, "(31, 100)");
        org.junit.Assert.assertNotNull(gamePlace10);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-10-01", "                                                                                                    ", "                                                                                                68 Y", "(35, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4252");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483627), 1, 398);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4253");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(99, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4254");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(1, 2147483305)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4255");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace((-252), (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4256");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        gamePlayer2.resetScore();
        gamePlayer2.addScore(35);
        gamePlayer2.setScore((int) (short) 10);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4257");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, 365, 89, 3, 28, (-2147483307));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4258");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483096, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4259");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(149477049);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4260");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Jan4444444", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jan4444444" + "'", str3, "Jan4444444");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4261");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4262");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Nov");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject0.new GamePlace((-24), 32);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject0.new GamePlace((int) (byte) 10, (int) (short) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer22 = subject0.new GamePlayer("                                                                                                68 Y");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration24 = subject0.new GameConfiguration((-2147483625));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4264");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(11, byteArray9, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 366 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 0, 0, 10]");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4265");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-2147483307));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147483307 S" + "'", str1, "-2147483307 S");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4266");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0029-10-31", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0029-10-31" + "'", str3, "0029-10-31");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4267");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(31, (int) (short) -1, 2147483621);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4268");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483549 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4269");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 100, (-2147483648), 2147483617, 108, 108, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(366, 0);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = subject0.new GameConfiguration(0, gamePlayerArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4271");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0398-04-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Jan");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        gamePlayer6.addScore(488);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4273");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("32 S######", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 S######" + "'", str3, "32 S######");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4274");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0010-02-28", "(100, 10)a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4275");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(387);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4276");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 214);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 M" + "'", str1, "4 M");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, 365)", "(10, 1)444", "-2147483618 S", "1 S#######");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4278");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(763, (int) 'a', 2147483353, 365, 34, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4279");
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
        int int19 = gamePlace11.x();
        java.lang.String str20 = gamePlace11.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(32, -1)" + "'", str12, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-2147483648) + "'", int17 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(32, -2147483648)" + "'", str18, "(32, -2147483648)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(32, -2147483648)" + "'", str20, "(32, -2147483648)");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4280");
        char[] charArray4 = new char[] { 'a' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, 0)", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(-1, 0)" + "'", str6, "(-1, 0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4281");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        java.lang.String str5 = gamePlayer2.toString();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.resetScore();
        gamePlayer2.setScore(101);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='10 S', score=100}" + "'", str5, "GamePlayer{name='10 S', score=100}");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4282");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483646), 3887, 110);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4284");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = gamePlace6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4285");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(28, 225);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4286");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477150, 488);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4287");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(394);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4288");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("#######################################################################################-2147483483 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4289");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        gamePlace9.y((int) '#');
        int int12 = gamePlace9.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace9.clone();
        int int14 = gamePlace9.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace9.clone();
        java.lang.String str16 = gamePlace9.toString();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(10, 35)" + "'", str16, "(10, 35)");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4290");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4291");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0000-10-01", "GamePlayer{name='(100, 52) ', score=108}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4292");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 3887);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 H" + "'", str1, "1 H");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4293");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        int int9 = gamePlace8.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4294");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(334, (-2147483625));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4295");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(67);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4296");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Jan");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4297");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray3);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#(100, -1)", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1st" + "'", str4, "1st");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10th Oct 366" + "'", str5, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#(100, -1)" + "'", str6, "#(100, -1)");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4298");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-02-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4299");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483559-01-31", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483559-01-31" + "'", str3, "-2147483559-01-31");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4300");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483646), 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4301");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483617));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4302");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(32, -1)44", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, -1)44" + "'", str3, "(32, -1)44");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4303");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 S4444444", "-2147483648-01-3144444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4304");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4305");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "hi!", "10 S", "hi!", "10 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4306");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(45, (-2147483307), 1, 730);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4307");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483617);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4308");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483638, 2147483647, 32, 44444441, 4, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4309");
        char[] charArray10 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 10)a", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("a", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(100, 10)a" + "'", str13, "(100, 10)a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a" + "'", str15, "a");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0052-01-314" + "'", str16, "0052-01-314");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4310");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0052-01-314");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ", "GamePlayer{name='11 S', score=0}", "(32, 10)", "-024-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4312");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(387, 149477150, (-2147483483), 2147483096, 32, 68);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4313");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483096, 2147483096, 2147483647);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4314");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(133, 70, 398);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4315");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(133, (-2147483626));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4316");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(110, 44444441, (int) (byte) 0, 0, 34, 90);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4317");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 720, 0, (int) (byte) 1, 2147483305, 2147483640);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4318");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(149477150, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4319");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(44444441);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4320");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483096, 387);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4321");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        int int9 = gamePlace7.x();
        gamePlace7.x((-2147483348));
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = null;
        int int13 = gamePlace7.manhattanDistance(gamePlace12);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(730, 335, 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4323");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483559), (-1), 80, 97, 388, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4324");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=0}", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1st" + "'", str6, "1st");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10th Oct 366" + "'", str7, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 S" + "'", str8, "10 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='10th', score=0}" + "'", str10, "GamePlayer{name='10th', score=0}");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4325");
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
        gamePlace7.y(32);
        int int31 = gamePlace7.x();
        java.lang.String str32 = gamePlace7.toString();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(1, 32)" + "'", str32, "(1, 32)");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4326");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(214, 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4327");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        int int10 = gamePlace9.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace9.clone();
        gamePlace9.x((int) '#');
        boolean boolean14 = gamePlace3.isAdjacent(gamePlace9);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace3.clone();
        java.lang.String str16 = gamePlace3.toString();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(32, -1)" + "'", str16, "(32, -1)");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4328");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-252-04-01", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-314", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1st" + "'", str6, "1st");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str7, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-24 S" + "'", str8, "-24 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-252-04-01" + "'", str9, "-252-04-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0052-01-314" + "'", str10, "0052-01-314");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4329");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 149477049, 399, 101, (int) (short) 1, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4330");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 1)444", "GamePlayer{name='(32, -1)', score=0}", "30th", "-2147483626 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4331");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, 108, 149477148);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4332");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 11, 295, 30, 90, 335);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4333");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(80, (int) (short) -1, 333, 152);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4334");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 10, 0, 110, 2147483621, (-1), 295);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4335");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=168}", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=168}" + "'", str3, "GamePlayer{name='Anonymous Player', score=168}");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4336");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(364);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4337");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(399, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4338");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                      (149477148, 0)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4339");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(132, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4340");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4341");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        gamePlayer7.addScore(68);
        gamePlayer7.addScore(0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = gamePlayer7.clone();
        org.junit.Assert.assertNotNull(gamePlayer12);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4342");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, -2147483648)", "                                                                                          Ja");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4343");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(214);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########################################################################################0000-10-01", "0110-11-30", "6 S", "#####################################################################GamePlayer{name='2 M', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4345");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, -2147483648)", "0110-11-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10th######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4347");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("32 S######", "(188, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4348");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483626, 149477148)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4349");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(334);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4350");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(10, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4351");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4352");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(35, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4353");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1), 149477148, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4354");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(779, 3887);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4355");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str9 = gamePlayer2.getName();
        java.lang.String str10 = gamePlayer2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 S" + "'", str9, "10 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='10 S', score=-1}" + "'", str10, "GamePlayer{name='10 S', score=-1}");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4356");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("11th Apr 37", "28th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4357");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y(0);
        gamePlace6.x((-2147483627));
        int int11 = gamePlace6.y();
        gamePlace6.y(29);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4358");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        int int8 = gamePlace7.y();
        gamePlace7.y((int) (byte) -1);
        gamePlace7.x(22);
        gamePlace7.x(2147483164);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483617), 3887);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4360");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(369, byteArray7, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(89, 100)", "", "                                                                                          22nd Oct 0", "GamePlayer{name='10 S', score=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4362");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("GamePlayer{name='10 S', score=4}");
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject4.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        java.lang.String str14 = gamePlace13.toString();
        gamePlace13.x(100);
        java.lang.String str17 = gamePlace13.toString();
        boolean boolean18 = gamePlace8.isAdjacent(gamePlace13);
        gamePlace13.y((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace13.clone();
        boolean boolean22 = gamePlayer3.equals((java.lang.Object) gamePlace13);
        java.lang.String str23 = gamePlace13.toString();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(32, -1)" + "'", str14, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(100, -1)" + "'", str23, "(100, -1)");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4363");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, 10)a", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4364");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483618), 297, 10, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4365");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(333, (int) 'a', 364, (int) (short) -1, 11, 399);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4366");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(35, 369, (-2147483638), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4367");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          2 S4444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th Oct 366", "GamePlayer{name='31 S', score=0}", "-3555 S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4369");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483617), 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4370");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(213, (-2147483348));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4371");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("2nd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character n is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4373");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        java.lang.String str4 = gamePlayer1.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject5.new GamePlayer("10 S");
        java.lang.String str8 = gamePlayer7.getName();
        gamePlayer7.addScore(4);
        java.lang.String str11 = gamePlayer7.toString();
        gamePlayer7.addScore(2);
        boolean boolean14 = gamePlayer1.equals((java.lang.Object) gamePlayer7);
        gamePlayer7.resetScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 S" + "'", str8, "10 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='10 S', score=4}" + "'", str11, "GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4374");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray6, (-2147483348));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483348 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10]");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4375");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, 52) ", "Apr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4376");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        gamePlace6.y((int) (byte) 10);
        gamePlace6.y(35);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4377");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 2)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4378");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10 S', score=4}", "2 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4379");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", "0 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4380");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-1, 0)                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4381");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(295);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4382");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='0010-10-01', score=0}", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0010-10-01', score=0}" + "'", str3, "GamePlayer{name='0010-10-01', score=0}");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4383");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0052-01-314");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4384");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(188, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4385");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(67, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4386");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) -1, 0, 388, 99, (-3555), 779);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4387");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#####################################################################GamePlayer{name='0 S', score=0}", "11th");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4388");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483600), (-2147483483), (-2147483307), (int) '4', 97, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4389");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("                                                                                                    ", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4390");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483638 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4391");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        int int6 = gamePlace4.x();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        gamePlace13.y(0);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer20 = subject16.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject16.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace23.clone();
        boolean boolean25 = gamePlace13.isAdjacent(gamePlace24);
        java.lang.String str26 = gamePlace24.toString();
        int int27 = gamePlace4.manhattanDistance(gamePlace24);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(gamePlace24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(10, -2147483648)" + "'", str26, "(10, -2147483648)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2147483627) + "'", int27 == (-2147483627));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4392");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(369, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, 100)", "GamePlayer{name='Anonymous Player', score=399}", "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(-2147483617, 58)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4394");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, -1)");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4395");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(386, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0386-01-31" + "'", str2, "0386-01-31");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4396");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0108-01-01", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0108-01-01" + "'", str3, "0108-01-01");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4397");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S", "hi!", "10 S", "hi!", "10 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4398");
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(149477148, byteArray10, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4399");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 720);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 M" + "'", str1, "12 M");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4400");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', 387);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4401");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(399, byteArray9, 386);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 386 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4402");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(366, 386, 779);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4403");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(386, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4404");
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
        int int20 = gamePlace18.y();
        int int21 = gamePlace18.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4405");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(730, 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4406");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(90, 214, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4407");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(3, 10, 0, 333);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4408");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        gamePlayer1.setScore(0);
        gamePlayer1.addScore(365);
        gamePlayer1.addScore(394);
        java.lang.String str9 = gamePlayer1.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=759}" + "'", str9, "GamePlayer{name='Anonymous Player', score=759}");
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 32)", "(1, 2147483305)", "#", "-2147483617 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4410");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(333, 68, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4411");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        gamePlace8.x((int) (byte) 1);
        java.lang.String str11 = gamePlace8.toString();
        gamePlace8.y(1);
        gamePlace8.y(0);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -1)" + "'", str11, "(1, -1)");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4412");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, 22)", "GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4413");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1, (int) (short) 10, 30, 213, 386, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4414");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=100}", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=100}" + "'", str3, "GamePlayer{name='Anonymous Player', score=100}");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4415");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(3, 2147483384, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4416");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 32)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4417");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '4', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0052-10-31" + "'", str2, "0052-10-31");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4418");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(335, 6, (int) '4', (-2147483348));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4419");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject0.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = subject0.new GameConfiguration(132);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4420");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 334, 101, 168, 295, 394);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4421");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0029-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4422");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        int int9 = gamePlayer2.getScore();
        gamePlayer2.addScore(31);
        gamePlayer2.setScore(80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4423");
        char[] charArray3 = new char[] { 'a' };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0010-02-01", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#(100, -1)##########################################################################################", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0010-02-01" + "'", str4, "0010-02-01");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#(100, -1)##########################################################################################" + "'", str5, "#(100, -1)##########################################################################################");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4424");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0388-10-31", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0388-10-31" + "'", str3, "0388-10-31");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4425");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, 133, 58, 763, 225, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4426");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 52)", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#(100, 52)" + "'", str3, "#(100, 52)");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4427");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, -214");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4428");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(29);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4429");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.setScore(0);
        boolean boolean14 = gamePlayer8.equals((java.lang.Object) 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4430");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=168}                                                      ", "-2147483626 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4431");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        java.lang.String str9 = gamePlayer8.toString();
        java.lang.String str10 = gamePlayer8.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str9, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2 M" + "'", str10, "2 M");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4432");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483305, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 10)a", "7 M", "10th Oct 100                                                                                        ", "0029-02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0365-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4435");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                        29th Nov 365", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                        29th Nov 365" + "'", str3, "                                                                                        29th Nov 365");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4436");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        java.lang.String str6 = gamePlayer5.getName();
        gamePlayer5.resetScore();
        java.lang.String str8 = gamePlayer5.getName();
        gamePlayer5.setScore(149477514);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, -1)" + "'", str6, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4437");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("32 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4438");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(45, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4439");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4440");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        java.lang.String str6 = gamePlayer2.toString();
        int int7 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='10 S', score=4}" + "'", str6, "GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4441");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(488);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4442");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1 S");
        java.lang.String str3 = gamePlayer2.toString();
        gamePlayer2.setScore(10);
        gamePlayer2.setScore((-3555));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-1 S', score=0}" + "'", str3, "GamePlayer{name='-1 S', score=0}");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4443");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4444");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S', score=0}", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S', score=0}" + "'", str3, "GamePlayer{name='aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 S', score=0}");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4445");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(210, 44444441);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4446");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, (-2147483348), 10, 2, (int) (short) 0, (-3555));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4447");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(149477138, 779);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4448");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace18.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace18.clone();
        comp5111.assignment.cut.Subject subject27 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject27.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer31 = subject27.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = subject27.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace35 = gamePlace34.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace35.clone();
        gamePlace36.y((int) '#');
        int int39 = gamePlace36.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace40 = gamePlace36.clone();
        int int41 = gamePlace26.manhattanDistance(gamePlace36);
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
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(gamePlace35);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(gamePlace40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 58 + "'", int41 == 58);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4449");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(365, (-2147483626));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4450");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483647, 365, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4451");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-2147483600), 51, 6, 295, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4452");
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
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace23.clone();
        int int25 = gamePlace24.y();
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = subject30.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject30.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = gamePlace36.clone();
        int int38 = gamePlace29.manhattanDistance(gamePlace36);
        int int39 = gamePlace29.x();
        int int40 = gamePlace24.manhattanDistance(gamePlace29);
        int int41 = gamePlace18.manhattanDistance(gamePlace29);
        gamePlace29.y((-2147483348));
        int int44 = gamePlace29.y();
        gamePlace29.y(210);
        gamePlace29.x(28);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(32, -1)" + "'", str13, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, -1)" + "'", str16, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(100, -1)" + "'", str17, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gamePlace24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(gamePlace37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 68 + "'", int41 == 68);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-2147483348) + "'", int44 == (-2147483348));
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4453");
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-24), byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(335, byteArray11, 333);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 333 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[10, 0, 0, 10]");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4454");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483348), 333, (int) (byte) -1, 2147483353, 100, 44444441);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4455");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(287, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4456");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(188, 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4457");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-2147483618), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4458");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 100, 149477150, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4459");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 110, 779, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4460");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, 1)", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)                                                                                             " + "'", str3, "(10, 1)                                                                                             ");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4461");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(6, 287, 11, 333, (-1), 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4462");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483638 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4463");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "GamePlayer{name='Anonymous Player', score=698}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4464");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        int int5 = gamePlace3.x();
        int int6 = gamePlace3.y();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4465");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4466");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2 S4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4467");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4468");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483549 S', score=0}", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483549 S', score=0}" + "'", str3, "GamePlayer{name='-2147483549 S', score=0}");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4469");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4470");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30 S", "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4471");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0386-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[386, 0, 0, 0]");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4472");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject subject4 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = subject4.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject4.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace3.manhattanDistance(gamePlace10);
        gamePlace3.x((int) '4');
        int int15 = gamePlace3.y();
        int int16 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace3.clone();
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gamePlace17);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4473");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        java.lang.String str10 = gamePlayer9.getName();
        int int11 = gamePlayer9.getScore();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4474");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(386, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483096, byteArray8, 169);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 169 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 0, 0, 10]");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4475");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 67);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4476");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2 S", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 S" + "'", str3, "2 S");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4477");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("GamePlayer{name='10 S', score=4}");
        gamePlayer3.resetScore();
        gamePlayer3.addScore(108);
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace10.clone();
        int int13 = gamePlace12.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace12.clone();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace18.clone();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace23.clone();
        java.lang.String str25 = gamePlace24.toString();
        gamePlace24.x(100);
        java.lang.String str28 = gamePlace24.toString();
        boolean boolean29 = gamePlace19.isAdjacent(gamePlace24);
        int int30 = gamePlace12.manhattanDistance(gamePlace24);
        boolean boolean31 = gamePlayer3.equals((java.lang.Object) gamePlace24);
        gamePlayer3.setScore(366);
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace37 = subject34.new GamePlace((int) (byte) 1, 386);
        comp5111.assignment.cut.Subject.GamePlace gamePlace40 = subject34.new GamePlace(779, 35);
        boolean boolean41 = gamePlayer3.equals((java.lang.Object) 35);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(32, -1)" + "'", str25, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(100, -1)" + "'", str28, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 68 + "'", int30 == 68);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4478");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 3, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4479");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########################################################################################0000-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4480");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("29th Nov 365", "aaaaaaa0 S", "10th Jan 100", "2147483640-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4482");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace7.clone();
        gamePlace8.x((int) (byte) 1);
        gamePlace8.y(2147483384);
        int int13 = gamePlace8.x();
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4483");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(394, (-2147483627));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4484");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(366, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("-2147483648-01-31");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer8.clone();
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4485");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject5.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace15.clone();
        int int17 = gamePlace11.manhattanDistance(gamePlace16);
        boolean boolean18 = gamePlace4.isAdjacent(gamePlace16);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace16.clone();
        int int20 = gamePlace16.y();
        gamePlace16.y(0);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4486");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace6.clone();
        byte[] byteArray32 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray32, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray32, (int) (byte) 0);
        boolean boolean37 = gamePlace6.equals((java.lang.Object) byteArray32);
        java.lang.String str38 = gamePlace6.toString();
        gamePlace6.y((int) (byte) 1);
        java.lang.String str41 = gamePlace6.toString();
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
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(1, -1)" + "'", str38, "(1, -1)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "(1, 1)" + "'", str41, "(1, 1)");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4487");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-214");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4488");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(335);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4489");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(720, (-2147483648), 68, 251, 6, (-2147483549));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4490");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', 364, 388, 287, 52, 3887);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4491");
        comp5111.assignment.cut.Subject subject2 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject2.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject2.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        java.lang.String str15 = gamePlace14.toString();
        int int16 = gamePlace14.y();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject17.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        java.lang.String str22 = gamePlace21.toString();
        int int23 = gamePlace21.y();
        boolean boolean24 = gamePlace14.isAdjacent(gamePlace21);
        int int25 = gamePlace14.x();
        boolean boolean26 = gamePlace8.isAdjacent(gamePlace14);
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace8.clone();
        byte[] byteArray34 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray34, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray34, (int) (byte) 0);
        boolean boolean39 = gamePlace8.equals((java.lang.Object) byteArray34);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray34, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray34, 213);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 213 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(32, -1)" + "'", str15, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, -1)" + "'", str22, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4492");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaa10th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4493");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("GamePlayer{name='10 S', score=4}");
        gamePlayer3.addScore(1);
        gamePlayer3.addScore(4);
        java.lang.String str8 = gamePlayer3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='GamePlayer{name='10 S', score=4}', score=5}" + "'", str8, "GamePlayer{name='GamePlayer{name='10 S', score=4}', score=5}");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4494");
        java.lang.String[] strArray5 = new java.lang.String[] { "aaaaaa10th", "0366-10-01", "-24 S", "Ga", " (32, 365)" };
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4495");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("0029-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4496");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("6th", "0029-02-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4497");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, -2147483648)", "-2147483348 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(-2147483617, 58)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (-2147483617, 58)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4499");
        java.lang.String[] strArray4 = new java.lang.String[] { "0010-10-31", "22nd", "(100, 100)", "7 M" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test8.test4500");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

