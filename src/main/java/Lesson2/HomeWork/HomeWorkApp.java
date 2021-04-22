package Lesson2.HomeWork;

public class HomeWorkApp {

        static boolean interval1(int a, int b) {

            return (a + b) >= 10 && (a + b) <= 20;
        }

    static String plusMinus(int a) {

        if (a >= 0) {
            return "положительное";
        } else return "отрицательное";
    }
    static boolean plusMinus1(int a) {
        return a < 0;
    }
    static void printString(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }


        public static void main(String[] args) {
            System.out.println(interval1(14,17));
            System.out.println(plusMinus(15));
            System.out.println(plusMinus1(2));
            printString("привет", 5);
        }
    }

