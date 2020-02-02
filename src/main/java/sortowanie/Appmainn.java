package sortowanie;

import java.lang.management.BufferPoolMXBean;
import java.util.Arrays;

public class Appmainn {
    public static void main(String[] args) {
int [] numbers = {10, 4 ,8 ,6 ,3 ,1 ,2 ,5, 9,7};
        BubbleSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
