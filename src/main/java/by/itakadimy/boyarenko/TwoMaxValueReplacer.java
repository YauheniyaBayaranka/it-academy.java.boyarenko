package by.itakadimy.boyarenko;

public class TwoMaxValueReplacer {
    public static void main(String[] args) {
        int[] array = {3, 150, 0, -5, 16, -30, -2};
        int max = array[0];
        for (int num : array) {
            if (max < num) {
                max = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = max;
            }
            System.out.println("array[" + i + "]= " + array[i]);
        }
    }
}
