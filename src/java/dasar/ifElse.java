package java.dasar;

public class ifElse {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 80;

        if (nilai >= 80 && absen >= 80){
            System.out.println("A");
        }else if (nilai >= 70 && absen >= 70){
            System.out.println("B");
        } else if (nilai >= 60 && absen >= 60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }

    }
}
