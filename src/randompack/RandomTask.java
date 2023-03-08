package randompack;

import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzunlugu daxil edin");
        int uzunluq = scanner.nextInt();
        String shifre = "";

        Random random = new Random();

        for (int i = 0; i < uzunluq; i++) {
            int eded = random.nextInt(10);
            shifre += eded;


        }
        System.out.println(shifre);
    }

}
