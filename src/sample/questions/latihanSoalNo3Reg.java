package sample.questions;

import java.util.Scanner;

public class latihanSoalNo3Reg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number ;

        System.out.print("Input sebuah angka : ");
        number = input.nextInt();

        if ( (number  % 4 == 0) && (number % 5 == 0) ){
            System.out.print(number + " Dapat dibagi angka 4 dan 5 ");
        } else if (( number  % 4 == 0) || ( number % 5 == 0 )) {
            System.out.print(number + " dapat dibagi oleh salah satu dari angka 4 atau 5, tetapi tidak keduanya  ");
        } else {
            System.out.print("tidak dabat dibagi oleh angka 4 dan 5");
        }


    }
}
