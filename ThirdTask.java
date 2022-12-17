package HW_Exceptions_1;

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDifference(new int[]{5, 4, 6}, new int[]{3, 0, 3, 0})));
    }

    public static int[] arrayDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Разные длины массивов");
        }
        int[] difArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            difArr[i] = arr1[i] - arr2[i];
        }
        return difArr;
    }
}
