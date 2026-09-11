import java.util.*;

class Demo{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
      
       int arr[]= new int[n];
       
       for (int i=0;i<arr.length;i++ ){
           arr[i]= sc.nextInt();
           System.out.print(arr[i] + " ");
       }
       System.out.println();
       
       int new_arr[] = new int[n-1];
       
       int x=0;
        for(int i=0;i<n;i++){
            if (i!=2){
                new_arr[x++] = arr[i];
            }
        }
        

        for(int i=0;i<new_arr.length;i++){
            System.out.print(new_arr[i]+ " ");
        }
        
        // System.out.print(new_arr[5] + " ");
    }
}