import java.util.ArrayList;

public class BuddyPairs {

    public static String buddy(long start, long limit) {

        ArrayList<Long> arr1 = new ArrayList<>();
        ArrayList<Long> arr2 = new ArrayList<>();

        long sum1 = 0;
        long sum2 = 0;
        long n =0;


        for (long i = start; i < limit; i++) {

            sum2 = devisiors(i);
            n = sum2 - 1;
            if (n < start){
                continue;
            }
            sum1 = devisiors(n);
            if (sum1 == i + 1){
                if (i < n){
                    arr1.add(i);
                    arr1.add(n);

                    return arr1.toString().replace("[","(")
                            .replace("]",")").replace(",","");
                } else {
                    arr2.add(i);
                    arr2.add(n);

                    return arr2.toString().replace("[","(")
                            .replace("]",")").replace(",","");
                }
            }


        }


        return "Nothing";
    }

    private static long devisiors(long n) {
        int num = 1;
        double sqrt = Math.sqrt(n);
        for (int i = 2; i < Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == i) {

                    num += i;
                } else {
                    //Тук намериме делители например 12 се дели на 1 2 и 6 и връшаме сумата от тях = 9.
                    num += i;
                    num += n / i;
                }
            }
        }
        return num;
    }

}
