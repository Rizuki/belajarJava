package sample.questions;

public class OperasiString {
    public static void main(String[] args) {
        String iniKalimat = "Edi Irawan";
        System.out.println(iniKalimat.length());
        System.out.println();

        String isKalimat = "Edi Irawan";
        System.out.println(isKalimat.equals("edi Irawan"));
        System.out.println(isKalimat.equalsIgnoreCase("EDI Irawan"));
        System.out.println();

        String Kalimat = "Edi Irawan";
        System.out.println(Kalimat.toLowerCase());
        System.out.println(Kalimat.toUpperCase());
        System.out.println();

        String value1 = "Edi";
        String value2 = "Irawan";

        String value3 = value1.concat(" "+value2);
        System.out.println(value3);

    }
}