package task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz = sc.nextLine();
        int netice = Task5.say(soz);
        System.out.println(netice);

    }
    public static int say(String herf) {
        int result = 0;
        for (int i = 0; i <= herf.length() - 1; i++) {

            if (herf.charAt(i) == 'a' || herf.charAt(i) == 'e' || herf.charAt(i) == 'i') {
                result++;
            }

        }
        return result;
    }
}
