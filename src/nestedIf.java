import java.util.Scanner;
public class nestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kelas ;
        int hari, tarif, bayar ;

        System.out.print("==============================================================================\n");
        System.out.print("| \t Kelas \t\t\t | \t\t  Standar  \t\t   | \t\t\t VIP \t\t\t |\n");
        System.out.print("|-----------------------------------------------------------------------------\n");
        System.out.print("| \t Lama Menginap \t | 1-2 Malam  | > 2 Malam  | 1-2 Malam    |  > 2 Malam   |\n");
        System.out.print("|-----------------------------------------------------------------------------\n");
        System.out.print("| \t Tarif \t\t\t | Rp.400.000 | Rp.350.000 | Rp.1.200.000 | Rp.1.000.000 |\n");
        System.out.print("==============================================================================\n");
        System.out.println();

        System.out.print("Jenis kelas kamar (Standar/VIP) : ") ;
        kelas = input.nextLine();
        System.out.print("lama menginap : ");
        hari = input.nextInt();

        tarif =0;
        if (kelas.equalsIgnoreCase( "VIP")){
            if (hari <= 2){
                tarif = 1_200_000;
            }else {
                tarif = 1_000_000;
            }
        } else if (kelas.equalsIgnoreCase("Standar")) {
            if (hari <= 2){
                tarif = 400_000;
            }else{
                tarif = 350_000;
            }

        }

        bayar  = tarif * hari;

        System.out.print("------------------------------------------\n");
        System.out.println("Tarif yang harus dibayar adalah Rp." +bayar);
        System.out.print("=============================================\n");
        System.out.print("|\t\tTerimakasih Telah Berkunjung \t\t|\n");
        System.out.print("=============================================\n");

    }
}

