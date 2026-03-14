package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_1_Test9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4501");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(2147483598, 2147483598, 29, 187, 477218678, (-1287));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4502");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(44, 29047, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(90, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (90, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4504");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444#" + "'", str3, "444444444#");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4505");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("#################################################################################################Oct");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4506");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, 444444);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4507");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0003-10-01", (short) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0003-10-01" + "'", str3, "0003-10-01");
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4508");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0030-01-31", "(28, 28)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4509");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4510");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("29th", "GamePlayer{name='Anonymous Player', score=-345}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4511");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 32, 477218678);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4512");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4513");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray5);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4514");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(32, 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4515");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4516");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 91, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4517");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 10, 140, 29047, (int) (short) -1, 3848, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4518");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(62);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4519");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(96, (int) 'a', 28947);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4520");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 122);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st", "GamePlayer{name='Anonymous Player', score=-2}", "29047-02-28", "(90, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4522");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(-3747, 29047)", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                      (-3747, 29047)" + "'", str3, "                                                                                      (-3747, 29047)");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4523");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("1st Jan -1");
        gamePlayer2.setScore(97);
        gamePlayer2.addScore(0);
        gamePlayer2.resetScore();
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4524");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(97, 97)aa", "", "                                                                                                30th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4525");
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray8, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(29, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray8, 366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 366 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, -1, 0, 1]");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4526");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0000-01-01", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4527");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4528");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1287), 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4529");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(100, 9)4");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4530");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(90, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4531");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(35,                                                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4532");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-10-31", charArray10);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='30th', score=35}", charArray10);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0365-01-01                                                                                          ", charArray10);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0010-04-01", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52 S" + "'", str12, "52 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!#######" + "'", str13, "hi!#######");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str14, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str15, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0001-10-31" + "'", str17, "0001-10-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GamePlayer{name='30th', score=35}" + "'", str18, "GamePlayer{name='30th', score=35}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0365-01-01                                                                                          " + "'", str19, "0365-01-01                                                                                          ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0010-04-01" + "'", str20, "0010-04-01");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0030-10-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4534");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(-2147483648, 9)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4535");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(3848, 187, (-1), 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("##########################################################################################0004-09-30", "GamePlayer{name='(10, -1)', score=0}", "(1, 28)", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4537");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-02-28");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4538");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((-2147483648), (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("0004-01-01");
        gamePlayer5.setScore(477218844);
        gamePlayer5.setScore(4);
        gamePlayer5.resetScore();
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4539");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(365, 0, (int) 'a', 142, 97, 2147483598);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4540");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=109}", (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                      GamePlayer{name='Anonymous Player', score=109}" + "'", str3, "                                                      GamePlayer{name='Anonymous Player', score=109}");
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4541");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4542");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(96, 9, 28947);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4543");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(32, 52)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4544");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-02-28", "(32, 52)", "0001-09-30", "(143, 100)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4545");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray11, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(9, byteArray11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4546");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace(10, (int) (short) 100);
        int int5 = gamePlace4.x();
        gamePlace4.y((int) (byte) 1);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        int int15 = gamePlace4.manhattanDistance(gamePlace14);
        gamePlace14.y(477218678);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4547");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(9, 68, 3, (int) (byte) 10, 143, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4548");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(24, 366, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4549");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(187, -345)", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(187, -345)" + "'", str3, "(187, -345)");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4550");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("-2147483648-03-01", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-03-01" + "'", str3, "-2147483648-03-01");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4551");
        char[] charArray7 = new char[] { 'a', '4' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Mar", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-001-01-31", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(28947, 52)", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4" + "'", str9, "4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Ma" + "'", str10, "Ma");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-001-01-31" + "'", str11, "-001-01-31");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(2894" + "'", str12, "(2894");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4552");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1 M", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444441 M" + "'", str3, "44444441 M");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4553");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("3 M");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4554");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-10-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4555");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4 S", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################4 S" + "'", str3, "#################################################################################################4 S");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4556");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(477218588, -1287)", "GamePlayer{name='Anonymous Player', score=-336}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#################################################################################################1st", "2 ", "", "(366, 0)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4558");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(109, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4559");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((-2147483647));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4560");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(10, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='0143-01-31', score=0}                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='0143-01-31', score=0}                                                              ");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4562");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477218678, 477218588, (int) (short) -1, 142, (-2147483647), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4563");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-345, 39)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4564");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44, 97, 143, 477218844, (int) (byte) 0, 52);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4565");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01", "GamePlayer{name='Anonymous Player', score=232}", "", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4566");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477218678, (-2147483647), 140, 140, 142, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4567");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 187, 444444);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4568");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(35, 39, 122, (int) (short) 1, (int) (byte) 0, 91);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4569");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-345), (-345), 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4570");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(3848);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4571");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(41, 0, 32, 9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4572");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        int int3 = gamePlayer1.getScore();
        int int4 = gamePlayer1.getScore();
        int int5 = gamePlayer1.getScore();
        gamePlayer1.addScore((int) '4');
        java.lang.String str8 = gamePlayer1.getName();
        gamePlayer1.addScore((int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Anonymous Player" + "'", str8, "Anonymous Player");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("8 H", "0001-10-01", "0100-10-31", "1st Jan 0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4574");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(18, byteArray11, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray11, (-1287));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1287 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4575");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, 71, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4576");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='31st', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4577");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-3747-04-01", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-3747-04-01" + "'", str3, "-3747-04-01");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4578");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0006-01-01", "GamePlayer{name='31st', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4579");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("0010-10-31");
        gamePlayer8.resetScore();
        gamePlayer8.resetScore();
        int int11 = gamePlayer8.getScore();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4580");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='1st', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4581");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 10, 28947, 29047, 122, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4582");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "GameConfiguration ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4583");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0 S", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 S" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 S");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 S", "          ", "", "(0, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4585");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(3848, 62, (int) (short) 10, 477218678, 0, 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4586");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, 1, (int) '#', (-345));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4587");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("##########################################################################################0004-09-30", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################0004-09-30" + "'", str3, "##########################################################################################0004-09-30");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4588");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(3848, byteArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1]");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4589");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(30, 1)", (short) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(30, 1)" + "'", str3, "(30, 1)");
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4590");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("52 ", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52 " + "'", str3, "52 ");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4591");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(68, 62, (-345), 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4592");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("9th", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(0, 0)", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 S" + "'", str7, "52 S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!#######" + "'", str8, "hi!#######");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9th" + "'", str9, "9th");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(0, 0)" + "'", str10, "(0, 0)");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4593");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, (int) (short) 1, 143, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1596 + "'", int4 == 1596);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4594");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(91, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0091-01-01" + "'", str2, "0091-01-01");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4595");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483648, 9)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(100, 18)", "GamePlayer{name='Anonymous Player', score=52}", "0000-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4596");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 0, (-2147483647), 477218588, 29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4597");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(30, 29047, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4598");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0030-10-31", "-001-01-31", "(100, -2147483648)", "0030-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4599");
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
            System.out.format("%n%s%n", "Regression_1_Test9.test4600");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("3 M", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3 M4444444" + "'", str3, "3 M4444444");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4601");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(90, 30, 44, 140, 9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4602");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 366 + "'", int1 == 366);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4603");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='', score=1}", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='', score=1}" + "'", str3, "GamePlayer{name='', score=1}");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4604");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################" + "'", str3, "####################################################################################################");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4605");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(10, 31)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (10, 31)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4606");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("52 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4607");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0097-10-01", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-10-01" + "'", str3, "0097-10-01");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4608");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("29047-02-28", "(-2147483648, 9)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444GamePlayer{name='0004-09-30', score=143}", "0031-02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4609");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, (int) 'a', 30, 3848);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4610");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("#################################################################################################4 S", "32 Saaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4611");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1596, (int) (byte) 1, 91, 100, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4612");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(1596, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4613");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(365, 140, 6, (-2147483647), 3, 28947);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4614");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) (byte) -1, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4615");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray6);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray9 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray7);
        java.lang.String[] strArray10 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray9);
        java.lang.String[] strArray11 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray12 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray13 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray10);
        java.lang.String[] strArray14 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
        java.lang.String[] strArray15 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray13);
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
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4616");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-2147483648), (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Oct -2147483648" + "'", str3, "10th Oct -2147483648");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4617");
        char[] charArray2 = new char[] {};
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray2);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='31st', score=97}", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GamePlayer{name='31st', score=97}" + "'", str4, "GamePlayer{name='31st', score=97}");
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4618");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("28th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4619");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(9, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4620");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("#################################################################################################9th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4621");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0000-04-01");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4622");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2 S", (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 S" + "'", str3, "2 S");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4623");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(366, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4624");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) '#', 477218588, 96, 477218678, (int) (short) 100, 6);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4625");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 4);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(68, byteArray7, 2147483598);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2147483598 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1]");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "                                                                                          0004-10-31", "(97, 32)", "10th Oct -387");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4627");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-3747), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4628");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(75, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4629");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray8);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("9th4444444", charArray8);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray8);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th Oct -387", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52 S" + "'", str10, "52 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!#######" + "'", str11, "hi!#######");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str12, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "9th4444444" + "'", str14, "9th4444444");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1st" + "'", str15, "1st");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10th Oct -387" + "'", str16, "10th Oct -387");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4630");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, (-345), (int) (byte) 0, (int) 'a', 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4631");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 0, 1596, 0, 2147483589, 3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4632");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 365, 62, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4633");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(142, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#(366, -1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #(366, -1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4635");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("29 S", "(-1, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4636");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0031-02-01", "GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4637");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='', score=1}", "(10, 52)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4638");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, (int) '#', 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4639");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 10, (-387));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4640");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(97, 97)aa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4641");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        int int9 = gamePlayer1.getScore();
        java.lang.String str10 = gamePlayer1.toString();
        java.lang.String str11 = gamePlayer1.toString();
        java.lang.String str12 = gamePlayer1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str10, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str11, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str12, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4642");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4643");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0142-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4644");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(109, 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4645");
        char[] charArray7 = new char[] {};
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray7);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='52 S', score=0}", charArray7);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4th", charArray7);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 S" + "'", str10, "10 S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Jan" + "'", str11, "Jan");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GamePlayer{name='52 S', score=0}" + "'", str12, "GamePlayer{name='52 S', score=0}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4th" + "'", str13, "4th");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st" + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa31st");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4646");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray1, (-387));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4647");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10 S', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4648");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2147483598, 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4649");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483648), (int) (byte) 0, 41, (-2147483647), 0, 68);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4650");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(317, (int) (short) 100, 44, 142, (int) (byte) 10, 142);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4651");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(1, 44, (int) 'a', (-1287));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4652");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4653");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(invalid)");
        comp5111.assignment.cut.Subject.GamePlace gamePlace8 = subject0.new GamePlace(90, 0);
        gamePlace8.y(30);
        gamePlace8.y(97);
        comp5111.assignment.cut.Subject.GamePlace gamePlace13 = gamePlace8.clone();
        org.junit.Assert.assertNotNull(gamePlace13);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4654");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("52 ", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52 4444444" + "'", str3, "52 4444444");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4655");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, 52)a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4656");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(2147483598, 317);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4657");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0366-01-31", "-3747-04-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4658");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("                                                                                          444444-1 S", "44444441 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4659");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(1, (int) '4', 29, 140, 62, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4660");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0018-03-31", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0018-03-31" + "'", str3, "0018-03-31");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4661");
        char[] charArray6 = new char[] { 'a', '4' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4 S", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Mar", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(366, -1)", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4" + "'", str8, "4");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ma" + "'", str9, "Ma");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(366, -1)" + "'", str10, "(366, -1)");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4662");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(1, ", "0010-02-28");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4663");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4664");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477218678, 477218678);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4665");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(90, 10)", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(90, 10)##" + "'", str3, "(90, 10)##");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4666");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(-2147483648, 52)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4667");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0001-10-31", charArray10);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='30th', score=35}", charArray10);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0365-01-01                                                                                          ", charArray10);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                      (-3747, 29047)", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52 S" + "'", str12, "52 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!#######" + "'", str13, "hi!#######");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str14, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str15, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0001-10-31" + "'", str17, "0001-10-31");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GamePlayer{name='30th', score=35}" + "'", str18, "GamePlayer{name='30th', score=35}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0365-01-01                                                                                          " + "'", str19, "0365-01-01                                                                                          ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                      (-3747, 29047)" + "'", str20, "                                                                                      (-3747, 29047)");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4668");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(122, 0, 477218844, 2147483598, 52, (int) '#');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4669");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2nd", (short) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2nd" + "'", str3, "2nd");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4670");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("52 4444444");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[52, 0, 0, 0]");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4671");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("44444441 M");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[44444441, 0, 0, 0]");
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4672");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='31st', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4673");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(477218588, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4674");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("18th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4675");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 115);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4676");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(97, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4677");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(97, 32)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4678");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        java.lang.String str3 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        boolean boolean6 = gamePlayer1.equals((java.lang.Object) "(100, 52)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = gamePlayer1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(gamePlayer7);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4679");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(invalid)4", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)4" + "'", str3, "(invalid)4");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4680");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(-345, 0)", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-345, 0)" + "'", str3, "(-345, 0)");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4681");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("2 S", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2 S" + "'", str3, "2 S");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4682");
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray5);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray5);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(90, -1)", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 S" + "'", str7, "52 S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!#######" + "'", str8, "hi!#######");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str9, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(90, -1)" + "'", str10, "(90, -1)");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4683");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(28947, 143, 0, 365, 3848, 41);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4684");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-3747), 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-3747-03-31" + "'", str2, "-3747-03-31");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4685");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(82, 187, (-2147483648), 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='Anonymous Player', score=-2}", "2 M", "444444-1 S", "(187, -345)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4687");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(6, 82, 62, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4688");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        int int9 = gamePlayer1.getScore();
        gamePlayer1.resetScore();
        int int11 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer12 = gamePlayer1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(gamePlayer12);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4689");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, -1)", "0004-10-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4690");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='52 S', score=0}", charArray8);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("4th", charArray8);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken(" ", charArray8);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(2894", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 S" + "'", str11, "10 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Jan" + "'", str12, "Jan");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GamePlayer{name='52 S', score=0}" + "'", str13, "GamePlayer{name='52 S', score=0}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4th" + "'", str14, "4th");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(2894" + "'", str16, "(2894");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4691");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(82, byteArray8, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) ' ', byteArray8, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(29, byteArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray8, 28947);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 28947 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, -1, 0]");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4692");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4693");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("                                                      GamePlayer{name='Anonymous Player', score=109}", "(100, 18)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4694");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(39, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4695");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(2147483598, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4696");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(140, 109);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4697");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(35, byteArray7, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(4, byteArray7, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-3747), byteArray7, 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, -1, 0, 1]");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4698");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace((int) ' ', (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = subject0.new GamePlace((int) '4', (int) (short) 1);
        int int10 = gamePlace9.y();
        java.lang.String str11 = gamePlace9.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace12 = gamePlace9.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, 1)" + "'", str11, "(52, 1)");
        org.junit.Assert.assertNotNull(gamePlace12);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4699");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.getName();
        gamePlayer1.setScore((int) (byte) 1);
        gamePlayer1.setScore(143);
        gamePlayer1.resetScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Anonymous Player" + "'", str2, "Anonymous Player");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4700");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-1287 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4701");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(91);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4702");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(97, 97)############################################################################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4703");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((-387), 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4704");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(28947, 317, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4705");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray8, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(2147483589, byteArray8, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4706");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(52, 10)", "GamePlayer{name='1 S', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-2147483648, 9)", "#", "(9, 52)", "0028-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4708");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(142, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0142-10-01" + "'", str2, "0142-10-01");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4709");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("32 S", "68 Y", "#################################################################################################Sep", "0000-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4710");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = gamePlace3.equals(obj4);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = gamePlace3.clone();
        gamePlace3.y(187);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(gamePlace6);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("9thaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "2nd", "8 H", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4712");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0032-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4713");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean(" (100, -1)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 0)aaa", "aaaaaaa2nd", "GamePlayer{name='0143-01-31', score=0}                                                              ", "0035-06-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4715");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(91, 29047);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4716");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(477218844, 4, 6, (-345), 29047, 477218588);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4717");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(187, 35, 143);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4718");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(100, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4719");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray8, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((-3747), byteArray8, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4720");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(90, 1)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("3 M", "0365-01-01                                                                                          ", "GamePlayer{name='0 S4444444', score=0}", "GamePlayer{name='9th Sep 35', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4722");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(97, 52)");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        gamePlayer6.resetScore();
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4723");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(18, 0, 68, 187, 0, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4724");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("hi!", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!#################################################################################################" + "'", str3, "hi!#################################################################################################");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4725");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(52, 0)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4726");
        char[] charArray9 = new char[] {};
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray9);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Jan", charArray9);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray9);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10th", charArray9);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(52, 10)", charArray9);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-3747-04-01", charArray9);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='(97, 1)', score=0}", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 S" + "'", str12, "10 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Jan" + "'", str13, "Jan");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str14, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10th" + "'", str15, "10th");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(52, 10)" + "'", str16, "(52, 10)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-3747-04-01" + "'", str17, "-3747-04-01");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GamePlayer{name='(97, 1)', score=0}" + "'", str18, "GamePlayer{name='(97, 1)', score=0}");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4727");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(97, 52)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4728");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 10)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4729");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("3 M", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443 M" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443 M");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4730");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4731");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(75, 75, 142, (int) (short) -1, 52, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4732");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(18, byteArray11, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44, byteArray11, 3);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray11, 477218844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477218844 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4733");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(75, 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4734");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(6, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0006-10-31" + "'", str2, "0006-10-31");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4735");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray11, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) '#', byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (byte) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(52, byteArray11, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray11, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 41 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4736");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray3);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray6 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray7 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        java.lang.String[] strArray8 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4737");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 29047, 477218678);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(143, 100)", "GamePlayer{name='31st', score=97}", "", "0115-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4739");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-3747), (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4740");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(29, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("                                                                                          -345 S4444", "GamePlayer{name='(invalid)', score=31}", "0097-10-31", "GamePlayer{name='GamePlayer{name='', score=0}', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4742");
        char[] charArray10 = new char[] {};
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("52 S", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!#######", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=-2}", charArray10);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray10);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("9th4444444", charArray10);
        java.lang.String str17 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0004-09-30", charArray10);
        java.lang.String str18 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='Anonymous Player', score=9}", charArray10);
        java.lang.String str19 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(28947, 52)", charArray10);
        java.lang.String str20 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("GamePlayer{name='1 S', score=0}", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "52 S" + "'", str12, "52 S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!#######" + "'", str13, "hi!#######");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GamePlayer{name='Anonymous Player', score=-2}" + "'", str14, "GamePlayer{name='Anonymous Player', score=-2}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str15, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "9th4444444" + "'", str16, "9th4444444");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0004-09-30" + "'", str17, "0004-09-30");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GamePlayer{name='Anonymous Player', score=9}" + "'", str18, "GamePlayer{name='Anonymous Player', score=9}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(28947, 52)" + "'", str19, "(28947, 52)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GamePlayer{name='1 S', score=0}" + "'", str20, "GamePlayer{name='1 S', score=0}");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4743");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Oct", "(365, 0)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4744");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0010-03-31");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4745");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-1), 24, 29047, 477218678, (int) (byte) 0, 32);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4746");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(365, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4747");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (short) 0, 82, 140, 115, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4748");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(444444, 44, 3848);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4749");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-2147483647), 24, (-387), 109, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='(invalid)', score=10}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='(invalid)', score=10}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (0, 10)aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4752");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(477218588, 96, 187, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4753");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0100-01-31" + "'", str2, "0100-01-31");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4754");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0004-10-31", (short) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0004-10-31" + "'", str3, "0004-10-31");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4755");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4756");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(75);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4757");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.getName();
        gamePlayer1.setScore((int) (short) -1);
        gamePlayer1.resetScore();
        java.lang.String str6 = gamePlayer1.getName();
        java.lang.String str7 = gamePlayer1.toString();
        int int8 = gamePlayer1.getScore();
        gamePlayer1.resetScore();
        int int10 = gamePlayer1.getScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Anonymous Player" + "'", str2, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Anonymous Player" + "'", str6, "Anonymous Player");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str7, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4758");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(100, 10, 366);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4759");
        char[] charArray6 = new char[] {};
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray6);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0 S", charArray6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player", charArray6);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray6);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0035-01-31", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 S" + "'", str9, "0 S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player" + "'", str10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444Anonymous Player");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0035-01-31" + "'", str12, "0035-01-31");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4760");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(97, 1)", (short) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(97, 1)444" + "'", str3, "(97, 1)444");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4761");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(3, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4762");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-10-31", (short) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-10-31" + "'", str3, "0097-10-31");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4763");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("444444444444444444444444444444444444444444444444444444444444GamePlayer{name='0004-09-30', score=143}", "(187, 30)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4764");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(90, 30)", "(366, 0)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='(invalid)', score=31}", "41 S", "(-1, 10)", "0001-09-30");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4766");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        char[] charArray5 = new char[] {};
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray5);
        boolean boolean8 = gamePlayer1.equals((java.lang.Object) str7);
        int int9 = gamePlayer1.getScore();
        gamePlayer1.resetScore();
        gamePlayer1.resetScore();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4767");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(97, 52)', score=100}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4768");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='0035-01-01', score=0}", "5 D");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4769");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0010-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, -345)", " ", "0052-10-01", "                                                                                                 9 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4771");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='30th ', score=0}", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='30th ', score=0}" + "'", str3, "GamePlayer{name='30th ', score=0}");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("hi!#################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!#################################################################################################");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4773");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(3, 32, 1, 29047, 30, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4774");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray9, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray9, 4);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 10, byteArray9, 2);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 1, byteArray9, 3);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4775");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        gamePlayer1.resetScore();
        gamePlayer1.addScore((int) ' ');
        java.lang.String str6 = gamePlayer1.toString();
        gamePlayer1.setScore(0);
        gamePlayer1.setScore(55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GamePlayer{name='Anonymous Player', score=32}" + "'", str6, "GamePlayer{name='Anonymous Player', score=32}");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4776");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0097-01-31444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4777");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(75, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4778");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(115, 0, 52, 41, 97, 6);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4779");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10th Oct -387", "                                                                                           (100, 18)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4780");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer5 = subject0.new GamePlayer("(invalid)");
        int int6 = gamePlayer5.getScore();
        int int7 = gamePlayer5.getScore();
        gamePlayer5.addScore(0);
        java.lang.String str10 = gamePlayer5.getName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(invalid)" + "'", str10, "(invalid)");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4781");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlace gamePlace4 = subject0.new GamePlace(10, (int) (short) 100);
        int int5 = gamePlace4.x();
        gamePlace4.y((int) (byte) 1);
        comp5111.assignment.cut.Subject subject8 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = subject8.new GamePlace((int) (byte) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.GamePlace gamePlace14 = subject8.new GamePlace((int) ' ', (int) (byte) -1);
        int int15 = gamePlace4.manhattanDistance(gamePlace14);
        int int16 = gamePlace14.x();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4782");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4783");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(317, 91, 71);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4784");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, (-387), (-2147483647), (int) (byte) 1, (int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4785");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, (int) (short) 10, (int) (byte) 100, 6, (int) (byte) 0, 477218678);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4786");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(122, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4787");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(4, 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4788");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th Oct -2147483648", "8 ", "                                                      GamePlayer{name='Anonymous Player', score=100}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4789");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1287 S", "31st      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4790");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(90, 2147483598, 152);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4791");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, 517);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4792");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, (int) '#', (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4793");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        java.lang.String str2 = gamePlayer1.toString();
        int int3 = gamePlayer1.getScore();
        int int4 = gamePlayer1.getScore();
        int int5 = gamePlayer1.getScore();
        gamePlayer1.addScore((int) '4');
        java.lang.String str8 = gamePlayer1.getName();
        int int9 = gamePlayer1.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer10 = gamePlayer1.clone();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str2, "GamePlayer{name='Anonymous Player', score=0}");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Anonymous Player" + "'", str8, "Anonymous Player");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(gamePlayer10);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4794");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray11, (int) (short) 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(90, byteArray11, (int) (short) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray11, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(18, byteArray11, (int) (byte) 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(28947, byteArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 1, 1, 0, 10]");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4795");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(2894");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4796");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='Anonymous Player', score=32}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4797");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(28, (int) (byte) 1, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24th Jan 28" + "'", str3, "24th Jan 28");
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(0, 41)", "GamePlayer{name='(0, 0)', score=0}", "(97, 52)", "28th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4799");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-345), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4800");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        boolean boolean3 = gamePlayer1.equals((java.lang.Object) (short) -1);
        int int4 = gamePlayer1.getScore();
        gamePlayer1.setScore(1);
        int int7 = gamePlayer1.getScore();
        int int8 = gamePlayer1.getScore();
        gamePlayer1.setScore(187);
        gamePlayer1.resetScore();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4801");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0 S", (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 S" + "'", str3, "0 S");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4802");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=-336}", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=-336}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='Anonymous Player', score=-336}");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4803");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((-3747), 35, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4804");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("8 H", "0004-10-31");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4805");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("9th Jan 71", "GamePlayer{name='0004-09-30', score=143}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4806");
        char[] charArray8 = new char[] {};
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("hi!", charArray8);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("10 S", charArray8);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("31st", charArray8);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0004-10-31", charArray8);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-001-10-31", charArray8);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("0000-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("-387 S", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 S" + "'", str11, "10 S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "31st" + "'", str12, "31st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                          0004-10-31" + "'", str13, "                                                                                          0004-10-31");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-001-10-31" + "'", str14, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-001-10-31");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0000-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str15, "0000-01-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-387 S" + "'", str16, "-387 S");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4807");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(55, 477218678, (-2147483647), 2147483598);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_1_Test9.test4808");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(115);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

