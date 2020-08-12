package com.basharat.onlineExam;
import java.util.*; 

class FindSum 
{  
    static int findSum(int arr[]) 
    { 
        int sum = 0;  
        Set<Integer> s = new TreeSet<Integer>(); 
        for (int i = 0; i <arr.length; i++) 
        { 
            if (!s.contains(arr[i])) 
            { 
                sum += arr[i]; 
                s.add(arr[i]); 
            } 
        } 
        return sum; 
    } 
    public static void main(String[] args)  
    { 
        int arr[] = {6,2,5,4,1}; 
        System.out.println(findSum(arr)); 
    } 
}
