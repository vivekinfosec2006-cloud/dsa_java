import java.util.*; 

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.print("OG array : ");
        for (int i=0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
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
        System.out.println();
        
        System.out.print("Reverse of an OG array : ");
        
        for (int i= arr.length-1; i>=0 ; i--){
            arr[i] = revarr[i];
            System.out.print(revarr[i] + " ");
        }
            
//         int prefix[] = new int[arr.length];
        
//         prefix[0] = arr[0];
        
//         for (int i=1; i<arr.length; i++){
//             prefix[i] = prefix[i-1] + arr[i];
//         }
        
// 		System.out.print("Prefix Array: ");
		
//         for (int i=0; i<arr.length; i++){
//          System.out.print(prefix[i] + " ");
//         }
        
//         System.out.println();
        
//         int L = sc.nextInt();
//         int R = sc.nextInt();
//         int sum = 0;
        
//         if(L==0) {
//             // System.out.print(prefix[R]);
//             sum = prefix[R];
//         }
//         else{
//             // System.out.print(prefix[R] - prefix[L-1]);
//             sum = prefix[R] - prefix[L-1];
//         }
        
//         System.out.print("sum of Range  from "+ L +" To " + R + " is : " + sum);

        
        
        sc.close();
    }
}