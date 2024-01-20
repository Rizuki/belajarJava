package sample.questions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TugasBesarP10No4 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("datapasien.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("======================================================================");
            System.out.printf("%-10s %-15s %-15s %-15s %-20s %n","ID Pas","Nama Pasien","Kode Kamar","Lama Inap","Total Biaya");
            System.out.println("======================================================================");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("_");

                String idPasien = data[0];
                String kodeKamar = data[1];
                String lamaInap = data[2];
                String namaPasien = data[3];

                double biayaPerHari = 0;
                switch (kodeKamar) {
                    case "1":
                        biayaPerHari = 100000;
                        break;
                    case "2":
                        biayaPerHari = 250000;
                        break;
                    case "3":
                        biayaPerHari = 500000;
                        break;
                }

                double totalBiaya = Double.parseDouble(lamaInap) * biayaPerHari;

                System.out.printf("%-10s %-15s %-15s %-15s %-20.2f %n", idPasien, namaPasien, kodeKamar, lamaInap, totalBiaya);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}

