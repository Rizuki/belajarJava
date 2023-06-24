package sample.questions;

public class dataTerbesarArray {
    public static void main(String[] args) {

        int [] data = {
               13, 10 , 11 , 12, 8 , 6 , 8 , 8 , 0 ,1
        };
        int  dataTerbesar =  data [0];

        for ( int i = 0 ; i < 10 ; i++){
            if ( data [i] > dataTerbesar )
                dataTerbesar = data [i];

        }
        System.out.println(" data terbesar =" +dataTerbesar);


    }
}
