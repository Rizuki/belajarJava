public class MethodVariableArgument {
    public static void main(String[] args) {


        int[] values = {90,90,90,90};
        sayCongrats("edi",values);


    }

    static void sayCongrats(String name , int[] values){

        int total = 0;
        for (int value: values) {
            total += value;
        }

        int finalValue = total / values.length;
        System.out.println("Dengan Rata-Rata Nilai : " +finalValue);
        if (total >= 75 ){
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Coba Lagi");
        }
    }
}
