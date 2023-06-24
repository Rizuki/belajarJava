package sample.questions;
import java.util.Scanner;
public class uasNo2sem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalPinjaman, lamaPinjaman ;

        System.out.print(" Total Pinjaman : " );
        totalPinjaman = input.nextDouble();
        System.out.print(" Lama Pinjaman (Bulan) : ");
        lamaPinjaman = input.nextDouble();

        double bunga = 0.1 ;
        double pinjamanPerbulan = totalPinjaman / lamaPinjaman;
        double bungaPertahun = totalPinjaman * bunga ;
        double bungaPerbulan = bungaPertahun / 12 ;
        double cicilan = pinjamanPerbulan + bungaPerbulan;

        System.out.println(" Pokok Pinjaman perBulan :" +pinjamanPerbulan);
        System.out.println(" Bunga perTahun : " +bungaPertahun);
        System.out.println(" Bunga perrTahun : " +bungaPerbulan);
        System.out.println(" Cicilan yang di bayar : " +cicilan);
    }
}
