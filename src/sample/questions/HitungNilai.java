package sample.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HitungNilai {
    public static void main(String[] args) {
        String str;
        int tugas, uts, uas;
        double nilai;
        try {
            FileReader inputReader = new FileReader("nilaiTugas.txt");
            BufferedReader inputBuffer = new BufferedReader(inputReader);
            while ((str = inputBuffer.readLine()) != null) {
                tugas = Integer.parseInt(str.substring(1,3));
                uts = Integer.parseInt(str.substring(4,6));
                uas = Integer.parseInt(str.substring(7,9));
                nilai = (20 * tugas + 30 * uts + 50 * uas) / 100.0;
                System.out.printf("tugas %d uts %d uas %d nilai %7.2f\n", tugas, uts, uas, nilai);
            }
            inputBuffer.close();
        } catch (IOException e){
            System.out.println("File Read Eror");
        }
    }
}
