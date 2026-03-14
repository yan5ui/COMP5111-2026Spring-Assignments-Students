package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5001");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(417, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5002");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("52 ", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 ");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5003");
        comp5111.assignment.cut.Subject subject0 = null;
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray2 = new comp5111.assignment.cut.Subject.GamePlayer[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration3 = subject0.new GameConfiguration(0, gamePlayerArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray2);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5004");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, 89)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5005");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(100, 200, 98, 28, 0, 477214195);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5006");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5007");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        boolean boolean11 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject12.new GamePlayer("-2147483648-10-01");
        int int15 = gamePlayer14.getScore();
        int int16 = gamePlayer14.getScore();
        gamePlayer14.addScore((int) '4');
        gamePlayer14.addScore((int) (short) 100);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList21 = gameConfiguration5.getPlacesOfPlayer(gamePlayer14);
        int[] intArray22 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(gamePlaceList21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0]");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5008");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10 M", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                10 M" + "'", str3, "                                                                                                10 M");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5009");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(328, 477214189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5010");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(861);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5011");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        gameConfiguration5.clearInitialBoard();
        int int10 = gameConfiguration5.getSize();
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean12 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5012");
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
        gamePlayer2.addScore(89);
        java.lang.String str15 = gamePlayer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=90}" + "'", str15, "GamePlayer{name='-2147483648-10-01', score=90}");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5013");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                10 M");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5014");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaa31st", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa31st" + "'", str3, "aaaaaa31st");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5015");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(104, 417, 52, 0, 366, 131);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5016");
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
        int int23 = gamePlace7.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace7.clone();
        gamePlace7.y(15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(gamePlace24);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5017");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44182, 141, 44444500);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5018");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        int int4 = gamePlace3.x();
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = gamePlace3.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace5.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(gamePlace5);
        org.junit.Assert.assertNotNull(gamePlace6);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5019");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(23, 44444763, 184, (-1), (-1561), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5020");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(0, 52)###", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5021");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (short) 1, 62);
        gamePlace5.y(28);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5022");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(356, 151, 102, 99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5023");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration7.clone();
        boolean boolean11 = gameConfiguration7.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration7.getEmptyPlaces();
        java.lang.Class<?> wildcardClass13 = gameConfiguration7.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5024");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(25, 0, 105, 23, 120, (-2147483643));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5025");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0002-02-01", "0141-02-28", "10 M", "GamePlayer{name='-2147483648-10-01', score=31}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5027");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(186);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5028");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        gamePlace3.y(104);
        gamePlace3.x(2147483562);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5029");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444329, 89, 196, 44444329);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#####(35, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #####(35, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5031");
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
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject14.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject14.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = subject14.new GamePlayer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject14.new GamePlace((int) '#', 390);
        boolean boolean27 = gameConfiguration5.isOccupied(gamePlace26);
        int int28 = gamePlace26.x();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5032");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='-2147483648-10-01', score=100}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5033");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(382, 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5034");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(98);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0035-10-31", "(97, ", "(1, 1)", "(-1, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5036");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=477214179}", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=477214179}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=477214179}");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5037");
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
        int[] intArray35 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean36 = gameConfiguration5.isBoardSymmetric();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5038");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(32, 44444403)", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 44444403)" + "'", str3, "(32, 44444403)");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5039");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration6.getInitialBoard();
        gameConfiguration6.clearInitialBoard();
        boolean boolean9 = gameConfiguration6.isBoardFull();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5040");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(17, 0, 61, 88, (int) 'a', 388);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5041");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("35 S", "1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5042");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5043");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214179, 105, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5044");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                                    ", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(103, 1)", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0100-10-01" + "'", str10, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                          0100-01-01" + "'", str11, "                                                                                          0100-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                    " + "'", str12, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(103, 1)" + "'", str13, "(103, 1)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52 S" + "'", str14, "52 S");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5045");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444410, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray10, 44444329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444329 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                                 1st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                  1st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5047");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(698, 40, 80, 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5048");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(477213945);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5049");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0089-01-01", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0089-01-01" + "'", str3, "0089-01-01");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5050");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "(10, 97)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5051");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        gamePlayer2.addScore((-2147483648));
        int int8 = gamePlayer2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2147483648) + "'", int8 == (-2147483648));
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5052");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(15, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5053");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(25, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0025-10-31" + "'", str2, "0025-10-31");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5054");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(184);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5055");
        char[] charArray10 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='0032-01-01', score=0}", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, ", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=0}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(35, 10)', score=0}", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ga" + "'", str12, "Ga");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(62, " + "'", str13, "(62, ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Ga" + "'", str14, "Ga");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Ga" + "'", str15, "Ga");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5056");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(77, -2147483648)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5057");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483562, byteArray2, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 30 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5058");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(inva" + "'", str12, "(inva");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2 " + "'", str14, "2 ");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5059");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#         ", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#         " + "'", str3, "#         ");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5060");
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
        java.lang.String str22 = gamePlace21.toString();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(gamePlace21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(10, 10)" + "'", str22, "(10, 10)");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5061");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(28, 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getPlacesOfPlayer(gamePlayer9);
        boolean boolean11 = gameConfiguration5.isBoardSymmetric();
        int[] intArray12 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, 194)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (0, 194)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5064");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-01-31##########################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5065");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-01-01", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-01-01" + "'", str3, "0097-01-01");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5066");
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
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5067");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5068");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList10);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5069");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ', score=104}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5070");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        int int10 = gameConfiguration8.getSize();
        int int11 = gameConfiguration8.getSize();
        int[] intArray12 = gameConfiguration8.countPiecesPerPlayer();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration8.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlaceList13);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5071");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5072");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', 52, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5073");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0001-01-31##########################################################################################", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31##########################################################################################" + "'", str3, "0001-01-31##########################################################################################");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5074");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(200, 15)###########################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5075");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5076");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 M", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 M" + "'", str3, "10 M");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5077");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(388, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0366-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5079");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(35, -1)", "0001-01-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5080");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(407, 360, 122, 151, 167, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5081");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        java.lang.String str6 = gamePlayer2.getName();
        java.lang.String str7 = gamePlayer2.getName();
        java.lang.String str8 = gamePlayer2.getName();
        gamePlayer2.addScore(372);
        java.lang.String str11 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-10-01" + "'", str6, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-2147483648-10-01" + "'", str11, "-2147483648-10-01");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5082");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(95, -1)", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(95, -1)" + "'", str3, "(95, -1)");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5083");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(40, 2147483562, 388, 101, 107, 151);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5084");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214246, 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5085");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477213945, 44444403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0109-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5087");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(97, 97)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}", "", "GamePlayer{name='(10, 10)', score=0}", "35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5089");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(194, 0, 86, (int) (short) -1, 54, (int) '#');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5090");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Ga");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(390, 360);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("GamePlayer{name='(1, 365)', score=0}");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject0.new GamePlace(477214308, 477214179);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer15 = subject0.new GamePlayer("2nd");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration20 = subject0.new GameConfiguration(44444403, gamePlayerArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5091");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-01-31aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5092");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0000-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5093");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("###################################################################################################4", "(52, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5094");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("17th", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17th" + "'", str3, "17th");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5095");
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
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray16 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration17 = gameConfiguration5.clone();
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
        org.junit.Assert.assertNotNull(gamePlayerArray16);
        org.junit.Assert.assertNotNull(gameConfiguration17);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5096");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 365)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5097");
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
        int int13 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration16);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5098");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444045, 96, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5099");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        java.lang.String str8 = gamePlayer7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(10, 10)" + "'", str8, "(10, 10)");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5100");
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
        boolean boolean12 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5101");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(20, 1, 109, 77, 32, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5102");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) ' ', 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5103");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getPlacesOfPlayer(gamePlayer10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5104");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(10, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5105");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        int int4 = gamePlace3.x();
        java.lang.String str5 = gamePlace3.toString();
        int int6 = gamePlace3.y();
        gamePlace3.y(44444315);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(10, 10)" + "'", str5, "(10, 10)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5106");
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
        gamePlayer2.addScore(89);
        java.lang.String str15 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-2147483648-10-01" + "'", str15, "-2147483648-10-01");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5107");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(71, 477214195, 89, 0, 61, (-2147483643));
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5108");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 477218588, 287, (int) ' ', 167, 44444045);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5109");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("36 ", "(0, 97)   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(35, 366)", "GamePlayer{name='-2147483648-10-01', score=31}", "(77, -2147483648)", "#         ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5111");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        int int6 = gamePlace5.x();
        gamePlace5.y(32);
        java.lang.Class<?> wildcardClass9 = gamePlace5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5112");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        gamePlace3.y(2);
        gamePlace3.x(186);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5113");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(184, (int) ' ', 477214308, 427, 52, 328);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5114");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444480, 44444763, 84, 35, 44444045, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5115");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(99, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5116");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("68 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5117");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0002-01-01", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0002-01-01" + "'", str3, "0002-01-01");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5118");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(52, ", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, " + "'", str3, "(52, ");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(186, 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5120");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(52, 52, 390, 62, 0, 477214215);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5121");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        int int7 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.String str10 = gamePlayer2.getName();
        java.lang.String str11 = gamePlayer2.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-2147483648-10-01" + "'", str10, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-2147483648-10-01" + "'", str11, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer12);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5122");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444410, 120, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5123");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        gamePlayer2.addScore((int) 'a');
        int int5 = gamePlayer2.getScore();
        java.lang.String str6 = gamePlayer2.toString();
        gamePlayer2.addScore(50);
        gamePlayer2.resetScore();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='#######1st', score=97}" + "'", str6, "GamePlayer{name='#######1st', score=97}");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5124");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='aaaaaaaaaa', score=0}", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='aaaaaaaaaa', score=0}" + "'", str3, "GamePlayer{name='aaaaaaaaaa', score=0}");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5125");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44182);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 H" + "'", str1, "12 H");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5126");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(71, 390);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5127");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(141, 44444763, (int) '#', 44444329, 372, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5128");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(23, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(88, byteArray5, 44444500);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444500 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5129");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration8.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        gameConfiguration8.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration8.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration12);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5130");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(151, byteArray9, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 88 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5131");
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
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5132");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5133");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5134");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(59, (int) '4', 61, 74, 109, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5135");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(417);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5136");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5137");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace(477214246, 97);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5138");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5139");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("############################################################################################(35, 10)", "15 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5140");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st Jan 129", "GamePlayer{name='#######1st', score=97}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5141");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(84);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5142");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='', score=142}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5143");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace11.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace23.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace24.clone();
        java.lang.String str26 = gamePlace24.toString();
        java.lang.String str27 = gamePlace24.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertNotNull(gamePlace24);
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, 10)" + "'", str26, "(0, 10)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(0, 10)" + "'", str27, "(0, 10)");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44445108, 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5145");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, 14, 448, 103, 105, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5146");
        char[] charArray13 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(365, 61)", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2 " + "'", str18, "2 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Ga" + "'", str19, "Ga");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(365, " + "'", str20, "(365, ");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5147");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        int int8 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5148");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(388, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5149");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=131}", "GamePlayer{name='-2147483648-10-01', score=44444403}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5150");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0363-01-01", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5151");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration10.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration11.clone();
        int[] intArray13 = gameConfiguration12.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5152");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        boolean boolean7 = gamePlayer2.equals((java.lang.Object) "#######1st");
        java.lang.String str8 = gamePlayer2.toString();
        gamePlayer2.addScore(40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=0}" + "'", str8, "GamePlayer{name='-2147483648-10-01', score=0}");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5153");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.resetScore();
        gamePlayer1.resetScore();
        java.lang.String str4 = gamePlayer1.toString();
        java.lang.String str5 = gamePlayer1.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5154");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-10-31", "GamePlayer{name='15 Y', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5155");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        boolean boolean10 = gameConfiguration7.isBoardSymmetric();
        int[] intArray11 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5156");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(52, ", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               (52, " + "'", str3, "                                                                                               (52, ");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5157");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        int int9 = gameConfiguration5.getSize();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        boolean boolean12 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5158");
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
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration11.getEmptyPlaces();
        gameConfiguration11.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5159");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(35, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5160");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5161");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        gameConfiguration13.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray15 = gameConfiguration13.getPlayers();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gamePlayerArray15);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5162");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='', score=120}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5163");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(98);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5164");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=0}", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "                                                        GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5165");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(100, 364, 0, 88, 141, 184);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 44444329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5167");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(invalid)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5168");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5169");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 366)a", "(52, 71)", "(35, 44)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5171");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0035-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5172");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        int[] intArray10 = gameConfiguration9.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration9.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration9.clone();
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer15 = subject13.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject13.new GamePlace(62, 1);
        gamePlace18.x((int) (short) 1);
        gamePlace18.y((int) (short) -1);
        gamePlace18.y((int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer25 = gameConfiguration12.getPlayerAt(gamePlace18);
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNull(gamePlayer25);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        boolean boolean7 = gameConfiguration5.isBoardFull();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5174");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=31}", "(62, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5175");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        gameConfiguration5.clearInitialBoard();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5176");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        int int10 = gamePlace3.y();
        java.lang.String str11 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject12.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject12.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer18 = subject12.new GamePlayer();
        boolean boolean19 = gamePlace3.equals((java.lang.Object) gamePlayer18);
        java.lang.String str20 = gamePlayer18.getName();
        gamePlayer18.addScore(477213945);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Anonymous Player" + "'", str20, "Anonymous Player");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5177");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10 M", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa10 M" + "'", str3, "aaaaaa10 M");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5178");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44444763, 20, (int) 'a', 0, 388, 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5179");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5180");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-2147483648-10-01', score=71}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5181");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-01-01", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-01-01" + "'", str3, "0097-01-01");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5182");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(62, 1)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5183");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4(97, ", "GamePlayer{name='31st', score=89}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5184");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 0, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5185");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483648), 427, 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=62}", "0052-04-01", "0000-01-31", "(0, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5187");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(63);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5188");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(52, 100, 102, 0, 122, 25);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5189");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5190");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444045, 30, 44445108, 14, 141, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5191");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(63, 131, 356, 0, 99, 77);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5192");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5193");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(30, 360, (int) ' ', 366, 44444045, 120);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5194");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(89, 25)", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            (89, 25)" + "'", str3, "                                                                                            (89, 25)");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5195");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5196");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5197");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, (int) (short) -1, 44182, (int) 'a', 328, 44444045);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5198");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(63, 390, 77, 218, 861, 477214496);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5199");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(105, 477214496);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5200");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = subject14.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace17.x((int) 'a');
        int int20 = gamePlace17.y();
        boolean boolean22 = gamePlace17.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = gamePlace17.clone();
        gamePlace23.y((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer26 = gameConfiguration5.getPlayerAt(gamePlace23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(gamePlace23);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5201");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 ", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 aaaaaaa" + "'", str3, "10 aaaaaaa");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5202");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(96);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5203");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray10, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(10, byteArray10, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 28 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5204");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("############################################################################################(35, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5205");
        char[] charArray15 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray15);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray15);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray15);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray15);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray15);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=10}", charArray15);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, 444444", charArray15);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray15);
        java.lang.String str24 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(52, ###############################################################################################", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1st" + "'", str16, "1st");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(inva" + "'", str17, "(inva");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(62, " + "'", str18, "(62, ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Ga" + "'", str21, "Ga");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(1, " + "'", str22, "(1, ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(52, " + "'", str24, "(52, ");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5206");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "aaaaaa10 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5207");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(363, 0, 186, 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0194-10-31", "", "(52, 25)", "(52, ###############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5209");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5210");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) -1, 2, 105, 141);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5211");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(287, 477218588);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5212");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(31, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5213");
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
        int[] intArray12 = gameConfiguration7.countPiecesPerPlayer();
        boolean boolean13 = gameConfiguration7.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = subject15.new GamePlayer("-2147483648-10-01");
        java.lang.String str18 = gamePlayer17.getName();
        gamePlayer17.setScore((int) (short) -1);
        gamePlayer17.resetScore();
        char[] charArray34 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str35 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray34);
        java.lang.String str36 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray34);
        java.lang.String str37 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray34);
        java.lang.String str38 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray34);
        java.lang.String str39 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray34);
        java.lang.String str40 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31", charArray34);
        boolean boolean41 = gamePlayer17.equals((java.lang.Object) str40);
        gamePlayer17.addScore(0);
        char[] charArray52 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str53 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray52);
        java.lang.String str54 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray52);
        boolean boolean55 = gamePlayer17.equals((java.lang.Object) str54);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList56 = gameConfiguration7.getPlacesOfPlayer(gamePlayer17);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2147483648-10-01" + "'", str18, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1st" + "'", str35, "1st");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(inva" + "'", str36, "(inva");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(62, " + "'", str37, "(62, ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " " + "'", str38, " ");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4" + "'", str39, "4");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0001-01-31" + "'", str40, "0001-01-31");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "1st" + "'", str53, "1st");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "(inva" + "'", str54, "(inva");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(gamePlaceList56);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5214");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(95, 44444763);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5215");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray1, 356);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        boolean boolean10 = gameConfiguration7.isBoardFull();
        gameConfiguration7.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5217");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', 407);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(95, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (95, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5219");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(407, 44444410);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5220");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='', score=120}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5221");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(129, (int) (byte) 100, 23, 44182, 96, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5222");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 S", "1st Jan 129");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5223");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 10, 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5224");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        int int9 = gamePlayer8.getScore();
        java.lang.String str10 = gamePlayer8.getName();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5225");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(45, 477214179)", "(62, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5226");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        boolean boolean7 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5227");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1561), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1561-10-01" + "'", str2, "-1561-10-01");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5228");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 ", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 ");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        java.lang.String str10 = gamePlayer9.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = gamePlayer9.clone();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        org.junit.Assert.assertNotNull(gamePlayer11);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5230");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648-10-01", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5231");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', 698);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5232");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5233");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(4", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa(4" + "'", str3, "aaaaaaaa(4");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5234");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        int int12 = gameConfiguration5.getSize();
        int[] intArray13 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean14 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5235");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1561-10-01", "1st Jan 477214195");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5236");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 477213945, 0, 382);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5237");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477218588, 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5238");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(17, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5239");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (short) 1, 62);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5240");
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
        gameConfiguration10.clearInitialBoard();
        boolean boolean15 = gameConfiguration10.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = gameConfiguration10.clone();
        boolean boolean17 = gameConfiguration10.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5241");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, (-1), 287, 44, 364, 427);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5242");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(88, byteArray7, 382);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 382 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5243");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray3, 44445108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44445108 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5244");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(80, 25, 131);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5245");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1, 477214215, 44444315, 328, 141, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5246");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(390, 87, 44444687, 151, 364, 44444428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=453}", "4(97, ", "                                                                                          0100-01-01", "0000-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 477214189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5249");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(382, 59, 0, 31, 69, 44444763);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5250");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("############################################################################################(-1, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5251");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray9, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5252");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0074-01-31", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0074-01-31" + "'", str3, "0074-01-31");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5253");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(54, 218);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5254");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(15, 101, 69, 96, 477214195, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5255");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("                                                                                            (89, 25)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5256");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 98);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0089-01-01", "(52, 0)", "GamePlayer{name='Anonymous Player', score=62}", "(62, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5258");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 35)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5259");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        int int11 = gameConfiguration7.getSize();
        boolean boolean12 = gameConfiguration7.isBoardFull();
        boolean boolean13 = gameConfiguration7.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5260");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaa31st", "", "(10, 10)", "aaaaaa31st");
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5261");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5262");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("4444444hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[4444444, 0, 0, 0]");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5263");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("12th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5264");
        char[] charArray4 = new char[] { ' ', 'a' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("##################################################################################################2 ", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("50 S", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , a]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##################################################################################################2 " + "'", str5, "##################################################################################################2 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "50 " + "'", str6, "50 ");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5265");
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
        java.lang.String str59 = gamePlayer18.getName();
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
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-2147483648-10-01" + "'", str59, "-2147483648-10-01");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 97)", "(71, ", "1 M", "0052-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5267");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, ", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1 Y", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-1561 S", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("45 S", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-214" + "'", str14, "-214");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(10, " + "'", str15, "(10, ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 " + "'", str16, "1 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1561 " + "'", str17, "-1561 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5268");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477214246);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5269");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(71, 366)", "0097-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5270");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(4, 1)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5271");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 1, 366, 44444428, 96, 184, (int) '4');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5272");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration5.clone();
        gameConfiguration8.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5273");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}", "(-1, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5274");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(32, 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5275");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='Anonymous Player', score=35}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5276");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, 0, 40, 86, 129, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5277");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5278");
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
        comp5111.assignment.cut.Subject subject14 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = subject14.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace19 = subject14.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer21 = subject14.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = subject14.new GamePlayer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject14.new GamePlace((int) '#', 390);
        boolean boolean27 = gameConfiguration5.isOccupied(gamePlace26);
        java.lang.String str28 = gamePlace26.toString();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(35, 390)" + "'", str28, "(35, 390)");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("7 M", "10th Feb 62", "Ga", "0089-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5281");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(77);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5282");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(96);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(71, 366)", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(71, 366)4" + "'", str3, "(71, 366)4");
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5284");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=366}", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("44(-1, 52)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-214" + "'", str12, "-214");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4" + "'", str14, "4");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Ga");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(390, 360);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject0.new GamePlayer("GamePlayer{name='(1, 365)', score=0}");
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject0.new GamePlace(477214308, 477214179);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = gamePlace13.clone();
        org.junit.Assert.assertNotNull(gamePlace14);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5286");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(89, byteArray3, 360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 360 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5287");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01', score=100}44444444444444444444444444444444444444444444444444444", (short) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=100}44444444444444444444444444444444444444444444444444444" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=100}44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("hi!                                                                                                 ", "0097-10-014", "44 S", "GamePlayer{name='#######1st', score=97}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5289");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 0, 365, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        int[] intArray9 = gameConfiguration5.countPiecesPerPlayer();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5291");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5292");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray10, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5293");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(194, 98, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5294");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore(366);
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace9.x((int) 'a');
        int int12 = gamePlace9.y();
        boolean boolean14 = gamePlace9.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = gamePlace9.clone();
        boolean boolean16 = gamePlayer2.equals((java.lang.Object) gamePlace15);
        gamePlace15.y(200);
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace22.x((int) 'a');
        int int25 = gamePlace22.y();
        boolean boolean27 = gamePlace22.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace22.clone();
        int int29 = gamePlace22.y();
        java.lang.String str30 = gamePlace22.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace22.clone();
        boolean boolean32 = gamePlace15.isAdjacent(gamePlace31);
        comp5111.assignment.cut.Subject.GamePlace gamePlace33 = gamePlace15.clone();
        gamePlace15.x(390);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(gamePlace15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(gamePlace28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(97, 10)" + "'", str30, "(97, 10)");
        org.junit.Assert.assertNotNull(gamePlace31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(gamePlace33);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0097-10-014", "1st       ", "477218588-10-31", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5296");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444480, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5297");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("28 S######", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28 S######" + "'", str3, "28 S######");
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5298");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(131, byteArray8, 388);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 388 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5299");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(12, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(50, byteArray5, 44445108);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44445108 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5300");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(71, 62, 477214179, 84);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5301");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration7.clone();
        int int11 = gameConfiguration10.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration10.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration12.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration12.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = gameConfiguration12.clone();
        boolean boolean16 = gameConfiguration15.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlaceList13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertNotNull(gameConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        java.lang.Class<?> wildcardClass9 = gameConfiguration5.getClass();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5303");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = subject12.new GamePlayer("-2147483648-10-01");
        int int15 = gamePlayer14.getScore();
        int int16 = gamePlayer14.getScore();
        java.lang.String str17 = gamePlayer14.getName();
        java.lang.String str18 = gamePlayer14.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer19 = gamePlayer14.clone();
        comp5111.assignment.cut.Subject subject20 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace23 = subject20.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace26 = subject20.new GamePlace(62, 89);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = subject20.new GamePlace(366, 63);
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration5.addInitialPiece(gamePlayer14, gamePlace29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the player of the piece is unknown");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-2147483648-10-01" + "'", str17, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-2147483648-10-01" + "'", str18, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer19);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5304");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("12th######", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12th######" + "'", str3, "12th######");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5305");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(96, byteArray5, 44444428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444428 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5306");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=35}", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, 44444403)", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("36 S", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='10th', score=35}" + "'", str8, "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(32, 44444403)" + "'", str9, "(32, 44444403)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "36 S" + "'", str10, "36 S");
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5307");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaa10 M", "(52, 25)##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5308");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(4, 1)4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(167, 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5310");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(99, 71, (int) (short) 1, 364, 382, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5311");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = gamePlace28.clone();
        comp5111.assignment.cut.Subject.GamePlace gamePlace31 = gamePlace28.clone();
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
        org.junit.Assert.assertNotNull(gamePlace30);
        org.junit.Assert.assertNotNull(gamePlace31);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(31, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (31, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5313");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5314");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(407, (int) (short) 0);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5315");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(44444410);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5316");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray10, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(129, byteArray10, 151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 151 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5317");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                             (97, 1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5318");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration7.clone();
        int int11 = gameConfiguration10.getSize();
        gameConfiguration10.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration10.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5319");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 ", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52 ");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5320");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray13 = gameConfiguration12.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5321");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, 71, 12, 477214179, 218, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5322");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214308, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5323");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("12th", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12th######" + "'", str3, "12th######");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5324");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(477214179, 407, 44444315, 453, 44444428, 122);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5325");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(32, 34, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5326");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477214343);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5327");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration5.clone();
        boolean boolean13 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5328");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        int int10 = gameConfiguration7.getSize();
        gameConfiguration7.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration7.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList12);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5329");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("-1 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5330");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(103, 287);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5331");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44445108, byteArray9, 363);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 363 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5332");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("50 S", "(35, ###############################################################################################", "GamePlayer{name='31st', score=0}", "GamePlayer{name='(62, 1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5334");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject subject7 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject7.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = subject7.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = subject7.new GameConfiguration(25);
        int int13 = gameConfiguration12.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration12.clone();
        boolean boolean15 = gameConfiguration14.isBoardSymmetric();
        int[] intArray16 = gameConfiguration14.countPiecesPerPlayer();
        boolean boolean17 = gameConfiguration14.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList18 = gameConfiguration14.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration14.getPlayers();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration20 = subject0.new GameConfiguration(0, gamePlayerArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(gamePlaceList18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5335");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration8.getInitialBoard();
        boolean boolean10 = gameConfiguration8.isBoardFull();
        boolean boolean11 = gameConfiguration8.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5336");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10 S", "-1561 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5337");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, 365)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-01", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0001-01-01" + "'", str13, "0001-01-01");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0001-01-31" + "'", str14, "0001-01-31");
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5338");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4 S                                                                                                 ", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4 S                                                                                                 " + "'", str3, "4 S                                                                                                 ");
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5339");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 151);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3 M" + "'", str1, "3 M");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5340");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=-1561}", "25th                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5341");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        int int11 = gameConfiguration10.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration10.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration10.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration10.getEmptyPlaces();
        boolean boolean15 = gameConfiguration10.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gamePlaceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5342");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(372, byteArray2, 360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 360 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5343");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(390, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477218588, byteArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(356, byteArray10, 477214246);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477214246 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5344");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
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
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5345");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5346");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(477218588, 99, 77, 477214195, 44444763, 28);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5347");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Feb 0", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(-1, 44444410)", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Jan 1", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st " + "'", str14, "1st ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(-1, " + "'", str15, "(-1, ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10th " + "'", str16, "10th ");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaa(4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5349");
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
        int int27 = gamePlace8.y();
        int int28 = gamePlace8.x();
        java.lang.Class<?> wildcardClass29 = gamePlace8.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5350");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214496, 287);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5351");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(100, (-1561), 356, 96, 184, 407);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5352");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(35, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5353");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483643 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5354");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        int int12 = gameConfiguration11.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(31, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (31, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5356");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(218, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5357");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration5.getInitialBoard();
        int int10 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration11);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5358");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration8.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration8.clone();
        int int12 = gameConfiguration11.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(101, 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5360");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        int[] intArray10 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5361");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        java.lang.Class<?> wildcardClass8 = gameConfiguration5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5362");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44, 372, (-1561), 50, 45, 44444045);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5363");
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
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration13.clone();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gameConfiguration14);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5364");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 10, 44444329, (int) (byte) -1, 84, 28, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5365");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-1 S', score=32}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5366");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st Feb 0###########################################################################################", "(inva");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5367");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        int int10 = gamePlace3.x();
        gamePlace3.y((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5368");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=35}", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(32, 44444403)", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken(" ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='10th', score=35}" + "'", str8, "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(32, 44444403)" + "'", str9, "(32, 44444403)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5369");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0360-10-31", "(1, 365)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0025-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5371");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0032-04-01", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0032-04-01" + "'", str3, "0032-04-01");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5372");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(71, 366)a", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5373");
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
        boolean boolean12 = gameConfiguration9.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5374");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(218, 71, 129, 25, 194, 44445108);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5375");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5376");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray1, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5377");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("a", "Jan");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5378");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477213945, 477214189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5379");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        int int4 = gamePlayer3.getScore();
        gamePlayer3.setScore(390);
        gamePlayer3.resetScore();
        gamePlayer3.addScore(103);
        java.lang.String str10 = gamePlayer3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='                                                                                          0100-01-01', score=103}" + "'", str10, "GamePlayer{name='                                                                                          0100-01-01', score=103}");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5380");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        gamePlayer7.setScore(32);
        java.lang.String str10 = gamePlayer7.getName();
        java.lang.String str11 = gamePlayer7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 10)" + "'", str10, "(10, 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='(10, 10)', score=32}" + "'", str11, "GamePlayer{name='(10, 10)', score=32}");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5381");
        char[] charArray4 = new char[] {};
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='10th', score=35}", charArray4);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("12th", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='10th', score=35}" + "'", str7, "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12th" + "'", str8, "12th");
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5382");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        int int11 = gameConfiguration10.getSize();
        boolean boolean12 = gameConfiguration10.isBoardFull();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration10.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gamePlaceList13);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5383");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 141)", "0089-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5384");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 0)", "(32, 44444403)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5385");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        int[] intArray12 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = null;
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
        int int40 = gamePlace22.x();
        int int41 = gamePlace22.y();
        int int42 = gamePlace22.x();
        java.lang.String str43 = gamePlace22.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace44 = gamePlace22.clone();
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration5.addInitialPiece(gamePlayer13, gamePlace22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlayer.equals(Object)\" because \"piece\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(0, 0)" + "'", str43, "(0, 0)");
        org.junit.Assert.assertNotNull(gamePlace44);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5386");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0002-10-01", "0001-01-31##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5387");
        char[] charArray8 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 1)", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 477214215)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(100, " + "'", str10, "(100, ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(62, " + "'", str11, "(62, ");
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5388");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        int[] intArray12 = gameConfiguration5.countPiecesPerPlayer();
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                               (52, ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(35, 25)", "GamePlayer{name='Anonymous Player', score=0}", "0044-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5390");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        gamePlace8.y(0);
        java.lang.String str11 = gamePlace8.toString();
        java.lang.String str12 = gamePlace8.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(0, 0)" + "'", str11, "(0, 0)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 0)" + "'", str12, "(0, 0)");
        org.junit.Assert.assertNotNull(gamePlace13);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5391");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-02-28");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5392");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(105, 2147483562, 61, 328, 477213945, 364);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5393");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration7.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration7.clone();
        boolean boolean12 = gameConfiguration11.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5394");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("15th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5395");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("##########################################################################################0360-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5396");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        java.lang.String str10 = gamePlayer9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str10, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(100, 360);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5398");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject0.new GamePlace((-1561), 151);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5399");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, 0)", "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5400");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34 S" + "'", str1, "34 S");
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5401");
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
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration10.getEmptyPlaces();
        boolean boolean15 = gameConfiguration10.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gamePlaceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5402");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(34, 30, 453, 109, 71, 477214179);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5403");
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
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration14 = gameConfiguration5.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(gamePlaceList13);
        org.junit.Assert.assertNotNull(gameConfiguration14);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5404");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        int int10 = gameConfiguration7.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration7.getEmptyPlaces();
        boolean boolean12 = gameConfiguration7.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5405");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='10th', score=0}", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5406");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(167, 44444329, 390, 44444687);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5407");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("0035-10-01");
        int int10 = gamePlayer9.getScore();
        int int11 = gamePlayer9.getScore();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5408");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(50, 44444763);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("15 Y", "(97, ", "10thaaaaaa", "4(97, 141)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5410");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', (int) (short) -1, 287, 167, 71, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(1, 365)', score=0}", "4th Oct 44444403", "-1561 ", "(89, 25)############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5412");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(95, 44444329, 71, 105, 44444315, 407);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5413");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01', score=44}                                                      ", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=44}                                                      " + "'", str3, "GamePlayer{name='-2147483648-10-01', score=44}                                                      ");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(44444329);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5415");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(141, 194, 44444315, 30);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(97, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (97, 0)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5417");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                                 1 Y", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 1 Y" + "'", str3, "                                                                                                 1 Y");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5418");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        int int11 = gameConfiguration8.getSize();
        boolean boolean12 = gameConfiguration8.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray13 = gameConfiguration8.getPlayers();
        boolean boolean14 = gameConfiguration8.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5419");
        char[] charArray13 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, ", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0000-02-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0360-10-31", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("#####(35, ", charArray13);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("35 S", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0052-01-01" + "'", str15, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(1, " + "'", str16, "(1, ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0000-02-01" + "'", str17, "0000-02-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0360-10-31" + "'", str19, "0360-10-31");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#####(35, " + "'", str20, "#####(35, ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35 " + "'", str21, "35 ");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5420");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(35, ###############################################################################################", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, ###############################################################################################" + "'", str3, "(35, ###############################################################################################");
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5421");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("30 S", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "30 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "30 S444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5422");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(52, 417);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5423");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        java.lang.String str9 = gamePlayer8.getName();
        gamePlayer8.resetScore();
        java.lang.String str11 = gamePlayer8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Anonymous Player" + "'", str9, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str11, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5424");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("5 M");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[5, 0, 0, 0]");
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5425");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration8.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration8.clone();
        boolean boolean12 = gameConfiguration8.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5426");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#####(35, ", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################(35, " + "'", str3, "###############################################################################################(35, ");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5427");
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
        gamePlace28.x(17);
        gamePlace28.x(0);
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
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5428");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        java.lang.String str3 = gamePlayer2.getName();
        java.lang.String str4 = gamePlayer2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######1st" + "'", str3, "#######1st");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='#######1st', score=0}" + "'", str4, "GamePlayer{name='#######1st', score=0}");
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5429");
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
        int int13 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        gameConfiguration5.clearInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList16 = gameConfiguration5.getEmptyPlaces();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList17 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList16);
        org.junit.Assert.assertNotNull(gamePlaceList17);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5430");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration5.getInitialBoard();
        int int12 = gameConfiguration5.getSize();
        int[] intArray13 = gameConfiguration5.countPiecesPerPlayer();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlaceList14);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5431");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(32, 52)", "12th######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5432");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        int int9 = gameConfiguration5.getSize();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration11.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(gameConfiguration11);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, -1)", "0044-01-31", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", "GamePlayer{name='', score=142}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5434");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(372, 218, 477214179, 477214308);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5435");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(103, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44, byteArray8, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 23 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5436");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(698);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5437");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(194, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5438");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 448);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7 M" + "'", str1, "7 M");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5439");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5440");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0035-10-31", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0100-10-01" + "'", str16, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2 " + "'", str17, "2 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0035-10-31" + "'", str18, "0035-10-31");
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5441");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration7.clone();
        int int11 = gameConfiguration10.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration12 = gameConfiguration10.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList13 = gameConfiguration12.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration12.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = gameConfiguration12.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray16 = gameConfiguration12.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(gamePlaceList13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
        org.junit.Assert.assertNotNull(gameConfiguration15);
        org.junit.Assert.assertNotNull(gamePlayerArray16);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5442");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, 15, (-2147483613), (int) (byte) 10, 20, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5443");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        gameConfiguration6.clearInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration6.clone();
        boolean boolean9 = gameConfiguration8.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration8.getPlayers();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5444");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.x();
        int int9 = gamePlace7.x();
        java.lang.Object obj10 = null;
        boolean boolean11 = gamePlace7.equals(obj10);
        java.lang.String str12 = gamePlace7.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, 10)" + "'", str12, "(97, 10)");
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5445");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(62, 44182, 218, 89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5446");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        java.lang.String str4 = gamePlayer3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str4, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5447");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        java.lang.String str6 = gamePlayer2.getName();
        java.lang.String str7 = gamePlayer2.getName();
        gamePlayer2.addScore(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-10-01" + "'", str6, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5448");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        boolean boolean11 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5449");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483613));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5450");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        int int10 = gameConfiguration9.getSize();
        gameConfiguration9.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5451");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray8);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
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
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5452");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=97}", "0032-02-29");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5453");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray5, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 50 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5454");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(71, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0071-01-31" + "'", str2, "0071-01-31");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5455");
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
        boolean boolean15 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration16 = gameConfiguration5.clone();
        int int17 = gameConfiguration5.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(gameConfiguration16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 25 + "'", int17 == 25);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0035-10-01", "12th", "(52, 25)##", "(-1, 52)############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5457");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, ", "0001-02-28                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5458");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("30 S", "GamePlayer{name='-2147483648-10-01', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5459");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(97, 0)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5460");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214215, 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5461");
        char[] charArray9 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=97}", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1st" + "'", str10, "1st");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Ga" + "'", str11, "Ga");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5462");
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
        int[] intArray17 = gameConfiguration12.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray18 = gameConfiguration12.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray19 = gameConfiguration12.getPlayers();
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0]");
        org.junit.Assert.assertNotNull(gamePlayerArray18);
        org.junit.Assert.assertNotNull(gamePlayerArray19);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5463");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        int int4 = gamePlayer3.getScore();
        java.lang.String str5 = gamePlayer3.getName();
        int int6 = gamePlayer3.getScore();
        java.lang.String str7 = gamePlayer3.toString();
        gamePlayer3.setScore(87);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                          0100-01-01" + "'", str5, "                                                                                          0100-01-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='                                                                                          0100-01-01', score=0}" + "'", str7, "GamePlayer{name='                                                                                          0100-01-01', score=0}");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5464");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(88, (int) (short) 10, 129);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5465");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(43, 14, (int) (byte) 0, 131, 44445108, 382);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5466");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5467");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44182, (int) (short) -1, 44444329, 365, 477214195, 328);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5468");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(427, (int) (byte) 100, 698);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5469");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(71, 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5470");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(372, 129, 372);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5471");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(10, 32)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test10.test5472");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("###################################################################################################4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

