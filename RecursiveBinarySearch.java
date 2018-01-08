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
public class RecursiveBinarySearch {
    
    public int recursive_BinarySearch(int[] a, int p, int r, int x)
    {
        
      if(p > r)
      {
          return -1;
      }
      else{
         int q = ( p+ r) /2;
         if (a[q] == x)
         {
             return a[q];
         }
           else if (a[q] > x)
            {
            return recursive_BinarySearch(a, p, q-1, x);
            }
            else
            {
            return recursive_BinarySearch(a, q+1, r , x);
            }
      }
      
    }
}
