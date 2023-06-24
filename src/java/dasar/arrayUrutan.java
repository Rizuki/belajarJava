package java.dasar;

import java.util.Scanner;
public class arrayUrutan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] mobil = new String[5];

        for ( int a = 0 ; a < mobil.length ; a++){
            System.out.print(" nama mobil ke - "+a+ ":" );
            mobil[a] = input.nextLine();

        }
        System.out.println("--------------------");

        for (String b : mobil){
            System.out.println(b);
        }

    }
}
