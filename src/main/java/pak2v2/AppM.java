package pak2v2;

import java.util.Arrays;

public class AppM {

    private static AppM QuickSort;

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int lowerIndex, int higherIndex) {
        int pivot = arr[(lowerIndex + higherIndex) / 2];
        int leftSearch = lowerIndex;
        int rightSearch = higherIndex;
        while (leftSearch <= rightSearch) {
            while (arr[leftSearch] < pivot) {
                leftSearch++;
            }
            while (arr[rightSearch] > pivot) {
                rightSearch--;
            }
            if (leftSearch <= rightSearch) {
                int temp = arr[leftSearch];
                arr[leftSearch] = arr[rightSearch];
                arr[rightSearch] = temp;
                leftSearch++;
                rightSearch--;
            }
        }
        if (lowerIndex < rightSearch) {
            quickSort(arr, lowerIndex, rightSearch);
        }
        if (leftSearch < higherIndex) {
            quickSort(arr, leftSearch, higherIndex);
        }
    }
    public static void main(String[] args) {
        int[] arrOne = {12, 5, 3, 5, 6, 3, 353, 42};
        int[] arrTwo = {12, -5, 3, 5, 2332, 13, 353, 0, 42, 55, 6666, 34};
        System.out.println("arrOne");
        System.out.println(Arrays.toString(arrOne));
        QuickSort.sort(arrOne);
        System.out.println(Arrays.toString(arrOne));

        System.out.println("arrTwo");
        System.out.println(Arrays.toString(arrTwo));
        QuickSort.sort(arrTwo);
        System.out.println(Arrays.toString(arrTwo));
    }
}