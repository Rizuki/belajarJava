import java.util.Scanner;
class piramid {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" PROGRAM JAVA BERBINTANG ");
        System.out.println(" ======================= ");
        System.out.println();

        int tinggiSegitiga, i, j, k;

        System.out.print("Input tinggi piramid :");
        tinggiSegitiga = input.nextInt();

        System.out.println();

        for (i = 1; i <= tinggiSegitiga; i++) {

            for (j = 1; j <= tinggiSegitiga-i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
