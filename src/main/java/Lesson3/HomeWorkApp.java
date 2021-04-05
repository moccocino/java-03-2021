package Lesson3;
import java.util.Arrays;

public class HomeWorkApp {
    static int[] task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }
    static int[] task2(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
     static int[] task3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] =  array[i] * 2;
            }
        }
        return array;
    }
    static void task4() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                } System.out.println();
            }
        }
    }

    private static int[] task5(int length, int initialValue) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = initialValue;
        }
        return array;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(task1(new int[]{ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 })));
        System.out.println(Arrays.toString(task2(100)));
        System.out.println(Arrays.toString(task3(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 })));
        task4();
        System.out.println(Arrays.toString(task5(15, 5)));
    }


}


