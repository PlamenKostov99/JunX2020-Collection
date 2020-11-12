import java.util.ArrayList;
import java.util.Collections;

public class Multiply {

    public static long nextBiggerNumber(long n) {

        if (n < 10) {
            return -1;
        }

         StringBuilder sb = new StringBuilder();

        final String str = String.valueOf(n);
        for (int i = str.length() - 1; i > 0; i--) {

             int digit = Character.getNumericValue(str.charAt(i - 1));
            if (digit < Character.getNumericValue(str.charAt(i))) {

                int smallestLargerDigit = 9;
                int indexOfSmallestLargerDigit = 0;

                for (int j = i; j < str.length(); j++) {

                    final int actualDigit = Character.getNumericValue(str.charAt(j));

                    if (actualDigit > digit && actualDigit <= smallestLargerDigit) {
                        smallestLargerDigit = actualDigit;
                        indexOfSmallestLargerDigit = j;
                    }
                }

                 ArrayList<Integer> digits = new ArrayList<>();

                for (int j = i - 1; j < str.length(); j++) {
                    if (j != indexOfSmallestLargerDigit) {
                        digits.add(Character.getNumericValue(str.charAt(j)));
                    }
                }

                sb.append(str.substring(0, i - 1));
                sb.append(smallestLargerDigit);

                Collections.sort(digits);
                for (int actualDigit : digits) {
                    sb.append(actualDigit);
                }
                return Long.parseLong(sb.toString());
            }
        }
        return -1;
    }
}

