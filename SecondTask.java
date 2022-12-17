package HW_Exceptions_1;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(sum2d(new String[][]{{"1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1"}}));
//        System.out.println(sum2d(new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}}));
//        System.out.println(sum2d(null));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
/*
 *  1 исключение длинна массива меньше 5 (ArrayIndexOutOfBoundsException)
 *  2 исключение значение не цифра (NumberFormatException)
 *  3 исключение вместо массива пришел Null (NullPointerException)
 * */