
// Write a java program to generate user defined exception
// using “throw” and “throws” keyword.
// Also Write a java that differentiates checked and
// unchecked exceptions. (Mention at least two checked and
// two unchecked exceptions in program).
import java.util.Scanner;

public class jprac_26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Enter two numbers : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            int c = a/b;
            System.out.println("Result : " + c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }
        System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");
    }
}
