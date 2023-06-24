package sample.questions;

public class Soal1ForBreak {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1 ; i < 5 ; i++ ){
            if (i == 4 )
                break;
                a = a + 1;
        }
        System.out.println(a);
    }
}
