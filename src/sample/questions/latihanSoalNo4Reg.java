package sample.questions;

import java.util.Scanner;

public class latihanSoalNo4Reg {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String status;
        long income, pajak;

        System.out.println(" Status katagori ");
        System.out.println(" 1 Tidak kawin ");
        System.out.println(" 2 kawin ");

        System.out.print("Input Status Katagori = ");
        status = userInput.nextLine();
        System.out.print("Masukan Pendapatan anda dalam 1 tahun = ");
        income = userInput.nextLong();


        pajak = 0;
        if ( status.equalsIgnoreCase("tidak kawin") ){
            if ( income > 270_000_000){
                pajak = income * 25 / 100;
                income = income - pajak;
            } else if ( income > 70_000_000) {
                pajak = income * 15/100;
                income = income - pajak;
            } else {
                pajak = income * 5/100;
                income = income - pajak;
            }
        } else if (status.equalsIgnoreCase("kawin")) {
            if (income > 250_000_000){
                pajak = income * 25/100;
                income = income - pajak;
            } else if ( income > 50_000_000) {
                pajak = income * 15/100;
                income = income - pajak;
            } else {
                pajak = income * 5/100;
                income = income - pajak;
            }

        }

        System.out.print("pajak anda adalah : Rp. " +pajak );


    }
}
