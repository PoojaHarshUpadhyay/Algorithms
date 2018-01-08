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
public class SelectionSort {
    public void selection_sort(int[] data)
    {
        for (int i = 0; i <= data.length -1 ; i++)
        {
            int min = i;
            for(int j = i+1; j < data.length; j++)
            {
                if( data[j] < data[min])
                {
                    min = j;
                }
            }
            
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
            System.out.println(" " + data[i]);
        }
    }
}
