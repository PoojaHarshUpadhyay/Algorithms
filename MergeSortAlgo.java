import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Hello obj = new Hello();
        int[] val = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] res = obj.mergeSort(val);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    private int[] mergeSort(int[] A) {
        int n = A.length;
        int mid = A.length / 2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];
        if (mid != 0) {

            for (int i = 0; i < mid; i++) {
                left[i] = A[i];
            }
            int p = 0;
            for (int j = mid; j < n; j++) {
                right[p] = A[j];
                p++;
            }
            mergeSort(left);
            mergeSort(right);
            merge(left, right, A);

        }
        return A;
    }


    private void merge(int[] left, int[] right, int[] A) {
        int nL = left.length;
        int nR = right.length;

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nL && j < nR) {
            if (left[i] < right[j]) {
                A[k] = left[i];
                i++;
            } else {
                A[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            A[k] = left[i];
            k++;
            i++;
        }
        while (j < nR) {
            A[k] = right[j];
            k++;
            j++;
        }
    }
}
