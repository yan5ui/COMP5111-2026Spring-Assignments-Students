package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4501");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        java.lang.String str6 = gamePlayer2.getName();
        java.lang.String str7 = gamePlayer2.getName();
        java.lang.String str8 = gamePlayer2.getName();
        gamePlayer2.resetScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-10-01" + "'", str6, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4502");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray12 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4503");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(365, 95, 477214189, 105, 44444403, 102);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4504");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(408, 448, (int) ' ', 200, 407, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4505");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(129, 328);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4506");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 861);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "14 M" + "'", str1, "14 M");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4507");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        gamePlayer2.resetScore();
        java.lang.String str8 = gamePlayer2.getName();
        int int9 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) (short) 100);
        gamePlayer2.addScore(102);
        java.lang.String str14 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-2147483648-10-01" + "'", str14, "-2147483648-10-01");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4508");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 100, 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4509");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray10, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray10, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 69 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 477214179)", "35 S", "36 S", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4511");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 M", "(10, 97)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4512");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444687, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4513");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Ga");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(390, 360);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("GamePlayer{name='(1, 365)', score=0}");
        java.lang.String str11 = gamePlayer10.getName();
        gamePlayer10.addScore(44444403);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='(1, 365)', score=0}" + "'", str11, "GamePlayer{name='(1, 365)', score=0}");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4514");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(69, (int) '4', 218, 28);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4515");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        boolean boolean7 = gameConfiguration5.isBoardFull();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4516");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("44444410 S", "15 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4517");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        boolean boolean10 = gameConfiguration5.isBoardFull();
        boolean boolean11 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4518");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1st", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######1st" + "'", str3, "#######1st");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4519");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("################################################################################################31st", "-1561 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4520");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(80, 88, 103, 105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4521");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483643), 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4522");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.x();
        int int9 = gamePlace7.x();
        gamePlace7.y(356);
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace7.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace7.clone();
        gamePlace7.y(102);
        java.lang.String str16 = gamePlace7.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(gamePlace12);
        org.junit.Assert.assertNotNull(gamePlace13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(97, 102)" + "'", str16, "(97, 102)");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4523");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(104, 44444315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4524");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        int int9 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList10);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4525");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(218);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4526");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaa31st", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10-014" + "'", str16, "0097-10-014");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a" + "'", str18, "a");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4527");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(356, 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4528");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0095-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4529");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4530");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration7.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration7.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration7.getInitialBoard();
        int int14 = gameConfiguration7.getSize();
        int int15 = gameConfiguration7.getSize();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4531");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-2147483648-10-01', score=97}", "(71, #####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4532");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st Jan 477214195", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Jan 477214195" + "'", str3, "1st Jan 477214195");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4533");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("44(-1, 52)", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44(-1, 52)" + "'", str3, "44(-1, 52)");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4534");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        int int9 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4535");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        int int10 = gameConfiguration5.getSize();
        int int11 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration12.clone();
        gameConfiguration12.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gameConfiguration13);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4536");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 44444329);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4537");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(44444403, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4538");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(61);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4539");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("################################################################################################31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4540");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(0, 69)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4541");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(587, (int) (short) -1, 218, 477214308);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4542");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(122, 194, 50, 45, 44445108, 364);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4543");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        boolean boolean7 = gamePlayer2.equals((java.lang.Object) "#######1st");
        java.lang.String str8 = gamePlayer2.toString();
        int int9 = gamePlayer2.getScore();
        int int10 = gamePlayer2.getScore();
        gamePlayer2.addScore(107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=0}" + "'", str8, "GamePlayer{name='-2147483648-10-01', score=0}");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4544");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = subject0.new GamePlace(0, (int) ' ');
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject0.new GamePlayer("0002-10-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject0.new GamePlayer();
        int int14 = gamePlayer13.getScore();
        java.lang.String str15 = gamePlayer13.getName();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Anonymous Player" + "'", str15, "Anonymous Player");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4545");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-1), 17, 15, 360);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4546");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("35 S", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444435 S" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444435 S");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4547");
        char[] charArray9 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("31 S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1st" + "'", str10, "1st");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31 " + "'", str12, "31 ");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4548");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, 89)", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 89)" + "'", str3, "(-1, 89)");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4549");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(97, 141)", "                                                                                                -214");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4550");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GamePlayer{name='-2147483648-10-01', score=35}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4551");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(95, 477214496);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4552");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        int int10 = gameConfiguration7.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration7.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4553");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0000-02-01", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-02-01                                                                                          " + "'", str3, "0000-02-01                                                                                          ");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4554");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0218-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 218 + "'", int1 == 218);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4555");
        char[] charArray4 = new char[] { '4', '#' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 Saaaaaa", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4, #]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52 Saaaaaa" + "'", str6, "52 Saaaaaa");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4556");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        java.lang.String str9 = gamePlayer8.getName();
        gamePlayer8.resetScore();
        gamePlayer8.setScore(44444410);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Anonymous Player" + "'", str9, "Anonymous Player");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4557");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, 477214215, 107, 200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4558");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1561), 0, 433, (int) (byte) 100, 104, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4559");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(186, 427, 109, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4560");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration7.clone();
        boolean boolean12 = gameConfiguration7.isBoardSymmetric();
        boolean boolean13 = gameConfiguration7.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ", "                                                                                                  1 ", "(77, -2147483648)", "0194-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4562");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-1, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4563");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-04-30", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-04-30" + "'", str3, "0097-04-30");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4564");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(743, 109, (int) ' ', 477214496, 120, 44444315);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4565");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-1, 89)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4566");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(84, 44444687);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4567");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4568");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration7.getInitialBoard();
        boolean boolean11 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        boolean boolean13 = gameConfiguration7.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4569");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483643), 30, 122);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4570");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44444403, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4571");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4572");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, 35)", "7 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4573");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0360-10-31", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4574");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(477214215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4575");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("##########################################################################################0032-01-01", "(74, 151)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4576");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483643 S", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       -2147483643 S" + "'", str3, "                                                                                       -2147483643 S");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4577");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 36, 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4578");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(35, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4579");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(103, 167, 390);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4580");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 62, (int) '4', 74, 356, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4581");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-1561 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4582");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214221, 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4583");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 328, 2147483562, 364);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4584");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration8.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration8.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4585");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(62, 89);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("12 M");
        java.lang.String str9 = gamePlayer8.getName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12 M" + "'", str9, "12 M");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4586");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0097-04");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4587");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(186);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4588");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration12);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4589");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, 10)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(62, 1)', score=0}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-04-01", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, " + "'", str12, "(97, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-214" + "'", str14, "-214");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4590");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(129, (int) (byte) 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Jan 129" + "'", str3, "1st Jan 129");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4591");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        java.lang.String str17 = gamePlayer16.getName();
        gamePlayer16.setScore(366);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace23.x((int) 'a');
        int int26 = gamePlace23.y();
        boolean boolean28 = gamePlace23.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace23.clone();
        boolean boolean30 = gamePlayer16.equals((java.lang.Object) gamePlace29);
        gamePlace29.y(200);
        boolean boolean33 = gameConfiguration5.isOccupied(gamePlace29);
        comp5111.assignment.cut.Subject subject34 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer36 = subject34.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = subject34.new GamePlace(62, 1);
        java.lang.String str40 = gamePlace39.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace41 = gamePlace39.clone();
        comp5111.assignment.cut.Subject subject42 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace45 = subject42.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace45.x((int) 'a');
        int int48 = gamePlace45.y();
        int int49 = gamePlace45.x();
        gamePlace45.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace52 = gamePlace45.clone();
        int int53 = gamePlace45.x();
        gamePlace45.x(0);
        int int56 = gamePlace41.manhattanDistance(gamePlace45);
        comp5111.assignment.cut.Subject.GamePlace gamePlace57 = gamePlace41.clone();
        java.lang.String str58 = gamePlace41.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace59 = gamePlace41.clone();
        gamePlace59.y(366);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer62 = gameConfiguration5.getPlayerAt(gamePlace59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-2147483648-10-01" + "'", str17, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "(62, 1)" + "'", str40, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(gamePlace52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 71 + "'", int56 == 71);
        org.junit.Assert.assertNotNull(gamePlace57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(62, 1)" + "'", str58, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace59);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4592");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(89, 25)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4593");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=142}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4594");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(15, 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4595");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(186, 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4596");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4597");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(54, (-1561));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4598");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        java.lang.String str8 = gamePlayer7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4600");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444045, byteArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4601");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        gamePlace3.y(2);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace13.x((int) 'a');
        gamePlace13.x((int) (byte) 10);
        int int18 = gamePlace13.y();
        int int19 = gamePlace13.x();
        boolean boolean20 = gamePlace3.isAdjacent(gamePlace13);
        comp5111.assignment.cut.Subject.GamePlace gamePlace21 = gamePlace13.clone();
        int int22 = gamePlace13.y();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4602");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        gameConfiguration7.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration7.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration7.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4603");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        int int11 = gamePlace3.y();
        java.lang.String str12 = gamePlace3.toString();
        gamePlace3.y(861);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 10)" + "'", str12, "(0, 10)");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4604");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(141, 36);
        gamePlace11.x(388);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4605");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 0, 363, 287);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4606");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        int int9 = gameConfiguration7.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration7.getEmptyPlaces();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration7.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4607");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        java.lang.String str17 = gamePlayer16.getName();
        gamePlayer16.setScore(366);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace23.x((int) 'a');
        int int26 = gamePlace23.y();
        boolean boolean28 = gamePlace23.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace23.clone();
        boolean boolean30 = gamePlayer16.equals((java.lang.Object) gamePlace29);
        gamePlace29.y(200);
        boolean boolean33 = gameConfiguration5.isOccupied(gamePlace29);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration34 = gameConfiguration5.clone();
        int[] intArray35 = gameConfiguration34.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-2147483648-10-01" + "'", str17, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(gameConfiguration34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 0]");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(31, 10)", "GamePlayer{name='0100-10-01', score=0}", "(35, 0)", "477214195-02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4609");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject8.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject8.new GamePlace(62, 1);
        java.lang.String str14 = gamePlace13.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace13.clone();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace19.x((int) 'a');
        int int22 = gamePlace19.y();
        int int23 = gamePlace19.x();
        gamePlace19.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace19.clone();
        int int27 = gamePlace19.x();
        gamePlace19.x(0);
        int int30 = gamePlace15.manhattanDistance(gamePlace19);
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace15.clone();
        java.lang.String str32 = gamePlace15.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = gamePlace15.clone();
        java.lang.String str34 = gamePlace33.toString();
        boolean boolean35 = gamePlace7.isAdjacent(gamePlace33);
        int int36 = gamePlace33.y();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(62, 1)" + "'", str14, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 71 + "'", int30 == 71);
        org.junit.Assert.assertNotNull(gamePlace31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(62, 1)" + "'", str32, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(62, 1)" + "'", str34, "(62, 1)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4610");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(107, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4611");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(364, 4, (int) 'a', 97, 40, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4612");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(287, 861);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4613");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0097-10-014", "0218-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44182 + "'", int2 == 44182);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4614");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(71, 366)a");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4615");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0388-01-31", "#######Oct");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4616");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 287);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5 M" + "'", str1, "5 M");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4617");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(107, 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4618");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        boolean boolean12 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4619");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(31, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4620");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(12, 77, 356, 98, 35, 477214195);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4621");
        char[] charArray11 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, ", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0000-02-01", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(35, 366)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0052-01-01" + "'", str13, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1, " + "'", str14, "(1, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0000-02-01" + "'", str15, "0000-02-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(35, " + "'", str17, "(35, ");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4622");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(287);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4623");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(32, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4624");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        boolean boolean12 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration5.getInitialBoard();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer18 = subject16.new GamePlayer("-2147483648-10-01");
        java.lang.String str19 = gamePlayer18.getName();
        gamePlayer18.setScore((int) (short) -1);
        gamePlayer18.resetScore();
        char[] charArray35 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str36 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray35);
        java.lang.String str37 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray35);
        java.lang.String str38 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray35);
        java.lang.String str39 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray35);
        java.lang.String str40 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray35);
        java.lang.String str41 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31", charArray35);
        boolean boolean42 = gamePlayer18.equals((java.lang.Object) str41);
        gamePlayer18.addScore(0);
        char[] charArray53 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str54 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray53);
        java.lang.String str55 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray53);
        boolean boolean56 = gamePlayer18.equals((java.lang.Object) str55);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList57 = gameConfiguration5.getPlacesOfPlayer(gamePlayer18);
        gamePlayer18.resetScore();
        int int59 = gamePlayer18.getScore();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-2147483648-10-01" + "'", str19, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "1st" + "'", str36, "1st");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(inva" + "'", str37, "(inva");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(62, " + "'", str38, "(62, ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " " + "'", str39, " ");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4" + "'", str40, "4");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "0001-01-31" + "'", str41, "0001-01-31");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1st" + "'", str54, "1st");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(inva" + "'", str55, "(inva");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(gamePlaceList57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4625");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4626");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(71, 44444500, (int) (short) 0, 407);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4627");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        int int8 = gameConfiguration5.getSize();
        int int9 = gameConfiguration5.getSize();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4628");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(408, 86, 861, (int) (short) -1, 372, 101);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4629");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='aaaaaaaaaa', score=0}", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaa', score=0}" + "'", str3, "GamePlayer{name='aaaaaaaaaa', score=0}");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4630");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(35, 25)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4631");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0010-01-31" + "'", str2, "0010-01-31");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4632");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(408);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4633");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        gameConfiguration10.clearInitialBoard();
        gameConfiguration10.clearInitialBoard();
        int[] intArray13 = gameConfiguration10.countPiecesPerPlayer();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration10.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlaceList14);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4634");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0002-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4635");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(50, (int) (short) -1, 32, 40, 30, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4636");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore((int) (short) -1);
        gamePlayer2.resetScore();
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray19);
        java.lang.String str24 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray19);
        java.lang.String str25 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31", charArray19);
        boolean boolean26 = gamePlayer2.equals((java.lang.Object) str25);
        gamePlayer2.addScore(0);
        gamePlayer2.addScore(477214246);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(62, " + "'", str22, "(62, ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " " + "'", str23, " ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4" + "'", str24, "4");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0001-01-31" + "'", str25, "0001-01-31");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4637");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1), 861, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4638");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=120}", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=120}" + "'", str3, "GamePlayer{name='', score=120}");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4639");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (int) (short) -1, 62, (-2147483648), (-1), 477214189);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4640");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        boolean boolean11 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration7.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4641");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 44444403)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4642");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0328-10-01", "0002-02-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=100}44444444444444444444444444444444444444444444444444444", "(97, 97)", "31 S", "(45, 477214179)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4644");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4645");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration10.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray12 = gameConfiguration11.getPlayers();
        gameConfiguration11.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration11.clone();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertNotNull(gameConfiguration14);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4646");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration10.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4647");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4648");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='31st', score=0}", "10 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4649");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(31, ", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(31, " + "'", str3, "(31, ");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4650");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(62, 98, 44444045, 356, 477214195, 372);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4651");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(10, 97)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4652");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(364, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4653");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = gamePlace3.equals(obj11);
        gamePlace3.y(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4654");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 365 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 1]");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4655");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        int int8 = gameConfiguration5.getSize();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean12 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gameConfiguration13);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4656");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, 52)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################(-1, 52)" + "'", str3, "############################################################################################(-1, 52)");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4657");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(433, 477214496);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4658");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477213945);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4659");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444410, 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4660");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(88, 4, 218, 477214215, 1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4661");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(372);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4662");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        boolean boolean10 = gameConfiguration5.isBoardFull();
        boolean boolean11 = gameConfiguration5.isBoardFull();
        int int12 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4663");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore(366);
        gamePlayer2.addScore((int) (byte) 0);
        java.lang.String str8 = gamePlayer2.toString();
        java.lang.String str9 = gamePlayer2.getName();
        int int10 = gamePlayer2.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=366}" + "'", str8, "GamePlayer{name='-2147483648-10-01', score=366}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-2147483648-10-01" + "'", str9, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 366 + "'", int10 == 366);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4664");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        gameConfiguration6.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration6.clone();
        boolean boolean9 = gameConfiguration6.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4665");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray19);
        java.lang.Class<?> wildcardClass24 = charArray19.getClass();
        boolean boolean25 = gamePlace8.equals((java.lang.Object) wildcardClass24);
        gamePlace8.y((int) 'a');
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace8.clone();
        int int29 = gamePlace28.y();
        java.lang.String str30 = gamePlace28.toString();
        gamePlace28.x(44);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0100-10-01" + "'", str23, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(0, 97)" + "'", str30, "(0, 97)");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4666");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0089-01-01", "10th Feb 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4667");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("4th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4668");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(69);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4669");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject8.new GamePlayer("-2147483648-10-01");
        int int11 = gamePlayer10.getScore();
        int int12 = gamePlayer10.getScore();
        java.lang.String str13 = gamePlayer10.getName();
        int int14 = gamePlayer10.getScore();
        gamePlayer10.addScore(31);
        gamePlayer10.addScore((int) (byte) 100);
        boolean boolean19 = gamePlace3.equals((java.lang.Object) gamePlayer10);
        gamePlayer10.setScore(97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-2147483648-10-01" + "'", str13, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4670");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(80, 2147483562, 477214221, 0, 477214179, 44444500);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4671");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        gameConfiguration7.clearInitialBoard();
        boolean boolean9 = gameConfiguration7.isBoardSymmetric();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4672");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444045, byteArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 25 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4673");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4674");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444480, (-2147483648), 194);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4675");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = gamePlace3.equals(obj11);
        int int13 = gamePlace3.x();
        gamePlace3.y(363);
        gamePlace3.y(103);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4676");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st Feb 0", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Feb 0###########################################################################################" + "'", str3, "1st Feb 0###########################################################################################");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4677");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(12, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477214189, byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4678");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(105, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4679");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("32 S", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 S######" + "'", str3, "32 S######");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4680");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = gamePlace3.equals(obj11);
        int int13 = gamePlace3.x();
        gamePlace3.y(363);
        int int16 = gamePlace3.x();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4681");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, 0, (-2147483648), 54, 105, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4682");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = gamePlace3.equals(obj11);
        gamePlace3.x(407);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace3.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4683");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        gamePlayer2.setScore(89);
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject11.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject11.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject11.new GameConfiguration(25);
        int int17 = gameConfiguration16.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList18 = gameConfiguration16.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration16.getPlayers();
        boolean boolean20 = gameConfiguration16.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration21 = gameConfiguration16.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray22 = gameConfiguration16.getPlayers();
        int int23 = gameConfiguration16.getSize();
        boolean boolean24 = gamePlayer2.equals((java.lang.Object) gameConfiguration16);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration25 = gameConfiguration16.clone();
        gameConfiguration16.clearInitialBoard();
        boolean boolean27 = gameConfiguration16.isBoardFull();
        int[] intArray28 = gameConfiguration16.countPiecesPerPlayer();
        boolean boolean29 = gameConfiguration16.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gameConfiguration21);
        org.junit.Assert.assertNotNull(gamePlayerArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 25 + "'", int23 == 25);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gameConfiguration25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4684");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(120, 433);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(-2147483648, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (-2147483648, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4686");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=131}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4687");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(88, 45, 407, 69);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4688");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("68 ", "44(-1, 52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4689");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(427);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4690");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4691");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Apr" + "'", str1, "Apr");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4692");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        int[] intArray12 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration13.getEmptyPlaces();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gamePlaceList14);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4693");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(35, 861);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4694");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(102, 0, 477214195, 427);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4695");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(365, 167, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4696");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        gamePlayer2.addScore((int) 'a');
        int int5 = gamePlayer2.getScore();
        java.lang.String str6 = gamePlayer2.toString();
        gamePlayer2.addScore(50);
        java.lang.Object obj9 = null;
        boolean boolean10 = gamePlayer2.equals(obj9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='#######1st', score=97}" + "'", str6, "GamePlayer{name='#######1st', score=97}");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4697");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getPlacesOfPlayer(gamePlayer9);
        int int11 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject12.new GamePlayer("#######1st");
        gamePlayer14.addScore((int) 'a');
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList17 = gameConfiguration5.getPlacesOfPlayer(gamePlayer14);
        boolean boolean18 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4698");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        int int5 = gamePlayer2.getScore();
        java.lang.Object obj6 = null;
        boolean boolean7 = gamePlayer2.equals(obj6);
        gamePlayer2.setScore(89);
        int int10 = gamePlayer2.getScore();
        gamePlayer2.setScore(1);
        int int13 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4699");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444329, 372, 218);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4700");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214246, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4701");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4702");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        gameConfiguration6.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration6.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gameConfiguration8.getPlayerAt(gamePlace9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlace.x()\" because \"place\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gameConfiguration8);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4703");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(45, 477214179)                                                                                     ", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(45, 477214179)                                                                                     " + "'", str3, "(45, 477214179)                                                                                     ");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4704");
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray11, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483562, byteArray11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4705");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        boolean boolean11 = gameConfiguration7.isBoardFull();
        int[] intArray12 = gameConfiguration7.countPiecesPerPlayer();
        int[] intArray13 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 Y", "(0, 25)###", "0052-04-01", "#######Oct");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4707");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, 44182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4708");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("45 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4709");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        int int8 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace13.x((int) 'a');
        int int16 = gamePlace13.y();
        int int17 = gamePlace13.x();
        gamePlace13.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace13.clone();
        java.lang.Object obj21 = null;
        boolean boolean22 = gamePlace13.equals(obj21);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = gameConfiguration5.getPlayerAt(gamePlace13);
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace13.clone();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(gamePlayer23);
        org.junit.Assert.assertNotNull(gamePlace24);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4710");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4711");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("477218588-10-31", "0001-01-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4712");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(97, 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (97, 97)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4713");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(407, 35, 287, 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4714");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (short) 1, 62);
        gamePlace5.y((int) (short) 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject10.new GamePlayer("-2147483648-10-01");
        java.lang.String str13 = gamePlayer12.getName();
        gamePlayer12.setScore(366);
        comp5111.assignment.cut.Subject subject16 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject16.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace19.x((int) 'a');
        int int22 = gamePlace19.y();
        boolean boolean24 = gamePlace19.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace19.clone();
        boolean boolean26 = gamePlayer12.equals((java.lang.Object) gamePlace25);
        gamePlace25.y(200);
        int int29 = gamePlace9.manhattanDistance(gamePlace25);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-2147483648-10-01" + "'", str13, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 196 + "'", int29 == 196);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(71, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (71, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4716");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        int int5 = gamePlayer2.getScore();
        java.lang.Object obj6 = null;
        boolean boolean7 = gamePlayer2.equals(obj6);
        gamePlayer2.setScore(89);
        gamePlayer2.addScore(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4717");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray19);
        java.lang.Class<?> wildcardClass24 = charArray19.getClass();
        boolean boolean25 = gamePlace8.equals((java.lang.Object) wildcardClass24);
        gamePlace8.y((int) 'a');
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace8.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace28.clone();
        java.lang.String str30 = gamePlace28.toString();
        java.lang.String str31 = gamePlace28.toString();
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0100-10-01" + "'", str23, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace28);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(0, 97)" + "'", str30, "(0, 97)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(0, 97)" + "'", str31, "(0, 97)");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4718");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        java.lang.String str9 = gamePlayer8.getName();
        gamePlayer8.setScore(61);
        java.lang.String str12 = gamePlayer8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2 M" + "'", str9, "2 M");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='2 M', score=61}" + "'", str12, "GamePlayer{name='2 M', score=61}");
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4719");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(52, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4720");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(inva', score=0}", "(71, 477214179)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4721");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 97)", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 97)" + "'", str3, "(0, 97)");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4722");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483562, byteArray5, 287);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 287 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4723");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0071-01-31", "GamePlayer{name='-2147483648-10-01', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4724");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 587);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4725");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "0010-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4726");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "50 S" + "'", str1, "50 S");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4727");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                    ", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("477214179-10-31", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31##########################################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0100-10-01" + "'", str10, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                          0100-01-01" + "'", str11, "                                                                                          0100-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "477214179-10-31" + "'", str13, "477214179-10-31");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0001-01-31##########################################################################################" + "'", str14, "0001-01-31##########################################################################################");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4728");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=131}                                                     ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4729");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 88, 0, 31, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4730");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4731");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10th Oct 44444403", "32 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4732");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444410, 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4733");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(31, (int) (short) -1, 99, 99, 109, 44444763);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4(97, ", "aaaaaaaaaa", "(4", "(31, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4735");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(218, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4736");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444329, 408, 328, 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4737");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214179, 89, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4738");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(36, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4739");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='aaaaaaaaaa', score=0}", "############################################################################################(-1, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4740");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(184, 184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4741");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        java.lang.String str7 = gamePlace5.toString();
        gamePlace5.y((int) (short) 1);
        int int10 = gamePlace5.y();
        int int11 = gamePlace5.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace5.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(62, 1)" + "'", str7, "(62, 1)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(gamePlace12);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4742");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(167, 69, 477214246);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4743");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(77, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4744");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(122, 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4745");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("15 Y", "(31, 1)", "(-1, 0)", "(62, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4746");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444763, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4747");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4748");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(10, 97)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4749");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        int int10 = gameConfiguration5.getSize();
        int int11 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration5.clone();
        boolean boolean13 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList15 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertNotNull(gamePlaceList15);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4750");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(88, 44444410, 1, 194);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4751");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        boolean boolean10 = gameConfiguration9.isBoardSymmetric();
        boolean boolean11 = gameConfiguration9.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4752");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(34, byteArray8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4753");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(107, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4754");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477214195, byteArray8, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 61 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4755");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214189, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4756");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 184, 100, 408);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4757");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444329, 587, 477214246);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4758");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=-2147483648}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4759");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4760");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444403, 99, 0, (int) (short) 0, 218, 477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4761");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4762");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483648), 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4763");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(196);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4764");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(218, byteArray7, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4765");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4766");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0000-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4767");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration10.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration11.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration12.clone();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gameConfiguration13);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4768");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#######################################################GamePlayer{name='Anonymous Player', score=36}", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4769");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        gameConfiguration10.clearInitialBoard();
        int[] intArray12 = gameConfiguration10.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4770");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (short) 1, 62);
        gamePlace5.y((int) (short) 100);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject9.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject9.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject9.new GamePlace(0, 0);
        gamePlace17.y(0);
        int int20 = gamePlace17.y();
        boolean boolean21 = gamePlace5.isAdjacent(gamePlace17);
        int int22 = gamePlace17.x();
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4771");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, 200, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4772");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4773");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4774");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        int[] intArray11 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration12.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlaceList13);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4775");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, 365)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=0}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-10-31", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0052-10-31" + "'", str14, "0052-10-31");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4776");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444763, 28, 2147483562, 87, 390, (-2147483643));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4777");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, 2, 287, 448, 388, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4778");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4779");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "(97, 102)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4780");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration7.getInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration7.getEmptyPlaces();
        boolean boolean13 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration7.getInitialBoard();
        boolean boolean15 = gameConfiguration7.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4781");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='(35, 10)', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4782");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(1, 365)44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4783");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(86, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4784");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(448);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4785");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(388, 356, 17, 364);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4786");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444687, 2147483562, (int) '#', 587);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4787");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(200, 390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4788");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getPlacesOfPlayer(gamePlayer9);
        int int11 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject12.new GamePlayer("#######1st");
        gamePlayer14.addScore((int) 'a');
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList17 = gameConfiguration5.getPlacesOfPlayer(gamePlayer14);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer18 = gamePlayer14.clone();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList17);
        org.junit.Assert.assertNotNull(gamePlayer18);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4789");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) -1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(427, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1, 1, 100, 0, -1]");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4790");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(408, 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4791");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("############################################################################################(-1, 52)", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################(-1, 52)" + "'", str3, "############################################################################################(-1, 52)");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4792");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='2 ', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4793");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        boolean boolean7 = gameConfiguration5.isBoardSymmetric();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        int[] intArray9 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                  1 ", "4th Oct 44444403", "4th Oct 44444403", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4795");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44444500, 122, 200, (int) (byte) 100, (int) (short) -1, 84);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4796");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, 365)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 97)   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(0, " + "'", str14, "(0, ");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4797");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4(97, ", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4(97, " + "'", str3, "4(97, ");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4798");
        char[] charArray11 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, ", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=36}", charArray11);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-10-31", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0052-01-01" + "'", str13, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(1, " + "'", str14, "(1, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0052-10-31" + "'", str17, "0052-10-31");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4799");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4444444hi!", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4800");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(45, 477214179)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4801");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray19);
        java.lang.Class<?> wildcardClass24 = charArray19.getClass();
        boolean boolean25 = gamePlace8.equals((java.lang.Object) wildcardClass24);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace8.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace26.clone();
        int int28 = gamePlace27.y();
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0100-10-01" + "'", str23, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4802");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='', score=0}", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4803");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2nd", "10th Oct 44444403");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4804");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "(71, 356)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4805");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0388-01-31", "0097-04-30");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4806");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(364, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4807");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(1, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4808");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        java.lang.String str7 = gamePlayer2.getName();
        gamePlayer2.addScore(44444045);
        gamePlayer2.addScore((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4809");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(0, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4810");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(99, 408, 360, 40);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4811");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4812");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray13);
        org.junit.Assert.assertNotNull(gameConfiguration14);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4813");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(20, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4814");
        char[] charArray9 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, ", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(97, 141)', score=0}", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0052-01-01" + "'", str11, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4815");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(151, 95, 44445108, (int) 'a', 0, 328);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4816");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(103, 1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4817");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(44444687);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4818");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(743, 15);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4819");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) 'a', 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4820");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(408, 17, (-1), 477214179, (int) 'a', 77);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4821");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(0, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4822");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(390, 587);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4823");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4824");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        int int14 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        int int16 = gameConfiguration5.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 25 + "'", int16 == 25);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4825");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject10.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject10.new GamePlace(62, 1);
        java.lang.String str16 = gamePlace15.toString();
        gamePlace15.y((int) '4');
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = gamePlace15.clone();
        int int20 = gamePlace3.manhattanDistance(gamePlace15);
        int int21 = gamePlace3.y();
        java.lang.Object obj22 = null;
        boolean boolean23 = gamePlace3.equals(obj22);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(62, 1)" + "'", str16, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4826");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        int int11 = gameConfiguration7.getSize();
        boolean boolean12 = gameConfiguration7.isBoardSymmetric();
        int[] intArray13 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4827");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(427, 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4828");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444687, 196, 69, 107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4829");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0004-04-01", "50 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4830");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 44182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4831");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 52)", "14 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4832");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        gamePlayer2.setScore(89);
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject11.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject11.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject11.new GameConfiguration(25);
        int int17 = gameConfiguration16.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList18 = gameConfiguration16.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration16.getPlayers();
        boolean boolean20 = gameConfiguration16.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration21 = gameConfiguration16.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray22 = gameConfiguration16.getPlayers();
        int int23 = gameConfiguration16.getSize();
        boolean boolean24 = gamePlayer2.equals((java.lang.Object) gameConfiguration16);
        boolean boolean25 = gameConfiguration16.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList26 = gameConfiguration16.getEmptyPlaces();
        boolean boolean27 = gameConfiguration16.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gameConfiguration21);
        org.junit.Assert.assertNotNull(gamePlayerArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 25 + "'", int23 == 25);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(gamePlaceList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0071-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4834");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(4, 1)", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 1)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "(4, 1)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4835");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4836");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(inva", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(inva" + "'", str3, "(inva");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}", "4(97, 141)", "477214179-10-31", "(35, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4838");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        boolean boolean10 = gameConfiguration9.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration9.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration9.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4839");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 477218588);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "15 Y" + "'", str1, "15 Y");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4840");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore((int) (short) -1);
        gamePlayer2.resetScore();
        int int7 = gamePlayer2.getScore();
        gamePlayer2.setScore(44445108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4841");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("3 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4842");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        int int5 = gamePlayer2.getScore();
        java.lang.Object obj6 = null;
        boolean boolean7 = gamePlayer2.equals(obj6);
        gamePlayer2.resetScore();
        gamePlayer2.addScore(25);
        java.lang.Class<?> wildcardClass11 = gamePlayer2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, -1)", "                                                                                                  1 ", "31st", "4(97, 141)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4844");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace11.x((int) 'a');
        int int14 = gamePlace11.y();
        int int15 = gamePlace11.x();
        gamePlace11.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace11.clone();
        int int19 = gamePlace11.x();
        gamePlace11.x(0);
        int int22 = gamePlace7.manhattanDistance(gamePlace11);
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace7.clone();
        int int24 = gamePlace7.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace7.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(gamePlace25);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4845");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        int int11 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer15 = subject13.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject13.new GamePlace(62, 1);
        java.lang.String str19 = gamePlace18.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = gamePlace18.clone();
        comp5111.assignment.cut.Subject subject21 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = subject21.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace24.x((int) 'a');
        int int27 = gamePlace24.y();
        int int28 = gamePlace24.x();
        gamePlace24.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace24.clone();
        int int32 = gamePlace24.x();
        gamePlace24.x(0);
        int int35 = gamePlace20.manhattanDistance(gamePlace24);
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = gamePlace20.clone();
        gamePlace36.y(477214496);
        boolean boolean39 = gameConfiguration5.isOccupied(gamePlace36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(62, 1)" + "'", str19, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(gamePlace31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 71 + "'", int35 == 71);
        org.junit.Assert.assertNotNull(gamePlace36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4846");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(167);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4847");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-2147483648-10-01', score=89}", "0000-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4848");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44444687);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 Y" + "'", str1, "1 Y");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4849");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444763, byteArray9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4850");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        int int7 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str10 = gamePlayer2.getName();
        java.lang.String str11 = gamePlayer2.getName();
        gamePlayer2.addScore(101);
        gamePlayer2.setScore(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-2147483648-10-01" + "'", str10, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-2147483648-10-01" + "'", str11, "-2147483648-10-01");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4851");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        boolean boolean10 = gameConfiguration5.isBoardFull();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4852");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(167, byteArray5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4853");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(25, byteArray8, 84);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 84 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4854");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray19);
        java.lang.Class<?> wildcardClass24 = charArray19.getClass();
        boolean boolean25 = gamePlace8.equals((java.lang.Object) wildcardClass24);
        gamePlace8.y((int) 'a');
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace8.clone();
        java.lang.String str29 = gamePlace8.toString();
        int int30 = gamePlace8.y();
        gamePlace8.x(448);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0100-10-01" + "'", str23, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(gamePlace28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(0, 97)" + "'", str29, "(0, 97)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4855");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4856");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10 S", "(364, 32)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4857");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(131, (-1), 218, 477214189, 12, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4858");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        gamePlayer2.setScore(89);
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject11.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject11.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject11.new GameConfiguration(25);
        int int17 = gameConfiguration16.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList18 = gameConfiguration16.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration16.getPlayers();
        boolean boolean20 = gameConfiguration16.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration21 = gameConfiguration16.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray22 = gameConfiguration16.getPlayers();
        int int23 = gameConfiguration16.getSize();
        boolean boolean24 = gamePlayer2.equals((java.lang.Object) gameConfiguration16);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration25 = gameConfiguration16.clone();
        boolean boolean26 = gameConfiguration25.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray27 = gameConfiguration25.getPlayers();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gameConfiguration21);
        org.junit.Assert.assertNotNull(gamePlayerArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 25 + "'", int23 == 25);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gameConfiguration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray27);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4859");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483562, (int) '#', 0, 88, 63, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4860");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        gamePlayer2.setScore(89);
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = subject11.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject11.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = subject11.new GameConfiguration(25);
        int int17 = gameConfiguration16.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList18 = gameConfiguration16.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration16.getPlayers();
        boolean boolean20 = gameConfiguration16.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration21 = gameConfiguration16.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray22 = gameConfiguration16.getPlayers();
        int int23 = gameConfiguration16.getSize();
        boolean boolean24 = gamePlayer2.equals((java.lang.Object) gameConfiguration16);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration25 = gameConfiguration16.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray26 = gameConfiguration16.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList27 = gameConfiguration16.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray28 = gameConfiguration16.getInitialBoard();
        int[] intArray29 = gameConfiguration16.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(gameConfiguration21);
        org.junit.Assert.assertNotNull(gamePlayerArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 25 + "'", int23 == 25);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gameConfiguration25);
        org.junit.Assert.assertNotNull(gamePlayerArray26);
        org.junit.Assert.assertNotNull(gamePlaceList27);
        org.junit.Assert.assertNotNull(gamePlayerArray28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4861");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444410, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4862");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483643));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4863");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(12, 0, 2147483562, 15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4864");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##################################################################################################2 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4865");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(97, 97)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4866");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        char[] charArray19 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray19);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray19);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray19);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray19);
        java.lang.Class<?> wildcardClass24 = charArray19.getClass();
        boolean boolean25 = gamePlace8.equals((java.lang.Object) wildcardClass24);
        int int26 = gamePlace8.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace8.clone();
        int int28 = gamePlace8.y();
        gamePlace8.x((int) ' ');
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1st" + "'", str20, "1st");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(inva" + "'", str21, "(inva");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0100-10-01" + "'", str23, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4867");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        int int5 = gamePlayer2.getScore();
        java.lang.Object obj6 = null;
        boolean boolean7 = gamePlayer2.equals(obj6);
        gamePlayer2.resetScore();
        gamePlayer2.addScore(25);
        java.lang.String str11 = gamePlayer2.getName();
        java.lang.String str12 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-2147483648-10-01" + "'", str11, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-2147483648-10-01" + "'", str12, "-2147483648-10-01");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4868");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        int int12 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject14.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject14.new GamePlace(0, 0);
        char[] charArray33 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str34 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray33);
        java.lang.String str35 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray33);
        java.lang.String str36 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray33);
        java.lang.String str37 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray33);
        java.lang.Class<?> wildcardClass38 = charArray33.getClass();
        boolean boolean39 = gamePlace22.equals((java.lang.Object) wildcardClass38);
        comp5111.assignment.cut.Subject.GamePlace gamePlace40 = gamePlace22.clone();
        int int41 = gamePlace40.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = gamePlace40.clone();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer43 = gameConfiguration5.getPlayerAt(gamePlace42);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList13);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1st" + "'", str34, "1st");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(inva" + "'", str35, "(inva");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "0100-10-01" + "'", str37, "0100-10-01");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(gamePlace40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(gamePlace42);
        org.junit.Assert.assertNull(gamePlayer43);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4869");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0044-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4870");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(31, 10)", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(31, 10)" + "'", str3, "(31, 10)");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0004-04-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4872");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.addScore(100);
        gamePlayer1.resetScore();
        java.lang.String str5 = gamePlayer1.getName();
        gamePlayer1.addScore(44444403);
        gamePlayer1.addScore(360);
        gamePlayer1.resetScore();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4873");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        int int10 = gameConfiguration9.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration9.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4874");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=0}", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=0}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=0}");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4875");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(44444500);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4876");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(101);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4877");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0109-01-01", "(4, 1)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4878");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(31, 44444763, 360, 287, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4879");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
        java.lang.Object obj5 = null;
        boolean boolean6 = gamePlayer4.equals(obj5);
        int int7 = gamePlayer4.getScore();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4880");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 0)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 0)" + "'", str3, "(0, 0)");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4881");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(88, 477214189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4882");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4883");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477213945);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4884");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(44444687);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4885");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        gameConfiguration10.clearInitialBoard();
        gameConfiguration10.clearInitialBoard();
        boolean boolean13 = gameConfiguration10.isBoardFull();
        boolean boolean14 = gameConfiguration10.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = gameConfiguration10.isOccupied(gamePlace15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlace.x()\" because \"place\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4886");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 151, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4887");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("477214179-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 477214179 + "'", int1 == 477214179);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4888");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477218588, 587);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4889");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(10, ", "                                                                                       -2147483643 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4890");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(34, 360, 107, 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4891");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(407, 2147483562);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4892");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 0, 151, 194, 372, (int) '4');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4893");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1561 S", "(52, ###############################################################################################", "15 Y", "(103, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4894");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-10-31", "52 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4895");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0001-01-31", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4896");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(62, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4897");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("14 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4898");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 52)###", "GamePlayer{name='-2147483648-10-01', score=-2147483648}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4899");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(10, 10)', score=0}", "35 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4900");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(52, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4901");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(194, 0, 360, (-2147483643), 200, 87);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4902");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(103);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4903");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='Anonymous Player', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("4th Oct 44444403");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4th Oct\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='15 Y', score=0}", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='', score=0}", "GamePlayer{name='0032-01-01', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4906");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 52, 477214246, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4907");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 365)44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(35, 366)", "                                                                                          0194-10-01", "GamePlayer{name='10th', score=35}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4909");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0001-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4910");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(407, byteArray8, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 194 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4911");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(20, byteArray2, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 120 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4912");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=1}", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=1}#######################################################" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=1}#######################################################");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4913");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(44445108);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("477218588-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4915");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(14, byteArray5, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4916");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(390, 28, (int) '4', 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4917");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=0}", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4918");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(364, 360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4919");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) -1, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4920");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########################################################################################0360-10-31", "(35, 366)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4921");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        boolean boolean12 = gameConfiguration5.isBoardFull();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        int int14 = gameConfiguration5.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 25 + "'", int14 == 25);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4922");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0001-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(100, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4923");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        gamePlayer2.setScore(89);
        gamePlayer2.setScore(0);
        gamePlayer2.setScore(44444410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4924");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        boolean boolean11 = gameConfiguration10.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration10.getInitialBoard();
        boolean boolean13 = gameConfiguration10.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = gameConfiguration10.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4925");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("##########################################################################################0032-01-01", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################0032-01-01" + "'", str3, "##########################################################################################0032-01-01");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4926");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 196, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4927");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("##########################################################################################0360-10-31", "0097-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4928");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44444315);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 Y" + "'", str1, "1 Y");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4929");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4930");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444435 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4931");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4932");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(364, 44444687, 433, (int) (byte) 1, 44444403, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4933");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4934");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        boolean boolean10 = gameConfiguration9.isBoardFull();
        gameConfiguration9.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4935");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(35, 10)', score=0}", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(35, 10)', score=0}" + "'", str3, "GamePlayer{name='(35, 10)', score=0}");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4936");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        int[] intArray11 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray12 = gameConfiguration7.getPlayers();
        int[] intArray13 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4937");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(131);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4938");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(184, byteArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(100, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (100, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4940");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(861, 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4941");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList8 = gameConfiguration7.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        boolean boolean10 = gameConfiguration7.isBoardFull();
        int int11 = gameConfiguration7.getSize();
        boolean boolean12 = gameConfiguration7.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlaceList8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4942");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44445108, 77, 194, 698, 15, 44444687);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4943");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, 10)", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(62, 1)', score=0}", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-10-014", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=-2147483648}", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(97, " + "'", str13, "(97, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0097-10-014" + "'", str15, "0097-10-014");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Ga" + "'", str16, "Ga");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4944");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(61, 86);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject0.new GamePlayer("Oct");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4945");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 186);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4946");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        java.lang.String str17 = gamePlayer16.getName();
        gamePlayer16.setScore(366);
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace23.x((int) 'a');
        int int26 = gamePlace23.y();
        boolean boolean28 = gamePlace23.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace23.clone();
        boolean boolean30 = gamePlayer16.equals((java.lang.Object) gamePlace29);
        gamePlace29.y(200);
        boolean boolean33 = gameConfiguration5.isOccupied(gamePlace29);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration34 = gameConfiguration5.clone();
        boolean boolean35 = gameConfiguration34.isBoardSymmetric();
        comp5111.assignment.cut.Subject subject36 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace39 = subject36.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace39.x((int) 'a');
        int int42 = gamePlace39.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace43 = gamePlace39.clone();
        int int44 = gamePlace43.x();
        int int45 = gamePlace43.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace46 = gamePlace43.clone();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer47 = gameConfiguration34.getPlayerAt(gamePlace46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-2147483648-10-01" + "'", str17, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(gameConfiguration34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(gamePlace43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(gamePlace46);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4947");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(122, 62, 101, 477214195, 861, 196);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4948");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 477214496, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4949");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        gamePlayer7.setScore(32);
        java.lang.String str10 = gamePlayer7.getName();
        gamePlayer7.resetScore();
        gamePlayer7.setScore(477214195);
        int int14 = gamePlayer7.getScore();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 10)" + "'", str10, "(10, 10)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 477214195 + "'", int14 == 477214195);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4950");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4951");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##########################################################################################(71, #####", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################(71, #####" + "'", str3, "##########################################################################################(71, #####");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4952");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4953");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        gameConfiguration10.clearInitialBoard();
        gameConfiguration10.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration10.clone();
        java.lang.Class<?> wildcardClass14 = gameConfiguration10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4954");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0089-10-01", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0089-10-01" + "'", str3, "0089-10-01");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, ", "(62, 477214215)", "GamePlayer{name='-2147483648-10-01', score=100}", "(95, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4956");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-04-30", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-04-30" + "'", str3, "0097-04-30");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(31, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (31, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4958");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        int[] intArray13 = gameConfiguration5.countPiecesPerPlayer();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray15 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray15);
        org.junit.Assert.assertNotNull(gameConfiguration16);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4959");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(104, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4960");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(287, 44445108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4961");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace11.x((int) 'a');
        int int14 = gamePlace11.y();
        int int15 = gamePlace11.x();
        gamePlace11.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace11.clone();
        int int19 = gamePlace11.x();
        gamePlace11.x(0);
        int int22 = gamePlace7.manhattanDistance(gamePlace11);
        java.lang.String str23 = gamePlace11.toString();
        gamePlace11.x((int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = gamePlace11.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace11.clone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0, 10)" + "'", str23, "(0, 10)");
        org.junit.Assert.assertNotNull(gamePlace26);
        org.junit.Assert.assertNotNull(gamePlace27);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4962");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(10, 2)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4963");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "28 S" + "'", str1, "28 S");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4964");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-04-01", "", "4 S", "GamePlayer{name='-2147483648-10-01', score=477214179}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4965");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(105, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4966");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, 0)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4967");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4968");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        boolean boolean12 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray15 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray16 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertNotNull(gamePlayerArray15);
        org.junit.Assert.assertNotNull(gamePlayerArray16);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4969");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(122, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4970");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(95, 477214189, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4971");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, 287, 87, 167, 43, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4972");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(71, 366)a", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(71, 366)a" + "'", str3, "(71, 366)a");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4973");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(52, ###############################################################################################", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, ###############################################################################################" + "'", str3, "(52, ###############################################################################################");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4974");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444315, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4975");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4976");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ', score=104}", "(97, 141)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4977");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44182, 44444045);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4978");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(25, 407, 32, 861);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4979");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("28 S", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28 S######" + "'", str3, "28 S######");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4980");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
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
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4981");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(186);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4982");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444315, 2147483562);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4983");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44445108, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4984");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        int int7 = gamePlace5.x();
        int int8 = gamePlace5.x();
        int int9 = gamePlace5.y();
        gamePlace5.y(360);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 62 + "'", int7 == 62);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4985");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration7.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration12.getPlacesOfPlayer(gamePlayer13);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList15 = gameConfiguration12.getEmptyPlaces();
        int[] intArray16 = gameConfiguration12.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray17 = gameConfiguration12.getInitialBoard();
        boolean boolean18 = gameConfiguration12.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlaceList14);
        org.junit.Assert.assertNotNull(gamePlaceList15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4986");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration7.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration7.clone();
        java.lang.Class<?> wildcardClass13 = gameConfiguration12.getClass();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4987");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 ", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 " + "'", str3, "10 ");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4988");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44444687);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4989");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(477213945);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10th', score=35}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10th', score=35}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4991");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444687, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4992");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=0}", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0097-10-014" + "'", str16, "0097-10-014");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Ga" + "'", str17, "Ga");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4993");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("12th", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12th######" + "'", str3, "12th######");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4994");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(328, 44444329, 360);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4995");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        gamePlace3.y((-2147483648));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4996");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(363, 44444403, 44444329, 44444045, 427, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4997");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("14 M", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4998");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(382, 360, 103, (int) '#', 477214179, 44444500);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test4999");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(95, -1)", "0097-04");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test9.test5000");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(40, 477214189, 59);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }
}

