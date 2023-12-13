package sample.questions;

import java.io.FileInputStream;
import java.io.IOException;

public class FilleInput {
    public static void main(String[] args) throws IOException {


        FileInputStream input = new FileInputStream("myfile.txt");
        System.out.print(input.read());

        int data = input.read();
        while (data != -1) {
            System.out.print((char)data);
            data = input.read();
        }

        input.close();


        System.out.println();
        sayHello("Edi", "Irawan");
        System.out.println(sum(20, 20));
        System.out.println(sum(20, "+", 40));
        System.out.println(sum(20, "-", 40));
        System.out.println(sum(20, "salah", 40));
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    static int sum(int value1, String operasi, int value2) {
        if (operasi.equals("+")) {
            int total = value1 + value2;
            return total;
        } else if (operasi.equals("-")) {
            int total = value1 - value2;
            return total;
        } else {
            System.out.print("operasi Salah : ");
            return 0;
        }
    }

}
