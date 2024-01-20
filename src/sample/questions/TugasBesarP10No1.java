package sample.questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasBesarP10No1 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan Banyak Jumlah Nasabah : " );
        int inputNasabah =Integer.parseInt(input.readLine());
        System.out.println("===========================================================================");

        String[][] jumlahNasabah = new String[inputNasabah][3];

        for (int i = 0; i < inputNasabah; i++) {
            System.out.print("No Rekening " + (i+1)+" : ");
            jumlahNasabah[i][0] = input.readLine();
            System.out.print("Nama Nasabah  : " );
            jumlahNasabah[i][1] = input.readLine();
            System.out.print("Saldo Awal    : " );
            jumlahNasabah[i][2] = String.valueOf(Double.parseDouble(input.readLine()));
            System.out.println();
        }

        double bunga ;
        double saldoAhir ;
        System.out.printf("============================================================================================%n");
        System.out.printf("\t\t\t\t\t\t BANK EDI IRAWAN \t\t\t\t\t\t%n");
        System.out.printf("============================================================================================%n");
        System.out.printf("| %-15s | %-15s | %-17s | %-15s | %-15s |%n","No Rekening","Nama Nasabah","Saldo Awal","Bunga","Saldo Awal");
        System.out.printf("============================================================================================%n");

        for (int i = 0; i < inputNasabah; i++) {
            if(Double.parseDouble(jumlahNasabah[i][2]) >= 5000000){
                bunga = Double.parseDouble(jumlahNasabah[i][2]) * 0.05;
            } else if (Double.parseDouble(jumlahNasabah[i][2]) >= 3000000) {
                bunga = Double.parseDouble(jumlahNasabah[i][2]) * 0.03;
            }  else if (Double.parseDouble(jumlahNasabah[i][2]) >= 1000000) {
                bunga = Double.parseDouble(jumlahNasabah[i][2]) * 0.015;
            } else {
                bunga = 0;
            }

            saldoAhir = Double.parseDouble(jumlahNasabah[i][2]) + bunga ;
            System.out.printf("| %-15s | %-15s | %-17.2f | %-15.2f | %-15.2f |%n",
                    jumlahNasabah[i][0],jumlahNasabah[i][1],Double.parseDouble(jumlahNasabah[i][2]),bunga,saldoAhir);
        }
    }

}
