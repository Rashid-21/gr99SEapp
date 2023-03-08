package ifswitchpack;

import java.util.Scanner;

public class IfCls2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi daxil edin");
        String name = scanner.next();
        String surname = "";

        if (name.equals("Rahman")) {
            surname = "Aliyev";
        } else if (name.equals("Telman")) {
            surname = "Ehmedli";

        } else if (name.equals("Nihad")) {
            surname = "Azizov";

        } else {

            surname = "not found";
        }
        System.out.println(surname);
    }
}
