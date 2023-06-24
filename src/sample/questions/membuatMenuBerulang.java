package sample.questions;

import java.util.Scanner;

public class membuatMenuBerulang {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int pilihanMenu ;
        char menambahMenu ;
        do {
            System.out.println("Daftar Menu Rumah Makan Padang");
            System.out.println("==============================");
            System.out.println("1. Nasi Rendang");
            System.out.println("2. Nasi Ayam Goreng");
            System.out.println("3. Nasi Ayam Bakar");
            System.out.println("4. Nasi Bawal Bakar");
            System.out.println("5. Nasi Lele goreng");
            System.out.println("6. Nasi Tunjang");
            System.out.println("==============================");

            System.out.print("Silahkan Pilih Menu anda : ");
            pilihanMenu = userInput.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.println("================================");
                    System.out.println("Anda Memilih Menu 1 Nasi Rendang");
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.println("Anda Memilih Menu 2 Nasi Ayam Bakar");
                    break;
                case 3:
                    System.out.println("===================================");
                    System.out.println("Anda Memilih Menu 3 Nasi Ayam Goreng");
                    break;
                case 4:
                    System.out.println("===================================");
                    System.out.println("Anda Memilih Menu 4 Nasi Bawal Bakar");
                    break;
                case 5:
                    System.out.println("====================================");
                    System.out.println("Anda Memilih Menu 5 Nasi Lele Goreng");
                    break;
                case 6:
                    System.out.println("================================");
                    System.out.println("Anda Memilih Menu 6 Nasi Tunjang");
                    break;
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia");
            }
            System.out.println();
            System.out.print("Apakah anda ingin menabah Menu (y/n) : ");
            menambahMenu = userInput.next().charAt(0);

            System.out.println();
        }
            while (menambahMenu != 'n') ;
        System.out.println("Terimakasih");
    }

}





