package sample.questions;

import java.util.Scanner;
public class javaLite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, jenis, harga, bayar ;

        System.out.println("-----------------------------------------");
        System.out.println("| Jenis bahan bakar | Harga perLiter \t|");
        System.out.println("-----------------------------------------");
        System.out.println("| 1. JavaLite\t\t| 2. 7.650\t\t\t|");
        System.out.println("| 1. JavaMax\t\t| 2. 9.000\t\t\t|");
        System.out.println("-----------------------------------------");

        System.out.print("Jenis Bahan Bakar ( 1 atau 2 ) : ");
        jenis = input.nextInt();
        System.out.print("Jumlah Bahan Bakar Perliter : ");
        jumlah = input.nextInt();

        harga = 0;
        if (jenis == 1 ){
            harga = 7650;
        } else if (jenis == 2) {
            harga = 9000;
        }

        bayar = harga * jumlah ;
        System.out.println("-----------------------------------------");
        System.out.println("Biaya yang harus di bayar adalah Rp." +bayar);
        System.out.println("-----------------------------------------");
    }
}
