package sample.questions;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial dari 5 Adalah : " +result);
    }

    static int factorial(int value){
        if(value == 0 || value == 1){
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }
}
