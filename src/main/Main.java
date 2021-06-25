/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author m-w-n
 */
public class Main
{
    public static void main(String[] args)
    {
        RotateArray r = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        r.rotate(arr, 9);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}