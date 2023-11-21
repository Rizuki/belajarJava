package sample.questions;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class GetInputFromKeyboardp2 {
    public static void main(String[] args) throws IOException  {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name = " " ;

        System.out.print("please Enter your name : ");
        try{
            name = input.readLine();
        } catch (Exception e){
            System.out.println("Error!!!");
        }

        System.out.println("Hello " +name);

        System.out.println(name.getClass());
    }
}
