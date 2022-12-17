package HW_Exceptions_1;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {

    public static void main(String[] args) {
        //exceptionDivisionZero(10, 0);
        //exceptionNull(null);
        exceptionSearch(new int[]{1, 2, 3, 4}, 8);
    }

    private static void exceptionDivisionZero(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    private static void exceptionNull(int[] arr) {
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void exceptionSearch(int[] arr, int num) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                indexes.add(i);
            }
        }
        if (indexes.size() > 0) {
            System.out.println(String.format("Искомое значение находится в индексах: " + indexes));
        } else {
            throw new RuntimeException("Искомое значение не найдено");
        }
    }
}
