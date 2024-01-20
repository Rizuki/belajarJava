package sample.questions;

import java.io.*;
public class TugasBesarP10No3 {
    public static void main(String[] args) {
        try {
            FileOutputStream inputFile = new FileOutputStream("datapasien.txt");
            PrintStream cetak = new PrintStream(inputFile);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Input Digit Terahir NPM Anda : ");
            int digitNpm = Integer.parseInt(input.readLine());
            int ganjilGenap = (digitNpm % 2 == 0) ? 4 : 3;
            System.out.println("---------------------------------------");
            String[][] dataPasien = new String[ganjilGenap][4];
            for (int i = 0; i < ganjilGenap; i++) {
                System.out.print("ID Pasien   : ");
                dataPasien[i][0] = input.readLine();
                System.out.print("Nama Pasien : ");
                dataPasien[i][1] = input.readLine();
                System.out.print("Kode Kamar  : ");
                dataPasien[i][2] = input.readLine();
                System.out.print("Lama Inap   : ");
                dataPasien[i][3] = input.readLine();
                System.out.println();
                cetak.println(dataPasien[i][0] + "_" + dataPasien[i][2] + "_" + dataPasien[i][3] + "_" + dataPasien[i][1]);
            }
            input.close();
        } catch (IOException e){
            System.out.println("Terjadi Kesalahan "+e.getMessage());
        }
        System.out.println("---------------------------------------");
        System.out.println("Selesai Menulis ke File");
    }
}
