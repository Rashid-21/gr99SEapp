package task;


import java.util.Scanner;

public class Task4 {
    public static String soz(String revers){
        String ters = "";
        for (int i=revers.length()-1;i>=0;i--){
            ters+=revers.charAt(i);

        }
        return ters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin");
        String ters = sc.nextLine();
        String soz = Task4.soz(ters);
        System.out.println(soz);
    }

}
