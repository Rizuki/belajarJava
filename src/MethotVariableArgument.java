public class MethotVariableArgument {
    public static void main(String[] args) {


        sayCongrats("edi" , 90,90,90,90,90);
    }
    static void sayCongrats( String name , int... value){
        var total = 0;
        for (var values : value ){
            total += values ;
        }
        var finalTotal = total / value.length;

        if (finalTotal > 75 ){
            System.out.println("Selamat "+name+ " anda lulus");
        } else {
            System.out.println("mohon " + name + " coba lagi");
        }
    }
}
