package sample.questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class uasNo3sem2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int masaKerja ;
        long gajiBulan, thr ;

        System.out.print(" Masa Kerja (bulan) :");
        masaKerja = Integer.parseInt(br.readLine());
        System.out.print(" Gaji 1 bulan : ");
        gajiBulan = Long.parseLong(br.readLine());

        thr = 0 ;
        if (masaKerja >= 12 ){
            thr = gajiBulan;
        } else {
            thr = (long) (((double) masaKerja / 12) * gajiBulan);
        }
        System.out.println(" THR yang didapat : " +thr);
        br.close();
    }
}
