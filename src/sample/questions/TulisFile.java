package sample.questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileOutputStream outputFile = new FileOutputStream("obat.txt");
            PrintStream cetak = new PrintStream(outputFile);
            cetak.println("SYR001|Panadol|Botol|6500");
            cetak.println("SYR002|Bodrex|Botol|5500");
            cetak.println("SYR003|Antimo|Botol|4500");
            cetak.println("SYR004|Diare|Botol|3500");
            cetak.println("SYR005|Antangin|Botol|2500");
            cetak.close();
        } catch (Exception e){
            System.out.println("Ada Kesalahan : " +e.getMessage());
        }
        System.out.println("Tulis Ke file berhasil");
    }
}
