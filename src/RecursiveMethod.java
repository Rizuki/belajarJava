public class RecursiveMethod {
    public static void main(String[] args) {


        System.out.println(factorial(5));

        System.out.println(factorialRecursive(5));
        loop(80);
    }

     static int factorial(int value){

        int result = 1;
        for (int i = 1 ; i <= value ; i++){
            result *= i;
        }
        return result;
    }

    static int factorialRecursive(int value){
        if ( value == 1){
            return 1 ;
        } else {
            return value * factorialRecursive(value -1);
        }
    }

    static void loop(int value){
        if (value == 0){
            System.out.println("selesai");
        } else {
            System.out.println("loop-" +value);
            loop(value-1);
        }
    }
}




