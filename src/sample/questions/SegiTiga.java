package sample.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SegiTiga {
//    public static void main(String[] args) {
//        segiTiga(10);
//    }

     public static void main (String[] args)  {

         BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            try {

                System.out.print("Masukan Value :");
                int value = Integer.parseInt(input.readLine());

                for (int i = 1 ; i <= value ; i++ ){
                    for (int j = 1 ; j <= i ; j++){
                        System.out.print(" *");
                    }
//                    for (int k = 1 ; k <= i ; k++){
//                        System.out.print(" *");
//                    }
                    System.out.println();
                }
            } catch (Exception e){
                System.out.println(e);
            }
     }
}
