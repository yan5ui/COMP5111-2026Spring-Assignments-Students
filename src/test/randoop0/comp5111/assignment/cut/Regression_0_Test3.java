package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1501");
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
        gamePlayer18.resetScore();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Anonymous Player" + "'", str20, "Anonymous Player");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1502");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(1, 35, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1503");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1504");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 Y");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1505");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(52, 363);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1506");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1507");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-1), 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1508");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(365, (int) (short) 100, 0, 433);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1509");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray9, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483648 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1510");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (short) -1, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1511");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, (int) (byte) 1, 194);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1512");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0004-04-01", "(1, 365)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0089-10-01", "GamePlayer{name='-2147483648-10-01', score=10}", "0001-01-31#", "##########################################################################################0032-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1514");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(31, 10)", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1515");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1516");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0100-10-01", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-10-01" + "'", str3, "0100-10-01");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1517");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(89, 44444403);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1518");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 109, (-1561));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1519");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(71, 356)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1520");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(477214179, (int) (byte) 1, (int) (byte) 1, 194);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1521");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 1, 477214179, (-2147483648), (int) (short) 1, 44444410, 477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1522");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("36 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1523");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("36 S", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 S" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa36 S");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1524");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0002-10-01" + "'", str2, "0002-10-01");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1525");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(31, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1526");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(61, 366, 2, 0, 100, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1527");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("25 S", "477214179-10-31", "GamePlayer{name='(1, 365)', score=0}", "(31, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1528");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 S", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S                                                                                                " + "'", str3, "10 S                                                                                                ");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1529");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 4, 100, 100, (-1561), (int) (short) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1530");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44, byteArray6, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 43 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100]");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1531");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaa31st", "31 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1532");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 1, 45, 141, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1533");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(97, 141)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1534");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1535");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214179, 477214179);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(52, 25)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (52, 25)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1537");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-01-01", "-1 S", "0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0100-04-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1539");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1540");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1541");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(36, 25, 366, 363);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1542");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 25)", "                                                                                                    ", "2nd", "10th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1544");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, ", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "(1, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1545");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject subject3 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer4 = subject3.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject3.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = subject3.new GameConfiguration(25);
        int int9 = gameConfiguration8.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray11 = gameConfiguration8.getPlayers();
        boolean boolean12 = gameConfiguration8.isBoardSymmetric();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration13 = gameConfiguration8.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray14 = gameConfiguration8.getPlayers();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = subject0.new GameConfiguration(360, gamePlayerArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(gameConfiguration13);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1546");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 M", "2 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1547");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1548");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-1, 52)", (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 52)############################################################################################" + "'", str3, "(-1, 52)############################################################################################");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1549");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(109);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0002-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1551");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(95, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10thaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10thaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1553");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) -1, byteArray3, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1554");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("25th", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"<local3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1555");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer27 = gamePlayer2.clone();
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
        org.junit.Assert.assertNotNull(gamePlayer27);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1556");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(477214179);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1557");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(109, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0109-01-01" + "'", str2, "0109-01-01");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1558");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 M", "4 S", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01", "GamePlayer{name='-2147483648-10-01', score=10}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1559");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(122, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1560");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(25, 100, 109, (-1561), (int) '4', 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1561");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0366-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1562");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10th Feb 62", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "GamePlayer{name='10th', score=97}", "0001-01-01", "25th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1564");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(61, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1565");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444410, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1566");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(71, #####", "0000-02-29");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1567");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[477214179, 0, 0, 0]");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1568");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1569");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1570");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4444444hi!", "(100, 1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1571");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        gamePlayer2.addScore((int) ' ');
        int int9 = gamePlayer2.getScore();
        java.lang.String str10 = gamePlayer2.toString();
        int int11 = gamePlayer2.getScore();
        gamePlayer2.setScore((-1561));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 84 + "'", int9 == 84);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=84}" + "'", str10, "GamePlayer{name='-2147483648-10-01', score=84}");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 84 + "'", int11 == 84);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1572");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1573");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 1, 45, 84, 356, 31, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1574");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 1, 0, 200, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1575");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0032-02-29", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0032-02-29" + "'", str3, "0032-02-29");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1576");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(365, 44444410, 44, 141);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("############################################################################################(35, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ############################################################################################(35, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1578");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "45 S" + "'", str1, "45 S");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1579");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(356, 2, 122, (int) (short) 100, 356, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1580");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(25, 44, 50, 45);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1581");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("                                                                                                -214", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                -214" + "'", str3, "                                                                                                -214");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1582");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 84, 365, 365);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1583");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0097-10-01444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "10 S                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1584");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        comp5111.assignment.cut.Subject subject9 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = subject9.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace12.x((int) 'a');
        int int15 = gamePlace12.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace16 = gamePlace12.clone();
        comp5111.assignment.cut.Subject subject17 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer19 = subject17.new GamePlayer("-2147483648-10-01");
        int int20 = gamePlayer19.getScore();
        int int21 = gamePlayer19.getScore();
        java.lang.String str22 = gamePlayer19.getName();
        int int23 = gamePlayer19.getScore();
        gamePlayer19.addScore(31);
        gamePlayer19.addScore((int) (byte) 100);
        boolean boolean28 = gamePlace12.equals((java.lang.Object) gamePlayer19);
        comp5111.assignment.cut.Subject.GamePlace gamePlace29 = null;
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration8.addInitialPiece(gamePlayer19, gamePlace29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: the player of the piece is unknown");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(gamePlace16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-2147483648-10-01" + "'", str22, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1585");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore(31);
        java.lang.String str9 = gamePlayer2.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-2147483648-10-01" + "'", str9, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1586");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01', score=31}", (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=31}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=31}");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1587");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[477214244, 0, 0, 0]");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1588");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='#######1st', score=97}", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='#######1st', score=97}" + "'", str3, "GamePlayer{name='#######1st', score=97}");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-04-01", "0052-01-31", "1 ", " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1590");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(356, 1, 366, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120 + "'", int4 == 120);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1591");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '4', byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray9, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 61 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1592");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(43, 477214221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0000-02-29", "(52, 25)", "GamePlayer{name='-2147483648-10-01', score=131}", "10th Feb 62");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1594");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 477214179);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "15 Y" + "'", str1, "15 Y");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1595");
        char[] charArray13 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(71, ", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 141)", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(62, " + "'", str16, "(62, ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " " + "'", str17, " ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4" + "'", str18, "4");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(71, " + "'", str19, "(71, ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0, " + "'", str20, "(0, ");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1596");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(356, 63, 365, 366, 390, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1597");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1598");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1599");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0 S", "0004-04-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1600");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0100-04-01", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-04-01" + "'", str3, "0100-04-01");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1601");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44, 63, 4, 25);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1602");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477214221);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1603");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(363, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1604");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(141, (-1), 364);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1605");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        gamePlayer2.resetScore();
        java.lang.String str8 = gamePlayer2.getName();
        int int9 = gamePlayer2.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1606");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(194, 44444403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1607");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        boolean boolean7 = gameConfiguration5.isBoardSymmetric();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        boolean boolean9 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1608");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10 S                                                                                                ", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10 S                                                                                                " + "'", str3, "10 S                                                                                                ");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1609");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st", "(62, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1610");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(95);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1611");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(0, ", (short) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, " + "'", str3, "(0, ");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1612");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(95, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0095-01-31" + "'", str2, "0095-01-31");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1613");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(477214221, byteArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 1 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1614");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(43, 31, (int) (byte) 0, 0, 477214179, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1615");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 141);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44, 63, 63, 89, 141, 141);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1617");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(104, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1618");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(109, byteArray4, 360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 360 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1619");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1 ", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  1 " + "'", str3, "                                                                                                  1 ");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1620");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(1, 444444", "(1, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1621");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=10}", "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1622");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Oct" + "'", str1, "Oct");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1623");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-1, 52)############################################################################################", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 52)############################################################################################" + "'", str3, "(-1, 52)############################################################################################");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1624");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("31st", "45 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1625");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1626");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0000-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1627");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:           ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1629");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 194);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1630");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(10, ", "(100, 10)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1631");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 1, 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1632");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Ga");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1633");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-04-30" + "'", str2, "0000-04-30");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1634");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(71, 104, 390, 36, 2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1635");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 100, 50, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1636");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 10, (-2147483648), 122, (int) (short) 100, (int) '#', 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1637");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(61, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1638");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration6.getInitialBoard();
        java.lang.Class<?> wildcardClass8 = gamePlayerArray7.getClass();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1639");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("1st", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st" + "'", str3, "1st");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1640");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-2147483648-10-01', score=1}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1641");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("10th Feb 0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1642");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}" + "'", str3, "GamePlayer{name='-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa', score=0}");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1643");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore(31);
        gamePlayer2.addScore((int) (byte) 100);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gamePlayer11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1644");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(109, 120, 10, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1645");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1646");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 477214221, 97, (int) (byte) 100, (int) (short) 1, 364);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(71, 366)a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (71, 366)a");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1648");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(141, 477214195);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1649");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1650");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(95, 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1651");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(97, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (97, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1652");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, ", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1 Y", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(10, " + "'", str14, "(10, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 " + "'", str15, "1 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-214" + "'", str16, "-214");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1653");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1654");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0035-10-01", "52 Saaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1655");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1, (int) '#', 62, 61, 356, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1656");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, (int) (byte) 10, (int) '4', 0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1657");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, (int) (byte) 1, 407, 4, 32, 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1658");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(44);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1659");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-01-31" + "'", str2, "0000-01-31");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1660");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("6 M", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0052-01-31", "0360-10-31", "2nd", "#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1662");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0052-04-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1663");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("52 Saaaaaa", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52 Saaaaaa" + "'", str3, "52 Saaaaaa");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1664");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0360-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 360 + "'", int1 == 360);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1665");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(0, 0);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration11 = subject0.new GameConfiguration(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1666");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(35, ', score=10}", "(1, 444444", "(62, 1)", "6 M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1667");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(32, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1668");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 31, 44444403, 141);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1669");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}", "GamePlayer{name='Anonymous Player', score=104}", "(52, 25)", "Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1671");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(97, ", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, " + "'", str3, "(97, ");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1672");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, ", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1 Y", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 10)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(10, " + "'", str14, "(10, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 " + "'", str15, "1 ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, " + "'", str16, "(100, ");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1673");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray8, 122);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 122 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1674");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1675");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1676");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 97)", "", "(71, #####", "(97, 141)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1677");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(141, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0141-02-28" + "'", str2, "0141-02-28");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1678");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(61, 61, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1679");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(10, ", "(35, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1680");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10th', score=35}", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='10th', score=35}" + "'", str3, "GamePlayer{name='10th', score=35}");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1681");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        int int8 = gameConfiguration5.getSize();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1682");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1684");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1685");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st", "-214");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1686");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("25 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[25, 0, 0, 0]");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1687");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1688");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("477214179-10-31", "(10, ", "(100, ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1689");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0141-02-28", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0141-02-28" + "'", str3, "0141-02-28");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1690");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1691");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 84);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1692");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-10-31", "4 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1693");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1694");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray8, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1695");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 477214221);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1696");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(382, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("36 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 36 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1698");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("hi!                                                                                                 ", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1699");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        boolean boolean8 = gamePlace3.equals((java.lang.Object) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = gamePlace3.clone();
        gamePlace9.y((int) (short) 10);
        int int12 = gamePlace9.y();
        java.lang.Class<?> wildcardClass13 = gamePlace9.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1700");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration6.getEmptyPlaces();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlaceList7);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1701");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = null;
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getPlacesOfPlayer(gamePlayer9);
        int[] intArray11 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0]");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1702");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaa31st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaa31st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1703");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(71, 89, 0, 71);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1704");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(407, 477214221, (int) (short) 10, 87, 109, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1705");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(35, ", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, " + "'", str3, "(35, ");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1706");
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
        java.lang.String str26 = gamePlace25.toString();
        java.lang.Class<?> wildcardClass27 = gamePlace25.getClass();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(62, 1)" + "'", str26, "(62, 1)");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1707");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(45, 477214221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1708");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 84, 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1709");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(194, 61, 45, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1710");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("2nd", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 52)", "0097-10-014", "(71, 25)", "GamePlayer{name='(62, 1)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(87, 35, 35, 44444410, (int) (short) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1714");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        gamePlace5.x((int) (short) 1);
        gamePlace5.y((int) (short) -1);
        gamePlace5.y((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = gamePlace5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa(31, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1716");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1717");
        char[] charArray13 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-214", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-01", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4444444hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-214" + "'", str18, "-214");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0001-01-01" + "'", str19, "0001-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4" + "'", str20, "4");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1718");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0001-01-31##########################################################################################", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31##########################################################################################" + "'", str3, "0001-01-31##########################################################################################");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1719");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 122, 25, (int) '#', (int) '4', 433);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1720");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        boolean boolean7 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1721");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-1561));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1561 S" + "'", str1, "-1561 S");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1722");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1723");
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
        gamePlayer2.resetScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 89 + "'", int10 == 89);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1724");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', 477214195);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0095-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1726");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 0, 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1727");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='', score=0}", "10 S                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1728");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0194-10-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1729");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(43);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0001-02-28");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1731");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01', score=10}", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=10}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=10}");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1732");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("25th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(97, 141)", "31 S", "                                                                                                  1 ", "0032-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1734");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(194, 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1735");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0035-10-01", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0035-10-01" + "'", str3, "0035-10-01");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1736");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(63, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1737");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444403, (int) '4', 433);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("1 M");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1 M");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1739");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        int int7 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) (short) -1);
        java.lang.Object obj10 = null;
        boolean boolean11 = gamePlayer2.equals(obj10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1740");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(31, 10)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1741");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore(366);
        gamePlayer2.addScore((int) (byte) 0);
        java.lang.String str8 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01" + "'", str8, "-2147483648-10-01");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1742");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, 10)", "0001-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1743");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0366-01-31", "GamePlayer{name='#######1st', score=97}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1744");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(95);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1745");
        char[] charArray9 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(1, ", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0052-01-01" + "'", str11, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(1, " + "'", str12, "(1, ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52 " + "'", str13, "52 ");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1746");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(95, -1)", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(95, -1)" + "'", str3, "(95, -1)");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1747");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='                                                                                          0100-01-01', score=0}", "", "GamePlayer{name='                                                                                          0100-01-01', score=0}", "#");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "(1, ", "0032-02-29", "(71, 366)a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1749");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 356)", "4444444hi!", "(0, ", "-2147483648 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1750");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(71, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0071-01-31" + "'", str2, "0071-01-31");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Anonymous Player");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Anonymous Player");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 366)a", "0001-02-28", "(0, 0)", "6 M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1753");
        byte[] byteArray5 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray5, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-2147483648), byteArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(433, byteArray5, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 109 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[]");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1754");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1755");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0032-01-01", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0032-01-01" + "'", str3, "0032-01-01");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1756");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(407, 360, 382, 45, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1758");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("44444410 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[44444410, 0, 0, 0]");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1759");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(inva", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(71, 366)", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 1)", charArray11);
        java.lang.Class<?> wildcardClass17 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-214" + "'", str13, "-214");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(inva" + "'", str14, "(inva");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(71, " + "'", str15, "(71, ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(100, " + "'", str16, "(100, ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1760");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("25 S", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25 S" + "'", str3, "25 S");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1761");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(44444403, (int) '4', 366, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1762");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0100-01-31", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0100-01-31" + "'", str3, "0100-01-31");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1763");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("2 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1764");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477214195);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1765");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray9, 2);
        java.lang.Class<?> wildcardClass16 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1766");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaa31st");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("44444410 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444410 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1768");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("#######1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1769");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 71);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1770");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        int[] intArray9 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1771");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, 365, 365, 433, 35, 120);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1772");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(52, 25)", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 25)##" + "'", str3, "(52, 25)##");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1773");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(95, 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1774");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444410, (int) (byte) 0, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1775");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440100-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1776");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1777");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0052-04-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1778");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(141, 382, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1779");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-1561 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlayer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1780");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 141)", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 141)" + "'", str3, "(0, 141)");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1781");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(10, 390, 0, (int) (byte) 1, 62, 45);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1782");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444410, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1783");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = gameConfiguration5.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList10 = gameConfiguration5.getEmptyPlaces();
        boolean boolean11 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertNotNull(gamePlaceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1784");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(1, 444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1785");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("Jan");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1786");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("7 M", "a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1787");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = gameConfiguration5.getPlayers();
        int[] intArray9 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean10 = gameConfiguration5.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1788");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1789");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 0, 44444403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1790");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-1), 433);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1791");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0000-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1792");
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
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 25 + "'", int9 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1793");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214179, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1794");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(10, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1795");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) (short) -1, 10);
        gamePlace6.y(71);
        java.lang.Class<?> wildcardClass9 = gamePlace6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1796");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 382, 433, (int) '4', (int) (short) -1, 360);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1797");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='', score=142}", "0071-01-31", "(1, ", "GamePlayer{name='                                                                                          0100-01-01', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1799");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(104, 95, 477214221, 364);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1800");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(365, (int) (byte) -1, (int) (short) 1, (-2147483648));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1801");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(100, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1802");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', 477214221, 44444403);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1803");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 44, 104, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1804");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("##########################################################################################0032-01-01", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################0032-01-01" + "'", str3, "##########################################################################################0032-01-01");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1805");
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
        comp5111.assignment.cut.Subject subject12 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace15 = subject12.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace15.x((int) 'a');
        int int18 = gamePlace15.y();
        int int19 = gamePlace15.x();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlayer gamePlayer20 = gameConfiguration11.getPlayerAt(gamePlace15);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1806");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject subject6 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject6.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace9.x((int) 'a');
        int int12 = gamePlace9.y();
        int int13 = gamePlace9.x();
        gamePlace9.x(0);
        int int16 = gamePlace5.manhattanDistance(gamePlace9);
        int int17 = gamePlace9.y();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1807");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 477214179, (int) (short) 100, 63);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1808");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0089-10-01", "25th                                                                                                ", "GamePlayer{name='(35, 10)', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1809");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0032-02-29", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0032-02-29" + "'", str3, "                                                                                          0032-02-29");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0141-02-28", "(10, 10)", "hi!                                                                                                 ", "0100-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 0)", "(71, #####", "0100-04-01", "1st ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1812");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(109, 31, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1813");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(200, 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1814");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 0, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-02-01" + "'", str2, "0000-02-01");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1815");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1816");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", "GamePlayer{name='10th', score=35}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1817");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1818");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(25, 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1819");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#################################################################################################hi!", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################hi!" + "'", str3, "#################################################################################################hi!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1820");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(363, (int) (short) 100, 433);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1821");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        java.lang.String str7 = gamePlace5.toString();
        int int8 = gamePlace5.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(62, 1)" + "'", str7, "(62, 1)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1822");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("                                                                                          0100-01-01", (short) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          0100-01-01" + "'", str3, "                                                                                          0100-01-01");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1823");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(366, 194);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1824");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(10, 365, 477214179, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1825");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 0, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-02-01" + "'", str2, "0000-02-01");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1826");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1st Feb 0", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1st Feb 0" + "'", str3, "1st Feb 0");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1827");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477214195);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1828");
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
        int[] intArray13 = gameConfiguration12.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertNotNull(gameConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 25 + "'", int10 == 25);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1829");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(71, (int) (byte) 100, 382, 390);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1830");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(363);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1831");
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
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer20 = gamePlayer18.clone();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gamePlayer20);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1832");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1833");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("##########################################################################################0032-01-01", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(52, 25)", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(inva" + "'", str13, "(inva");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#" + "'", str15, "#");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(52, " + "'", str16, "(52, ");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1834");
        char[] charArray8 = new char[] { 'a', ' ', 'a', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0052-01-01", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0000-04-30", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a a a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , a,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0052-01-01" + "'", str10, "0052-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0000-04-30" + "'", str11, "0000-04-30");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1835");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = gameConfiguration5.clone();
        gameConfiguration5.clearInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertNotNull(gameConfiguration10);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1836");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 477214179);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1837");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(36, (int) '4', 62, (int) (byte) 1, 407, 36);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1838");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(200, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1839");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10th', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1840");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0109-01-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[109, 0, 0, 0]");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1841");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(363, 10, 84, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1842");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) -1, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1843");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(0, 52, 200, 477214215, (int) 'a', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1844");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace(360, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GamePlace with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1845");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 1, 366, 141, (int) (byte) -1, 194, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1846");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, 89, 30, 366, (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1847");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(366, (-2147483648), 45, 71);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1848");
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray9, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 390 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1849");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 52)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1850");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1851");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", "25th                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1852");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########################################################################################0032-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1853");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2, 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1854");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        java.lang.String str8 = gamePlace7.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = null;
        boolean boolean10 = gamePlace7.isAdjacent(gamePlace9);
        int int11 = gamePlace7.y();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(62, 1)" + "'", str8, "(62, 1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1855");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='Anonymous Player', score=104}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1856");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaa31st", "(97, 141)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1857");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1858");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) -1, 407);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1859");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 382, 382);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1860");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(120, 97, 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1861");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1862");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(382, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1863");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1864");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444410, byteArray1, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1865");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10th Feb 0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1866");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray8, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1867");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(200, 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1868");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(390);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1869");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray6 = gameConfiguration5.getPlayers();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gamePlayerArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1870");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(356);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1871");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44444403, 10, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4th Oct 44444403" + "'", str3, "4th Oct 44444403");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1872");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(inva", "0000-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1873");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(433, (int) (short) 1, 363, 407);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1874");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList7 = gameConfiguration5.getEmptyPlaces();
        int int8 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray9 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 25 + "'", int8 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1875");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0001-01-31##########################################################################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1876");
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
        boolean boolean12 = gameConfiguration10.isBoardSymmetric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1877");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(141, 477214221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1878");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, (-1561));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1879");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(97, 1)", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             (97, 1)" + "'", str3, "                                                                                             (97, 1)");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1880");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1881");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(44444403);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1882");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(356, 194, 104, (int) (short) 100, 356, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1883");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(1, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1884");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("10th", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th" + "'", str3, "10th");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1885");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        int[] intArray7 = gameConfiguration5.countPiecesPerPlayer();
        int[] intArray8 = gameConfiguration5.countPiecesPerPlayer();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0]");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1886");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("4 S", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4 S                                                                                                 " + "'", str3, "4 S                                                                                                 ");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1887");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        gamePlace5.x((int) (short) 1);
        gamePlace5.x(390);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1888");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(109, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1889");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 104, 50, 87, 363, 2);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ", "(52, 25)", "a", "(97, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1891");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(407, 477214195, 200, 30, (-2147483648), 477214215);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1892");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(89, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1893");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, ", "(0, 10)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1894");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44444410, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1895");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 477214215);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "15 Y" + "'", str1, "15 Y");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1896");
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray10, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray10, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444410, byteArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(194, byteArray10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1897");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(477214215);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1898");
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
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray14 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlaceList7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(gameConfiguration10);
        org.junit.Assert.assertNotNull(gamePlayerArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray14);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1899");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                                -214");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1900");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(200, 0, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1901");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1 S", "25th                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1902");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 0, (int) (byte) 10, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(35, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (35, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(35, ", "35 S", "4 S                                                                                                 ", "(1, 365)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1905");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(31, 10)", "0097-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1906");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477214215, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1907");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(109, 61, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1908");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(97, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097-04-30" + "'", str2, "0097-04-30");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1909");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(44444410, (-1561));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1910");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(63, 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1911");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=366}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1912");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(120, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1913");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(44444329, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1914");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(62, 62, 477214215);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10 S", "0004-04-01", "1 Y", "-1561 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1916");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(62, 1)", "0000-02-29");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1917");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(45, 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1918");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='-2147483648-10-01', score=1}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1919");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1st ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1920");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(25, 45, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1921");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(433, 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1922");
        char[] charArray12 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray12);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01", charArray12);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(10, ", charArray12);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 10)", charArray12);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("a", charArray12);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='', score=142}", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1st" + "'", str13, "1st");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-214" + "'", str14, "-214");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(10, " + "'", str15, "(10, ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(0, " + "'", str16, "(0, ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ga" + "'", str18, "Ga");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1923");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        java.lang.String str3 = gamePlayer2.getName();
        gamePlayer2.setScore((int) (short) -1);
        java.lang.String str6 = gamePlayer2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-2147483648-10-01" + "'", str6, "-2147483648-10-01");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1924");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(71, 25)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1925");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214179, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1926");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration7 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = gameConfiguration7.clone();
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList9 = gameConfiguration8.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = null;
        comp5111.assignment.cut.Subject subject11 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject11.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace14.x((int) 'a');
        int int17 = gamePlace14.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace18 = gamePlace14.clone();
        gamePlace14.y(0);
        // The following exception was thrown during execution in test generation
        try {
            gameConfiguration8.addInitialPiece(gamePlayer10, gamePlace14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"comp5111.assignment.cut.Subject$GamePlayer.equals(Object)\" because \"piece\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gameConfiguration7);
        org.junit.Assert.assertNotNull(gameConfiguration8);
        org.junit.Assert.assertNotNull(gamePlaceList9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(gamePlace18);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1927");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(97, 10)", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 10)" + "'", str3, "(97, 10)");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1928");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        gamePlayer2.addScore((int) 'a');
        java.lang.String str5 = gamePlayer2.toString();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = gamePlayer2.clone();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GamePlayer{name='#######1st', score=97}" + "'", str5, "GamePlayer{name='#######1st', score=97}");
        org.junit.Assert.assertNotNull(gamePlayer6);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444329, (int) (short) 1, 0, 364, 194, 360);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1930");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0001-01-31##########################################################################################", "0100-01-31", "6 M", "0366-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1931");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        int int6 = gameConfiguration5.getSize();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray7 = gameConfiguration5.getInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray8 = gameConfiguration5.getInitialBoard();
        boolean boolean9 = gameConfiguration5.isBoardFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 25 + "'", int6 == 25);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertNotNull(gamePlayerArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1932");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 356)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1933");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(477214195);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1934");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0052-01-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1935");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        int int6 = gamePlace5.x();
        int int7 = gamePlace5.x();
        int int8 = gamePlace5.x();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 62 + "'", int6 == 62);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 62 + "'", int7 == 62);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 62 + "'", int8 == 62);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1936");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(100, 1)", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st Feb 0", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0100-10-01" + "'", str9, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                          0100-01-01" + "'", str10, "                                                                                          0100-01-01");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(100, 1)" + "'", str11, "(100, 1)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st Feb 0" + "'", str12, "1st Feb 0");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1937");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("Ga");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(390, 360);
        comp5111.assignment.cut.Subject subject10 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer11 = subject10.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer13 = subject10.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration15 = subject10.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList16 = gameConfiguration15.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray17 = gameConfiguration15.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray18 = gameConfiguration15.getInitialBoard();
        boolean boolean19 = gameConfiguration15.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray20 = gameConfiguration15.getPlayers();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration21 = subject0.new GameConfiguration(104, gamePlayerArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlaceList16);
        org.junit.Assert.assertNotNull(gamePlayerArray17);
        org.junit.Assert.assertNotNull(gamePlayerArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray20);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1938");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(477214215, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1939");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("#", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1940");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(84);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1941");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=31}", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=31}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=31}");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1942");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) -1, byteArray4, 200);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1943");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(0, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1944");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(407);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1945");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, 32, 30, 477214179, (int) '4', 360);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1946");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("                                                                                          0100-01-01");
        int int4 = gamePlayer3.getScore();
        gamePlayer3.setScore(390);
        java.lang.String str7 = gamePlayer3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                          0100-01-01" + "'", str7, "                                                                                          0100-01-01");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1947");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("31st", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################31st" + "'", str3, "################################################################################################31st");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='-2147483648-10-01', score=366}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='-2147483648-10-01', score=366}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1949");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, (int) (short) 0, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1950");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(109, 382);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1951");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("");
        org.junit.Assert.assertNull(intArray1);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1952");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(45, (-1561), 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1953");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) '4', 388, 364, 71, (int) 'a', 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1954");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(390, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1955");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44, (-1561), (int) (byte) 100, 71, (int) 'a', 366);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1956");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(52, 25)##");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1957");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(109, 35, 1, 89, (int) (byte) -1, 364);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1958");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0 S", "GamePlayer{name='10th', score=97}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1959");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0001-01-31", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31" + "'", str3, "0001-01-31");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1960");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(120, 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("52 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 52 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1962");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(inva");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1963");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(62, 477214195, 0, 35, 35, 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1964");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        gamePlayer2.addScore((-2147483648));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer8);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1965");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(363, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1966");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        gamePlayer8.setScore(382);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1967");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(120, 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1968");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648 S", "(35, ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1969");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(200, 477214179);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1970");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477214215);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1971");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='-2147483648-10-01', score=131}", "-214", "############################################################################################(35, 10)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1972");
        char[] charArray13 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray13);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray13);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray13);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0100-10-01", charArray13);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-214", charArray13);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-01-01", charArray13);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1st" + "'", str14, "1st");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(inva" + "'", str15, "(inva");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0100-10-01" + "'", str17, "0100-10-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-214" + "'", str18, "-214");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0001-01-01" + "'", str19, "0001-01-01");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "52 " + "'", str20, "52 ");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1973");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214195, (-1561), (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1974");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214179, 477214221, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1975");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("10 S", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1976");
        byte[] byteArray1 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(200, byteArray1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1977");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 S" + "'", str1, "0 S");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1978");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((-2147483648));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1979");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-1, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1980");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0095-01-31", "                                                                                             (97, 1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1981");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1982");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0000-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1983");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(87, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1984");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        java.util.List<comp5111.assignment.cut.Subject.GamePlace> gamePlaceList6 = gameConfiguration5.getEmptyPlaces();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardFull();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = gameConfiguration5.getPlayers();
        comp5111.assignment.cut.Subject.GamePlayer[][] gamePlayerArray10 = gameConfiguration5.getInitialBoard();
        org.junit.Assert.assertNotNull(gamePlaceList6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlayerArray9);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1985");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(141);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1986");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 10, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1987");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(360, 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1988");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        gamePlace5.x((int) (short) 1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = gamePlace5.clone();
        org.junit.Assert.assertNotNull(gamePlace8);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1989");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(122, 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1990");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0002-10-01", "(31, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1991");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='0100-10-01', score=0}", (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='0100-10-01', score=0}" + "'", str3, "GamePlayer{name='0100-10-01', score=0}");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1992");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("Oct", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######Oct" + "'", str3, "#######Oct");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1993");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(1, ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (1, ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1994");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='Anonymous Player', score=35}", "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1995");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='-2147483648-10-01', score=366}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1996");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(71, 356)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" ", "GamePlayer{name='-2147483648-10-01', score=1}", "0010-01-31", "GamePlayer{name='-2147483648-10-01', score=31}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1998");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("-2147483648 S", "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test1999");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(25);
        comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration6 = gameConfiguration5.clone();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray7 = gameConfiguration5.getPlayers();
        boolean boolean8 = gameConfiguration5.isBoardSymmetric();
        gameConfiguration5.clearInitialBoard();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray10 = gameConfiguration5.getPlayers();
        org.junit.Assert.assertNotNull(gameConfiguration6);
        org.junit.Assert.assertNotNull(gamePlayerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(gamePlayerArray10);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test3.test2000");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(95, 477214215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }
}

