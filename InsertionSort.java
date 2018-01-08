/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmspractice;

/**
 *DID NOT UNDERSTOOD, TRY AGAIN
 * @author pooja
 */
public class InsertionSort {
    public int[] insertionSort(int[] a)
    {
      
        int i, j, key, temp;
        for(i= 1; i < a.length; i++)
        {
            key = a[i];
            j = i - 1;
            while(j >= 0 && a[j] > key)
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                j--;
            }
        }
       return a;
    }
}
