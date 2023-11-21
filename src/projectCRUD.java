import java.io.*;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class projectCRUD {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String pilihanUser;
        boolean Next = true;

        while (Next) {
            System.out.println("=========================");
            System.out.println("| Database perpustakaan |");
            System.out.println("=========================\n");
            System.out.println("1.\t Lihat Seluruh buku");
            System.out.println("2.\t Cari Data buku");
            System.out.println("3.\t Tambah Data buku");
            System.out.println("4.\t Ubah Data buku");
            System.out.println("5.\t Hapus Data buku");

            System.out.print("\n\nMasukan Pilihan :");
            pilihanUser = input.nextLine();

            switch (pilihanUser) {
                case "1" -> {
                    System.out.println("\n-----------------");
                    System.out.println("SELURUH LIST BUKU");
                    System.out.println("-----------------");
                    tampilkanData();
                }
                case "2" -> {
                    System.out.println("\n---------");
                    System.out.println("CARI BUKU");
                    System.out.println("---------");
                    cariData();
                }
                case "3" -> {
                    System.out.println("\n----------------");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("----------------");
                    tambahData();
                }
                case "4" -> {
                    System.out.println("\n--------------");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("--------------");
                }
                case "5" -> {
                    System.out.println("\n---------------");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("---------------");
                }
                default -> System.out.print("\nInput anda tidak di temukan\nSilahkan pilih [1-5]");
            }

            Next = getYesorNo("Apakah anda ingin melanjutkan");

        }
    }
    private static void tambahData() throws IOException{
        FileWriter fileOutput = new FileWriter("database.txt" ,true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        //mengabil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis , judul , penerbit , tahun ;

        System.out.print("Masukan nama penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, format(YYYY) : ");
        tahun = ambilTahun();

        //cek buku di database
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDataBase(keywords, false);

        //menulis buku di data base
       if (isExist){
           // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
           String penulisTanpaSpaci = penulis.replaceAll("\\s+","");

       }

        bufferedOutput.close();
    }

    private static boolean cekBukuDiDataBase(String[] keywords, boolean isDisplay) throws IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();
        boolean isExist = false;
        int nomerData = 0 ;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku ");
            System.out.println("----------------------------------------------------------------------------------");
        }
        while ( data != null){

            // cek keyword di dalam baris
            isExist = true;

            for (String keyword:keywords){
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            // Jika keyword cocok maka tampilkan

            if (isExist){
                if (isDisplay) {
                    nomerData++;
                    StringTokenizer stringToken = new StringTokenizer(data, ",");

                    stringToken.nextToken();
                    System.out.printf("| %2d ", +nomerData);
                    System.out.printf("|\t%4s  ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%-20s   ", stringToken.nextToken());
                    System.out.printf("|\t%s   ", stringToken.nextToken());
                    System.out.print("\n");
                } else {
                    break;
                }
            }
            data = bufferedInput.readLine();
        }
        if (isDisplay) {
            System.out.println("----------------------------------------------------------------------------------");
        }
        return isExist;
    }
    private static String ambilTahun() throws IOException{
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while (!tahunValid){
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            }catch (Exception e){
                System.out.println("Format tahun yang anda masukan salah ");
                System.out.print("Silahkan masukan tahun terbit lagi : ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }
    private static void cariData() throws IOException {
        //Membaca data base ada atau tidak
        try{
            FileReader file = new FileReader("database.txt");
        } catch (Exception e){
            System.err.println(" Data Base tidak di temukan ");
            System.err.println(" Silahkan tambah Data Base terlebih dahulu ");
            return;
        }
        // ambil keyword dari user
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukan kata kunci untuk mencari buku :");
        String cariString = input.nextLine();
        String[] keywords = cariString.split("\\s");


        //ambil keyword dari user
        cekBukuDiDataBase(keywords, true);

    }
    private static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader BufferInput;

        try{
            fileInput = new FileReader("database.txt");
            BufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println(" Data Base tidak di temukan ");
            System.err.println(" Silahkan tambah Data Base terlebih dahulu ");
            return;
        }


        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku ");
        System.out.println("----------------------------------------------------------------------------------");

        String data = BufferInput.readLine();
        int nomorData = 0;
        while (data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");

            data = BufferInput.readLine();
        }
        System.out.println("----------------------------------------------------------------------------------");
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

