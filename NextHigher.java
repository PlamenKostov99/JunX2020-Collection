public class NextHigher {

    public static int nextHigher(int n) {

        int rightOne, nextHigherOneBit, rightOnesPattern, next = 0;

        if (n > 0) {

            //right most bits
            rightOne = n & -n;

            nextHigherOneBit = n + rightOne;

            rightOnesPattern = n ^ nextHigherOneBit;

            rightOnesPattern = (rightOnesPattern) / rightOne;

            rightOnesPattern >>= 2;

            next = nextHigherOneBit | rightOnesPattern;


        }
        return next;
    }
}
