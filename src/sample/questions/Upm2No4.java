package sample.questions;

import java.util.Scanner;

public class Upm2No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah baris :");
        int inputBaris = input.nextInt();
        System.out.print("Input jumlah kolom :");
        int inputKolom = input.nextInt();

        for (int i = 1 ; i <= inputBaris ; i++){
            for (int j = 1 ; j <= inputKolom ; j++){
                if ((i+j) % 2 == 0 ){
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
