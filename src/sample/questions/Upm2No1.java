package sample.questions;

import java.util.Scanner;

public class Upm2No1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka ;
        int bilBagi = 1;

        System.out.print("Input sebuah angka : ");
        angka = in.nextInt();

        while (bilBagi <= 10){
            int hasilBagi = angka / bilBagi;
            int sisaBagi = angka % bilBagi;
            System.out.printf("%d : %d = %d sisa %d\n", angka ,bilBagi ,hasilBagi ,sisaBagi);
            bilBagi++;
        }

    }
}
