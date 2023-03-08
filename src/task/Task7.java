package task;

import java.util.Scanner;

public class Task7 {
    public static int kod(String soz){
        int cem = 0;

        for (int i = 0; i <= soz.length() - 1; i++) {
            int kod = soz.charAt(i);
            cem += kod;
        }
        return cem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String soz =sc.nextLine();
        int kodcem = Task7.kod(soz);
        System.out.println(kodcem);
    }
}
