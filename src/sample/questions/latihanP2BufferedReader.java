package sample.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihanP2BufferedReader {
    public static void main(String[] args) throws IOException {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = 1, x, jumlah = 0;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan Data ke-"+n+" :");
        try {
            while (( x = Integer.parseInt(input.readLine()))!=0){
                if (x > max) max = x;
                if (x > min) min = x;
                jumlah += x;
                System.out.print("Masukan Angka Ke- "+(++n)+ " [Ketik 0 Untuk STOP] : ");
            }
        } catch (Exception e){

        }
        double rataRata = (double) jumlah/(n-1);

        System.out.println("total          : " +jumlah);
        System.out.println("Rata-Rata      : " +rataRata);
        System.out.println("Angka Terkecil : " +min);
        System.out.println("Angka Terbesar : " +max);
    }
}
