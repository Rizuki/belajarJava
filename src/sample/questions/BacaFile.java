package sample.questions;

import java.io.DataInputStream;
import java.io.FileInputStream;


public class BacaFile {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("harga");
            DataInputStream dataFile = new DataInputStream(inputFile);

            while ( inputFile.available() !=0){
                String data = dataFile.readLine();
                System.out.println(data);
            }
            dataFile.close();
        } catch ( Exception e){
            System.out.println("Ada Kesalahan : "+e.getMessage());
        }
    }
}
