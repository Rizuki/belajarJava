public class Continue {
    public static void main(String[] args) {

        for (var iniVar = 1 ; iniVar <= 10 ; iniVar++){
            if ( iniVar % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil -" +iniVar);
        }
    }
}
