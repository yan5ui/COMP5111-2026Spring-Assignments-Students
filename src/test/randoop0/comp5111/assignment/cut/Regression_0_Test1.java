package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Jan");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0502");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, (int) (short) 1, 1, 71, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0503");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0504");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0505");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, 2, (int) ' ', 365, (int) (byte) 100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0506");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("", "0052-01-01", "4 S", "1 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0508");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', (int) (short) -1, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0509");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.x();
        int int9 = gamePlace7.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace7.clone();
        int int11 = gamePlace10.x();
        java.lang.Class<?> wildcardClass12 = gamePlace10.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(gamePlace10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0510");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 0, 52, (int) (short) 10, 366);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0511");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(31, 0, (-2147483648), (int) (byte) -1, (int) '4', 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0512");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) -1, (int) '4', 477214179, (int) (byte) 10, (-2147483648), 25);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0513");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 1, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0001-02-28" + "'", str2, "0001-02-28");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 M", "10th", "Oct", "0001-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0515");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 100, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0516");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(25, 356, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0517");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, ", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 444444" + "'", str3, "(1, 444444");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0518");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, (-1), 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0519");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(35, 10)", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################(35, 10)" + "'", str3, "############################################################################################(35, 10)");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0520");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) '4', byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0521");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(62, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0522");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0523");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 35, (int) (short) 100, (-2147483648));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(35, 89, 97, (int) (short) 1, 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0525");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th", (short) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th" + "'", str3, "10th");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0526");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Feb 62", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Feb 62" + "'", str3, "10th Feb 62");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0527");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '#', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0035-10-01" + "'", str2, "0035-10-01");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0528");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(366, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0529");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(52, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0530");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(390, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0531");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(390, byteArray4, (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -2147483648 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0532");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(4, 52, 141, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0533");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0534");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=97}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0535");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, 477214179, 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0536");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(71);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0537");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(10, 71, 97, 2, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0538");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(32, (int) (byte) 10, 35, 141, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0539");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0540");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0541");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0542");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(100, 1)", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0543");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0544");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(477214179, (int) ' ', 2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0545");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.GamePlace gamePlace6 = subject0.new GamePlace(62, 89);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = subject0.new GameConfiguration((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0546");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0547");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097-10-01" + "'", str2, "0097-10-01");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0548");
        java.lang.String[] strArray4 = new java.lang.String[] { "0097-10-01", "0001-01-31", "(0, 10)", "(10, 10)" };
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0549");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(71, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0001-01-01", "-2147483648-10-01", "(1, 444444", "GamePlayer{name='#######1st', score=97}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0551");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(25, 0, 4, 356, (-1), 390);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0552");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(0, 10)", "1 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0553");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1 S" + "'", str1, "-1 S");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0554");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("                                                                                          0100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0555");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0001-02-28", "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(25, 62, 0, 0, 390, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0557");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("2 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0558");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 390);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7 M" + "'", str1, "7 M");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0559");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(25, 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0560");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4 S", "10th", "(71, ", "(52, 25)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st", "0100-01-01", "GamePlayer{name='-2147483648-10-01', score=10}", "##########################################################################################0032-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0562");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0563");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 S" + "'", str1, "1 S");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0564");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0565");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648 S", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0566");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) 'a', byteArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 10]");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0567");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("1st", (short) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1st");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0568");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(1, 444444", (short) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 444444" + "'", str3, "(1, 444444");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0569");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0570");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='10th', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0571");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jan" + "'", str1, "Jan");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0572");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("a");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0573");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0574");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        boolean boolean7 = gamePlayer2.equals((java.lang.Object) "#######1st");
        int int8 = gamePlayer2.getScore();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0575");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(390);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0576");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (byte) 100, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("35 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0578");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0579");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (short) 10, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0580");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 1, 356, (int) 'a', (int) '4', 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0581");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0582");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0100-10-31", "(100, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0583");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0584");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(366, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0366-01-31" + "'", str2, "0366-01-31");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0585");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 S" + "'", str1, "10 S");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0586");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(10, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0587");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "10th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0588");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("35 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0589");
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
        gamePlace11.x(365);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(gamePlace18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 71 + "'", int22 == 71);
        org.junit.Assert.assertNotNull(gamePlace23);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0590");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray8 = new comp5111.assignment.cut.Subject.GamePlayer[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration9 = subject0.new GameConfiguration(89, gamePlayerArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray8);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0591");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(2, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0592");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(62, (int) (short) 100, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0593");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0594");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(71, ", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0595");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(32, 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0596");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(390, byteArray3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 52 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0597");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr(2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Feb" + "'", str1, "Feb");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0598");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, (int) (short) 1, (-2147483648), 25, 35, (int) (short) 1);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0599");
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
        gamePlace5.x((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 71 + "'", int16 == 71);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0600");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 0, (int) ' ', (int) (byte) -1, (int) '4', (int) (short) 10, 141);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0601");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(71, 366)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0602");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(71, 35, 477214179, (int) (short) 100, (int) 'a', (-2147483648));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(62, 1)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (62, 1)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0604");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, 0, (-1), 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0605");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("        2 ", "(52, 25)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0606");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("10th", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0607");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214179, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0608");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0032-01-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0609");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("44444410 S");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44444410 + "'", int1 == 44444410);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0610");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(32, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0611");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(89, 356);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0612");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(100, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray3, 141);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 141 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0613");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration(477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0614");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(141);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0615");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='Anonymous Player', score=0}", "0032-01-01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0616");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(25, 31, 0, 31);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, 366)", "0001-02-28", "(0, 97)", "GamePlayer{name='-2147483648-10-01', score=97}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0618");
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
        comp5111.assignment.cut.Subject.GamePlace gamePlace28 = gamePlace8.clone();
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
        org.junit.Assert.assertNotNull(gamePlace28);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0619");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0620");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0621");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("0000-01-01", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000-01-01" + "'", str3, "0000-01-01");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0622");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', 477214179);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0623");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(35, (int) (byte) -1, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0624");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0100-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0625");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray3, 390);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 390 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(62, (-2147483648), 100, (int) (short) -1, (int) (byte) 10, 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0627");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray1);
        java.lang.String[] strArray3 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray4 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray2);
        java.lang.String[] strArray5 = comp5111.assignment.cut.Subject.StringAlgorithms.trimArrayElements(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0628");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, (int) '4', (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0629");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-2147483648-10-01', score=97}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0630");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) 'a', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097-10-01" + "'", str2, "0097-10-01");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0631");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("7 M");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[7, 0, 0, 0]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0632");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st", "44444410 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(62, (int) ' ', (int) (short) 10, (int) ' ', (-2147483648), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0634");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 62);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 M" + "'", str1, "1 M");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0635");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0636");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0637");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(4, 0, 356, 62, (int) (short) 0, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0638");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0639");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(0, 10)", (short) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 10)" + "'", str3, "(0, 10)");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0640");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0641");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 356);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0642");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("-2147483648 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -2147483648 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0643");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0644");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(89, 366);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0645");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("#######1st");
        java.lang.Class<?> wildcardClass3 = subject0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0646");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(62, 52)", "(1, 365)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "(0, 0)", "0100-01-31", "        2 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0648");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(35, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0649");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(2, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0650");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 44444410);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0651");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("##########################################################################################0032-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0652");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1st" + "'", str1, "1st");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0653");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4", "Feb");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0654");
        char[] charArray11 = new char[] { 'a', '4', '#', '4', '#', ' ' };
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("1st", charArray11);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(invalid)", charArray11);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("(62, 1)", charArray11);
        java.lang.String str15 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("                                                                                          0100-01-01", charArray11);
        java.lang.String str16 = comp5111.assignment.cut.Subject.StringAlgorithms.parseToken("Feb", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #, 4, #,  ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1st" + "'", str12, "1st");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(inva" + "'", str13, "(inva");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(62, " + "'", str14, "(62, ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " " + "'", str15, " ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Feb" + "'", str16, "Feb");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0655");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", "2 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0656");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 32, 0, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0657");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) '4', 356, (int) (byte) 100, (int) (byte) -1, (int) (short) 1, 25);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(89, (int) (short) 10, 35, 62, 356, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0659");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0660");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10 S" + "'", str1, "10 S");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0661");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25 S" + "'", str1, "25 S");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0662");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, 31, (int) (byte) 100, (int) (short) 100, 141, 71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0663");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 100, (int) (byte) 0, 10, 32, 365, (-1));
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0664");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0035-10-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(71, #####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (71, #####");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0666");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0667");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(71, 366)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0668");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) ' ', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0669");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-2147483648));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0670");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0671");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0672");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("25th", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25th" + "'", str3, "25th");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0673");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("32 S", "GamePlayer{name='-2147483648-10-01', score=97}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0674");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0675");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("4", "(62, 1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0676");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(4, 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0004-04-01" + "'", str2, "0004-04-01");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0677");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        int int8 = gamePlace3.y();
        int int9 = gamePlace3.y();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0678");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("-2147483648-10-01", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-2147483648-10-01" + "'", str3, "-2147483648-10-01");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0679");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 0, byteArray6, 44444410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444410 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100]");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0680");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(89);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0681");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(97, (int) (short) -1, 366);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("31 S", "(71, #####", "(0, 97)", "GamePlayer{name='                                                                                          0100-01-01', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='10th', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='10th', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0684");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(141, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0685");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(141, 477214179, 52, 71);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0686");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(25, 32, 44444410);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0687");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 0, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0688");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(4, 390);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0689");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(97, (int) (short) -1, 89, 366, 477214179, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0690");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10th" + "'", str1, "10th");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0691");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 100, 141, (int) '#', 44444410);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0692");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(477214179, (int) (byte) -1, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0693");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0695");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray2, 477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477214179 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0696");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("", "(1, 444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0697");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0698");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(100, 141, 356, 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(10, 10)", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31", " ", "10 S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0700");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0701");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("1st Feb 0", "2 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0702");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(32, byteArray8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0703");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0000-01-01", "44444410 S");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=71}", "(71, #####", "2 S", "#######1st");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0705");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0706");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(62, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0707");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(1, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0708");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(52, 25)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0709");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("31st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0710");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace3.clone();
        int int8 = gamePlace7.x();
        int int9 = gamePlace7.x();
        gamePlace7.x((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0711");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("Anonymous Player", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0712");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(62, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0713");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(477214179);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0 S", "GamePlayer{name='-2147483648-10-01', score=0}", "-2147483648-10-01", "(62, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0715");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(62, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0716");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(477214179, 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='Anonymous Player', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='Anonymous Player', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0718");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0004-04-01");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0719");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(0, 477214179);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0720");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("25 S", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0721");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(35, 10)", "(35, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0722");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) '4', 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0723");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0724");
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
        int int28 = gamePlace27.x();
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0725");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0726");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(71, 366)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0727");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '#', (int) (short) 100, (int) (short) 10, 44444410);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0728");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(31, 141, 0, 356);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0729");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) ' ', 0, 141, 477214179);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0730");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(141, 52, (int) (byte) -1, 477214179, (int) '4', 366);
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0731");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0732");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("(62, 52)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0733");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore((-1));
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0734");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Ga");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0735");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(36, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0736");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("44444410 S", (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444410 S" + "'", str3, "44444410 S");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0737");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(365, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0738");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0739");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(4, 44444410, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0740");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 10, (int) (byte) -1, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0741");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 2, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Feb 0" + "'", str3, "10th Feb 0");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0742");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(0, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0743");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(366, (int) (byte) 100, 365, (int) '#', 477214179, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0744");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Jan" + "'", str1, "Jan");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(71, ", "Feb", "GamePlayer{name='', score=0}", "10th");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0746");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "0001-01-31");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0747");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(32, (-2147483648), 0, 0, 4, 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0748");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '#', 366);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0749");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(52, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0750");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-01-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0751");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(32, 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0752");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer("");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer8.clone();
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0753");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(100, 10)", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0754");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0755");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("2 M", "7 M");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0756");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0757");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) 0, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0758");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(71);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0759");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("", (short) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0760");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(104, 0, 100, 89);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0761");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0762");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(477214179, 71, 365);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0763");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("aaaaaaaaaa", "10th Feb 62", "(71, #####", "(0, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0764");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(356, byteArray1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0765");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0000-01-01");
        java.lang.Class<?> wildcardClass2 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0766");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("0001-01-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0767");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, (int) (byte) 0, (int) (byte) 1, 52, (int) 'a', 104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0768");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("Anonymous Player");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0769");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("", (short) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0770");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer7 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer[] gamePlayerArray9 = new comp5111.assignment.cut.Subject.GamePlayer[] {};
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration10 = subject0.new GameConfiguration(104, gamePlayerArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gamePlayerArray9);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0771");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='10th', score=0}", "Anonymous Player", "0100-10-31", "(1, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0773");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = subject0.new GamePlayer("2 M");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer9 = gamePlayer8.clone();
        org.junit.Assert.assertNotNull(gamePlayer9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0774");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("(0, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: (0, 10)");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0775");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("0004-04-01", "25th");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0776");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(44444410, (int) (short) 1, (int) (byte) 1, 0, 0, 44444410);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0777");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='(35, 10)', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0778");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='-2147483648-10-01', score=97}", (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=97}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=97}");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0779");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0780");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) (short) 0, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0781");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("2 ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0782");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(71, 366)", (short) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(71, 366)a" + "'", str3, "(71, 366)a");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0783");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(71, 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0784");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0002-01-01" + "'", str2, "0002-01-01");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0785");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0786");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(44444403, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0787");
        comp5111.assignment.cut.Subject subject0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration2 = subject0.new GameConfiguration((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to comp5111.assignment.cut.Subject$GameConfiguration with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0788");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0789");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0790");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0791");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("1st");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0792");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0793");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='(35, 10)', score=0}", "0000-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-214", "", "(52, 25)", "0100-10-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0795");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (byte) -1, 0, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0796");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "36 S" + "'", str1, "36 S");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0797");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0798");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(32, 10, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("7 M");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 7 M");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0800");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44444403, (-1), 365, 89, (int) '#', (int) (short) 0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0801");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 1, 366, (int) (byte) 1, (int) (short) 100, 477214179, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0802");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(4, 89, (int) (short) -1, 4, 356, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0803");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("hi!", (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444hi!" + "'", str3, "4444444hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0804");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 44444403);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1 Y" + "'", str1, "1 Y");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0805");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        java.lang.String str8 = gamePlace7.toString();
        gamePlace7.x(44444403);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(62, 1)" + "'", str8, "(62, 1)");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0806");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='Anonymous Player', score=0}", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='Anonymous Player', score=0}" + "'", str3, "GamePlayer{name='Anonymous Player', score=0}");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0807");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("Jan", "############################################################################################(35, 10)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0808");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(366, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0809");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='-2147483648-10-01', score=31}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0810");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 45, 32, 365, 52, 365);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0811");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(97, (-2147483648), 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0812");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(35, 10)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", "0001-01-01", "32 S", "-2147483648-10-01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0814");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(390, 36, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0815");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer6 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration8 = subject0.new GameConfiguration(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be at least 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0816");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.month2MonAbbr((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0817");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(52, 25)", (short) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 25)" + "'", str3, "(52, 25)");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0818");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st", "1st Feb 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0819");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("1st Feb 0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th", "hi!", "(-1, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0820");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(141, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0821");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        int int6 = gamePlace3.y();
        int int7 = gamePlace3.x();
        gamePlace3.x(0);
        comp5111.assignment.cut.Subject.GamePlace gamePlace10 = gamePlace3.clone();
        gamePlace3.y((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(gamePlace10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0822");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44444403, 44444403, 2, (int) ' ', 390, 45);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0823");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000-02-29" + "'", str2, "0000-02-29");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0824");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='                                                                                          0100-01-01', score=0}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0825");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0002-01-01", (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0002-01-01" + "'", str3, "0002-01-01");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0826");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), (int) '#', 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0827");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((-1), 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0828");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10th");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0829");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(100, 1)", "(0, 10)", "1 Y", "(-1, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0830");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0831");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(32, 100, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0832");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) ' ', 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0032-04-01" + "'", str2, "0032-04-01");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0833");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(44444403);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0834");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("", "GamePlayer{name='-2147483648-10-01', score=97}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0835");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlace gamePlace3 = subject0.new GamePlace((int) (short) 10, (int) (short) 10);
        gamePlace3.x((int) 'a');
        gamePlace3.x((int) (byte) 10);
        gamePlace3.x((int) 'a');
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0836");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((-2147483648), 71, 31, (int) (short) 0, (int) (short) 100, 44444410);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0837");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0838");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) -1, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0839");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-1 S", "1 M");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0840");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0841");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0842");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(477214179);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0843");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        java.lang.String str5 = gamePlayer2.getName();
        int int6 = gamePlayer2.getScore();
        gamePlayer2.addScore(31);
        gamePlayer2.addScore((int) (byte) 100);
        java.lang.String str11 = gamePlayer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-2147483648-10-01" + "'", str5, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=131}" + "'", str11, "GamePlayer{name='-2147483648-10-01', score=131}");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0844");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("GamePlayer{name='(35, 10)', score=0}", (short) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='(35, 10)', score=0}" + "'", str3, "GamePlayer{name='(35, 10)', score=0}");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0845");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(71, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0846");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(356, 4, 100, 36, 44444410, 89);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates(477214179, 0, 104, 97, (int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) ' ', 0, (int) '4', 45, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0849");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) 97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2 M" + "'", str1, "2 M");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0850");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (short) 100, 0, 366, 31, 44444403, 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0851");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) '4', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0852");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("0100-01-31");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100, 0, 0, 0]");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0853");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(477214179, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "477214179-10-31" + "'", str2, "477214179-10-31");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0854");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(104);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0855");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(52, 25)");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0856");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("477214179-10-31", "##########################################################################################0032-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0857");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(0, byteArray6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 100]");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0858");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("-2147483648-10-01", "GamePlayer{name='(35, 10)', score=0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0859");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-2147483648-10-01', score=131}", "Anonymous Player");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0860");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("GamePlayer{name='#######1st', score=97}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0861");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(4, 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("-214", "10th Feb 62", "6 M", "(62, 52)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0863");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(30, byteArray1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0864");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (byte) 10, (int) (short) 100, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0865");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("(52, 25)", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0866");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets((int) '#', byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0867");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(1, (int) ' ', 97, 62, (-2147483648), 4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0868");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("(52, 25)", "10th Feb 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0869");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("Jan");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0366-01-31", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ", "Feb", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0871");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444403, byteArray4, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 0]");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0872");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("GamePlayer{name='-2147483648-10-01', score=0}");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0873");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(0, 477214179, (int) (short) -1, 10, (int) (byte) -1, 71);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0874");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray9, 1);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (short) 100, byteArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(104, byteArray9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(-1, 52)", "                                                                                          0100-01-01", "(0, 0)", "(71, ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0876");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(100, 10)", (short) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 10)" + "'", str3, "(100, 10)");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0877");
        byte[] byteArray3 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray3, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(356, byteArray3, 356);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 356 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[]");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0878");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 0, (int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0879");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(0, 365, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0880");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='10th', score=0}", (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0881");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(35, 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0882");
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
        gamePlayer18.addScore((-2147483648));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gamePlace9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(97, 10)" + "'", str11, "(97, 10)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0883");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((-2147483648), 36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0884");
        byte[] byteArray2 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(194, byteArray2, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[]");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0885");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("GamePlayer{name='-2147483648-10-01', score=71}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("#######1st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: #######1st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0887");
        byte[] byteArray4 = new byte[] {};
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 1, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(97, byteArray4, 0);
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(1, byteArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444403, byteArray4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 97 out of bounds for byte[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[]");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0 S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0 S");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0889");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(52, 477214179, (-2147483648), 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0890");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(30, 390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0891");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "35 S" + "'", str1, "35 S");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), 35, 104, (int) '4', 44444410, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0893");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0894");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("7 M", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7 M" + "'", str3, "7 M");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0895");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(194, 390);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0896");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((-2147483648), 62, 356, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0897");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '4', 25, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0898");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("10 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10, 0, 0, 0]");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0899");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(30, 71, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0900");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("GamePlayer{name='-2147483648-10-01', score=31}", (short) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=31}" + "'", str3, "GamePlayer{name='-2147483648-10-01', score=31}");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0901");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("0002-01-01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0902");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) ' ', (int) (byte) 10, 4, 45, (-2147483648), (int) (short) 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0903");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(45, (int) '#', 35, 30, 194, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0904");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(366, 100, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0905");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(36, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0906");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (short) 10, 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0907");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("35 S", (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35 S" + "'", str3, "35 S");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0908");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(44444410, 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0909");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(25, (int) (byte) 1, (int) (short) 10, 62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0910");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(141);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0911");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        java.lang.String str7 = gamePlayer2.getName();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer8 = gamePlayer2.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
        org.junit.Assert.assertNotNull(gamePlayer8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0912");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Ga", (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0913");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth((int) (byte) 1, 44444410);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0914");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear(36);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0915");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(100, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0916");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='-2147483648-10-01', score=131}", "(62, 52)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0917");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("(100, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0918");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("32 S");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0919");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(inva", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0920");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("#######1st", (short) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######1st" + "'", str3, "#######1st");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0921");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(366, 71, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0922");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padLeft("10th Feb 62", (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10th Feb 62" + "'", str3, "10th Feb 62");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0923");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings(" ", "##########################################################################################0032-01-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0924");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) (short) 10, 194, 356, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0925");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0926");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(1, 365)", "-214", "(97, 10)", "0366-01-31");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0928");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(30, (int) (short) 10, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0929");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration4 = subject0.new GameConfiguration((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard must be an odd number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0930");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer();
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.GameConfiguration gameConfiguration5 = subject0.new GameConfiguration(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: size of gameboard is at most 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0931");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(71, 30, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0932");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth(194, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0933");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) (short) 1, (int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0934");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(390, 44444403, 194, 44444403);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0935");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) '#', 477214179, (int) (byte) 100, 30, 0, 141);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("0100-10-31", "(35, -1)", "GamePlayer{name='-2147483648-10-01', score=31}", "(1, 444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0937");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("(62, 52)", "GamePlayer{name='                                                                                          0100-01-01', score=0}", "hi!", "0001-02-28");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0939");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("1st Feb 0", "(100, 1)");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0940");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(25, 390);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0941");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.roundSecondToString((long) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52 S" + "'", str1, "52 S");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0942");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0100-10-01", "25 S");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0943");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.setScore((int) (byte) 0);
        java.lang.String str7 = gamePlayer2.getName();
        int int8 = gamePlayer2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-2147483648-10-01" + "'", str7, "-2147483648-10-01");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0944");
        int int1 = comp5111.assignment.cut.Subject.StringAlgorithms.extractIntInStr("GamePlayer{name='-2147483648-10-01', score=131}");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0945");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("GamePlayer{name='#######1st', score=97}", "GamePlayer{name='-2147483648-10-01', score=71}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("0000-02-29");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0947");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(0, 97)");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0948");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringAlgorithms.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0949");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(89);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0950");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(97, 477214179);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0951");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGamePlayer{name='10th', score=0}");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0952");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("477214179-10-31", (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477214179-10-31" + "'", str3, "477214179-10-31");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0953");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("GamePlayer{name='', score=0}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: GamePlayer{name='', score=0}");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0954");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        comp5111.assignment.cut.Subject.GamePlace gamePlace5 = subject0.new GamePlace(62, 1);
        java.lang.String str6 = gamePlace5.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace7 = gamePlace5.clone();
        java.lang.String str8 = gamePlace7.toString();
        comp5111.assignment.cut.Subject.GamePlace gamePlace9 = null;
        boolean boolean10 = gamePlace7.isAdjacent(gamePlace9);
        comp5111.assignment.cut.Subject.GamePlace gamePlace11 = gamePlace7.clone();
        int int12 = gamePlace7.x();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(62, 1)" + "'", str6, "(62, 1)");
        org.junit.Assert.assertNotNull(gamePlace7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(62, 1)" + "'", str8, "(62, 1)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(gamePlace11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 62 + "'", int12 == 62);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = comp5111.assignment.cut.Subject.StringAlgorithms.parseNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######1st");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0956");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) '#', 10, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.StringAlgorithms.strToBoolean("10th", "1st", "4", "(100, 10)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0958");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0959");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(2, 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0002-02-01" + "'", str2, "0002-02-01");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0960");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(44444410, (-2147483648), 30, 32, 0, (int) '#');
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0961");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("0052-01-01", " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0962");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer1 = subject0.new GamePlayer();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer3 = subject0.new GamePlayer("        2 ");
        gamePlayer3.setScore(0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0963");
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
        java.lang.Class<?> wildcardClass29 = gamePlayer2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0964");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0965");
        java.lang.String str1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.dayStr(97);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(invalid)" + "'", str1, "(invalid)");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0966");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("Ga44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0967");
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(62, byteArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(365, byteArray7, 477214179);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 477214179 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 100, 0, 1, 100]");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0968");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440035-10-31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0969");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate((int) 'a', 32, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0970");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("(71, #####", "Feb");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0971");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((int) (byte) 100, (int) (byte) -1, 10, 44444410, (int) (short) 100, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0972");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(44444403);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0973");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(390, 477214179, 141, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0974");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter(366);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0975");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings(" ", "0097-10-01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0976");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.lastDayOfMonth((int) (byte) 100, 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0977");
        boolean boolean1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.judgeLeapYear((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0978");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("0001-01-31", (short) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0001-01-31##########################################################################################" + "'", str3, "0001-01-31##########################################################################################");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0979");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDateStrings("GamePlayer{name='-2147483648-10-01', score=31}", "(35, -1)");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0980");
        java.lang.String str2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.firstDayOfMonth(104, 477214179);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "(invalid)" + "'", str2, "(invalid)");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0981");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("(1, ", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, " + "'", str3, "(1, ");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0982");
        java.nio.ByteBuffer byteBuffer1 = null;
        java.lang.StringBuilder stringBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.Subject.StringAlgorithms.decodeOctets(35, byteBuffer1, stringBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.ByteBuffer.limit()\" because \"bb\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0983");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(71, ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0984");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween(104, (int) (byte) 100, 2, (int) (short) 10, 52, 31);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0985");
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysBetweenDates((-1), 194, (int) (short) 100, 97, 36, 356);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0986");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("2 S");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2, 0, 0, 0]");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0987");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.getQuarter((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0988");
        int[] intArray1 = comp5111.assignment.cut.Subject.StringAlgorithms.getVersionNo("(10, ");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0, 0, 0, 0]");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0989");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear(45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0990");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
        comp5111.assignment.cut.Subject.GamePlayer gamePlayer2 = subject0.new GamePlayer("-2147483648-10-01");
        int int3 = gamePlayer2.getScore();
        int int4 = gamePlayer2.getScore();
        gamePlayer2.addScore((int) '4');
        gamePlayer2.addScore((int) ' ');
        java.lang.String str9 = gamePlayer2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GamePlayer{name='-2147483648-10-01', score=84}" + "'", str9, "GamePlayer{name='-2147483648-10-01', score=84}");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0991");
        int int2 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.calcDaysInMonth((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0992");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringAlgorithms.padRight("Ga", (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ga" + "'", str3, "Ga");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0993");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween((int) '4', 62, 100, 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0994");
        int int4 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monthsBetween(0, 365, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0995");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.listDatesBetween((int) (byte) 10, 141, 2, 194, 0, 10);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0996");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 1 };
        comp5111.assignment.cut.Subject.StringAlgorithms.enlarge((int) (byte) 0, byteArray8, 1);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(44444410, byteArray8, 44444410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 44444410 out of bounds for byte[6]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 100, 10, 0, 100, 1]");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0997");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StringAlgorithms.enlarge(31, byteArray1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"data\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0998");
        java.lang.String str3 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.formatFullDate(25, (int) (short) 0, 390);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(invalid)" + "'", str3, "(invalid)");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test0999");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.monAbbr2month("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444(52, 25)");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test1.test1000");
        int int1 = comp5111.assignment.cut.Subject.DateTimeAlgorithms.daysInYear((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 365 + "'", int1 == 365);
    }
}

