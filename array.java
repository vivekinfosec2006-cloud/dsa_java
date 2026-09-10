// You are using Java
import java.util.*;

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for (int i=0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i=0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int sum = 0;
         for (int i=0; i< arr.length ; i++){
            sum += arr[i];
        }
            System.out.println("sum : " + sum);
            
            // for sorted array
            // System.out.println("Maximum : " + arr[arr.length-1]);
            // System.out.println("Minimum : " + arr[0]);
            
            
            // int min = Integer.MAX_VALUE;
            int min = arr[0];
            
            for (int i=0;i<n;i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            
            System.out.println("minimum : "+min);
            
            // int max = Integer.MIN_VALUE;
            int max = arr[0];
            
            for (int i=0;i<n;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            
            System.out.println("Maximum : "+max);
            
    }  
}

import java.util.*; 

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for (int i=0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i=0; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
        int sum = 0;
        
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        
        System.out.println("Sum of array is: " + sum);
        
    }
}

// sc.next(); String value "Parul"
// sc.nextInt(); Integer value -1 2 700 234
// sc.nextDoublr(); 1.3234 -3.4566 122.4566
// sc.nextLine(); "Hello Vivek" whenever we take a sentence which have a space use 