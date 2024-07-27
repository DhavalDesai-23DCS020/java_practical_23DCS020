
import java.util.Arrays;
import java.util.Scanner;

public class j10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        System.out.println("length of String : "+ s.length());
        System.out.println("lower case : "+ s.toLowerCase());
        System.out.println("upper case : "+s.toUpperCase());
        // System.out.println("reverse of String : "+s.reverse);
        
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
        //sorting of String 
        System.out.println("\nSorted string ");
        char [] ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        
    




       
        
    }
}
