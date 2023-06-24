package sample.questions;

import java.util.Scanner;
public class tugasKelompok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklasri variable
        int nilaiSatu ;
        int nilaiDua;
        float nilaiTiga;
        float nilaiEmpat;
        float total;

        //tampilan table
        System.out.print("============================================\n");
        System.out.print("|                KELOMPOK 1                 |\n");
        System.out.print("|         OPRASI DASAR ARITMATIKA           |\n");
        System.out.print("============================================\n");

        System.out.println();
        System.out.print("---------------------------------------------\n");
        System.out.print("|\t\t\t\tPenjumlahan\t\t\t\t\t|\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Nilai ke-1 \t: ");
        nilaiSatu = input.nextInt();
        System.out.print("Nilai ke-2 \t: ");
        nilaiDua = input.nextInt();
        total = (nilaiSatu + nilaiDua);
        System.out.print("---------------------------------------------\n");
        System.out.print("Hasil Penjumlahan " +nilaiSatu+ " dan " +nilaiDua+ " : " +total);

        System.out.println();
        System.out.println();
        System.out.print("---------------------------------------------\n");
        System.out.print("|\t\t\t\tPengurangan\t\t\t\t\t|\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Nilai ke-1 \t: ");
        nilaiSatu = input.nextInt();
        System.out.print("Nilai ke-2 \t: ");
        nilaiDua = input.nextInt();
        total = (nilaiSatu - nilaiDua);
        System.out.print("---------------------------------------------\n");
        System.out.print("Hasil Pengurangan " +nilaiSatu+ " dan " +nilaiDua+ " : " +total);

        System.out.println();
        System.out.println();
        System.out.print("---------------------------------------------\n");
        System.out.print("|\t\t\t\tPerkalian\t\t\t\t\t|\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Nilai ke-1 \t: ");
        nilaiSatu = input.nextInt();
        System.out.print("Nilai ke-2 \t: ");
        nilaiDua = input.nextInt();
        total = (nilaiSatu * nilaiDua);
        System.out.print("---------------------------------------------\n");
        System.out.print("Hasil Perkalian " +nilaiSatu+ " dan " +nilaiDua+ " : " +total);

        System.out.println();
        System.out.println();
        System.out.print("---------------------------------------------\n");
        System.out.print("|\t\t\t\tPembagian\t\t\t\t\t|\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Nilai ke-1 \t: ");
        nilaiTiga = input.nextFloat();
        System.out.print("Nilai ke-2 \t: ");
        nilaiEmpat = input.nextFloat();
        total = (nilaiTiga / nilaiEmpat);
        System.out.print("---------------------------------------------\n");
        System.out.print("Hasil Pembagian " +nilaiTiga+ " dan " +nilaiEmpat+ " : " +total);

    }
}
