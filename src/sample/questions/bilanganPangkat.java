package sample.questions;

import java.util.Scanner;
public class bilanganPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil1, bil2;
        long hasil;

        System.out.println("Input bilangan pertama : ");
        bil1 = input.nextInt();

        System.out.println("Inout Bilangan Ke dua : ");
        bil2 = input.nextInt();
        System.out.println("===========================");

        hasil = 1;
        for (  ; 1 <= bil2 ; );
        System.out.println(hasil * bil1);

        if ( bil1 > bil2 ){
            System.out.println(bil1);
        }else{
            System.out.println(bil2);
        }
        System.out.println("nilai");
        System.out.println("Nilai terbesar dari 2 Nilai tersebut adalah" + bil2);




    }
}
