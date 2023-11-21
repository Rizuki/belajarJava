package sample.questions;
import java.util.Scanner;
public class uasNo2sem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int npm ;
        System.out.print(" Input Npm terahir : " );
        npm = input.nextInt();

        int ab = 13 + npm / 13 ;
        for (ab = 10 ; ab <= 12 ; ab++){
            while (ab < npm){
                System.out.println(npm);
                npm += ab ;
            }
            do {
                npm--;
                System.out.println("Nilai AB =" +ab);
            }while (ab < 5);

        }

        System.out.println(" Nilai ab :" +ab);
        System.out.println(" Nilai NPM : " +npm);
    }
}
