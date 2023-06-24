package sample.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class pemog2Soal3Sore {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nilaiRataRata ;
        String keterangan, predikat ;

        System.out.print(" Nilai Rata - rata : ");
        nilaiRataRata = Integer.parseInt(br.readLine());
        System.out.println("=====================================");

        if (nilaiRataRata > 90){
            predikat = " Sangat Mumuaskan ";
        }else if ( nilaiRataRata > 80){
            predikat = " Mumuaskan ";
        } else if ( nilaiRataRata > 70) {
            predikat = " Baik ";
        } else if (nilaiRataRata > 60 ) {
            predikat = " Cukup ";
        } else {
            predikat = " Kurang ";
        }

        System.out.println(" Predikat :" +predikat);
        keterangan = (nilaiRataRata > 70 ) ? "Lulus " : " Tidak Lulus ";
        System.out.println(" Keterangan :" +keterangan);
        br.close();
    }

}
