package practice;

import java.util.Random;

/**
 * @author Aaron
 * @date 9/4/21 3:10 PM
 */
public class QuickSort {

    public int Partition(int[] data, int start, int end){
        Random random = new Random();
        int index = random.nextInt(end);
        data = swap(data, index, end);
        int small = start - 1;
        for (index = start; index < end; ++index) {
            if (data[index] < data[end]){
                ++small;
                if (small!=index){
                    data = swap(data, index, small);
                }
            }
        }
        ++small;
        data = swap(data, small, end);
        return 1;

    }

    public int[] swap(int[] data, int a, int b) {
        int temp  = data[a];
        data[a]  = data[b];
        data[b] = temp;
        return data;
    }


    public static void main(String[] args) {

    }
}
