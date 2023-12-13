package sample.questions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StockBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //mendapat waktu saat ini
        LocalDateTime currentTime = LocalDateTime.now();
        //Menentukan  format tampilan waktu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.print("Masukan Jumlah Barang : ");
        int jumlahBarang = input.nextInt();
        String[][] data = new String[jumlahBarang][4];
        for (int i = 0; i < jumlahBarang; i++) {
            input.nextLine();
            System.out.print("Masukan Kode  : ");
            data[i][0] = input.nextLine();
            System.out.print("Nama Barang   : ");
            data[i][1] = input.nextLine();
            System.out.print("QTY           : ");
            data[i][2] = String.valueOf(input.nextInt());
            System.out.print("Harga Barang  : ");
            data[i][3] = String.valueOf(input.nextInt());
            System.out.println();
        }
        long totalQty = 0;
        long totalHarga = 0;
        System.out.printf("\t\t\t\tPT MILIK KITA BERSAMA%n");
        System.out.printf("\t\t\t  Laporan Penjualan Barang%n");
        System.out.println();
        admin("Edi Irawan");
        System.out.println("Waktu Order\t\t : "+formattedTime);
        System.out.printf("%n=========================================================%n");
        System.out.printf("| %-11s | %-15s | %-6s | %-10s |%n", "Kode Barang", "Nama Barang", "QTY", "Harga Barang");
        System.out.printf("=========================================================%n");
        for (int i = 0; i < jumlahBarang; i++) {
            totalQty += Long.parseLong(data[i][2]);
            totalHarga += Long.parseLong(data[i][3]);
            System.out.printf("| %-11s | %-15s | %-6s | %-12s |%n", data[i][0], data[i][1], data[i][2], data[i][3]);
            System.out.printf("---------------------------------------------------------%n");
        }
        System.out.printf("  %29s | %-6s | %-12s %n", "Total", totalQty, totalHarga);
        System.out.println();
        System.out.println();
        massage();
    }
    static void admin(String name){
        System.out.println("Admin oprasional : "+name);
    }
    static void massage(){
        System.out.println("\t\t\t\tTerimakasih Atas Kunjunganya");
    }
}
