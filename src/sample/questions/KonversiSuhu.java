package sample.questions;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input suhu Celsius : ");
        double celsius = userInput.nextDouble();

        double fahrenheit = (9.0/5.0) * celsius + 32;
        double kelvin = celsius + 273.15;
        double reamur = (4.0/5.0) * celsius;

        System.out.println("==================");
        System.out.println(celsius+" Darajat Celsius = "+fahrenheit+" Derajat Fahrenhait");
        System.out.println(celsius+" Darajat Celsius = "+kelvin+" Derajat Kelvin");
        System.out.println(celsius+" Darajat Celsius = "+reamur+" Derajat Reamur");
    }
}
