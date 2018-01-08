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
public class MergeSortAlgo {
    public void Sort(int[] arr, int start, int end )
    { 
        if (start < end)
        {
        int mid = (start + end) / 2;
        
        Sort(arr, start, mid);
        Sort(arr, mid+1, end);
        Merge(arr, start, mid, end);
        }
    }
    
    public void Merge(int[] arr, int start,int mid, int end )
    {
       int tempArray[] = new int[end - start + 1];
       
       int left_slot = start;
       int right_slot = mid+1;
       
       int k = 0;
       
       while(left_slot <= mid && right_slot <= end)
       {
           if(arr[left_slot] < arr[right_slot])
           {
               tempArray[k] = arr[left_slot];
               k++;
               left_slot = left_slot+1;
           }
           else
           {
               tempArray[k] = arr[right_slot];
               k++;
               right_slot = right_slot +1;
           }
       }
       
        if (left_slot <= mid) {
            while (left_slot <= mid) {
                tempArray[k] = arr[left_slot];
                k++;
                left_slot = left_slot + 1;
            }
        }
        else if (right_slot <= end) {
            while (right_slot <= end) {
                tempArray[k] = arr[right_slot];
                k++;
                right_slot = right_slot + 1;
            }
        }
        
        for(int i = 0; i < tempArray.length; i++)
        {
            arr[start + i] = tempArray[i];
        }
        
    }
    
  
 
}
