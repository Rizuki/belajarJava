public class SelectionSort {
    public static void main(String[] args) {
        int[] dataArray = {12,43,2,34,6,76,87};
        System.out.println("Data sebelum di urutkan : ");
        displayArray(dataArray);

        selection(dataArray);

        System.out.println("\nData setelah di urutkan : ");
        displayArray(dataArray);

    }

    static void selection(int[] arr){
        int value = arr.length;

        for (int i = 0 ; i < value ; i++ ){
            int minIndex = i;
            // Temukan elemen terkecil dari sisa array
            for (int j = i + 1 ; j < value ; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen terkecil dengan elemen di indeks i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
