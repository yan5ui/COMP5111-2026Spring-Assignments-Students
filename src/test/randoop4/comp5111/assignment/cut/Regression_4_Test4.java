package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_4_Test4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2001");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214174, 97, 100, (-2147483583), 414, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2002");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########", "       0 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2003");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2004");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(invalid)', score=132}", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2005");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(366);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2006");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Ga", "                                                                                          10th Oct 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2007");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483345), (-6));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        java.lang.String str4 = gamePlace3.toString();
        gamePlace3.x((-104));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, -1)" + "'", str4, "(52, -1)");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2009");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.y();
        int int8 = gamePlace3.y();
        java.lang.String str9 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace13.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace13.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace13.clone();
        int int18 = gamePlace13.y();
        int int19 = gamePlace3.manhattanDistance(gamePlace13);
        int int20 = gamePlace3.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, -2147483648)" + "'", str9, "(1, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2147483648) + "'", int18 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2010");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(10, 2147483619, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2011");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("                                                                                          a", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          a#########" + "'", str3, "                                                                                          a#########");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2012");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, (int) (short) 1, 2147483647, 2, 373, 2147483382);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2013");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-12), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2014");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) 'a', (int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = subject0.new GameConfiguration((-2147483549), gamePlayerArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("31st", "2147483606-01-01", "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2016");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483605);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2017");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#################################################################################################4th", "########Ga");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 366)", "Feb", "GamePlayer{name='Anonymous Player', score=0}", "2147483605-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2019");
        char[] charArray7 = new char[] { ' ', '4', '#', ' ', '#' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, 52)", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(52, -1)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4# #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4# #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4, #,  , #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(10, " + "'", str8, "(10, ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(52, " + "'", str9, "(52, ");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        gamePlayer4.resetScore();
        gamePlayer4.setScore((int) (byte) 10);
        gamePlayer4.setScore(365);
        gamePlayer4.resetScore();
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2021");
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
        gamePlace14.y((-2147483345));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2022");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, 1)", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "(1, 1)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2023");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2024");
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
        int int19 = gamePlace3.x();
        int int20 = gamePlace3.y();
        java.lang.Class<?> wildcardClass21 = gamePlace3.getClass();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-2147483648) + "'", int20 == (-2147483648));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 1)", "GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}", "68 Y", "(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2026");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-421));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2027");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='(invalid)', score=100}", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=100}" + "'", str3, "GamePlayer{name='(invalid)', score=100}");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2028");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(invalid)', score=100}", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=100}" + "'", str3, "GamePlayer{name='(invalid)', score=100}");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2029");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2147483606-01-01", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2147483606-01-01" + "'", str3, "2147483606-01-01");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2030");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = gameConfiguration2.clone();
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gameConfiguration5);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2031");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("#######################################################################################-2147483648 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", "1st Sep 365", "0000-10-01", "2147483606-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2033");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2034");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-104), 6, 2147483549);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2035");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, ", "(10, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2036");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2037");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, 32, 2147483549, (int) '#', (-2147483345), 2147483602);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2038");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                          aaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                          aaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                           aaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2040");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("9 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2041");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(6, 10, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2042");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th Oct 1", "10th Oct 1", "0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-001-03-31");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2043");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483596, 31, (-1), (int) ' ', 0, 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2044");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        gameConfiguration2.clearInitialBoard();
        int int7 = gameConfiguration2.getSize();
        java.lang.String str8 = gameConfiguration2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str8, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 S######", "32 S", "1st", "GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2046");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-12), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483335 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483335 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2048");
        char[] charArray6 = new char[] { '4', 'a', '#' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0 ", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("##########", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 " + "'", str8, "0 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2049");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(59, byteArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483583), byteArray5, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2050");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(120);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2051");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("3rd", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3rd" + "'", str3, "3rd");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2052");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, 0, (-2147483642), 373);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2053");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2054");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2055");
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
        boolean boolean16 = gameConfiguration2.isBoardFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2056");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray3, (-2147483345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483345 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2057");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2058");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483645, (-2147483549), 4, 58, 97, 2147483382);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2059");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Ja", "GamePlayer{name='(1, 1)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2060");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483642), (-2147483642));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2061");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 S" + "'", str1, "2 S");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2062");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2063");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(97, 0, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2064");
        char[] charArray7 = new char[] { '4', 'a', '#' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, ", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='2 M', score=4}", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Ga" + "'", str8, "Ga");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 S" + "'", str9, "-1 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(-1, " + "'", str10, "(-1, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2065");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "(52, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2066");
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
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2067");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483648-01-01", "(10, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2068");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483602, (int) '#', 373, 477214174, 100, (-2147483648));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2069");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(366, 3)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2070");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483583-10-01", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################-2147483583-10-01" + "'", str3, "###################################################################################-2147483583-10-01");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2071");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483345), (-2147483334), 2147483382);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2072");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "-2147483345 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2073");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2074");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483648 S", "Sep");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2075");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483602);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2076");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-12), (-2147483642), (-6), 3, (int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2077");
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
        java.lang.String str21 = gamePlace19.toString();
        java.lang.String str22 = gamePlace19.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(-1, 100)" + "'", str21, "(-1, 100)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(-1, 100)" + "'", str22, "(-1, 100)");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2078");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483642), byteArray7, 2147483382);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483382 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2079");
        char[] charArray6 = new char[] { '4', 'a', '#' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0 ", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 " + "'", str8, "0 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-214", "#", "-2147483583 S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2081");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0365-09-30", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                 Oct", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0100-10-01" + "'", str16, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 " + "'", str17, "-1 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0365-09-30" + "'", str18, "0365-09-30");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2082");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483647, byteArray7, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2083");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##########", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                                                                          " + "'", str3, "##########                                                                                          ");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2084");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2085");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("###################################################################################-2147483583-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2086");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2087");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2088");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("       0 S", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       0 S" + "'", str3, "       0 S");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2089");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(365, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2090");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483613));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2091");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483382, (int) ' ', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2092");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2093");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483583), (-2147483334), 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2094");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483382, (-2147483648), (-2147483334), 2147483619);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2095");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2096");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("a", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444a" + "'", str3, "444444444a");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2097");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30th" + "'", str1, "30th");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2098");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(6, 2, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6th Feb 6" + "'", str3, "6th Feb 6");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9th", "Sep", "Sep", "35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(10, 10)", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 10)aa" + "'", str3, "(10, 10)aa");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2101");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 S######", "(100, 366)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2102");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(-1, ", "aaaa(0, 4)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2103");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483549, 59, 2147483645);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2104");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(214);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2105");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Sep", "(10, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2106");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, 2147483596, 214);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2107");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2108");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-1 S######", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2109");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("35 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2110");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(120, 6, 31, (-2147483549), 97, 2147483639);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#############################################################################################(1, -1)", "GamePlayer{name='          ', score=0}", "0030-10-01", "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        int int2 = gamePlayer1.getScore();
        int int3 = gamePlayer1.getScore();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2113");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1, 58, (-2147483613), 2147483602, 365, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("68 Y");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 68 Y");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2115");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483619, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', 2147483605, 9, (int) 'a', 2147483596, 2147483606);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2117");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2147483602);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2118");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2147483606-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2120");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}", "(366, 3)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2121");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483549-04-01", "-001-09-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2122");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("7 M", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2123");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("30th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2124");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Ga", "(10, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("6 M", "GamePlayer{name='aaaaaaaaaa', score=0}", "-421 S", "214");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2126");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##########", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2127");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2, (int) (byte) 0, 6, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2128");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.y();
        int int8 = gamePlace3.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2129");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 2147483639, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2130");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       0 S" + "'", str3, "       0 S");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2131");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2132");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Anonymous ", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, -2147483648)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Anonymous " + "'", str12, "Anonymous ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(10, -214" + "'", str13, "(10, -214");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2133");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 214);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 M" + "'", str1, "4 M");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2134");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) 'a', (int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(0, (int) (byte) 1);
        java.lang.String str12 = gamePlace11.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 1)" + "'", str12, "(0, 1)");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2135");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2136");
        char[] charArray10 = new char[] { '4', 'a', '#' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='                                                                                                    ', score=0}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483334 S", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S######", charArray10);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct 1", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 S" + "'", str12, "-1 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-214" + "'", str15, "-214");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 S#" + "'", str16, "-1 S#");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10th Oct 1" + "'", str17, "10th Oct 1");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2137");
        byte[] byteArray5 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483645, byteArray5, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483345), byteArray5, (-2147483345));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483345 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100]");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2138");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2139");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(9, 35, (int) '4', 477214174, 373, 2147483639);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2140");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483606);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2141");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Anonymous ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2142");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483335 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2143");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2144");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483382, (int) (short) 100, (-2147483613), 2147483619);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2145");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("35 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2146");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        boolean boolean4 = gameConfiguration2.isBoardFull();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration2.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList8 = gameConfiguration2.getEmptyPlaces();
        int int9 = gameConfiguration2.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration2.getEmptyPlaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlaceList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2147");
        char[] charArray8 = new char[] { '4', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, ", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("32 S", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 S" + "'", str10, "-1 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(-1, " + "'", str11, "(-1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 S" + "'", str13, "32 S");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2148");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        int[] intArray3 = gameConfiguration2.countPiecesPerPlayer();
        int[] intArray4 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean5 = gameConfiguration2.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration2.clone();
        int int7 = gameConfiguration2.getSize();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                    ", "0366-09-30", "(100, -1)", "9 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2150");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        int[] intArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(0, -2147483648)', score=0}");
        boolean boolean13 = gamePlayer10.equals((java.lang.Object) "GamePlayer{name='(0, -2147483648)', score=0}");
        gamePlayer10.setScore(4);
        gamePlayer10.addScore((-2147483613));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#######################################################################################-2147483648 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #######################################################################################-2147483648 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2153");
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
        gamePlayer24.addScore(2147483639);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(invalid)", "-2147483335 S", "a", "6th Feb 6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2155");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 100)", "(invalid)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2156");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2157");
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
        boolean boolean26 = gameConfiguration2.isBoardFull();
        boolean boolean27 = gameConfiguration2.isBoardFull();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration28 = gameConfiguration2.clone();
        int[] intArray29 = gameConfiguration2.countPiecesPerPlayer();
        boolean boolean30 = gameConfiguration2.isBoardFull();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gameConfiguration28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2158");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='##(52, -1)', score=32}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2159");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(9, (-2147483335), 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2160");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(373, 2147483647, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2161");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                    ", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                 Oct", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2162");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, 100)", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, " + "'", str9, "(1, ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(-1, " + "'", str10, "(-1, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10th" + "'", str11, "10th");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Feb");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2164");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("214");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2165");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray5, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2166");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("   (0, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2167");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2168");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(invalid)', score=1}", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=1}" + "'", str3, "GamePlayer{name='(invalid)', score=1}");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2169");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483596, 100, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2170");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(3, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2171");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-214", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-214" + "'", str3, "(-214");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-12), (-2147483613), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2173");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483648 S", "2147483619-02-28");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2174");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        int int7 = gamePlace6.y();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2147483648) + "'", int7 == (-2147483648));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2175");
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
        int[] intArray17 = gameConfiguration2.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer18 = null;
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace22.y();
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration2.addInitialPiece(gamePlayer18, gamePlace22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-2147483648) + "'", int23 == (-2147483648));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2176");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("68 Y", "(1, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2177");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483382, 2147483382, (-1), 9, 414, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2178");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("####################################################################################################", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Sep 365", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("9 S", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -1)", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1st " + "'", str17, "1st ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9 " + "'", str18, "9 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1, " + "'", str19, "(1, ");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2179");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("3rd", "0100-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2180");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Oct");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2181");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(97, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2182");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("####################################################################################################", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=-2147483583}", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#" + "'", str12, "#");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2183");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-421), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483583-10-01', score=0}", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483583-10-01', score=0}" + "'", str3, "GamePlayer{name='-2147483583-10-01', score=0}");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2185");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0010-09-01", "0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2186");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2147483596-01-31", "0 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2187");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-104), (int) (short) 1, (-421), (-6));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2188");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483645, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2189");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 S" + "'", str1, "4 S");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2190");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st ", "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("7 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 7 ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2192");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("(0, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2193");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(214, 3, 2147483602);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2194");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray3, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 58 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2195");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 214, (-2147483642));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2196");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(414, (-104));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2197");
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
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2198");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2199");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2200");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(477214174);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2201");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, 35, 373, 58, 2147483382, (-2147483335));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2202");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2203");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaaaaaa", "-12 Saaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2204");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483602, 10, 2, 30, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########                                                                                          ", "", "-001-09-01", "(100, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2206");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 477214174, (-1), 2147483619);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2207");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1, (int) (short) 0, 58, 373, 2147483382, (int) '4');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2208");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(31, (int) (byte) 10, (-2147483642));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2209");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483613 S", "(1, -1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2210");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(invalid)', score=373}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2211");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', (-2147483335), (-421));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2212");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483639, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2213");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace22.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace22.clone();
        int int27 = gamePlace11.manhattanDistance(gamePlace26);
        boolean boolean28 = gameConfiguration2.isOccupied(gamePlace11);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList29 = gameConfiguration2.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray30 = gameConfiguration2.getPlayers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(gamePlaceList29);
        org.junit.Assert.assertNotNull(gamePlayerArray30);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2214");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483549);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2215");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(0, -2147483648)', score=0}", "0010-02-28");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2216");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        gamePlace21.x((-2147483607));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertNotNull(gamePlace22);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2217");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483605, (int) (short) 100, (-2147483583), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2218");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(58, -2147483648)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444a", "4 S", "1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2220");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 2147483605, 0, (int) (byte) 1, (-2147483648), 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaa(0, 4)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440030-10-01", "##########", "(0, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 10)aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 10)aa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2223");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(-1, ", "Jan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(-214");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2225");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-1), (-2147483583));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2226");
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
        int int21 = gamePlace3.y();
        java.lang.String str22 = gamePlace3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2147483648) + "'", int21 == (-2147483648));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(1, -2147483648)" + "'", str22, "(1, -2147483648)");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2227");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace22.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace22.clone();
        int int27 = gamePlace11.manhattanDistance(gamePlace26);
        boolean boolean28 = gameConfiguration2.isOccupied(gamePlace11);
        int int29 = gamePlace11.x();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2228");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483596, 10, 4, 58);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2229");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(1, -214");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2230");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2231");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(52, 3, (-421), 2147483645, 477214174, 2147483606);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2232");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(414);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2233");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477214174);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2234");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483382);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2235");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-6), 54, 120, (-2147483334), 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2236");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("          ", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2237");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2 S", "0030-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2238");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((-2147483607));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(52, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (52, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2240");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-12 Saaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2241");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2147483619-02-28");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483619 + "'", int1 == 2147483619);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2242");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2243");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(373, byteArray7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2244");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(59, (-2147483642), 9, 2147483596, 2147483645, 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2245");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-12), 59, 30, 9, (int) (short) 10, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2246");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("9 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2247");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
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
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2248");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2250");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483645, (-104), (-2147483648), (int) (short) 10, 373, 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2251");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 0, (-2147483613));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2252");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Mar", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mar" + "'", str3, "Mar");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2253");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("##################################################################################################Ga");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "                                                                                                 Oct", "GamePlayer{name='aaaaaaaaaa', score=-1}", "2147483596-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2255");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(58, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2256");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, ", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -1)", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0028-01-01", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(-1, " + "'", str17, "(-1, ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, " + "'", str18, "(1, ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0028-01-01" + "'", str19, "0028-01-01");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='                                                                                                    ', score=0}", "0365-09-30", "                                                                                          aaaaaaaaaa", "Anonymous Player");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2258");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 1)", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 1)" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 1)");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2259");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", "aaaaaaaaaa                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2260");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483645, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2261");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) '4', (int) (short) -1);
        int int4 = gamePlace3.y();
        gamePlace3.y((int) (short) 0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.x();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2262");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 31, 414);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2263");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(366);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2264");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, -1)", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2265");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(invalid)', score=373}", (short) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=373}" + "'", str3, "GamePlayer{name='(invalid)', score=373}");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2266");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Ja");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2267");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Jan", "(-1, 100)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2268");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, (int) (byte) 1, 366);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2269");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2270");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, (-2147483335), (-1), 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("28th", "(100, -1)", "1 S", "GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(1, -2147483648)");
        java.lang.String str6 = gamePlayer5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2273");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=132}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2274");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray5, (-2147483334));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483334 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2275");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray7, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray7, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-6), byteArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[-1, 0]");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2276");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, (int) (byte) 1, (-2147483613), (int) (short) -1, 28, (-421));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2277");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0030-10-01", "GamePlayer{name='(invalid)', score=35}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2278");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 S" + "'", str1, "0 S");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2279");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0 S", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ga                                                                                                  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0100-10-01" + "'", str16, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ja" + "'", str17, "Ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 " + "'", str18, "0 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ga" + "'", str19, "Ga");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2280");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) 'a', (int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(0, (int) (byte) 1);
        gamePlace11.y(59);
        gamePlace11.x(2147483639);
        gamePlace11.y(10);
        int int18 = gamePlace11.y();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2281");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 S" + "'", str1, "3 S");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2282");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483619, (int) (short) 1, 373, 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace15.x((int) (short) 0);
        java.lang.String str26 = gamePlace15.toString();
        int int27 = gamePlace3.manhattanDistance(gamePlace15);
        gamePlace15.y(2147483647);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, -2147483648)" + "'", str26, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='####################################################################################################', score=0}", "                                                                                          a#########", "(100, 366)", "      1st ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2285");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(58, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("###################################################################################-2147483583-10-01", "#", "4 S", "3rd");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2287");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaa(0, 4)", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(1, 1)", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0100-10-01" + "'", str16, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ja" + "'", str17, "Ja");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a" + "'", str18, "a");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a" + "'", str19, "a");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2288");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2147483602, (int) 'a', (int) (short) 100, (-2147483648), 30, 52);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2289");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(2147483596);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2290");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) '4', byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2291");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(6, 2147483645, 0, 2147483644, 6, 414);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2292");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(invalid)', score=1}", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(invalid)', score=1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "GamePlayer{name='(invalid)', score=1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2293");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483607), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2294");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='', score=365}", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=365}" + "'", str3, "GamePlayer{name='', score=365}");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2295");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214174, (-2147483549));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2296");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2297");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(35, 52)", "GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2298");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483647), (-2147483647));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2299");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483602, 0, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2300");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483613 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject0.new GamePlace(366, 30);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject0.new GamePlayer();
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st ", "GamePlayer{name='aaaaaaaaaa', score=-1}", "1st Sep 365", "(1, -2147483648)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2303");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) 'a', 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2304");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2305");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) -1, (int) (short) 1, 477214174, 2147483596, 0, 214);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2306");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(9, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2307");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2147483619-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483619 + "'", int1 == 2147483619);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2308");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray17 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray18 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray19 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray18);
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 100, (-104));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2310");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, 52, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2311");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(214, (-2147483345), 3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2312");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Anonymous Player", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Anonymous Player" + "'", str3, "Anonymous Player");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2313");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483382);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2314");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0 ", "(1, 1)", "                                                                                                    ", "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2316");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2317");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 100, 2147483596, (-2147483648));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2318");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2319");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10th");
        java.lang.String str3 = gamePlayer2.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10th', score=0}" + "'", str3, "GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer4);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2320");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        gamePlace3.y((-2147483648));
        gamePlace3.x((-2147483642));
        gamePlace3.y(2147483647);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2321");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2322");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32 S" + "'", str1, "32 S");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2323");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(3, 52, 0, 2147483602, 59, (-2147483613));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2324");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(2147483644);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2325");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 365, 2147483639, (-2147483549), 0, 2147483645);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2326");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(10, ", "-2147483549 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2327");
        char[] charArray9 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, 100)", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("35 S", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-10-01", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(1, " + "'", str10, "(1, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(-1, " + "'", str11, "(-1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 " + "'", str12, "35 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0052-10-01" + "'", str13, "0052-10-01");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2328");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2329");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
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
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2330");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(invalid)', score=132}", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2331");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483549, 10, 365, 2147483382, (-2147483613), 2147483382);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2332");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0035-10-31", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-10-31" + "'", str3, "0035-10-31");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2333");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483334));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2334");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, (-2147483335));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2335");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 1)", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 1)" + "'", str3, "(1, 1)");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2336");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("10th");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        gamePlayer3.resetScore();
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2337");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='                                                                                                    ', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2338");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30th", "10th Jan 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2339");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2147483645);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2340");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='(invalid)', score=100}", "-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2341");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483613), (int) '4', 6, (-6), 2147483602, (-104));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2342");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2343");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-1 ", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1                                                                                                  " + "'", str3, "-1                                                                                                  ");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2344");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) -1, 2147483645, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2345");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "-2147483334 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='GamePlayer{name='(0, -2147483648)', score=0}', score=0}", "GamePlayer{name='(invalid)', score=-2147483642}", "Sep", "(0, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2347");
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
        gamePlayer23.setScore(32);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = gamePlayer23.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gamePlayer27);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2348");
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
        java.lang.String str26 = gamePlace16.toString();
        java.lang.String str27 = gamePlace16.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, 1)" + "'", str26, "(0, 1)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0, 1)" + "'", str27, "(0, 1)");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2349");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(477214174);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2350");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        int int9 = gamePlace8.x();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2351");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483549, 2147483606);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2352");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(58, byteArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(214, byteArray8, 414);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 414 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 100, 10, 10, -1, 1]");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2353");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2354");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0052-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2355");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(366, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2356");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("9 ", "GamePlayer{name='10th', score=2147483619}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2357");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(2147483605, (int) '4', 10, 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2358");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(2147483644);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2359");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("       0 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2360");
        char[] charArray8 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(52, -1)44", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(1, " + "'", str9, "(1, ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(52, " + "'", str10, "(52, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2361");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray6, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray6, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, (-2147483549));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483549 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0]");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2362");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                          a#########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2363");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2364");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((-2147483335));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2365");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483335), (-1), (int) (short) 1, (-2147483607), 0, 2147483619);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2366");
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
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray15 = gameConfiguration2.getInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList16 = gameConfiguration2.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray15);
        org.junit.Assert.assertNotNull(gamePlaceList16);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2367");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(477214174);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2368");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 2147483647, 10, (int) ' ', 2147483605, (-2147483642));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2369");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-12 S");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10th', score=0}", "                                                                                          10th Oct 1", "", "(366, 3)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2371");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(366, 52)", "                                                                                          a#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2372");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483334), (int) (short) 10, 31, (-2147483642), 30, (-2147483335));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2373");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 3, 31, (-2147483642));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2374");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 28, 2147483639, 120);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2375");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("28th");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 28th");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2377");
        char[] charArray12 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("####################################################################################################", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Sep 365", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-2147483583, 52)", charArray12);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(1, " + "'", str13, "(1, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1st " + "'", str17, "1st ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(-214" + "'", str18, "(-214");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2378");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(59, (int) (byte) -1, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2379");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(6, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2380");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(214);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2381");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject7.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject7.new GamePlace((int) 'a', (int) (short) 1);
        boolean boolean16 = gamePlace3.equals((java.lang.Object) (short) 1);
        java.lang.String str17 = gamePlace3.toString();
        java.lang.String str18 = gamePlace3.toString();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(1, -2147483648)" + "'", str17, "(1, -2147483648)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2382");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
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
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2383");
        char[] charArray9 = new char[] { '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483583-10-01", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("###################################################################################-2147483583-10-01", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 S" + "'", str11, "-1 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2384");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        int int7 = gamePlace3.x();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = subject8.new GameConfiguration(9);
        java.lang.String str11 = gameConfiguration10.toString();
        boolean boolean12 = gameConfiguration10.isBoardFull();
        boolean boolean13 = gameConfiguration10.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration10.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray15 = gameConfiguration10.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList16 = gameConfiguration10.getEmptyPlaces();
        boolean boolean17 = gamePlace3.equals((java.lang.Object) gamePlaceList16);
        java.lang.String str18 = gamePlace3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str11, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gameConfiguration14);
        org.junit.Assert.assertNotNull(gamePlayerArray15);
        org.junit.Assert.assertNotNull(gamePlaceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2385");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-2147483613), (-2147483647));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2386");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("                                                                                          aaaaaaaaaa", "(52, -1)44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2387");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2388");
        char[] charArray10 = new char[] { '4', '4', '#', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, -2147483648)", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(invalid)', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Anonymous Pla", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44# a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, #,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, " + "'", str11, "(1, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Anonymous " + "'", str13, "Anonymous ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, " + "'", str14, "(0, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-214" + "'", str15, "-214");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2389");
        char[] charArray6 = new char[] { '4', 'a', '#' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=1}", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Ga" + "'", str7, "Ga");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 S" + "'", str8, "-1 S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ga" + "'", str9, "Ga");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, ", "9 ", "0100-10-01", "10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2391");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace22.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace22.clone();
        int int27 = gamePlace11.manhattanDistance(gamePlace26);
        boolean boolean28 = gameConfiguration2.isOccupied(gamePlace11);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList29 = gameConfiguration2.getEmptyPlaces();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList30 = gameConfiguration2.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(gamePlaceList29);
        org.junit.Assert.assertNotNull(gamePlaceList30);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2392");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(invalid)', score=1}aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                          a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2393");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) (byte) 100, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2394");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0002-01-01" + "'", str2, "0002-01-01");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2395");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(414, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2396");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-12), 414, 1, (-2147483345), 35, 2147483596);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2397");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(58, byteArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 100, 10, 10, -1, 1]");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2398");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 ", "(-1, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2399");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2147483645-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483645 + "'", int1 == 2147483645);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2400");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        gameConfiguration2.clearInitialBoard();
        java.lang.String str6 = gameConfiguration2.toString();
        boolean boolean7 = gameConfiguration2.isBoardSymmetric();
        gameConfiguration2.clearInitialBoard();
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str6, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2401");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject7.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject7.new GamePlace((int) 'a', (int) (short) 1);
        boolean boolean16 = gamePlace3.equals((java.lang.Object) (short) 1);
        gamePlace3.x(366);
        gamePlace3.y(2147483639);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace3.clone();
        org.junit.Assert.assertNotNull(gamePlace6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2402");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) -1, 2147483552, 2147483644, 35, 30, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2403");
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
        java.lang.String str17 = gamePlace14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, -2147483648)" + "'", str17, "(0, -2147483648)");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2404");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaa                                                                                          ", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa                                                                                          " + "'", str3, "aaaaaaaaaa                                                                                          ");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2405");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2406");
        char[] charArray9 = new char[] { '4', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(0, -2147483648)', score=0}", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1 S", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=365}", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483583-10-01", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          -001-03-31", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 S" + "'", str11, "-1 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                          -001-03-31" + "'", str15, "                                                                                          -001-03-31");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2407");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 2147483549, 2147483606, 2147483605, 2147483619, (-2147483613));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2408");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "(10, 52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2409");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#############################################################################################(1, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2410");
        byte[] byteArray3 = new byte[] { (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(398, byteArray3, 2147483605);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483605 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100]");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2411");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0028-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2412");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', (-421), (-2147483334), 4, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2413");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = gameConfiguration2.clone();
        boolean boolean6 = gameConfiguration5.isBoardFull();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gameConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2414");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace3.clone();
        java.lang.String str19 = gamePlace3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, -2147483648)" + "'", str14, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 9)" + "'", str19, "(0, 9)");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2415");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483607), 0, (-2147483648), 4, 2147483647, 2147483549);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                    ", "GamePlayer{name='(invalid)', score=35}", "GamePlayer{name='####################################################################################################', score=0}", "9 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2417");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2418");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-2147483648-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2419");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-2147483345), 2147483596);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2420");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483613));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2421");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        boolean boolean3 = gameConfiguration2.isBoardFull();
        java.lang.String str4 = gameConfiguration2.toString();
        comp5111.assignment.cut.Subject subject5 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject5.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace8.x(1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace8.clone();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace22.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace22.clone();
        int int27 = gamePlace11.manhattanDistance(gamePlace26);
        boolean boolean28 = gameConfiguration2.isOccupied(gamePlace11);
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2422");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(10, -214");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2423");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='10th', score=0}", "9 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2424");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(365, 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2425");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(58, byteArray9, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 100, 10, 10, -1, 1]");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2426");
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
        int[] intArray28 = gameConfiguration2.countPiecesPerPlayer();
        gameConfiguration2.clearInitialBoard();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2147483648) + "'", int24 == (-2147483648));
        org.junit.Assert.assertNull(gamePlayer25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str26, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0]");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2427");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(28, 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2428");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((-104), byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2429");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("52 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2430");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(214, (-2147483607));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2431");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, ", "3rd");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2432");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2433");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
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
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2434");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 1, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0001-02-28" + "'", str2, "0001-02-28");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2435");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2436");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0035-10-31", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-10-31" + "'", str3, "0035-10-31");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2437");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0010-01-31", "(0, 4)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2438");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, (-2147483607), 0, (int) (short) -1, (-2147483647), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2439");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='2 M', score=4}", "0010-02-28444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2440");
        java.lang.String[] strArray6 = new java.lang.String[] { "aaaaaaaaaa", "hi!", "aaaaaaaaaa", "(invalid)", "10th Oct 1", "0 S" };
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray11);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray12);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
        java.lang.String[] strArray16 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray14);
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
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2441");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-104), 2147483647, 31, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2442");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2443");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(0, 4);
        gamePlace3.y((-2147483648));
        int int6 = gamePlace3.y();
        gamePlace3.x(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2147483648) + "'", int6 == (-2147483648));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2444");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483607));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2445");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, 366, 4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2446");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2, (int) ' ', 2147483382);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2447");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483602, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2147483602-10-31" + "'", str2, "2147483602-10-31");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2448");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("3 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2449");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList5 = gameConfiguration2.getEmptyPlaces();
        java.lang.String str6 = gameConfiguration2.toString();
        int int7 = gameConfiguration2.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gamePlaceList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str6, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2450");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='GamePlayer{name='(invalid)', score=100}', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2451");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace3.x(1);
        java.lang.String str6 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject7.new GamePlace((int) (byte) 10, (-2147483648));
        int int11 = gamePlace3.manhattanDistance(gamePlace10);
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace15.x(1);
        java.lang.String str18 = gamePlace15.toString();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (byte) 10, (-2147483648));
        int int23 = gamePlace15.manhattanDistance(gamePlace22);
        gamePlace15.x((int) (short) 0);
        java.lang.String str26 = gamePlace15.toString();
        int int27 = gamePlace3.manhattanDistance(gamePlace15);
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace3.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(1, -2147483648)" + "'", str18, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, -2147483648)" + "'", str26, "(0, -2147483648)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(gamePlace28);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-421 S', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-421 S', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2453");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='10th', score=2147483619}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2454");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(120, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2455");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483602, byteArray5, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 120 out of bounds for byte[2]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0]");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2456");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483326));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(10, 10)", "2147483619-01-31", "(52, -1)44");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2458");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-421 S', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2459");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(9);
        java.lang.String str3 = gameConfiguration2.toString();
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = gameConfiguration2.clone();
        boolean boolean6 = gameConfiguration5.isBoardFull();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str3, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertNotNull(gameConfiguration5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gamePlaceList7);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2460");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-104), 0, 6, 0, 58, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2461");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2147483596, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2462");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='##(52, -1)', score=32}", "Feb");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2463");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 0, 2147483552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2464");
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
        java.lang.String str20 = gamePlace16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(0, -2147483648)" + "'", str15, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0, 35)" + "'", str20, "(0, 35)");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2465");
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
        gameConfiguration2.clearInitialBoard();
        comp5111.assignment.cut.Subject subject66 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace69 = subject66.new GamePlace((int) (byte) 10, (-2147483648));
        gamePlace69.x(1);
        gamePlace69.x(100);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer74 = gameConfiguration2.getPlayerAt(gamePlace69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2466");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, -2147483648)444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "GamePlayer{name='(invalid)', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2467");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("35 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2468");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(58, -2147483648)", "0365-09-30");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2469");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(28, 52, (int) 'a', 414);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2470");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(52, (-421), 58, 54, 59, 477214174);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2471");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                          10th Oct 1");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2472");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(10, 2147483596, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2473");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483613), 3, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9 S", "aaaaaaaaaa", "(1, ", "1st Sep 365aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2475");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(0, -2147483648)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace((int) (short) 100, (-2147483642));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("2 M");
        int int11 = gamePlayer10.getScore();
        gamePlayer10.resetScore();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Jan", "-2147483334 S", "4", "##########                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2477");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10th Oct 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2478");
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
        boolean boolean18 = gameConfiguration17.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration17.getPlayers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n" + "'", str4, "GameConfiguration (size=9)\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n. . . . . . . . .\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(1, -2147483648)" + "'", str11, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2147483648) + "'", int12 == (-2147483648));
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertNotNull(gameConfiguration17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                          -001-03-31", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          -001-03-31" + "'", str3, "                                                                                          -001-03-31");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2480");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='Anonymous Player', score=-1}", "#######################################################################################-2147483648 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2481");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, (-2147483613));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2482");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-421), (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2483");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 100, 366, (-2147483583), 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2484");
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
        java.lang.Class<?> wildcardClass21 = gamePlace19.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2485");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 214, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("########Ga", "Jan", "-1 S######", "##########                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2487");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########                                                                                          ", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(52, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (52, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2489");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("##########                                                                                          ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2490");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 2147483644);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "68 Y" + "'", str1, "68 Y");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2491");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("35 S", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 S      " + "'", str3, "35 S      ");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10th', score=0}", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10th', score=0}" + "'", str3, "GamePlayer{name='10th', score=0}");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2493");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2147483645, 100, 2147483606);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2494");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) -1, (int) '4', (-2147483642), 59, 52, 477214174);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2496");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(54, 9, (-421), (-2147483583), (int) (byte) 1, 120);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2497");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-04-30" + "'", str2, "0000-04-30");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2498");
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
        gamePlace3.y(0);
        gamePlace3.x(214);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(1, -2147483648)" + "'", str19, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2499");
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
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = subject18.new GamePlace((int) (byte) 10, (-2147483648));
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace21.clone();
        int int23 = gamePlace16.manhattanDistance(gamePlace22);
        java.lang.String str24 = gamePlace22.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(1, -2147483648)" + "'", str6, "(1, -2147483648)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(gamePlace14);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, -2147483648)" + "'", str17, "(0, -2147483648)");
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(10, -2147483648)" + "'", str24, "(10, -2147483648)");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_4_Test4.test2500");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=-2147483648}");
        org.junit.Assert.assertNull(boolean1);
    }
}

