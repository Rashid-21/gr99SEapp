package task;

import java.util.Scanner;

public class Task6 {
    public static boolean foo(String herf){
        if (herf.startsWith("a")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz = sc.nextLine();
        boolean foo = Task6.foo(soz);
        System.out.println(foo);
    }
}
