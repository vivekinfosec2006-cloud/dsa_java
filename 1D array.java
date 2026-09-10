import java.util.*;

class Demo{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int[] arr = new int[n];
        System.out.print("OG of an array : ");
        for (int i=0; i< arr.length; i++){
            arr[i] = s.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse of an array : ");
        int revarr[] = new int[n];
        int x = 0;
        for (int i= arr.length-1; i>=0 ; i--){
            revarr[x++] = arr[i];
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
        
        // System.out.print("Reverse of an OG array : ");
        
        // for (int i= arr.length-1; i>=0 ; i--){
        //     arr[i] = revarr[i];
        //     System.out.print(revarr[i] + " ");
        // }
        // System.out.println();
        // int i = 0;
        // int j = arr.length-1;
        
        // while(i<=j){
        //     if(arr[i] != arr[j]){
        //         System.out.println("not a palindrome");
        //         // break;
        //         return;
        //     }
        //     i++;
        //     j--;
        // }
        // System.out.println("palindrome");
    }
}