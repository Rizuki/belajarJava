package sample.questions;

import java.util.Scanner;
public class nomerSatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Deklarasi variable
        double r, volume ;
        double phi = 3.14;

        //Proses input
        System.out.print("Input jari jari bola :");
        r = input.nextDouble();

        //Perhitungutan Output
        volume = ( 4 * phi * r * r * r ) / 3 ;

        System.out.print("Volume Bola adalah : " +volume);
    }
}
