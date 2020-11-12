public class EqualSidesToArr {

    public static int findEvenIndex(int[] arr) {

        int result = 0;
        int leftSide = 0;

        for (int i1 : arr) {

            result += i1;
        }

        for (int j = 0; j < arr.length; j++) {

            result -= arr[j];

            if (leftSide == result) {
                return j;
            }

            leftSide += arr[j];
        }


        return -1;
    }
}
