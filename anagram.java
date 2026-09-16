    import java.util.*;
class Main{
    String name2;
}

class Demo{
    public static void main(String[] args){
        
         Scanner sc = new Scanner(System.in);

        String s1 = "GOD";
        String s2 = "DOG";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);
        
        for (int i=0; i<ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }
        System.out.println("ANAGRAM");
        // int a=10;
        // long b=10;
        
        // System.out.println(a == b);
        // String name1 = "Hello";
        // s = name1.concat(" World!!");
        
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(" World!!");
        
        // System.out.println("String: " + name1);
        // System.out.println("StringBuilder: " + sb);
        // String name2 = "Vivek";
        // System.out.println(name1 == name1);
        
        // char ch[] = name1.toCharArray();
        
        // System.out.print("Convert String into Array by toCharArray: ");
        
        // for (int i=name1.length()-1; i>=0; i--) {
        //     System.out.print(name1.charAt(i) + " ");
        // }
        
        // String s1 = "my name is vivek .";
        // String[] words = s1.split(" ");
        
        // // for (int i=0;)
        // System.out.println(words[3]);
        
        // int[] arr ={1,2,3,4,5};
        
        // for (int i : arr) {
        //     System.out.println(i);   
        // }
        // String s = new String("Hello");
        // // String name4 = new String("word");
        
        // s.concat(" word!!");
        // System.out.println(s);
        // s = s.concat(" word!!");
        // System.out.println(s);
       
        // System.out.println(name3 == name4);
        // System.out.println(name3.equals(name4));
        // System.out.println(name3.equalsIgnoreCase(name4));
       
        // System.out.println(name1);
        // System.out.println(name2);
        // System.out.println(name3);
        
        // System.out.println(name1 == name3);
        // System.out.println(name1.equals(name2));
        // System.out.println("equalsIgnoreCase : "+name1.equalsIgnoreCase(name3));
        
        // System.out.println(name1.charAt(0));
        
        // for(int i=0;i<name1.length();i++){
        //     System.out.println(name1.charAt(i));
        // }
        
        // Main obj = new Main();
        // System.out.println(obj.name2);
    }
}