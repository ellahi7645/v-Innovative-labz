package com.basharat.onlineExam;// Efficient Java program to find pairs of  
//positive and negative values present in  
//an array.  
import java.util.*; 

class PositiveNagativePair
{    
 public static void propeticSort(int arr[], int n)  
{  
 List<Integer> aL = new ArrayList<Integer> ();  
 Map<Integer,Integer> tM = new TreeMap<Integer,Integer>(); 
 
 for (int i = 0; i < n; i++)  
 {   
     if (tM.containsKey(Math.abs(arr[i])))  
         tM.put(Math.abs(arr[i]), 1);  
 
     else 
     {  
         aL.add(Math.abs(arr[i]));  
         tM.put(Math.abs(arr[i]), 0);  
     }  
 }  

 if (aL.size() == 0)  
     return;  

 Collections.sort(aL);  
 for (int i = 0; i < aL.size(); ++i)  
     System.out.print(aL.get(i) + "-"+aL.get(aL.size()-1-i) + " ");  
}  
 
public static void main(String[] args)  
{  
 int arr[] = {5,9,3,-8,7,2};  
 int n = arr.length;  
 propeticSort(arr, n);  
} 
}