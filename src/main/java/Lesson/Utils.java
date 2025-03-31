package Lesson;

public class Utils {

    public static boolean isPolindpome(String str) {

        if (isNull(str)) {
            return false;
        }

        str = str.toLowerCase();
        final int LAST_INDEX = str.length() - 1;
        final int HALF_INDEX = str.length() / 2;

        if (isEmpty(str)) {
            return false;

        }
        for (int i = 0; i < HALF_INDEX; i++) {
            if (isEqual(str.charAt(i), str.charAt(LAST_INDEX - i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEqual(char leftChar, char rightChar) {
        return leftChar != rightChar;
    }

    private static boolean isEmpty(String str) {
        return str == "";
    }

    private static boolean isNull(String str) {
        return str == null;
    }


}


