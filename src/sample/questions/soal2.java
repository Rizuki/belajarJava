package sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class soal2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
        int bilangan ;

        System.out.println("Program verivikasi angka pembagian 3 dan 5");
        System.out.print("Silahkan Masukan Bilangan : ");
        bilangan = Integer.parseInt(br.readLine());

        if (bilangan % 3 == 0 && bilangan % 5 == 0){
            System.out.println("Bilangan tersebut dapat habis di bagi 3 dan 5");
        }else {
            System.out.println("Bilangan tersebut tidak dapat habis di bagi 3 dan 5");
        }

        br.close();
    }

}
