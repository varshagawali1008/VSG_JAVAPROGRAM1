
import java.util.Arrays;

interface Sorter {
    void sort(int[] arr);
}

class BubbleSort implements Sorter {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class InterfaceExample14 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        Sorter sorter = new BubbleSort();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
