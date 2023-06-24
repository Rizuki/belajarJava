package sample.questions;

import java.util.Scanner;

public class menetukanNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n  ;
        int k  ;

        System.out.print(" Masukan Nilai N : ");
        n = input.nextInt();
        System.out.print(" Masukan Nilai K : ");
        k = input.nextInt();



        for ( int i = 1 ; i < n ; i++){
            if (( i % 7 < 2 ) || ( i % 2 > ( n - 3 ))){
                k *= (n & 3);
            } else if ( i % 2 >= 4 ) {
                k-= (k + n);
            } else{
                k = k * 2;
            }
        }
        System.out.println("Maka Hasilnya adalah :" +k);
    }
}
