import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 7, 9, 11};

        //expect 5
        System.out.println(binarySearch(ints, 9));

        //expect -1
        System.out.println(binarySearch(ints, 8));

        //Java already have BS implemented
        System.out.println(Arrays.binarySearch(ints, 9));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
