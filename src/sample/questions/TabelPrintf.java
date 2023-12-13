package sample.questions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TabelPrintf {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("Input Banyak Mahasiswa : ");
        int banyakMahasiswa = Integer.parseInt(input.readLine());

        String[][] jumlahMahasiswa = new String[banyakMahasiswa][3];

         for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Input Name\t\t: ");
            jumlahMahasiswa[i][0] = input.readLine();
            System.out.print("Input Address\t: ");
            jumlahMahasiswa[i][1] = input.readLine();
            System.out.print("Input Phone\t\t: ");
            jumlahMahasiswa[i][2] = String.valueOf(Integer.parseInt(input.readLine()));
            System.out.println();

        }

        System.out.printf("===========================================%n");
        System.out.printf("\t\t\t\tData Mahasiswa\t\t\t\t%n");
        System.out.printf("===========================================%n");
        System.out.printf("| %-10s | %-10s | %-14s |%n","Name", "Address","Phone");
        System.out.printf("-------------------------------------------%n");
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.printf("| %-10s | %-10s | %-14s |%n",jumlahMahasiswa[i][0],jumlahMahasiswa[i][1],jumlahMahasiswa[i][2]);
            System.out.printf("-------------------------------------------%n");

        }
    }

//    static void entryData(String nama ,String address ,String phone ){
//
//    }
}
