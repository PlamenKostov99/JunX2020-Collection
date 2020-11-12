import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Snail {

    public static int[] snail(int[][] array) {

        if (array[0].length == 0)
            return array[0];

        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.stream(array[0]).boxed().collect(Collectors.toList()));

        int[][] next = array;

        //Правим копие на входа array
        while (next != null && next.length > 1) {
            next = copyNext(next);
            if (next != null) {
                next = rotateCounterClockwise(next);
                list.add(Arrays.stream(next[0]).boxed().collect(Collectors.toList()));
            }
        }
        return list.stream().flatMap(List::stream).mapToInt(i -> i).toArray();
    }

    private static int[][] copyNext(int[][] array) {
        if (array.length == 1)
            return null;
        //Нова матрица с 2 реда и 3 колони.
        int[][] newArray = new int[array.length - 1][array[0].length];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[i - 1][j] = array[i][j];
            }
        }
        return newArray;
    }

    private static int[][] rotateCounterClockwise(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                newArray[i][j] = array[j][Math.abs(i - (array[0].length - 1))];
            }
        }
        return newArray;

    }
}