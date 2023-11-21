package sample.questions;
import java.util.Scanner;
public class latihanArraymeltiInputp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jumlah Array : ");
        int jumlahArray = input.nextInt();

        int[] entry = new int[jumlahArray];

        for (int i = 0 ; i < entry.length ; i++){

            System.out.print("Masukan Nilai Array Ke - "+(i+1)+" : ");
            entry[i] =input.nextInt() ;
        }

        System.out.println();
        System.out.println("Nilai Array Yang Anda Masukan Adalah");

        for (int i = 0 ; i < entry.length ; i++){
            System.out.println("Nilai Array Ke - "+(i+1)+" : " +entry[i]);
        }
    }
}
