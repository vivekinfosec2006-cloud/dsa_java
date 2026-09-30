import java.util.*;

class Demo {
    
    static int sumDigit(int n) {
        if (n==0) return 0;
        
        return (n%10) + sumDigit(n/10);
    }
    
     static int countDigit(int n) {
        if (n==0) return 0;
        sumDigit(n/10);

        return 1 + sumDigit(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        System.out.println(sumDigit(n));
        System.out.println(countDigit(n));
        // int sum = 0;
        
        // while (n!=0) {
        //     int rem = n%10;
        //     sum+= rem;
        //     n = n/10;
        // }
        // System.out.println(sum);
        
        int arr[] = {2,5,4,7,1,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}