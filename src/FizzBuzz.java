public class FizzBuzz {

    public static void main(String[] args) {

        fizzBuzz(30);
    }

    static void fizzBuzz(int total){
        for (int i = 1 ; i <= total ; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fiiz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(i);
            }
        }
    }
}