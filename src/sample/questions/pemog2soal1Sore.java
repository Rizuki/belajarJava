package sample.questions;

import java.util.Scanner;

public class pemog2soal1Sore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sudutSatu, sudutDua, sudutTiga ;

        System.out.print(" Masukan sudut 1 : ");
        sudutSatu = input.nextInt();
        System.out.print(" Masukan sudut 2 : ");
        sudutDua = input.nextInt();
        System.out.print(" Masukan sudut 3 : ");
        sudutTiga = input.nextInt();

        System.out.println("--------------------------------------------");

        int semuaSudut = sudutSatu + sudutDua + sudutTiga ;

        if ( semuaSudut == 180 ){
            System.out.println(" Ketiga sudut dapat membuat sebuah segitiga ");
        } else {
            System.out.println(" Ketiga sudut tidak dapat membuat sebuah segitiga ");
        }
    }

}
