import java.util.*;

class Demo{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int r = sc.nextInt();
       int c = sc.nextInt();
       
       int[][] arr = new int[r][c];
       
    //         for (int i=0;i<r or arr.length ;i++){
    //         int sum= 0;
    //             for (int j=0;j<c or arr[0].length ;j++){
    //           arr[i][j] = sc.nextInt();
    //           System.out.print(arr[i][j]+ " ");
    //           sum+=arr[i][j];
    //       }
    //       System.out.print("---> Row "+(i+1) + ": "+ sum);
    //       System.out.println();
    //   }
       
        for (int j=0;j<c;j++){
            int sum= 0;
            for (int i=0;i<r;i++){
               arr[i][j] = sc.nextInt();
               System.out.print(arr[i][j]+ " ");
               sum+=arr[i][j];
           }
           System.out.print("---> Col "+(j+1) + ": "+ sum);
           System.out.println();
       }
                // System.out.print(arr[2][2]);
    }
}

// String name = "Vivek";
  //     String name1 = "Vivek";
    //   String name2 = new String("Vivek");
      // 
       //System.out.println(name2);
       //System.out.println(name);
       
       
     // System.out.print(name == name2);
	  
	  