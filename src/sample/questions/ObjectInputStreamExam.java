package sample.questions;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExam {
    public static void main(String[] args) {
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("myfile.txt"));
        } catch (Exception e){
            e.printStackTrace();
//            System.out.println("Error");
        }
    }
}
