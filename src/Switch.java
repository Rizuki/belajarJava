import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int total;

        System.out.println("masukan nilai satu : " );
        int nilaiSatu = userInput.nextInt();


        switch (nilaiSatu){
            case 1 :
                System.out.println("Penjumlahan");
                total = nilaiSatu ;
                break;
            case 2 :
                System.out.println("Perkalian");
                total = nilaiSatu ;
                break;
            default:
                System.out.println("selain perkalian dan penjumlahan ");
        }
    }
}
