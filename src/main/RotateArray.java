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
public class RotateArray
{
    public void rotate(int[] nums, int k)   //Rotation of array elements toward right.
    {
        if(k> nums.length)
            k = k%nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++)
        {
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for (int i = k; i < nums.length; i++)
        {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}