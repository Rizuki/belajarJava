package sample.questions;

import java.util.Scanner;
public class nomerDua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi Variable
        int angkaPertama , angkaKedua , hasil ;

        //Proses Input data
        System.out.print("Masukan angka pertama : ");
        angkaPertama = input.nextInt();
        System.out.print("Masukan angka Ke dua : ");
        angkaKedua = input.nextInt();

        //Percabangan
        if ( angkaPertama == angkaKedua ){
            hasil = angkaPertama + angkaKedua ;
        } else {
            hasil = angkaPertama * angkaKedua ;
        }
        System.out.println("Hasil Output dari : " +hasil);

    }
}
