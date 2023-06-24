package java.dasar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class nestedIf{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

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

        System.out.print("Jenis kelas kamar (Standar/Eksekutif) : ") ;
        kelas = br.readLine();
        System.out.print("lama menginap ( Dalam hari ) : ");
        hari = Integer.parseInt(br.readLine());

        tarif =0;
        if (kelas.equalsIgnoreCase( "Eksekutif")){
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

        br.close();
    }
}

