package sample.questions;
import java.util.Scanner;

public class latihanArray {
    public static void main(String[] args) {
        // Membuat array dengan panjang tertentu
        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai ke dalam array
        System.out.println("Masukkan 5 angka:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Menampilkan nilai array
        System.out.println("Anda telah memasukkan nilai-nilai berikut:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

