/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Gaurav
 */
import java.util.Arrays;
public class Main
{
    public static int[] sort(int [] tempArr)
    {
        Arrays.sort(tempArr);
        return tempArr;
    }
    public static void main(String[] args)
    {
        int[] arr = {3,8,0,4,9};
        int result[]= sort(arr);
        for (int i = 0; i < result.length; i++)
        {
            System.out.println(result[i]);

        }
        System.out.println(Arrays.binarySearch(arr,4));

    }
}
