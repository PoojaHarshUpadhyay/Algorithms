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
        int[] res = obj.quickSort(val, 0, val.length-1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    private int[] quickSort(int[] A, int start, int end) {
        if (start < end) {
            int partition = partition(A, start, end);
            quickSort(A, start, partition - 1);
            quickSort(A, partition + 1, end);
        }

        return A;
    }

    private int partition(int[] A, int start, int end) {
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (A[i] < A[end]) {
                //swap i and pIndex if the current index value is less than pivot index value and increment pIndex
                int temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;
                pIndex++;
            }
        }
        //swap
        int temp = A[end];
        A[end] = A[pIndex];
        A[pIndex] = temp;

        return pIndex;
    }
}
