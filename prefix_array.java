import java.util.*; 

class Demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for (int i=0; i< arr.length ; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
            
        int prefix[] = new int[arr.length];
        
        prefix[0] = arr[0];
        
        for (int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
		System.out.print("Prefix Array: ");
		
        for (int i=0; i<arr.length; i++){
         System.out.print(prefix[i] + " ");
        }
        
        System.out.println();
        // int sum = 0;
        
        // for (int i=1; i< arr.length; i++){
        //     sum += arr[i];
        // }
        
        // System.out.println("Sum of array is indext 1 to 4: " + sum);
        
        
        // for print string array
        
        //   int n = sc.nextInt();
        
        // String arr[] = new String[n];
        
        // for (int i=0; i< arr.length ; i++){
        //     arr[i] = sc.next();
        //     System.out.print(arr[i] + " ");
        // }
        
        sc.close();
    }
}

// sc.next(); String value "Parul"
// sc.nextInt(); Integer value -1 2 700 234
// sc.nextDoublr(); 1.3234 -3.4566 122.4566
// sc.nextLine(); "Hello Vivek" whenever we take a sentence which Have
// prefiction in array use to cutoff time
