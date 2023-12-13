package sample.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programKasirp2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Harga Barang Rp. ");
        int hargaBarang = Integer.parseInt(input.readLine());

        System.out.print("Jumlah Barang Yang Di Ambil : ");
        int jumlahBarang = Integer.parseInt(input.readLine());

        int total = hargaBarang * jumlahBarang;

        System.out.println();
        System.out.println("========================================");
        System.out.println("Harga Barang Rp. " +hargaBarang);
        System.out.println("Jumlah Barang : " +jumlahBarang);
        System.out.println("========================================");

        System.out.println();
        System.out.println("Total Harga Sebelum Diskon Rp. " +total);
        if (total > 10000 & total <= 100000){
            System.out.println("Tidak Ada Diskon");
            System.out.print("Toatal Yang Harus di bayar (Setelah Diskon) Rp. ");
            System.out.print(total-(total * 0));
        } else if (total > 100000 & total <= 500000) {
            System.out.println("Diskon 5%");
            System.out.print("Toatal Yang Harus di bayar (Setelah Diskon) Rp. ");
            System.out.println(total-(total * 0.05));
        }else if (total > 500000 & total <= 1000000) {
            System.out.println("Diskon 10%");
            System.out.print("Toatal Yang Harus di bayar (Setelah Diskon) Rp. ");
            System.out.println(total-(total * 0.1));
        }else {
            System.out.println("Diskon 15%");
            System.out.print("Toatal Yang Harus di bayar (Setelah Diskon) Rp. ");
            System.out.println(total-(total * 0.15));
        }
    }
}
