package sample.questions;

public class menghitungHari {
    public static void main(String[] args) {

        String [] hari = {
                "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"
        };

        System.out.println("Menggunakan For loop");
        for (int i = 0 ; i < hari.length ; i++ ){
            System.out.println("Hari " +hari[i]);
        }

        System.out.println();
        System.out.println("Menggunakan while loop");


        int counter = 0;
        while (counter < hari.length){
            System.out.println("Hari " +hari[counter]);
            counter++;
        }

        System.out.println();
        System.out.println("Menggunakan do while");

        int counterDo = 0;
        do{
            System.out.println("Hari " +hari[counterDo]);
            counterDo++;
        } while (counterDo < hari.length);


    }
}
