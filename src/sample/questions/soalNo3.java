package sample.questions;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class soalNo3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama , npm ,keterangan ;
        int nilaiTugas , nilaiUas , nilaiUts, nilaiAhir ;

        System.out.println("Program Nilai obMahasiswa");
        System.out.println("=======================");

        // Proses Input data
        System.out.print("Masukan Nama : ");
            nama = input.nextLine();
        System.out.print("Masukan NPM : ");
            npm = input.nextLine();
        nilaiTugas = Integer.parseInt(JOptionPane.showInputDialog(null, "Nilai Tugas"));
        nilaiUts = Integer.parseInt(JOptionPane.showInputDialog(null,"Nilai UTS"));
        nilaiUas = Integer.parseInt(JOptionPane.showInputDialog(null, "Nilai UAS"));

        nilaiAhir = (20 * nilaiTugas / 100 ) + ( 30 * nilaiUts / 100 ) + ( 50 * nilaiUas / 100 );

        // Proses penetuan Lulus atau tidak.
        if ( nilaiAhir > 70 ) {
            keterangan = " SELAMAT ANDA LULUS ";
        }else {
            keterangan = " MAAF ANDA BELUM LULUS ";
        }

        // Proses Output
        JOptionPane.showMessageDialog(null, "Nilai Ahir Anda : " +nilaiAhir);
        JOptionPane.showMessageDialog(null , keterangan);






    }
}
