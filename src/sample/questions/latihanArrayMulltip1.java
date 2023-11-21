package sample.questions;

public class latihanArrayMulltip1 {
    public static void main(String[] args) {

        String[][] entry = {
                {"Nina", "986-4345", "Bojong"},
                {"Gugun", "457-4356", "Curug"},
                {"Edi", "657-8768", "Bintaro"}
        };
        for (int i = 0 ; i < entry.length ; i++) {
            System.out.println("Nama    : " + entry[i][0]);
            System.out.println("Tel.#   : " + entry[i][1]);
            System.out.println("Address : " + entry[i][2]);
            System.out.println();
        }
    }
}
