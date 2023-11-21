public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
     static int factorial(int value){
        var result = 1;
        for (var i = 1 ; i <= value ; i++ ){
            //result = result * i
            result *= i;
        }
        return result;
    }
}
