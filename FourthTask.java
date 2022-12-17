package HW_Exceptions_1;

import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(privateArray(new int[]{10, 4}, new int[]{2, 2})));
    }

    public static int[] privateArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинны массивов не равны");
        }
        int[] privArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0");
            }
            privArr[i] = arr1[i] / arr2[i];
        }
        return privArr;
    }
}
