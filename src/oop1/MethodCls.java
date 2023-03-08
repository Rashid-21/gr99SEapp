package oop1;

import java.util.Scanner;

public class MethodCls {
    // geriye deyer qaytarmayan bosh
    static void yaz() {
        System.out.println("Rashid Alakbarov");
    }
    // geriye deyer qaytarmayan parametrli

    static void yazdir(String ad) {
        System.out.println(ad);
    }

    // geriye deyer qaytaran bosh

    static int topla() {
        int netice = 60 + 70;

        return netice;
    }

    //geriye deyer qaytaran parametrli

    static int vurma(int a,int b){
        int netice = a * b;
        return netice;
    }


    public static void main(String[] args) {
//        yaz();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("adiniz daxil edin");
//        String name = sc.next();
//
//        yazdir(name);

//        int a = topla();
//        System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println("a ni daxil edin");
        int a = sc.nextInt();
        System.out.println("b ni daxil edin");
        int b = sc.nextInt();
        int result = vurma(a,b);
        System.out.println(result);




    }

}
