package sample.questions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TugasBesarP10No2Math {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input NPM Anda      : ");
        String inputNpm = input.readLine();


        System.out.print("Input Nama Anda     : ");
        String inputNama = input.readLine();
        System.out.print("Tinggi Badan ( Cm ) : ");
        double tinggiBadan = Double.parseDouble(input.readLine());
        System.out.print("Berat Badan ( Kg )  : ");
        double beratBadan = Double.parseDouble(input.readLine());

        System.out.println("================================================");
        double BMI = beratBadan / Math.pow((tinggiBadan / 100),2) ;
        String status ;
        if (BMI >= 30.00){
            status = "Obesitas" ;
        } else if (BMI >= 25.0){
            status = "Kelebihan BB";
        } else if (BMI >= 18.5){
            status = "Ideal";
        } else {
            status = "Kekurangan BB";
        }

        System.out.printf("BMI       : %.2f",BMI);
        System.out.print("\nStatus    : "+status);
    }
}
