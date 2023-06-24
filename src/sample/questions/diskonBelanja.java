package sample.questions;

import java.util.Scanner;
public class diskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int belanja, diskon, total;

        System.out.print("Nominal belanja : Rp.");
        belanja = input.nextInt();

        if (belanja >= 1000000) {
            diskon = 100000;
        } else if (belanja >= 500000) {
            diskon = 50000;
        } else if (belanja >= 100000) {
            diskon = 20000;
        } else if (belanja >= 100000) {
            diskon = 20000;
        } else {
            diskon = 0;
        }
        System.out.println();
        System.out.println("------------------------------------------------");
        total = (belanja - diskon);
        System.out.println("Diskon yang anda dapatkan : Rp." + diskon);
        System.out.println("Harga yang harus dibayarkan adalah : Rp." + total);

    }
}
