package sample.questions;

import java.util.Scanner;

public class Upm2No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arrayInt = new int[5];

        for (int i = 0 ; i < 5 ; i++ ){
            System.out.print("Input bilangan ke-"+(i+1)+" : " );
            arrayInt[i] = input.nextInt();
        }
        System.out.println("=============================================");
        System.out.println("Data yang anda iput adalah : ");

        for (int number : arrayInt ){
            System.out.print(number +" ");
        }
    }
}
