package p02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        int a = 128 ;
        int b = 17 ;
        System.out.println("c="+(a+b));
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("GIRDIGINIZ SAYI CIFT SAYIDIR");
        }else System.out.println("Girdiginiz sayi cift sayi degildir ");
    }
}
