package by.itakadimy.boyarenko;

public class MaxValueReplacer {
    public static void main(String[] args) {
        int[] array = {3, -1, 7, -5, 2, -8, 10, -3};
        int maxValue = findMaxValue(array);

        replaceNegativeWithMax(array, maxValue);

        System.out.print("Измененный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int findMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void replaceNegativeWithMax(int[] array, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = maxValue;
            }
        }
    }
}
