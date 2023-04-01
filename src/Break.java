public class Break {
    public static void main(String[] args) {

        var row = 1;

        while (true){
            System.out.println("Perulangan Ke-" +row);
            row++;

            if ( row > 10){
                break;
            }
        }
        System.out.println("Perulangan Berhenti");
    }
}
