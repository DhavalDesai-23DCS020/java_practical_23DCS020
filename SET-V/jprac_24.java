import java.util.InputMismatchException;
import java.util.Scanner;

public class jprac_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Enter the first integer (x): ");
            int x = scanner.nextInt();

            System.out.print("Enter the second integer (y): ");
            int y = scanner.nextInt();

            // if (y == 0) {
            //     throw new ArithmeticException("Division by zero is not allowed.");
            // }

            int result = x / y;
            System.out.println("Result of " + x + " / " + y + " = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.--> Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            
            scanner.close();
        }
        
        System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");        
    }

}