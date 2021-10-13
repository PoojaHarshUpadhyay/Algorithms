import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Hello obj = new Hello();
        int[] val = {8, 5, 4, 3, 2};
        int[] res = obj.bubbleSort(val);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    } 

    private int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1 ; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
