package sample.questions;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class StringExamP2 {
    public static void main(String[] args) {

        try {
            FileInputStream input = new FileInputStream("database.txt");
            DataInputStream dataInput = new DataInputStream(input);
            while (dataInput.available() != 0) {
                String data = dataInput.readLine();
                System.out.println(data);
            }
            dataInput.close();
        } catch (Exception e) {
            System.out.println("File Error");
        }
    }
}
