package sample.questions;

import java.util.Scanner;

public class Upm2No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka ;


        do {
            System.out.print("Input sebuah angka : ");
            angka = input.nextInt();
        }while (angka <= 0);

        System.out.println("Angka yang dapat membagi "+angka+" tanpa sisa adalah");
        for (int i = 1 ; i <= angka ; i++){
            if (angka % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
}
