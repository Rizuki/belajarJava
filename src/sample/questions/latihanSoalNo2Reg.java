package sample.questions;
import java.util.Scanner;
public class latihanSoalNo2Reg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        long menit ,Tahun ,hari ;

        System.out.print("Input Jumlah Menit : ");
        menit = input.nextLong();

        Tahun = menit/(60 * 24 * 365)  ;
        hari = (menit / 60 / 24) % 365 ;

        System.out.print(menit + " Menit = " + Tahun + " Tahun " + hari + " Hari ");
    }
}
