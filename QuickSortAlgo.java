import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {


    int[] A = {7, 2, 1, 6, 8, 5, 3, 4};
    int start = 0;
    int end = A.length - 1;
    Main main = new Main();
    main.QuickSort(A, start, end);
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i]);
    }
  }

  private void QuickSort(int[] A, int start, int end) {
    if (start >= end) {
      return;
    }
    int pivot = partition(A, start, end);
    QuickSort(A, start, pivot - 1);
    QuickSort(A, pivot + 1, end);
  }


  private int partition(int[] A, int start, int end) {
    //i changes if the current value is less than pivot.
    int i = 0;
    int pivot = A[end];


    for (int c = 0; c < A.length; c++) {
      if (A[c] < pivot) {
        //swap c and i if the current index value is less than pivot index value and increment i
        int temp = A[c];
        A[c] = A[i];
        A[i] = temp;
        i++;
      }
    }
    if (A[end] < A[i]) {
      int temp = A[end];
      A[end] = A[i];
      A[i] = temp;
    }

    return i;
  }
}

