package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_3_Test11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5501");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(194, (-2147483638));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5502");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer("10 S");
        gamePlayer6.setScore(251);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5503");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(188, -2147483627)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5504");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(110, 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5505");
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
        gamePlace25.y((int) (byte) 1);
        int int28 = gamePlace25.x();
        int int29 = gamePlace25.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace25.clone();
        int int31 = gamePlace25.y();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5506");
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
        java.lang.Class<?> wildcardClass41 = gamePlace35.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5507");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(364);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5508");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        int int5 = gamePlace3.x();
        gamePlace3.x(68);
        int int8 = gamePlace3.x();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 68 + "'", int8 == 68);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5509");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483307));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5510");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(37, 2147483164, 335, 0, 51, (-2147483413));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5511");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(763, 0, 30, (-2147483615), 151, 779);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5512");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(194, (-2147483627));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5513");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(214, 1, 388, 34, 25, (-24));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5514");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
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
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5515");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(52, (-2147483617), 214, 149477148);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5516");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        java.lang.String str4 = gamePlayer1.toString();
        gamePlayer1.setScore(365);
        gamePlayer1.addScore(133);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5517");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("12 M", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12 M" + "'", str3, "12 M");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5518");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 1, 2147483583);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5519");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
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
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5520");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("-2147483559 S");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5521");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace10.clone();
        int int12 = gamePlace6.manhattanDistance(gamePlace11);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject13.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = subject13.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject13.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace20.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        java.lang.String str23 = gamePlace21.toString();
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = subject24.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace27.clone();
        int int29 = gamePlace28.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace28.clone();
        boolean boolean31 = gamePlace21.isAdjacent(gamePlace28);
        comp5111.assignment.cut.Subject.GamePlace gamePlace32 = gamePlace21.clone();
        comp5111.assignment.cut.Subject subject33 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject33.new GamePlace((int) ' ', (int) (byte) -1);
        int int37 = gamePlace36.x();
        int int38 = gamePlace32.manhattanDistance(gamePlace36);
        boolean boolean39 = gamePlace6.isAdjacent(gamePlace36);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(10, -2147483648)" + "'", str23, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gamePlace32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-2147483627) + "'", int38 == (-2147483627));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5522");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.setScore(152);
        java.lang.String str7 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 S" + "'", str7, "10 S");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5523");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(213, 2147483305, 38, 2, 110, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th Jan 100", "GamePlayer{name='(32, -1)', score=0}", "GamePlayer{name='2 M', score=365}", "GamePlayer{name='1 M', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5525");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(34, 381);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5526");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(149477138, (-2147483363), 266, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5527");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(108, 394, 333, 488, 152, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("5 Y", "1st", "GamePlayer{name='Anonymous Player', score=32}", "-2147483617 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5529");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, -1)", "GamePlayer{name='2 M', score=0}#####################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5530");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##############################################################GamePlayer{name='0010-02-28', score=0}", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################GamePlayer{name='0010-02-28', score=0}" + "'", str3, "##############################################################GamePlayer{name='0010-02-28', score=0}");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5531");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        int int5 = gamePlayer1.getScore();
        int int6 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5532");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(394, 366, 99, 388);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5533");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483627), 110, 957);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5534");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(90, 35, 169, 720, 2147483384, 2147483384);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5535");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(58, (-2147483646), 101, 2147483638, 2147483384, 35);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5536");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0365-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5537");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 488);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8 M" + "'", str1, "8 M");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5538");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 2147483305, 488, 730, 209, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5539");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(364, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5540");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(68, 31, 0, 32, (int) (byte) 10, 2147483583);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5541");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(225, 10)", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(225, 10)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(225, 10)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5542");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483646 S", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       -2147483646 S" + "'", str3, "                                                                                       -2147483646 S");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5543");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.addScore((int) (byte) 1);
        java.lang.String str13 = gamePlayer8.toString();
        java.lang.String str14 = gamePlayer8.getName();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject15.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject15.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        comp5111.assignment.cut.Subject subject23 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject23.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace26.clone();
        java.lang.String str28 = gamePlace27.toString();
        int int29 = gamePlace27.y();
        comp5111.assignment.cut.Subject subject30 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = subject30.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = gamePlace33.clone();
        java.lang.String str35 = gamePlace34.toString();
        int int36 = gamePlace34.y();
        boolean boolean37 = gamePlace27.isAdjacent(gamePlace34);
        int int38 = gamePlace27.x();
        boolean boolean39 = gamePlace21.isAdjacent(gamePlace27);
        comp5111.assignment.cut.Subject subject40 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace43 = subject40.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer44 = subject40.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace47 = subject40.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace48 = gamePlace47.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace49 = gamePlace48.clone();
        boolean boolean50 = gamePlace27.isAdjacent(gamePlace48);
        comp5111.assignment.cut.Subject.GamePlace gamePlace51 = gamePlace48.clone();
        boolean boolean52 = gamePlayer8.equals((java.lang.Object) gamePlace48);
        gamePlayer8.setScore(10);
        comp5111.assignment.cut.Subject subject55 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace58 = subject55.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace61 = subject55.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace62 = gamePlace61.clone();
        int int63 = gamePlace62.y();
        boolean boolean65 = gamePlace62.equals((java.lang.Object) 0.0d);
        gamePlace62.y(0);
        gamePlace62.x((-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace70 = gamePlace62.clone();
        java.lang.String str71 = gamePlace70.toString();
        comp5111.assignment.cut.Subject subject72 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace75 = subject72.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace76 = gamePlace75.clone();
        int int77 = gamePlace76.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace78 = gamePlace76.clone();
        gamePlace76.x((int) '#');
        comp5111.assignment.cut.Subject subject81 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace84 = subject81.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace85 = gamePlace84.clone();
        java.lang.String str86 = gamePlace85.toString();
        gamePlace85.x(100);
        java.lang.String str89 = gamePlace85.toString();
        java.lang.String str90 = gamePlace85.toString();
        gamePlace85.y((int) (short) 100);
        gamePlace85.x((int) (byte) 1);
        boolean boolean95 = gamePlace76.isAdjacent(gamePlace85);
        java.lang.String str96 = gamePlace76.toString();
        int int97 = gamePlace70.manhattanDistance(gamePlace76);
        java.lang.String str98 = gamePlace76.toString();
        boolean boolean99 = gamePlayer8.equals((java.lang.Object) str98);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='2 M', score=366}" + "'", str13, "GamePlayer{name='2 M', score=366}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2 M" + "'", str14, "2 M");
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(32, -1)" + "'", str28, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(gamePlace34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(32, -1)" + "'", str35, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(gamePlace48);
        org.junit.Assert.assertNotNull(gamePlace49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(gamePlace51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(gamePlace62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(gamePlace70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "(-1, 0)" + "'", str71, "(-1, 0)");
        org.junit.Assert.assertNotNull(gamePlace76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(gamePlace78);
        org.junit.Assert.assertNotNull(gamePlace85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "(32, -1)" + "'", str86, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "(100, -1)" + "'", str89, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "(100, -1)" + "'", str90, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "(35, -1)" + "'", str96, "(35, -1)");
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 37 + "'", int97 == 37);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "(35, -1)" + "'", str98, "(35, -1)");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5544");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        java.lang.String str6 = gamePlayer5.getName();
        gamePlayer5.setScore((int) (byte) -1);
        gamePlayer5.addScore(45);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(100, -1)" + "'", str6, "(100, -1)");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5545");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 287, (-3555));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(399, 10)", "GamePlayer{name='Anonymous Player', score=399}", "", "11th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5547");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        gamePlayer8.addScore(365);
        gamePlayer8.resetScore();
        gamePlayer8.resetScore();
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5548");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("6 M", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483618 S", charArray7);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-2147483618 S" + "'", str14, "-2147483618 S");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5549");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaa10th', score=0}44444444444444444444444444444444444444444444444444444444444444", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaa10th', score=0}44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='aaaaaa10th', score=0}44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5550");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(31, 100)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5551");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5552");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2 M#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 M#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "2 M#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5553");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, 335, 2147483621, (-331));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5554");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
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
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5555");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(58, (-24));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5556");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483559), 763, 3, 194, (-2147483363), (int) (byte) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5557");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore(366);
        gamePlayer2.resetScore();
        gamePlayer2.setScore(2147483353);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5558");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0029-02-01", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0029-02-01" + "'", str3, "0029-02-01");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5559");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 287);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5560");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (-2147483559), 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5561");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("44444441staaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5562");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(488);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5563");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483640, 2147483362, 0, 34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5564");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483096, 295);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5565");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483618), 194, 0, 89, 2147483617, 149477150);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5566");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5567");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(70, 214, 149477150, 0, 149477514, 399);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5568");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray6, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483559), byteArray6, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10]");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5569");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(100, 365, 151, (-2147483549), (-2147483604), 194);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5570");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace48 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject49 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace52 = subject49.new GamePlace((int) ' ', (int) (byte) -1);
        int int53 = gamePlace52.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace54 = gamePlace52.clone();
        java.lang.String str55 = gamePlace54.toString();
        comp5111.assignment.cut.Subject subject56 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace59 = subject56.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace62 = subject56.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace63 = gamePlace62.clone();
        int int64 = gamePlace63.x();
        comp5111.assignment.cut.Subject subject65 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace68 = subject65.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace69 = gamePlace68.clone();
        java.lang.String str70 = gamePlace69.toString();
        gamePlace69.x(100);
        java.lang.String str73 = gamePlace69.toString();
        java.lang.String str74 = gamePlace69.toString();
        boolean boolean75 = gamePlace63.isAdjacent(gamePlace69);
        int int76 = gamePlace54.manhattanDistance(gamePlace69);
        gamePlace69.x(79);
        comp5111.assignment.cut.Subject.GamePlace gamePlace79 = null;
        boolean boolean80 = gamePlace69.isAdjacent(gamePlace79);
        int int81 = gamePlace48.manhattanDistance(gamePlace69);
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
        org.junit.Assert.assertNotNull(gamePlace48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(gamePlace54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(32, -1)" + "'", str55, "(32, -1)");
        org.junit.Assert.assertNotNull(gamePlace63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(gamePlace69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "(32, -1)" + "'", str70, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "(100, -1)" + "'", str73, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(100, -1)" + "'", str74, "(100, -1)");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 68 + "'", int76 == 68);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 78 + "'", int81 == 78);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5571");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, 0)                                                                                             ", "(100, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5572");
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
        int int29 = gamePlayer2.getScore();
        java.lang.String str30 = gamePlayer2.getName();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10 S" + "'", str30, "10 S");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5573");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        gamePlayer1.setScore(11);
        gamePlayer1.setScore(0);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject8.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject8.new GamePlayer("2 M");
        java.lang.String str17 = gamePlayer16.toString();
        gamePlayer16.addScore(365);
        boolean boolean20 = gamePlayer1.equals((java.lang.Object) gamePlayer16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GamePlayer{name='2 M', score=0}" + "'", str17, "GamePlayer{name='2 M', score=0}");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5574");
        char[] charArray8 = new char[] { 'a', 'a', '4', '4' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10 S', score=4}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(79, -1)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, 4, 4]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(79, -1)" + "'", str12, "(79, -1)");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5575");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(78);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5576");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(149477049);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5577");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(266, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5578");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("30th", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30th" + "'", str3, "30th");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5579");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "(10, 0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5580");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "GamePlayer{name='10 S', score=366}444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5581");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, -1)4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          Ja", "", "29th", "0000-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5583");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(251);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5584");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483630), 369, 51, 79, 214, 3971);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5585");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = null;
        boolean boolean20 = gamePlace16.isAdjacent(gamePlace19);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5586");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(386, 364);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5587");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5588");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(149477148, 957, 13, 957);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5589");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(3, 2147483572, (-2147483615));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5590");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5591");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        gamePlayer2.setScore(0);
        java.lang.String str8 = gamePlayer2.getName();
        gamePlayer2.addScore(2147483647);
        int int11 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 S" + "'", str8, "10 S");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5592");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1st Apr 10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5593");
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
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483384, byteArray46, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 365 out of bounds for byte[4]");
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
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5594");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(779, 110, (int) (short) 0, 304, 763, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5595");
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
        gamePlace14.y(366);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, -1)" + "'", str22, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(100, -1)" + "'", str25, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(100, -1)" + "'", str26, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5596");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483621, 488, 394, (-2147483625), (int) 'a', (-2147483413));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5597");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483348, -2147483648)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5598");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 2147483552, 133, 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5599");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(34, 364);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5600");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='GamePlayer{name='Anonymous Player', score=0}', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5601");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(365, -1)", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(365, -1)" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(365, -1)");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5602");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(32, -2147483348)44444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0052-02-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5603");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 133, (-2147483483), 214);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5604");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-24, 11)", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################(-24, 11)" + "'", str3, "###########################################################################################(-24, 11)");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5605");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject0.new GamePlace((int) (byte) -1, 152);
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject11.new GamePlayer("10 S");
        java.lang.String str14 = gamePlayer13.getName();
        gamePlayer13.addScore(4);
        java.lang.String str17 = gamePlayer13.getName();
        gamePlayer13.resetScore();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = subject19.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = subject19.new GamePlayer("2 M");
        gamePlayer27.addScore(365);
        gamePlayer27.addScore((int) (byte) 1);
        gamePlayer27.setScore(37);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray34 = new comp5111.assignment.cut.Subject.GamePlayer[] { gamePlayer13, gamePlayer27 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration35 = subject0.new GameConfiguration(194, gamePlayerArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 S" + "'", str14, "10 S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 S" + "'", str17, "10 S");
        org.junit.Assert.assertNotNull(gamePlayerArray34);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5606");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(149477150);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5607");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        int int6 = gamePlace5.x();
        gamePlace5.y((int) (short) 0);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5608");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(99, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0099-10-31" + "'", str2, "0099-10-31");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5609");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(58, 194, 266, 38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(386, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (386, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5611");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(365, -1)", "0010-01-01                                                                                          ", "(152, -1)", "########################################################################################## (100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5612");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, 11, 2147483621, 2147483583, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5613");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(52, 209);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5614");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("6th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5615");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-3555 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5616");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("5 M", "                                                                                                    ", "2 M#################################################################################################", "GamePlayer{name='0010-10-01', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5617");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(297, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5618");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483353, 2147483164, 0, 101, 367, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5619");
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
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray15);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray16);
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
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5620");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(3971, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3971-10-01" + "'", str2, "3971-10-01");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5621");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(13, (-2147483615));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5622");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("2 M#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 2 M#a");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5623");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44444441);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 Y" + "'", str1, "1 Y");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5624");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.addScore((-2147483648));
        java.lang.String str13 = gamePlayer2.getName();
        gamePlayer2.resetScore();
        gamePlayer2.setScore(387);
        gamePlayer2.setScore(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 S" + "'", str13, "10 S");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "#######################################################################################-2147483483 S", "GamePlayer{name='-1 S', score=0}", "22 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5626");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 366", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, 365)", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1st" + "'", str5, "1st");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10th Oct 366" + "'", str6, "10th Oct 366");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(32, 365)" + "'", str8, "(32, 365)");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5627");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(0, -1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5628");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483483 S", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483483 S" + "'", str3, "-2147483483 S");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5629");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(149477138, 210);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5630");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(381, 45, 70, (-2147480159), 149477148, 149477514);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5631");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.resetScore();
        java.lang.String str6 = gamePlayer2.getName();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str9 = gamePlayer2.getName();
        gamePlayer2.resetScore();
        gamePlayer2.addScore((int) (short) 0);
        gamePlayer2.addScore(30);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 S" + "'", str9, "10 S");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5632");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483627), (-2147483618));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5633");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(251, 0, 1, 387, (int) (short) 0, (-2147483483));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, 1)", "", "(32, 100)", "(-1, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5635");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0037-10-01", "(394, 30)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5636");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(394, 0, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5637");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("2147483640-01-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2147483640, 0, 0, 0]");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5638");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(381, 386, 3, 68, 30, (-2147483559));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5639");
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
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
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
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5640");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1 M", "0099-11-30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5641");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("Jan4444444");
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject0.new GamePlace(2147483384, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer("GamePlayer{name='Anonymous Player', score=0}");
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration17 = subject0.new GameConfiguration(97, gamePlayerArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5642");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483625 S", "0099-11-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 35)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 35)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5644");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(110, 381);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5645");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        gamePlace14.y((-2147483604));
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5646");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(763);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5647");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(11, 304);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5648");
        char[] charArray3 = new char[] {};
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray3);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1st" + "'", str4, "1st");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str5, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Jan" + "'", str6, "Jan");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5649");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.y((int) (byte) -1);
        int int11 = gamePlace4.y();
        gamePlace4.x(367);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5650");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        gamePlace4.x((int) (short) 0);
        int[] intArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0010-10-31                                                                                          ");
        boolean boolean14 = gamePlace4.equals((java.lang.Object) intArray13);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5651");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 149477148)", "(1, 32)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5652");
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
        java.lang.String str34 = gamePlayer3.getName();
        int int35 = gamePlayer3.getScore();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "GamePlayer{name='10 S', score=4}" + "'", str34, "GamePlayer{name='10 S', score=4}");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 366 + "'", int35 == 366);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5653");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0052-02-01", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440052-02-01" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440052-02-01");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5654");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-02-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5655");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        gamePlace3.y(0);
        java.lang.Object obj7 = null;
        boolean boolean8 = gamePlace3.equals(obj7);
        int int9 = gamePlace3.y();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5656");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("                                                                                          Jan4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444", "###########################################################################################(-24, 11)", "GamePlayer{name='                                                                                           (100, 52)', score=0}", "                                                                                   (-2147483617, 58)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5658");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st Apr 10", "0052-01-314");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5659");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (-331));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5660");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(29, (int) (short) 0, 149477514, (int) (short) 10, (-2147483559), 67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5661");
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray12, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray12, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray12, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray12, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483348), byteArray12, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(763, byteArray12, 381);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 381 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5662");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483348), 386, (-2147483600), 28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5663");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483600), 168, 367, 22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5664");
        char[] charArray8 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-31", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1 Maaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-214" + "'", str10, "-214");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 Ma" + "'", str11, "1 Ma");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5665");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483615 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 M                                                                                                 ", "GamePlayer{name='0097-02-28', score=0}", "28th", "(32, 32)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5667");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='2 M', score=366}", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "(32, 188)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5668");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        java.lang.String str5 = gamePlayer4.getName();
        gamePlayer4.setScore(0);
        gamePlayer4.addScore(68);
        gamePlayer4.addScore(698);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5669");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483618), 225);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5670");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1 S#######");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5671");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0089-01-01", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0089-01-01" + "'", str3, "0089-01-01");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5672");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-001-01-01", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 M", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(366, -1)", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          22nd Oct 0", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1st" + "'", str8, "1st");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str9, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-001-01-01" + "'", str10, "-001-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32 S" + "'", str11, "32 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4 M" + "'", str12, "4 M");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(366, -1)" + "'", str13, "(366, -1)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                          22nd Oct 0" + "'", str14, "                                                                                          22nd Oct 0");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5673");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='GamePlayer{name='10 S', score=4}', score=5}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5674");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(399, 297, (-2147483363), (-2147483646), (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5675");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 168);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5676");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(388);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5677");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(13, (int) (short) 0);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5678");
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
        int int29 = gamePlayer2.getScore();
        int int30 = gamePlayer2.getScore();
        java.lang.String str31 = gamePlayer2.toString();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "GamePlayer{name='10 S', score=97}" + "'", str31, "GamePlayer{name='10 S', score=97}");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5679");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(2, -1)", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2, -1)" + "'", str3, "(2, -1)");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5680");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5681");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483615));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5682");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5683");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(297);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5684");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='GamePlayer{name='10 S', score=4}', score=5}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='GamePlayer{name='10 S', score=4}', score=5}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5686");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 488);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5687");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(310, 2147483617);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5688");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray9, 398);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 398 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483625 S", "(100, 52) ", "GamePlayer{name='Anonymous Player', score=759}", "GamePlayer{name='Anonymous Player', score=100}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5690");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(149477049, 194, 97, 2147483362, 0, 2147483638);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5691");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(108, 2147483096);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5692");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(38);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5693");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.addScore(4);
        int int6 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.setScore((int) 'a');
        gamePlayer2.setScore((int) ' ');
        gamePlayer2.addScore(52);
        int int15 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S" + "'", str3, "10 S");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 84 + "'", int15 == 84);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5694");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        java.lang.String str9 = gamePlace4.toString();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject10.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace16.clone();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        java.lang.String str23 = gamePlace22.toString();
        int int24 = gamePlace22.y();
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = subject25.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace28.clone();
        java.lang.String str30 = gamePlace29.toString();
        int int31 = gamePlace29.y();
        boolean boolean32 = gamePlace22.isAdjacent(gamePlace29);
        int int33 = gamePlace22.x();
        boolean boolean34 = gamePlace16.isAdjacent(gamePlace22);
        comp5111.assignment.cut.Subject subject35 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = subject35.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer39 = subject35.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject35.new GamePlace(10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace43 = gamePlace42.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace44 = gamePlace43.clone();
        boolean boolean45 = gamePlace22.isAdjacent(gamePlace43);
        comp5111.assignment.cut.Subject.GamePlace gamePlace46 = gamePlace43.clone();
        int int47 = gamePlace46.y();
        int int48 = gamePlace4.manhattanDistance(gamePlace46);
        int int49 = gamePlace4.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(100, -1)" + "'", str9, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(32, -1)" + "'", str23, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(32, -1)" + "'", str30, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(gamePlace43);
        org.junit.Assert.assertNotNull(gamePlace44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(gamePlace46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-2147483648) + "'", int47 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-2147483559) + "'", int48 == (-2147483559));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5695");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440052-02-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5696");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='0010-02-28', score=0}", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5697");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(364, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5698");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        java.lang.String str7 = gamePlace3.toString();
        int int8 = gamePlace3.y();
        gamePlace3.y(763);
        java.lang.String str11 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32, -1)" + "'", str7, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(32, 763)" + "'", str11, "(32, 763)");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5699");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5700");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='(32, -1)', score=-100}", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################GamePlayer{name='(32, -1)', score=-100}" + "'", str3, "#############################################################GamePlayer{name='(32, -1)', score=-100}");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5701");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(11, (int) (short) -1, 698);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5702");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483431);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5703");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0037-10-01", "0004-06-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12175) + "'", int2 == (-12175));
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5704");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(333, (-3555), 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5705");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject7.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace14.clone();
        int int16 = gamePlace6.manhattanDistance(gamePlace14);
        java.lang.String str17 = gamePlace14.toString();
        int int18 = gamePlace14.x();
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(1, -1)" + "'", str17, "(1, -1)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5706");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483307), 387, 22, (-2147483307));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5707");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, 225, (-2147483617), 225, 28, (-2147483646));
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5708");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(89, 100)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5709");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray7, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(25, byteArray7, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 0, 0, 10]");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5710");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "2147483640-01-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5711");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 2147483164, 32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5712");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5713");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=398}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5714");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 24, 28, 149477049);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5715");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        int int5 = gamePlace4.x();
        java.lang.String str6 = gamePlace4.toString();
        int int7 = gamePlace4.x();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(32, -1)" + "'", str6, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5716");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483583);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5717");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(14");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5718");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(11, 2147483305, 365, 2147483572, 149477514, 2147483638);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5719");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(70, 30, (-2147483648), (-2147483413));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5720");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, 213, (int) ' ', (-331), 149477148, 2147483638);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5721");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, 35)", "(0, -214");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5722");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2 M", "11th Apr 37");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-001-11-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5724");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 1)                                                                                             ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5725");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(366, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("##########################################################################################0000-10-01");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5726");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("################################################################################################35 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5727");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0 S", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5728");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -1)", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5729");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483618), 80, 2147483096, 130);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5730");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1staaaaaaa");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5731");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-02-28", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S######", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483600 S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1st" + "'", str8, "1st");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str9, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-24 S" + "'", str10, "-24 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0097-02-28" + "'", str11, "0097-02-28");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 S######" + "'", str13, "32 S######");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-2147483600 S" + "'", str14, "-2147483600 S");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5732");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147480159), 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5733");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(366, -1)", "(366, 0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5734");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(698, 4, (int) (short) 1, 13, 2147483305, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5735");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10 S");
        gamePlayer2.setScore((int) (byte) 100);
        gamePlayer2.setScore((int) (byte) 0);
        gamePlayer2.setScore((int) '#');
        int int9 = gamePlayer2.getScore();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5736");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(488, 0, (-331), 78);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5737");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0029-02-01", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0029-02-01" + "'", str3, "0029-02-01");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5738");
        char[] charArray10 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-31", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=32}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Apr", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th" + "'", str11, "10th");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Apr" + "'", str15, "Apr");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5739");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5740");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0386-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5741");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        java.lang.String str7 = gamePlace3.toString();
        int int8 = gamePlace3.y();
        gamePlace3.y(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(32, -1)" + "'", str7, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5742");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(25, byteArray1, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (100, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5744");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 13, 149477138, 364, 3887, 2147483164);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5745");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(79, -1)", "Ga");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5746");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-2147483648), 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject0.new GamePlace(10, 0);
        gamePlace14.y((-2147483618));
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5747");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.y((int) (byte) -1);
        java.lang.String str11 = gamePlace4.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace4.clone();
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, -1)" + "'", str11, "(100, -1)");
        org.junit.Assert.assertNotNull(gamePlace12);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5748");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0099-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[99, 0, 0, 0]");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5749");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("###########################################################################################(31, 100)", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5750");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5751");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(3, 210);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5752");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(29, 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5753");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(32, -2147483348)44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5754");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-3555), 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5755");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(80, 779, 44444441, 10, 89, 132);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5756");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (int) '#', 4, (-2147483307), 213, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5757");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='0010-10-01', score=0}", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0010-10-01', score=0}" + "'", str3, "GamePlayer{name='0010-10-01', score=0}");
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5758");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='0097-02-28', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='0097-02-28', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5759");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) '4', 0, 214, 369, 29, 51);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5760");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(70, 169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5761");
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
        gamePlace18.x(213);
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
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5762");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(367, byteArray8, 152);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 152 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 1, 1, 0, 10, 0]");
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5763");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(149477514, 365, 0, (-2147483307), (-1), 386);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5764");
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
        int int41 = gamePlace35.x();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5765");
        java.lang.String[] strArray4 = new java.lang.String[] { "10 S", "hi!", "", "10 S" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
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
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5766");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(779, 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5767");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer19 = subject17.new GamePlayer("-1 S");
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject17.new GamePlace((int) (byte) 10, (int) (byte) 0);
        int int23 = gamePlace14.manhattanDistance(gamePlace22);
        comp5111.assignment.cut.Subject subject24 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = subject24.new GamePlace((int) (byte) -1, (int) (short) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject24.new GamePlace((int) (short) 10, (-2147483648));
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = subject31.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer35 = subject31.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = subject31.new GamePlace(10, (-2147483648));
        int int39 = gamePlace38.y();
        java.lang.String str40 = gamePlace38.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace41 = gamePlace38.clone();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace45 = subject42.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace46 = gamePlace45.clone();
        java.lang.String str47 = gamePlace46.toString();
        gamePlace46.x(100);
        java.lang.String str50 = gamePlace46.toString();
        int int51 = gamePlace38.manhattanDistance(gamePlace46);
        int int52 = gamePlace30.manhattanDistance(gamePlace46);
        int int53 = gamePlace30.y();
        boolean boolean54 = gamePlace22.isAdjacent(gamePlace30);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2147483648) + "'", int39 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(10, -2147483648)" + "'", str40, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace41);
        org.junit.Assert.assertNotNull(gamePlace46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(32, -1)" + "'", str47, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(100, -1)" + "'", str50, "(100, -1)");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-2147483559) + "'", int51 == (-2147483559));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-2147483559) + "'", int52 == (-2147483559));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-2147483648) + "'", int53 == (-2147483648));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5768");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject0.new GamePlace(3971, 29);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5769");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(100, 133)", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 133)" + "'", str3, "(100, 133)");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5770");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("#######################################################################################-2147483483 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5771");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-24 S", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-02-28", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S######", charArray10);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray10);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-02-01", charArray10);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}", charArray10);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str12, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-24 S" + "'", str13, "-24 S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0097-02-28" + "'", str14, "0097-02-28");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str15, "Oct4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32 S######" + "'", str16, "32 S######");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0052-02-01" + "'", str18, "0052-02-01");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}" + "'", str19, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5772");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483647));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5773");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(45, 394, 3971);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5774");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        int int4 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject6.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject6.new GamePlace(10, (-2147483648));
        int int14 = gamePlace13.y();
        java.lang.String str15 = gamePlace13.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace13.clone();
        boolean boolean17 = gamePlace5.equals((java.lang.Object) gamePlace16);
        int int18 = gamePlace16.y();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-2147483648) + "'", int14 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(10, -2147483648)" + "'", str15, "(10, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5775");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                   (-2147483617, 58)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5776");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5777");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(32, 365)", "(1, 2147483096)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5778");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='aaaaaa10th', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5779");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(132, (int) (byte) 0, 188, 251, 149477049, 149477150);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5780");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5781");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        java.lang.String str3 = gamePlayer1.toString();
        java.lang.String str4 = gamePlayer1.toString();
        java.lang.String str5 = gamePlayer1.toString();
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject6.new GamePlace((int) (byte) 1, (-1));
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace12.clone();
        int int14 = gamePlace13.y();
        boolean boolean16 = gamePlace13.equals((java.lang.Object) 0.0d);
        gamePlace13.y(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace13.clone();
        boolean boolean20 = gamePlayer1.equals((java.lang.Object) gamePlace13);
        gamePlayer1.resetScore();
        gamePlayer1.resetScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str5, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5782");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2 M#a", "0108-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5783");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = gamePlace3.clone();
        java.lang.String str5 = gamePlace4.toString();
        gamePlace4.x(100);
        java.lang.String str8 = gamePlace4.toString();
        gamePlace4.y((int) (byte) -1);
        java.lang.String str11 = gamePlace4.toString();
        gamePlace4.y(99);
        org.junit.Assert.assertNotNull(gamePlace4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(32, -1)" + "'", str5, "(32, -1)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(100, -1)" + "'", str8, "(100, -1)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, -1)" + "'", str11, "(100, -1)");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5784");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(2147483362, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5785");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(957);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5786");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "                                                                                          Ja");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5787");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483447, 369);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5788");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("29th Nov 365", "(149477148, 0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5789");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(169, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5790");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0022-01-01", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5791");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(10, -1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5792");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject3.new GamePlayer("10 S");
        java.lang.String str6 = gamePlayer5.getName();
        gamePlayer5.addScore(4);
        gamePlayer5.resetScore();
        boolean boolean10 = gamePlayer1.equals((java.lang.Object) gamePlayer5);
        gamePlayer1.addScore((-2147483600));
        gamePlayer1.setScore(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 S" + "'", str6, "10 S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5793");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, (-3555), 779, (-2147483549), (-2147483638), 84);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5794");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483362, 2147483362, 2147483431, (int) (byte) 10, (-2147483615), 149477150);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5795");
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
        int int25 = gamePlace6.manhattanDistance(gamePlace21);
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject26.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace29.clone();
        int int31 = gamePlace30.x();
        int int32 = gamePlace6.manhattanDistance(gamePlace30);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(32, -1)" + "'", str22, "(32, -1)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 31 + "'", int32 == 31);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5796");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("3971-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[3971, 0, 0, 0]");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5797");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483604), 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5798");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(720, 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5799");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(194, 2147483353, 10, 381);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5800");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483552, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5801");
        char[] charArray8 = new char[] { '4', '#', '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-31", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, -1)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4#4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, 4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10th" + "'", str9, "10th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-214" + "'", str10, "-214");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(32, -1)" + "'", str11, "(32, -1)");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5802");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483483), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5803");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 133, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5804");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 335, (-2147480159));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5805");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483164, 398);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5806");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0010-02-28", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0010-02-28" + "'", str3, "0010-02-28");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5807");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2 S4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5808");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(168, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5809");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483384, 130, (-2147483413), 2147483621, (int) (byte) 1, 381);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5810");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-252), 0, 209, (-2147483559));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5811");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, 2147483647, 79, 51);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5812");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GamePlayer{name='(31, 100)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5813");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(334, 52, 335);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5814");
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
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray34, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483617, byteArray34, 763);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 763 out of bounds for byte[4]");
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
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5815");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(188, 145, (-1), (-2147483348), (-3555), 266);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5816");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Jun", "-2147483648 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5817");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(100, -1)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        java.lang.Class<?> wildcardClass8 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5818");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(149477150, 488, (-12175), (-2147483626));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5819");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0110-11-30", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0110-11-30" + "'", str3, "0110-11-30");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_3_Test11.test5820");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("22nd Oct 0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22nd Oct 0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "22nd Oct 0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }
}

