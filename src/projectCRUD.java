import java.util.Scanner;
import java.io.IOException;
public class projectCRUD {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String pilihanUser;
        boolean Next = true;

        while (Next) {
            System.out.println("=========================");
            System.out.println("| Database Perpustakaan |");
            System.out.println("=========================\n");
            System.out.println("1.\t Lihat Seluruh buku");
            System.out.println("2.\t Cari Data Buku");
            System.out.println("3.\t Tambah Data buku");
            System.out.println("4.\t Ubah Data buku");
            System.out.println("5.\t Hapus Data buku");

            System.out.print("\n\nMasukan Pilihan :");
            pilihanUser = input.nextLine();

            switch (pilihanUser) {
                case "1":
                    System.out.println("\n-----------------");
                    System.out.println("SELURUH LIST BUKU");
                    System.out.println("-----------------");
                    break;
                case "2":
                    System.out.println("\n---------");
                    System.out.println("CARI BUKU");
                    System.out.println("---------");
                    break;
                case "3":
                    System.out.println("\n----------------");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("----------------");
                    break;
                case "4":
                    System.out.println("\n------------");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("--------------");
                    break;
                case "5":
                    System.out.println("\n---------------");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("---------------");
                    break;
                default:
                    System.out.print("\nInput anda tidak di temukan\nSilahkan pilih [1-5]");
            }

            Next = getYesorNo("Apakah anda ingin melanjutkan");

        }
    }
    private static void tampilkanData() throws IOException {
        System.out.println(" Menampilkan data disini ");

        boolean NextTwo = getYesorNo("Apakah Anda Ingin Menambah Data : ");
    }
    private static boolean getYesorNo(String massege){
        Scanner input = new Scanner(System.in);
        System.out.print("\n"+massege+"(y/n)? ");
        String pilihanUser = input.nextLine();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("pilhan anda bukan y atau n");
            System.out.print("\n"+massege+"(y/n)? ");
            pilihanUser = input.nextLine();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

}

