/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmspractice;

/**
 *
 * @author pooja
 */
public class QuickSortAlgo {
    public void quickSort(int[] array, int p, int r)
    {
        if(p<r)
        {
            int q = partition(array, p, r);
            quickSort(array, p, q-1);
            quickSort(array, q+1, r);
        }
    }
    
    public int partition(int[] arr, int p, int r)
    {
        int x = arr[r];
        
        int i = p-1;
      
        for(int j = p; j <= r-1; j++)
        {
            if(arr[j] <= x)
            {
                i++;
                int ival = arr[i];
                int jval = arr[j];
                arr[i] = jval;
                arr[j] = ival;
            }
        }
        
       // put the pivot value in the correct slot
        int ival = arr[i+1];
        arr[r] = ival;
        arr[i+1] = x;         
        
        return i+1;
    }
}
