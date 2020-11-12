public class NumberZooPatrol {

    public static int findMissingNumber(int[] numbers) {

        int size = numbers.length;
        int total = 1;

        //Събираме всички индекси и от тях вадим всички елементи в колекцията.
        for (int i = 2; i <= (size + 1); i++) {

            total += i;
            total -= numbers[i - 2];
        }

        return total;
    }
}
