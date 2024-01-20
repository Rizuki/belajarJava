package sample.questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TulisFile2 {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("TulisFile.txt");
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write("baris kesatu"+"\n");
            bw.write("baris kedua"+"\n");
            bw.write("baris ketiga"+"\n");
            bw.write("baris keempat"+"\n");
            bw.close();
        } catch (IOException e){
            System.err.println("kesalahan pada penulisan file");
        }
    }
}
