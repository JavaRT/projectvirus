package sortowanie;

public class BubbleSort {
    public static void sort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
        for (int i = 1; i<arr.length; i++){
            if (arr[i-1]>arr[i]){
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                swapped = true;
            }
        }
                } while (swapped);
        }
    }
        /* swapped = false
        for i = 1 to array.lenght -1
        leftElement = i - 1
        rightElement = i
        if leftElement > rightElement
        swap(leftElement, rightElement)
        swapped = true
        while swapped */
