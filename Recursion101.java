import java.util.Arrays;

public class Recursion101 {

    public static int [] solve(int a, int b){


        while (a >= 2 * b || b >= 2 * a){

            if (a == 0 || b == 0){
                return new int[] {a,b};
            }else if (a >= 2 * b){
                a = a - 2 * b;
            }else if (b > 2 * a){
                b = b - 2 * a;
            }
        }

        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;

        return arr;
    }
}
