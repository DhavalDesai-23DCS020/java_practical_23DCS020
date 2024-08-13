// Write a Java program that throws an exception and catch
// it using a try-catch block.

import java.util.Scanner;

public class jprac_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result : " + c);
           
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }
        sc.close();
        System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");  
    }
    
}
