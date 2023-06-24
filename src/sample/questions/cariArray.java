package sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class cariArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] nilaiArray =  new int[100];
        int arrayCount , i , num;

        System.out.print("Input Jumlah Element Array : ");
        arrayCount = Integer.parseInt(br.readLine());
        System.out.print("Inputan yang anda masukan "+arrayCount+" angka :");
        System.out.println();

        // Simpan setiap angka yang di input
        for ( i = 0 ; i < arrayCount ; i++ ){
            nilaiArray[i] = Integer.parseInt(br.readLine());
        }
        System.out.println();

        System.out.print("Input angka yang akan di cari :");
        num = Integer.parseInt(br.readLine());

        // Proses pencarian Array
        for ( i = 0 ; i < arrayCount ; i++){
            if (nilaiArray[i] == num ){
                System.out.print("Angka di temukan pada Indeks ke - " +i);
                break;
            }
        }

        if ( i == arrayCount ){
            System.out.println("Angka yang anda input tidak di temukan \n");
        }
        System.out.println();

        br.close();
    }
}
