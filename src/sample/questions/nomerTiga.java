package sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class nomerTiga {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        System.out.print("---------------------------------------\n");
        System.out.print("|\tJarak Tempuh\t\t|\tDiskon    |\n");
        System.out.print("---------------------------------------\n");
        System.out.print("|\t0 - 10 km\t\t\t|\t0%\t\t  |\n");
        System.out.print("---------------------------------------\n");
        System.out.print("|\t10 km - 15 km\t\t|\tRp. 2.000 |\n");
        System.out.print("---------------------------------------\n");
        System.out.print("|\t>15 km\t\t\t\t|\tRp. 5.000 |\n");
        System.out.print("---------------------------------------\n");

        //Deklarasi Variable
        String name ;
        int jarak, tarif ,diskon ,bayar , total;

        //Proses Input
        System.out.println();
        System.out.print("Nama Customer : ");
        name = br.readLine();
        System.out.print("Jarak yang di tempuh ( km ) : ");
        jarak = Integer.parseInt(br.readLine());

        //Proses Percabangan
        tarif = 0;
        if(jarak <= 4){
            total = 9500;
        } else {
            total = 9500 + ( jarak - 4 ) * 2500;
        }
        if (jarak <= 10 ){
            diskon = 0;
        } else if (jarak <= 15) {
            diskon = 2000;
        } else {
            diskon = 5000;
        }

        bayar = total - diskon;

        // Proses Output
        System.out.println("=======================================");
        System.out.println("Selamat anda mendapatkan potongan : " +diskon);
        System.out.print("Tarif yang harus di bayar " +name+ " adalah : " +bayar);

        br.close();

    }
}
