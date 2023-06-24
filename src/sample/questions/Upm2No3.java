package sample.questions;

import java.util.Scanner;

public class Upm2No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input batasan angka : ");
        int number = input.nextInt();

        int nilaiGanjil = 0;
        int nilaiGenap = 0;


        System.out.println("Angka-angka yang merupakan kelipatan 3 atau 5 dari "+number+" adalah" );
        for (int i = 1 ; i < number ; i++){
            if (i % 3 == 0 || i % 5 == 0){
                System.out.print( i + " ");
                if (i % 2 == 0){
                    nilaiGenap++;
                }else {
                    nilaiGanjil++;
                }
            }
        }
        System.out.println("\n=======================");
        System.out.println("Jumlah angka genap : "+nilaiGenap);
        System.out.println("Jumlah angka ganjil : "+nilaiGanjil);
    }
}
