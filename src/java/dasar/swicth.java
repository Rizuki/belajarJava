package java.dasar;

public class swicth {
    public static void main(String[] args) {

        String nilai = "B";
        String ucapan ;
        ucapan = switch (nilai){
            case "A" :
                yield "Keren";
            case "B" :
                yield "Jelek";
            default:
                yield " Coba lagi" ;
        };
        System.out.println(ucapan);
    }


}
