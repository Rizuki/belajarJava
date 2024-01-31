import sample.questions.FilleInput;

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

            System.out.print("\n\nMasukan Pilihan : ");
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
                    tampilkanData();
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
                    hapusData();
                }
                default -> System.out.print("\nInput anda tidak di temukan\nSilahkan pilih [1-5]");
            }

            Next = getYesorNo("Apakah anda ingin melanjutkan");

        }
    }

    private static void hapusData() throws IOException {
//        ambil database original
        File filleInput = new File("database.txt");
        FileReader fileReader = new FileReader(filleInput);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        kita buat database sementara
        File tempDB = new File("tempDB.txt");
        FileWriter fileWriter = new FileWriter(tempDB);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        tampilkan data
        System.out.println("List buku");
        tampilkanData();
//        kita ambil user input untuk menghapus data
        Scanner scann = new Scanner(System.in);
        System.out.print("\nMasukan nomer buka yang akan di hapus : ");
        int deleteNum = scann.nextInt();

//        looping untuk membaca perbaris
        int entryCounts = 0;

        String data = bufferedReader.readLine();
        while (data != null) {
            entryCounts++;
            boolean isDelete = false;
            StringTokenizer st = new StringTokenizer(data, ",");
//             Tampilkan data yang ingin di hapus
            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin di hapus adalah : ");
                System.out.println("------------------------------------");
                System.out.println("Referensi    : " + st.nextToken());
                System.out.println("Tahun        : " + st.nextToken());
                System.out.println("Penulis      : " + st.nextToken());
                System.out.println("Penerbit     : " + st.nextToken());
                System.out.println("Judul Buku   : " + st.nextToken());
                isDelete = getYesorNo("Apakah yakin ingin menghapus data : ");
            }
            if (isDelete) {
                //skip data dari ori ke sementara
                System.out.println("Data berhasil dihapus");
            } else {
                //pindahkan data dari ori ke sementara
                bufferedWriter.write(data);
                bufferedWriter.newLine();

            }
            data = bufferedReader.readLine();
        }
//         menulis data ke file
        bufferedWriter.flush();
//         delete original file
        database.delete
//        rename file sementara ke database
        tempDB.renameTo(database);
    }

    private static void tampilkanData() throws IOException {

        FileReader fileInput;
        BufferedReader BufferInput;

        try {
            fileInput = new FileReader("database.txt");
            BufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println(" Data Base tidak di temukan ");
            System.err.println(" Silahkan tambah Data Base terlebih dahulu ");
            tambahData();
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

    private static void cariData() throws IOException {
        //Membaca data base ada atau tidak
        try {
            FileReader file = new FileReader("database.txt");
        } catch (Exception e) {
            System.err.println(" Data Base tidak di temukan ");
            System.err.println(" Silahkan tambah Data Base terlebih dahulu ");
            tambahData();
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

    private static void tambahData() throws IOException {
        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        //mengabil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukan nama penulis : ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku : ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit : ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, format(YYYY) : ");
        tahun = ambilTahun();

        //cek buku di database
        String[] keywords = {tahun + "," + penulis + "," + penerbit + "," + judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = cekBukuDiDataBase(keywords, false);

        //menulis buku di data base
        if (!isExist) {
            // fiersabesari_2012_1,2012,fiersa besari,media kita,jejak langkah
            System.out.println(ambilEntryPertahun(penulis, tahun));
            long nomorEntry = ambilEntryPertahun(penulis, tahun) + 1;
            String penulisTanpaSpaci = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpaci + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang anda masukan adalah");
            System.out.println("-----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);

            boolean tambahData = getYesorNo("Apakah anda ingin menambah data tersebut ? : ");

            if (tambahData) {
                bufferedOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferedOutput.newLine();
                bufferedOutput.flush();
            }
        } else {
            System.out.println("Buku yang anda masukan sudah sudah tersedia dengan data berikut");
            cekBukuDiDataBase(keywords, true);
        }


        bufferedOutput.close();
    }

    private static long ambilEntryPertahun(String penulis, String tahun) throws IOException {
        FileReader fileReader = new FileReader("database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        long entry = 0;
        String data = bufferedReader.readLine();
        Scanner dataScanner;
        String primaryKey;

        while (data != null) {
            dataScanner = new Scanner(data);
            dataScanner.useDelimiter(",");
            primaryKey = dataScanner.next();
            dataScanner = new Scanner(primaryKey);
            dataScanner.useDelimiter("_");

            penulis = penulis.replaceAll("\\s", "");

            if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                entry = dataScanner.nextInt();
            }
            data = bufferedReader.readLine();
        }
        return entry;

    }

    private static boolean cekBukuDiDataBase(String[] keywords, boolean isDisplay) throws IOException {

        FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        String data = bufferedInput.readLine();
        boolean isExist = false;
        int nomerData = 0;

        if (isDisplay) {
            System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku ");
            System.out.println("----------------------------------------------------------------------------------");
        }
        while (data != null) {

            // cek keyword di dalam baris
            isExist = true;

            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
            // Jika keyword cocok maka tampilkan

            if (isExist) {
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

    private static String ambilTahun() throws IOException {
        boolean tahunValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String tahunInput = terminalInput.nextLine();
        while (!tahunValid) {
            try {
                Year.parse(tahunInput);
                tahunValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah ");
                System.out.print("Silahkan masukan tahun terbit lagi : ");
                tahunValid = false;
                tahunInput = terminalInput.nextLine();
            }
        }
        return tahunInput;
    }

    private static boolean getYesorNo(String massege) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n" + massege + "(y/n)? ");
        String pilihanUser = input.nextLine();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("pilhan anda bukan y atau n");
            System.out.print("\n" + massege + "(y/n)? ");
            pilihanUser = input.nextLine();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }


}

