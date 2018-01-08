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
public class linearSearch {
    
    public int linear_search(int[] a, int x)
    {
        boolean result = false;
        
        for(int i = 0; i < a.length ; i++)
        {
            if(a[i] == x)
            {
               return i;
            }
             
        }
        return  -1;
    }
    
}
