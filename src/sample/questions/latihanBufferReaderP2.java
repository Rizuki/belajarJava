package sample.questions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class latihanBufferReaderP2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan angka :");
        int number = Integer.parseInt(input.readLine());


        int[] isArray = new int[number];

        try {
            for (int i = 0 ; i < isArray.length ; i++){
                System.out.println("Nilai Array : " +isArray[i]);
            }
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Program Berhenti");

    }
}
