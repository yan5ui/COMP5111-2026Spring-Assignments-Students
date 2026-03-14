package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2001");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0141-02-28");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 141 + "'", int1 == 141);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2002");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration5.clone();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(95, -1)", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", "GamePlayer{name='10th', score=35}", "(0, 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2004");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(50, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2005");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("25th                                                                                                ", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25th                                                                                                " + "'", str3, "25th                                                                                                ");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2006");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        int int8 = gamePlace3.y();
        int int9 = gamePlace3.x();
        gamePlace3.x(364);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2007");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(50, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2008");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        boolean boolean10 = gameConfiguration9.isBoardFull();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject11.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = subject11.new GamePlace(62, 1);
        java.lang.String str17 = gamePlace16.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace16.clone();
        comp5111.assignment.cut.Subject subject19 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = subject19.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace22.x((int) 'a');
        int int25 = gamePlace22.y();
        int int26 = gamePlace22.x();
        gamePlace22.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = gamePlace22.clone();
        int int30 = gamePlace22.x();
        gamePlace22.x(0);
        int int33 = gamePlace18.manhattanDistance(gamePlace22);
        comp5111.assignment.cut.Subject.GamePlace gamePlace34 = gamePlace22.clone();
        gamePlace34.x(0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer37 = gameConfiguration9.getPlayerAt(gamePlace34);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(62, 1)" + "'", str17, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(gamePlace29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 71 + "'", int33 == 71);
        org.junit.Assert.assertNotNull(gamePlace34);
        org.junit.Assert.assertNull(gamePlayer37);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2009");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(50, 407);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2010");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        gamePlayer9.setScore((int) (byte) 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2011");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-01-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2012");
        char[] charArray9 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1st" + "'", str10, "1st");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Ja" + "'", str12, "Ja");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2013");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        java.lang.String str9 = gamePlayer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=-1}" + "'", str9, "GamePlayer{name='-2147483648-10-01', score=-1}");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2014");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(50, 477214215, 382, 71);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2015");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(407, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2016");
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
        comp5111.assignment.cut.Subject subject26 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = subject26.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer29 = subject26.new GamePlayer("                                                                                          0100-01-01");
        java.lang.String str30 = gamePlayer29.toString();
        comp5111.assignment.cut.Subject subject31 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer33 = subject31.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace36 = subject31.new GamePlace(62, 1);
        java.lang.String str37 = gamePlace36.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace38 = gamePlace36.clone();
        comp5111.assignment.cut.Subject subject39 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace42 = subject39.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace42.x((int) 'a');
        int int45 = gamePlace42.y();
        int int46 = gamePlace42.x();
        gamePlace42.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace49 = gamePlace42.clone();
        int int50 = gamePlace42.x();
        gamePlace42.x(0);
        int int53 = gamePlace38.manhattanDistance(gamePlace42);
        comp5111.assignment.cut.Subject.GamePlace gamePlace54 = gamePlace42.clone();
        int int55 = gamePlace42.x();
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration25.addInitialPiece(gamePlayer29, gamePlace42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the player of the piece is unknown");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GamePlayer{name='                                                                                          0100-01-01', score=0}" + "'", str30, "GamePlayer{name='                                                                                          0100-01-01', score=0}");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(62, 1)" + "'", str37, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertNotNull(gamePlace49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 71 + "'", int53 == 71);
        org.junit.Assert.assertNotNull(gamePlace54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2017");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 1, (int) '#', 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2018");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(89, 360);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2019");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) -1, 4, 0, 360, (int) (short) 1, 50);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2020");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration7.getPlayers();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2021");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("############################################################################################(35, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2022");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(194, 36, (int) ' ', (int) ' ', (int) (byte) -1, 44);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2023");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0001-01-31", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31" + "'", str3, "0001-01-31");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2024");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44, byteArray9, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 194 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2025");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2026");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(200, 120, 44444045, 30, 0, 477214221);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2027");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2028");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(87);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2029");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444045, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2030");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(364, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2031");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2032");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1 M", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 M" + "'", str3, "1 M");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2033");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(356, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2034");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2035");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(10, 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2036");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(25, byteArray1, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, 477214195, 477214215, 141, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2038");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(44444045);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2039");
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray10, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray10, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray10, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray10, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 365 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2040");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(44444410);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2041");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, (-1561), (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1 S", "GamePlayer{name='(35, ', score=10}", "(100, 10)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2043");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration10.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2044");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 100, 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483648), 71, (int) (short) 100, 97, 104, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2046");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', (-1561));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2047");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(71, #####");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2048");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(0, 44444403)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2049");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(25, 382);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2050");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444045, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2051");
        char[] charArray13 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("2 M", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=0}", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 0)", charArray13);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0, " + "'", str20, "(0, ");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2052");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(360, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2053");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, (int) 'a', 382, 0, (int) (short) 10, 477214195);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2054");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4 S                                                                                                 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(10, 10)', score=0}", "0002-10-01", "10th Feb 62", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2056");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("#######Oct");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2057");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(200);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2058");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-214", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-214" + "'", str3, "-214");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2059");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44444410);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2060");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44 S" + "'", str1, "44 S");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2061");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, ", "(71, 366)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2062");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2063");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray9, 477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477214179 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2065");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)", "52 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2066");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Feb 62", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Feb 62" + "'", str3, "10th Feb 62");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2067");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), (-1561), 109, (int) (byte) 100, 0, 390);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2068");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray9, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray9, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 120 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2069");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0035-10-31", "44444410 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2070");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(390, 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2071");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(1, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2072");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2073");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(61);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2074");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 477218588 + "'", int1 == 477218588);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2075");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1 ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2076");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(52, 25)##");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2077");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject0.new GamePlayer();
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2078");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(50, 477214308);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2079");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("36 S", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36 S" + "'", str3, "36 S");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2080");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2081");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444045, byteArray4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2082");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        int int9 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2083");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 10, (int) ' ', 382);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2084");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(120);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2085");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(477218588, 104, 122, 2, (int) (short) 100, 356);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2086");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(63, 2, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2087");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        gameConfiguration5.clearInitialBoard();
        boolean boolean11 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2088");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(35, ', score=10}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2089");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2090");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='', score=0}", "0000-02-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2091");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(52, 32, 360);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2092");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477214215, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2093");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 1, 477214195);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2094");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 84, 1, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2095");
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
        java.lang.String str24 = gamePlace7.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace25 = gamePlace7.clone();
        int int26 = gamePlace25.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertNotNull(gamePlace23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(62, 1)" + "'", str24, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 62 + "'", int26 == 62);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2096");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(477214308);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2097");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444403, 200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2098");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214308, 10, 103);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2099");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(103, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2100");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2101");
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
        java.lang.String str26 = gamePlace8.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace8.clone();
        java.lang.String str28 = gamePlace27.toString();
        gamePlace27.y((int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, 0)" + "'", str26, "(0, 0)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0, 0)" + "'", str28, "(0, 0)");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2102");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(141, byteArray3, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2103");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0366-01-31", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0366-01-31" + "'", str3, "0366-01-31");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, 444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"(\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2105");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(477214308, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2106");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '4', 477214195, 0, (int) (byte) -1, 477214221, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2107");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration10.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2108");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("36 S", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36 S" + "'", str3, "36 S");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2109");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1561), 44444329, 382, 382, 120, 360);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2110");
        char[] charArray14 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray14);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray14);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray14);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray14);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray14);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=10}", charArray14);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray14);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0000-02-29", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1st" + "'", str15, "1st");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(inva" + "'", str16, "(inva");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(62, " + "'", str17, "(62, ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Ga" + "'", str20, "Ga");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0000-02-29" + "'", str22, "0000-02-29");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2111");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(97, 1)", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 1)" + "'", str3, "(97, 1)");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2112");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477214221, byteArray9, 44444329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444329 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2113");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0032-02-29", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0032-02-29" + "'", str3, "0032-02-29");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2114");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("52 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2115");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2116");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(433, 84, 365, 0, 363, 477214195);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2117");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2118");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st       " + "'", str3, "1st       ");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2119");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(390);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2120");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(84);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2121");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, 444444", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 444444" + "'", str3, "(1, 444444");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2122");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, 44444410)", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 44444410)" + "'", str3, "(-1, 44444410)");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2123");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 1, 50, 364, 407, 477214215, 44444045);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2124");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2125");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(74, 433, 0, 45, 382, 87);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2126");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', (int) (short) 10, 77, 477214308);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2127");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(43, 89, (int) (short) -1, 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2128");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444329, 0, 84, 74);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2129");
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
        java.lang.String str14 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-2147483648-10-01" + "'", str14, "-2147483648-10-01");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2130");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, 84, 194, 200, (int) (short) 10, 194);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2131");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=10}", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=10}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=10}");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2132");
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
        gamePlace3.x((int) ' ');
        gamePlace3.y(44444403);
        java.lang.String str24 = gamePlace3.toString();
        gamePlace3.x(89);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-2147483648-10-01" + "'", str13, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(32, 44444403)" + "'", str24, "(32, 44444403)");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2133");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(477214195);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2134");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(52, ", "1 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2135");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2136");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214179, 44444045);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("477214179-10-31", "(1, ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2138");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                                -214", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                -214" + "'", str3, "                                                                                                -214");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2139");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 2, 433, 52, 382, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2140");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Feb 0", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Feb 0" + "'", str3, "10th Feb 0");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2141");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(122, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2142");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0032-04-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[32, 0, 0, 0]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2143");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 44444329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2145");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2146");
        char[] charArray9 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, 10)", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1st" + "'", str10, "1st");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, " + "'", str11, "(97, ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, " + "'", str12, "(97, ");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2147");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2148");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, 44444045, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2149");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(87, 0, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2150");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(194, byteArray5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2151");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='-2147483648-10-01', score=84}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2152");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(360, 4, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2153");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer14 = null;
        comp5111.assignment.cut.Subject subject15 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer17 = subject15.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace20 = subject15.new GamePlace(62, 1);
        java.lang.String str21 = gamePlace20.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace22 = gamePlace20.clone();
        java.lang.String str23 = gamePlace22.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = null;
        boolean boolean25 = gamePlace22.isAdjacent(gamePlace24);
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration5.addInitialPiece(gamePlayer14, gamePlace24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlayer.equals(Object)\" because \"piece\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(62, 1)" + "'", str21, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(62, 1)" + "'", str23, "(62, 1)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2154");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration8.clone();
        gameConfiguration8.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(52, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (52, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2156");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2157");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 44444403, 71, (int) (byte) 10, 477214221, 97);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2158");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(364, 44444403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2159");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-1, 52)############################################################################################", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 52)############################################################################################" + "'", str3, "(-1, 52)############################################################################################");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2160");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=104}", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=104}" + "'", str3, "GamePlayer{name='Anonymous Player', score=104}");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2161");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(407);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("45 S", "(1, 444444", "7 M", "Ga");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2163");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) -1, 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2164");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0035-10-31", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-10-31" + "'", str3, "0035-10-31");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2165");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("10 S                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2166");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        gamePlayer2.addScore((int) (short) 100);
        boolean boolean10 = gamePlayer2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2167");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 S                                                                                                ", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S                                                                                                " + "'", str3, "10 S                                                                                                ");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2168");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        gamePlayer3.setScore((int) (byte) 1);
        gamePlayer3.addScore(356);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = gamePlayer3.clone();
        org.junit.Assert.assertNotNull(gamePlayer8);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2169");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2170");
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
        int int27 = gamePlace8.y();
        gamePlace8.x(74);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2171");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(52, ", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, ###############################################################################################" + "'", str3, "(52, ###############################################################################################");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(32, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2173");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.addScore(100);
        gamePlayer1.resetScore();
        java.lang.String str5 = gamePlayer1.getName();
        gamePlayer1.resetScore();
        gamePlayer1.addScore(77);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2174");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2175");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(95, 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2176");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(200, (int) (short) 10, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2177");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration6.getInitialBoard();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration6.clone();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2178");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(109, 365, 360);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2179");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(356, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2180");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2181");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, 44444329, 52, 477214308, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("################################################################################################31st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ################################################################################################31st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2183");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        gamePlayer7.setScore(32);
        java.lang.String str10 = gamePlayer7.getName();
        gamePlayer7.resetScore();
        gamePlayer7.setScore(477214195);
        java.lang.Class<?> wildcardClass14 = gamePlayer7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 10)" + "'", str10, "(10, 10)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2184");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(388, 43, 122, 103, (int) (short) 100, 44444410);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2185");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(366, byteArray9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2186");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, (-1), (int) (byte) 10, 122, 109, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='(62, 1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='(62, 1)', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2188");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0044-01-31" + "'", str2, "0044-01-31");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2189");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################################################################4" + "'", str3, "###################################################################################################4");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2190");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(61);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaa", "(inva", "(0, 0)", "(100, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2192");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 382);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2193");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2194");
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
        java.lang.Class<?> wildcardClass12 = gamePlayerArray11.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2195");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 743);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2196");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10th", "GamePlayer{name='-2147483648-10-01', score=84}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2197");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(71, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2198");
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
        gameConfiguration10.clearInitialBoard();
        boolean boolean13 = gameConfiguration10.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2199");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(25, 103, 25, 45, 77, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2200");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, 477214221, 43, 25, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2201");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2202");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(102, 477218588, 44444410);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2203");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(52, 84, 63, 364, 44, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2204");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 102);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2205");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(89, 25)", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(89, 25)############################################################################################" + "'", str3, "(89, 25)############################################################################################");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2206");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(363);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2207");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("52 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2208");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=1}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2209");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(62, 52)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0002-10-01", "GamePlayer{name='-2147483648-10-01', score=84}", "0194-10-31", "(71, 356)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2211");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration5.getInitialBoard();
        java.lang.Class<?> wildcardClass10 = gameConfiguration5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2212");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        boolean boolean10 = gameConfiguration7.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2213");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(35, ", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, ###############################################################################################" + "'", str3, "(35, ###############################################################################################");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2214");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2215");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097-01-01" + "'", str2, "0097-01-01");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2216");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        int int11 = gameConfiguration5.getSize();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2217");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = subject10.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace13.x((int) 'a');
        int int16 = gamePlace13.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace17 = gamePlace13.clone();
        comp5111.assignment.cut.Subject subject18 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer20 = subject18.new GamePlayer("-2147483648-10-01");
        int int21 = gamePlayer20.getScore();
        int int22 = gamePlayer20.getScore();
        java.lang.String str23 = gamePlayer20.getName();
        int int24 = gamePlayer20.getScore();
        gamePlayer20.addScore(31);
        gamePlayer20.addScore((int) (byte) 100);
        boolean boolean29 = gamePlace13.equals((java.lang.Object) gamePlayer20);
        gamePlace13.x((int) ' ');
        gamePlace13.y(44444403);
        java.lang.String str34 = gamePlace13.toString();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer35 = gameConfiguration7.getPlayerAt(gamePlace13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(gamePlace17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-2147483648-10-01" + "'", str23, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "(32, 44444403)" + "'", str34, "(32, 44444403)");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2218");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214308, 194, 477218588, 97, 44444403, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2219");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(104, 84, (int) (byte) -1, 477214179, 62, 382);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2220");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444329, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2221");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(44444329);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2222");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 365)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2223");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(363, (int) (byte) 1, 390, 477214195, 102, 360);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2224");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, (-2147483648), 44444410, 74, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2225");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(102, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2226");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, 89, 63, 200, 71, (int) '#');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2227");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0052-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2228");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-1561 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2229");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = subject0.new GameConfiguration(84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2230");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, 388, (int) 'a', 0, 97, 74);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2231");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 407);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2232");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1561), 356, 40, (int) ' ', 477218588, 25);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2233");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0004-04-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2234");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaa31st", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa31st" + "'", str3, "aaaaaa31st");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2235");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("################################################################################################31st", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################31st" + "'", str3, "################################################################################################31st");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2236");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(477214195);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2237");
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
        gameConfiguration7.clearInitialBoard();
        int int13 = gameConfiguration7.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2238");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 366);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 M" + "'", str1, "6 M");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2239");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(141, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2240");
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
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray26 = gameConfiguration16.getInitialBoard();
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
        org.junit.Assert.assertNotNull(gamePlayerArray26);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2241");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2242");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2243");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        int int9 = gamePlace3.x();
        int int10 = gamePlace3.x();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace14.x((int) 'a');
        gamePlace14.x((int) (byte) 10);
        gamePlace14.y(44444403);
        int int21 = gamePlace3.manhattanDistance(gamePlace14);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44444480 + "'", int21 == 44444480);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2244");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(364, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2245");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(43, 356, 109, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2247");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2248");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(1, 365)', score=0}", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(1, 365)', score=0}" + "'", str3, "GamePlayer{name='(1, 365)', score=0}");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2249");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        java.lang.String str8 = gamePlace3.toString();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace12.x((int) 'a');
        int int15 = gamePlace12.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace12.clone();
        int int17 = gamePlace16.x();
        int int18 = gamePlace16.x();
        gamePlace16.y(356);
        int int21 = gamePlace3.manhattanDistance(gamePlace16);
        gamePlace16.y(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(10, 10)" + "'", str8, "(10, 10)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 433 + "'", int21 == 433);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2250");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#         " + "'", str3, "#         ");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(104, (int) '4', 104, (int) (short) 10, 194, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2252");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) -1, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2253");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(382);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2254");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444763, byteArray9, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 95 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2255");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, 25)", "0001-01-31##########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2256");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2257");
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
        java.lang.Class<?> wildcardClass21 = gamePlace3.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(62, 1)" + "'", str16, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 104 + "'", int20 == 104);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2258");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Ga", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ga" + "'", str3, "Ga");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2259");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444045, byteArray1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0097-10-01", "(32, 44444403)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(1, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2261");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444403, 36, 1, 363);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2262");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(95, -1)", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(95, -1)" + "'", str3, "(95, -1)");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2263");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        boolean boolean11 = gameConfiguration10.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray12 = gameConfiguration10.getInitialBoard();
        int int13 = gameConfiguration10.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(62, ", "Ja", "", "35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2265");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration5.getInitialBoard();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList11 = gameConfiguration5.getEmptyPlaces();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
        org.junit.Assert.assertNotNull(gamePlaceList11);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2266");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 743);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12 M" + "'", str1, "12 M");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2267");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1561), 30, 200, (int) (byte) 10, 40, (int) ' ');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("45 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 45 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2269");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(103, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2270");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = subject0.new GameConfiguration(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2271");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Ja", "#         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2272");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2273");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0002-10-01", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2274");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(71, byteArray1, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2275");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2276");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2277");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(45, 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2278");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(63, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2279");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(388);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2280");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2281");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 25)", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 25)" + "'", str3, "(0, 25)");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2282");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(95);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2283");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        java.lang.String str10 = gamePlace9.toString();
        java.lang.String str11 = gamePlace9.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(97, 10)" + "'", str10, "(97, 10)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2284");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-10-01" + "'", str2, "0000-10-01");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2285");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        int[] intArray9 = gameConfiguration7.countPiecesPerPlayer();
        int int10 = gameConfiguration7.getSize();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = gameConfiguration7.getPlayerAt(gamePlace11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlace.x()\" because \"place\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2286");
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
        java.lang.Object obj13 = null;
        boolean boolean14 = gamePlayer2.equals(obj13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10 S                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10 S                                                                                                ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2288");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        int int6 = gamePlace5.x();
        int int7 = gamePlace5.x();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject8.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject8.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = subject8.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList14 = gameConfiguration13.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = gameConfiguration13.clone();
        boolean boolean16 = gamePlace5.equals((java.lang.Object) gameConfiguration15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 62 + "'", int7 == 62);
        org.junit.Assert.assertNotNull(gamePlaceList14);
        org.junit.Assert.assertNotNull(gameConfiguration15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2289");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1 Y");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2290");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        boolean boolean11 = gameConfiguration10.isBoardFull();
        int int12 = gameConfiguration10.getSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2291");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("36 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2292");
        char[] charArray10 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("36 S", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1st" + "'", str11, "1st");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(inva" + "'", str12, "(inva");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Ga" + "'", str13, "Ga");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "36 " + "'", str14, "36 ");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2293");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214221, 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2294");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, 44444410, 0, 109);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2295");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444763, (-1561), 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2296");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10 S                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2297");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 36, 360);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2298");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(364);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2299");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, 0, 477214195, 0, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2300");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace11.x((int) 'a');
        boolean boolean15 = gamePlace11.equals((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer16 = gameConfiguration5.getPlayerAt(gamePlace11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2301");
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
        gamePlayer18.addScore(100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2302");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        gameConfiguration7.clearInitialBoard();
        gameConfiguration7.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList12 = gameConfiguration7.getPlacesOfPlayer(gamePlayer11);
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer15 = subject13.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = subject13.new GamePlace(62, 1);
        int int19 = gamePlace18.x();
        gamePlace18.y((int) (short) 0);
        int int22 = gamePlace18.x();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer23 = gameConfiguration7.getPlayerAt(gamePlace18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Place is out of bounds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 62 + "'", int19 == 62);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 62 + "'", int22 == 62);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2303");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0194-10-01", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0194-10-01" + "'", str3, "0194-10-01");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2304");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        gamePlace5.x((int) (short) 1);
        gamePlace5.y((int) (short) -1);
        gamePlace5.y((int) (short) 1);
        gamePlace5.x(44444045);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2305");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(364, 743, 104, (int) '4', 109, 477214308);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2306");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(194);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2307");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("7 M", "(35, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2308");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(120, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2309");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444329, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2310");
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
        boolean boolean12 = gameConfiguration9.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2311");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(95);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2312");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray9, 2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(363, byteArray9, 44444480);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444480 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2313");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444763, 477214215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2314");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration9.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2315");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0052-01-01", "44444410 S", "(97, 141)", "GamePlayer{name='(10, 10)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2317");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(52, ###############################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2318");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477214308, 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2319");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2320");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0071-01-31", "4(97, 141)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2321");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("36 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[36, 0, 0, 0]");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2322");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("1st ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[1, 0, 0, 0]");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2323");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) 1, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2324");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(63, 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2325");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0097-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2326");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("6 M");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2327");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 365, 50, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2328");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 44444045, 366, 50, 477214221, 743);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2329");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, 44444763, 40, (int) 'a', (-1561), 407);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2330");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("0052-01-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = gamePlayer5.clone();
        org.junit.Assert.assertNotNull(gamePlayer6);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2331");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2332");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-1, 44444410)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2333");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0095-01-31", "10th Feb 0", "Anonymous Player", "31 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2335");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(194);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2336");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(30, 366, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2337");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(32, 44444403)", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(32, 44444403)" + "'", str3, "(32, 44444403)");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-2147483648-10-01', score=-1}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-2147483648-10-01', score=-1}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2339");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 30, 388);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2340");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2341");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        java.lang.String str8 = gamePlayer7.toString();
        java.lang.String str9 = gamePlayer7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GamePlayer{name='(10, 10)', score=0}" + "'", str8, "GamePlayer{name='(10, 10)', score=0}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(10, 10)" + "'", str9, "(10, 10)");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2342");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(102, 44444410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2343");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(141, 44, 382, 477214179, (int) (short) 10, 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2344");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        boolean boolean7 = gamePlayer2.equals((java.lang.Object) "#######1st");
        int int8 = gamePlayer2.getScore();
        gamePlayer2.resetScore();
        java.lang.String str10 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-2147483648-10-01" + "'", str10, "-2147483648-10-01");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2345");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(382, 77, 0, 44444329, 84, 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2346");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(407, 71, (int) (short) 0, 382, 87, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2347");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        boolean boolean8 = gameConfiguration7.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        int[] intArray10 = gameConfiguration7.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2348");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1 Y", "(0, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2349");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray8, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 25 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2350");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 S", "(32, 44444403)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2351");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=97}", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=97}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=97}");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2352");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2353");
        char[] charArray8 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " " + "'", str10, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01" + "'", str11, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2354");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44444410);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 Y" + "'", str1, "1 Y");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2355");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Oct", "32 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2356");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#################################################################################################hi!", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################hi!" + "'", str3, "#################################################################################################hi!");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2357");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(103);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2358");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 36, (int) '4', (int) (byte) -1, 365, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 0, 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2360");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("10th Feb 0");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2361");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(52, 25)##");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2362");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(45, 44444480, 1, (int) (short) 1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2363");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore((int) (short) -1);
        gamePlayer2.resetScore();
        int int7 = gamePlayer2.getScore();
        java.lang.String str8 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2364");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("##########################################################################################0032-01-01", "4(97, 141)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2365");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(89, 25)############################################################################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2366");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(433);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2367");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(388, 36, 363, 84, (int) 'a', 382);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2368");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(743);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2369");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(97, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2370");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4 S                                                                                                 ", "(invalid)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2371");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(84, 44444480, (int) (byte) 10, 84);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2372");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(4, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2373");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44444763);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2374");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='', score=0}", "0052-01-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2375");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(97, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2376");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, 97)", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 97)   " + "'", str3, "(0, 97)   ");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2377");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0000-02-29", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-02-29" + "'", str3, "0000-02-29");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2378");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (int) (byte) 100, 44444480, 356, 63, (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2379");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2380");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444410, byteArray8, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2381");
        char[] charArray8 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='0032-01-01', score=0}", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4(97, 141)", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ga" + "'", str10, "Ga");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4(97, " + "'", str11, "4(97, ");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2382");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("2nd", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2nd" + "'", str3, "2nd");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2383");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(433);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2384");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(44444045);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2385");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(inva", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(inva" + "'", str3, "(inva");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2386");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("##################################################################################################2 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2387");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0095-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[95, 0, 0, 0]");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2388");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(388, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2389");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2390");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("Ja");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2391");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10th', score=97}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2392");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0000-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2393");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(407, 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2394");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44, 388, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2395");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, ", "(89, 25)############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2396");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(87, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2397");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='(10, 10)', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2398");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-1561), (int) (short) 10, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2399");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("##################################################################################################2 ", "(32, 44444403)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2400");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=84}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2401");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2402");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((-2147483648), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2403");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44, 62, 109);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2404");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(477214308);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2405");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(35, -1)", "1st       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2406");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        int int8 = gameConfiguration5.getSize();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2407");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(62, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2408");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(89, 2, 30, 35, 365, 63);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 10)", "(71, 366)a", "aaaaaaaaaa", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2410");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration7.getPlayers();
        int int10 = gameConfiguration7.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray11 = gameConfiguration7.getInitialBoard();
        gameConfiguration7.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2411");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                          0100-01-01", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0100-01-01" + "'", str3, "                                                                                          0100-01-01");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2412");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 141)", "0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2413");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        int int10 = gamePlace3.y();
        java.lang.String str11 = gamePlace3.toString();
        java.lang.String str12 = gamePlace3.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(97, 10)" + "'", str12, "(97, 10)");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2414");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2415");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(2, 52, 477214308, 388, 0, 477218588);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2416");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2417");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("4444444hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[4444444, 0, 0, 0]");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, ", "", "0360-10-31", "31st");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2419");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444763, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2420");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        gamePlayer8.setScore(0);
        gamePlayer8.setScore(390);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2421");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(388);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2422");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(151, 433);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2423");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2424");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44444480);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2425");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, 102, 477214195);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2426");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(356, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2427");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2428");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477214195, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2429");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("25th", "(71, 366)a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2430");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ja");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2431");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-1), byteArray3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2432");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=10}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2433");
        char[] charArray15 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray15);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray15);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray15);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray15);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray15);
        java.lang.String str21 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='-2147483648-10-01', score=10}", charArray15);
        java.lang.String str22 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray15);
        java.lang.String str23 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray15);
        java.lang.String str24 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(97, 141)", charArray15);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(97, " + "'", str24, "(97, ");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2434");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, 477214179);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2435");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1st       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2436");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        gamePlayer1.addScore(100);
        gamePlayer1.resetScore();
        java.lang.String str5 = gamePlayer1.getName();
        gamePlayer1.addScore(44444403);
        gamePlayer1.addScore(360);
        java.lang.String str10 = gamePlayer1.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Anonymous Player" + "'", str5, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Anonymous Player" + "'", str10, "Anonymous Player");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2437");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2438");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "-2147483648 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2439");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(inva", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-31##########################################################################################", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Ja", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-214" + "'", str14, "-214");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0001-01-31#" + "'", str16, "0001-01-31#");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ja" + "'", str18, "Ja");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2440");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(186, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2441");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214308, 35, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2442");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444763, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("                                                                                          0032-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2444");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(104, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2445");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(89, 25)############################################################################################", "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2446");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(103, (-2147483648), 477214308);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2447");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2448");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        int[] intArray8 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2449");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(89, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0089-01-01" + "'", str2, "0089-01-01");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2450");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2451");
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
        java.lang.String str26 = gamePlace8.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace27 = gamePlace8.clone();
        java.lang.String str28 = gamePlace27.toString();
        gamePlace27.x((int) ' ');
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, 0)" + "'", str26, "(0, 0)");
        org.junit.Assert.assertNotNull(gamePlace27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0, 0)" + "'", str28, "(0, 0)");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2452");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214308, 97, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2453");
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
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2454");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(62, 52)", "(35, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2455");
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray11, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray11, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(61, byteArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 10, byteArray11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2456");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0002-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2457");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        gamePlayer2.resetScore();
        java.lang.String str8 = gamePlayer2.getName();
        int int9 = gamePlayer2.getScore();
        java.lang.String str10 = gamePlayer2.getName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-2147483648-10-01" + "'", str10, "-2147483648-10-01");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2458");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(365, 433, (int) (short) 10, 25, 31, 25);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2459");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        java.lang.String str4 = gamePlayer3.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = gamePlayer3.clone();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='                                                                                          0100-01-01', score=0}" + "'", str4, "GamePlayer{name='                                                                                          0100-01-01', score=0}");
        org.junit.Assert.assertNotNull(gamePlayer5);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2460");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444403, 44444763);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2461");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0360-10-31", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################0360-10-31" + "'", str3, "##########################################################################################0360-10-31");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2462");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44444480, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2463");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) -1, 200, 365, 433, 44444045, 35);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2464");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(477218588);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2465");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 477214308, 477214221, (int) (byte) 100, 0, (-2147483648));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2466");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(366, 743);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2467");
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
        gamePlace3.x((int) ' ');
        gamePlace3.y(44444403);
        comp5111.assignment.cut.Subject.GamePlace gamePlace24 = gamePlace3.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-2147483648-10-01" + "'", str13, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gamePlace24);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2468");
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
        gamePlace17.y(366);
        org.junit.Assert.assertNotNull(gamePlace8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2469");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0032-02-29", "GamePlayer{name='(62, 1)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2470");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(388, 477214179, 30, 433, 45, 120);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2471");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer("0035-10-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer9.clone();
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2472");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace((int) (short) 1, 62);
        gamePlace5.x(61);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2473");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444045, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444045-02-01" + "'", str2, "44444045-02-01");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2474");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 0, 194);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2475");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(364, 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2476");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(103, 44444329, (int) (byte) 1, 0, 36, 104);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2477");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0052-01-01", "GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2478");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(62, 44444045);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2479");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2480");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        gameConfiguration5.clearInitialBoard();
        gameConfiguration5.clearInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2481");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(103);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2482");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(43, 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2483");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 186);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2484");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-2147483648-10-01', score=84}", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2485");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(366, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2486");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, 44444410, 390, (int) (byte) 0, 45, 61);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2487");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2488");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 63, 477214308, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2489");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("(10, 10)");
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace11.x((int) 'a');
        int int14 = gamePlace11.y();
        int int15 = gamePlace11.x();
        gamePlace11.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace11.clone();
        java.lang.Object obj19 = null;
        boolean boolean20 = gamePlace11.equals(obj19);
        int int21 = gamePlace11.x();
        boolean boolean22 = gamePlayer7.equals((java.lang.Object) gamePlace11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2490");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        gamePlayer2.addScore((int) 'a');
        java.lang.String str5 = gamePlayer2.toString();
        gamePlayer2.addScore(390);
        gamePlayer2.resetScore();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='#######1st', score=97}" + "'", str5, "GamePlayer{name='#######1st', score=97}");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2491");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(84);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2492");
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
        comp5111.assignment.cut.Subject subject13 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer15 = subject13.new GamePlayer("-2147483648-10-01");
        int int16 = gamePlayer15.getScore();
        int int17 = gamePlayer15.getScore();
        gamePlayer15.setScore((int) (byte) 0);
        gamePlayer15.resetScore();
        java.lang.String str21 = gamePlayer15.getName();
        int int22 = gamePlayer15.getScore();
        java.lang.String str23 = gamePlayer15.toString();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList24 = gameConfiguration5.getPlacesOfPlayer(gamePlayer15);
        comp5111.assignment.cut.Subject subject25 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = subject25.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace30 = subject25.new GamePlace(62, 1);
        java.lang.String str31 = gamePlace30.toString();
        java.lang.String str32 = gamePlace30.toString();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer33 = gameConfiguration5.getPlayerAt(gamePlace30);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-2147483648-10-01" + "'", str21, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=0}" + "'", str23, "GamePlayer{name='-2147483648-10-01', score=0}");
        org.junit.Assert.assertNotNull(gamePlaceList24);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "(62, 1)" + "'", str31, "(62, 1)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(62, 1)" + "'", str32, "(62, 1)");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2493");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='Anonymous Player', score=36}", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=36}" + "'", str3, "GamePlayer{name='Anonymous Player', score=36}");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2494");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("################################################################################################31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2495");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='Anonymous Player', score=0}", "0097-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2496");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 97)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 97)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2497");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2498");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(200, 433, 103, (int) (short) 0, 363, 102);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2499");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-1, 52)");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test4.test2500");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        int int10 = gamePlace3.y();
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace14.x((int) 'a');
        gamePlace14.x((int) (byte) 10);
        gamePlace14.y(2);
        boolean boolean21 = gamePlace3.equals((java.lang.Object) gamePlace14);
        java.lang.String str22 = gamePlace14.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(10, 2)" + "'", str22, "(10, 2)");
    }
}

