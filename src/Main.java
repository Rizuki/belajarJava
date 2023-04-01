public class Main {
    public static void main(String[] args) {
        //char
        char e = 'E';
        char d = 'D';
        System.out.println(e);

        //bolean
        boolean benar = true;
        boolean salah = false;
        System.out.println(salah);

        //tambah
        int z = 100;
        z += 1;
        z -= 10;
        z *= 5;
        System.out.println(z);

        //String
        String namaDepan = "lu";
        String namaBelakang = "gua";
        System.out.println(namaDepan + namaBelakang);

        //array dua dimesi
        String[][] arrayString = {
                {"A", "B"},
                {"D", "D"}
        };
        System.out.println(arrayString[0][1]);
        System.out.println(arrayString[1][1]);

        //Array
        int[] arrayInteger = {
                1, 2, 3, 4
        };
        System.out.println(arrayInteger[2]);

        //++
        var a = 10;
        var b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        //while
        var counter = 1;
        while (counter <= 10) {
            System.out.println("perulangan" + counter);
            counter++;
        }
        var counterDua = 1;
        while (counterDua <= 10) {
            System.out.println("perulangan" + counterDua);
            counterDua++;
        }

        //do while
        var row = 1;

        do {
            System.out.println("perulangan " + row);
            counter++;
        } while (row <= 10);

        //ganjil
        }
 }
