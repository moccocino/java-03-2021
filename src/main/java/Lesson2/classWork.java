package Lesson2;

public class classWork {

    static void printTextNTimes(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    static void printUseWhile(int n) {
        int i = 0;
        while (i < n) {
            System.out.print(" * ");
            i++;
        }
    }
    // ()(())((()))(((()))) n = 4
    static void printBracketsSequence(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
        System.out.println();
    }


    static void printFirstNBrackets(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException(
                    "param n should be positive, but now n = " + n);
        }

        int begin = 1;

        while (true) {
            for (int i = 0; i < begin; i++) {
                System.out.print("(");
                n--;
                if (n == 0) {
                    return;
                }
            }
            for (int i = 0; i < begin; i++) {
                System.out.print(")");
                n--;
                if (n == 0) {
                    return;
                }
            }
            begin++;
        }
    }


        public static void main(String[] args) {
        printTextNTimes("Hello", 5);
        printUseWhile(10);
        System.out.println();
        printBracketsSequence(5);
            printFirstNBrackets(17);
            System.out.println();
    }
}

