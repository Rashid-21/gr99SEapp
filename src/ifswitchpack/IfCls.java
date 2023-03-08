package ifswitchpack;

import java.util.Scanner;

public class IfCls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Istifadeci adini daxil edin");
        String user = scanner.next();
        System.out.println("Sifre daxil edin");
        int password = scanner.nextInt();


        if (user.equals("admin") && password == 1234) {
            System.out.println("Succsess");

        } else if (user.equals("admin") && password != 1234) {
            System.out.println("Shifre yanlisdir");

        } else if (!user.equals("admin") && password == 1234) {
            System.out.println("Istifadechi yanlisdir");

        } else {
            System.out.println("Istifadeci ve sifre yanlisdir");
        }


    }
}
