package sample.questions;

import java.util.Scanner;
public class TugasP10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digit Terahir NPM Anda : ");
        int npm = input.nextInt();


        System.out.println("Hasil Output : "+pagi(npm));

    }

    static int pagi (int b){
        if ( b == 0 ){
            return 3;
        } else {
            return 2 * pagi(b - 1) - 1;
        }
    }
}
