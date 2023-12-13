package sample.questions;

public class ArrayP3 {
    public static void main(String[] args) {
        int [][] iniArray = new int[2][2];
        iniArray[0][0] = 1;
        iniArray[0][1] = 2;
        iniArray[1][0] = 3;
        iniArray[1][1] = 4;

        for (int i = 0 ; i < iniArray.length; i++){
            for (int j = 0; j < iniArray.length; j++) {
                System.out.print(iniArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        String[][] data = {
                {"123", "Budi", "Papua"},
                {"234", "Joko", "Makasar"},
                {"345", "Yono", "Bali"}};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }

    }
}
