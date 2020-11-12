import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DoubleCola {

    public static String WhoIsNext(String[] names, int n) {

        String[] res = names[0].split(" ");

        n = n - 1;
        int personNum = names.length;

        while (n >= personNum) {

            int div = n - personNum;
            //Делим на 2 докато не достигнем число равно или по малко на n
            //Ако стигнем такова число връшаме масива с стойността на n.
            n = (int) Math.floor(div / 2);
        }

        return names[n];
    }
}
