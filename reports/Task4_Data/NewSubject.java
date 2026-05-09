package comp5111.assignment.cut;

// Task 4 reduced CUT: 10 public static methods picked from Subject
// plus the private isOneOf helper. I use the Task-2 fault-fixed
// implementations as ground truth. Signatures are byte-identical to
// the originals in Subject.
public class NewSubject {

    // ---- 1 ----
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
        if (str.startsWith(prefix)) {
            return true;
        }
        String lcStr = str.substring(0, prefix.length()).toLowerCase();
        String lcPrefix = prefix.toLowerCase();
        return lcStr.equals(lcPrefix);
    }

    // ---- 2 ----
    /**
     * Returns the prefix of str up to (but not including) the first
     * character that appears in {@code terminators}.  If no terminator
     * is found, the whole string is returned.
     */
    public static String parseToken(final String str, final char[] terminators) {
        char ch;
        char[] chars = str.toCharArray();
        int pos = 0;
        while (pos < chars.length) {
            ch = chars[pos];
            if (isOneOf(ch, terminators)) {
                break;
            }
            pos++;
        }
        return str.substring(0, pos);
    }

    private static boolean isOneOf(char ch, final char[] charray) {
        boolean result = false;
        for (char element : charray) {
            if (ch == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    // ---- 3 ----
    /**
     * Returns the LAST contiguous run of digits in str interpreted as
     * an int. Empty/null/no-digit inputs return 0.
     * Examples: "1234" -> 1234, "a" -> 0, "1234a123" -> 123.
     */
    public static int extractIntInStr(String str) {
        if (str == null || str.length() < 1) {
            return 0;
        }
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                num = 0;
            } else {
                num = num * 10 + (ch - '0');
            }
        }
        return num;
    }

    // ---- 4 ----
    /**
     * Parses a version string of form a, a.b, a.b.c, or a.b.c.d into a 4-int
     * array. Trailing components default to 0. More than 4 dot-segments or
     * malformed (consecutive dots) produces null.
     */
    public static int[] getVersionNo(final String versionString) {
        if (versionString == null || versionString.length() < 1) {
            return null;
        }
        int[] vernos = new int[4];
        vernos[0] = vernos[1] = vernos[2] = vernos[3] = 0;
        int index = 0, cur = 0, pos;
        String segment;
        do {
            if (index > 3) {
                return null;
            }
            pos = versionString.indexOf('.', cur);
            if (pos == -1) {
                segment = versionString.substring(cur);
            } else if (cur < pos) {
                segment = versionString.substring(cur, pos);
            } else {
                return null;
            }
            vernos[index] = extractIntInStr(segment);
            cur = pos + 1;
            index++;
        } while (pos > 0);
        return vernos;
    }

    // ---- 5 ----
    /**
     * Pads str on the left with padChar so the resulting length is at least
     * length. Null str is treated as "". If str is already long enough it is
     * returned unchanged.
     */
    public static String padLeft(String str, short length, char padChar) {
        if (str == null)
            str = "";
        int pad = length - str.length();
        if (pad <= 0)
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pad; i++)
            sb.append(padChar);
        sb.append(str);
        return sb.toString();
    }

    // ---- 6 ----
    /** Returns true iff year is a leap year (Gregorian rule). */
    public static boolean judgeLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else
            return year % 400 == 0;
    }

    // ---- 7 ----
    /**
     * Returns the number of days in the given month (1-12) of the given
     * year. Returns -1 if month is out of range. February uses leap-year
     * rules.
     */
    public static int calcDaysInMonth(int year, int month) {
        if (month < 1 || month > 12)
            return -1;
        if (month == 2) {
            return judgeLeapYear(year) ? 29 : 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }

    // ---- 8 ----
    /** Returns the calendar quarter (1-4) for month (1-12), or -1 if invalid. */
    public static int getQuarter(int month) {
        if (month < 1 || month > 12)
            return -1;
        if (month <= 3)
            return 1;
        if (month <= 6)
            return 2;
        if (month <= 9)
            return 3;
        return 4;
    }

    // ---- 9 ----
    /**
     * Converts a 3-char month abbreviation (case-sensitive, e.g. "Jan",
     * "Sep") into its month number (1-12). Returns -1 on null, wrong
     * length, or unknown abbreviation.
     */
    public static int monAbbr2month(String abrr) {
        if (abrr == null || abrr.length() != 3) {
            return -1;
        }
        char ch0 = abrr.charAt(0);
        char ch1 = abrr.charAt(1);
        char ch2 = abrr.charAt(2);
        int hash = (ch0 << 16) | (ch1 << 8) | ch2;

        if (hash == 4874606)  return 1;
        if (hash == 4613474)  return 2;
        if (hash == 5071218)  return 3;
        if (hash == 4288626)  return 4;
        if (hash == 5071225)  return 5;
        if (hash == 4879726)  return 6;
        if (hash == 4879724)  return 7;
        if (hash == 4289895)  return 8;
        if (hash == 5465456)  return 9;
        if (hash == 5202804)  return 10;
        if (hash == 5140342)  return 11;
        if (hash == 4482403)  return 12;
        return -1;
    }

    // ---- 10 ----
    /**
     * Inverse of monAbbr2month: returns "Jan".."Dec" for month 1..12, and
     * "(invalid)" otherwise.
     */
    public static String month2MonAbbr(int month) {
        switch (month) {
            case 1:  return "Jan";
            case 2:  return "Feb";
            case 3:  return "Mar";
            case 4:  return "Apr";
            case 5:  return "May";
            case 6:  return "Jun";
            case 7:  return "Jul";
            case 8:  return "Aug";
            case 9:  return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "(invalid)";
        }
    }
}
