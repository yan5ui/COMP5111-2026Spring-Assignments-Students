package comp5111.assignment.cut;

/**
 * Task 4 reduced CUT.
 *
 * Ten public-static methods selected from {@link Subject}, with their
 * documented contracts and one private helper (isOneOf).  The patched
 * (correct) implementations from Task 2 are used so that EvoSuite's
 * generated tests pin down the intended behaviour, against which the
 * LLM's regenerated code is judged.
 *
 * Every signature is identical to the corresponding method in Subject.
 */
public class NewSubject {

    /**
     * Returns true if str starts with prefix ignoring case, else false.
     * Returns false on any null argument or if str is shorter than prefix.
     */
    public static boolean startsWithIgnoreCase(String str, String prefix) {
        if (str == null || prefix == null) {
            return false;
        }
        if (str.length() < prefix.length()) {
            return false;
        }
        return str.regionMatches(true, 0, prefix, 0, prefix.length());
    }

    /**
     * Returns the prefix of str up to (but not including) the first
     * character that appears in {@code terminators}.  If no terminator
     * is found, the whole string is returned.
     */
    public static String parseToken(final String str, final char[] terminators) {
        if (str == null) {
            return null;
        }
        if (terminators == null || terminators.length == 0) {
            return str;
        }
        for (int i = 0; i < str.length(); i++) {
            if (isOneOf(str.charAt(i), terminators)) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    private static boolean isOneOf(char ch, final char[] charray) {
        if (charray == null) {
            return false;
        }
        for (char c : charray) {
            if (c == ch) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the LAST contiguous run of digits in str interpreted as
     * an int. Empty/null/no-digit inputs return 0.
     * Examples: "1234" -> 1234, "a" -> 0, "1234a123" -> 123.
     */
    public static int extractIntInStr(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int end = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                end = i;
                break;
            }
        }
        if (end == -1) {
            return 0;
        }

        int start = end;
        while (start >= 0 && Character.isDigit(str.charAt(start))) {
            start--;
        }
        String digits = str.substring(start + 1, end + 1);
        try {
            return Integer.parseInt(digits);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Parses a version string of form a, a.b, a.b.c, or a.b.c.d into a 4-int
     * array. Trailing components default to 0. More than 4 dot-segments or
     * malformed (consecutive dots) produces null.
     */
    public static int[] getVersionNo(final String versionString) {
        if (versionString == null || versionString.length() == 0) {
            return null;
        }

        int dotCount = 0;
        for (int i = 0; i < versionString.length(); i++) {
            if (versionString.charAt(i) == '.') {
                dotCount++;
            }
        }
        if (dotCount > 3) {
            return null;
        }

        String[] parts = versionString.split("\\.", -1);
        if (parts.length == 0 || parts.length > 4) {
            return null;
        }

        int[] result = new int[] {0, 0, 0, 0};
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() == 0) {
                return null;
            }
            result[i] = extractIntInStr(parts[i]);
        }
        return result;
    }

    /**
     * Pads str on the left with padChar so the resulting length is at least
     * length. Null str is treated as "". If str is already long enough it is
     * returned unchanged.
     */
    public static String padLeft(String str, short length, char padChar) {
        if (str == null) {
            str = "";
        }
        if (str.length() >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        sb.append(str);
        return sb.toString();
    }

    /** Returns true iff year is a leap year (Gregorian rule). */
    public static boolean judgeLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    /**
     * Returns the number of days in the given month (1-12) of the given
     * year. Returns -1 if month is out of range. February uses leap-year
     * rules.
     */
    public static int calcDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                return judgeLeapYear(year) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
            default:
                return -1;
        }
    }

    /** Returns the calendar quarter (1-4) for month (1-12), or -1 if invalid. */
    public static int getQuarter(int month) {
        if (month < 1 || month > 12) {
            return -1;
        }
        return (month - 1) / 3 + 1;
    }

    /**
     * Converts a 3-char month abbreviation (case-sensitive, e.g. "Jan",
     * "Sep") into its month number (1-12). Returns -1 on null, wrong
     * length, or unknown abbreviation.
     */
    public static int monAbbr2month(String abrr) {
        if (abrr == null || abrr.length() != 3) {
            return -1;
        }
        switch (abrr) {
            case "Jan":
                return 1;
            case "Feb":
                return 2;
            case "Mar":
                return 3;
            case "Apr":
                return 4;
            case "May":
                return 5;
            case "Jun":
                return 6;
            case "Jul":
                return 7;
            case "Aug":
                return 8;
            case "Sep":
                return 9;
            case "Oct":
                return 10;
            case "Nov":
                return 11;
            case "Dec":
                return 12;
            default:
                return -1;
        }
    }

    /**
     * Inverse of monAbbr2month: returns "Jan".."Dec" for month 1..12, and
     * "(invalid)" otherwise.
     */
    public static String month2MonAbbr(int month) {
        switch (month) {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "Jul";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec";
            default:
                return "(invalid)";
        }
    }
}
