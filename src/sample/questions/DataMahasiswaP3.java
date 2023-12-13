package sample.questions;
import java.util.Scanner;
public class DataMahasiswaP3 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Jumlah Data : ");
        int inputDataMhs = inputScanner.nextInt();

        int[][] dataMahasiswa= new int[inputDataMhs][3];
        System.out.println("-------------------");
        for (int i = 0; i < inputDataMhs ; i++) {
            inputScanner.nextLine();
            System.out.print("Mata Kuliah       : ");
            dataMahasiswa[i][0] = inputScanner.nextInt();
            System.out.print("Nilai Teori       : ");
            dataMahasiswa[i][1] = inputScanner.nextInt();
            System.out.print("Nilai Praktikum   : ");
            dataMahasiswa[i][2] = inputScanner.nextInt();
            System.out.println();

        }
        System.out.println();

        System.out.println("=================================================================");
        System.out.println("Mata Kuliah\t\t\tTeori\t\t\tPraktikum\tRata-rata");
        System.out.println("=================================================================");
        for (int i = 0; i < inputDataMhs; i++) {
            double rataRata = (dataMahasiswa[i][1]+dataMahasiswa[i][2]) / 2;
            System.out.print(dataMahasiswa[i][0]+"\t\t\t\t\t "+dataMahasiswa[i][1]+"\t\t\t\t\t"+dataMahasiswa[i][2]+"\t\t\t"+rataRata);
            System.out.println();
        }
    }
}
