package task;

public class Task {

    public static String foo(int bal) {
        if (bal > 50 && bal < 61) {
            return "E";
        } else if (bal > 60 && bal < 71) {
            return "D";

        } else if (bal > 70 && bal < 81) {
            return "C";

        } else if (bal > 80 && bal < 90) {
            return "B";

        } else if (bal > 90 && bal <= 100) {
            return "A";
        } else {
            return "F";
        }


    }

    public static boolean math(int number) {
        if (number % 3 == 0 || number % 4 == 0) {
            return true;

        } else {
            return false;
        }

    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;

        }
        return f;
    }

    public static int quvvet(int c, int d) {
        int netice = 1;

        for (int i = 1; i <= d; i++) {
            netice = netice * c;
        }
        return netice;



    }


}

