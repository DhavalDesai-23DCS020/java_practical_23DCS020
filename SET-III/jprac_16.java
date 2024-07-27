import java.util.*;

public class jprac_16 {

private double real;
private double imaginary;

public jprac_16 () {
}

public jprac_16 (double real, double imaginary) {
this.real = real;
this.imaginary = imaginary;
}

public static jprac_16  getInput() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter real part: ");
double real = scanner.nextDouble();
System.out.print("Enter imaginary part: ");
double imaginary = scanner.nextDouble();
return new jprac_16 (real, imaginary);
}

public jprac_16 add(jprac_16 other) {
return new jprac_16(real + other.real, imaginary + other.imaginary);
}

public jprac_16 subtract(jprac_16 other) {
return new jprac_16(real - other.real, imaginary - other.imaginary);
}

public jprac_16 multiply(jprac_16 other) {
double newReal = (real * other.real) - (imaginary * other.imaginary);
double newImaginary = (real * other.imaginary) + (imaginary * other.real);
return new jprac_16(newReal, newImaginary);
}


public String toString() {
return String.format("%.2f + %.2fi", real, imaginary);
}

public static void main(String[] args) {
System.out.println("Enter first complex number:");
jprac_16 number1 = getInput();
System.out.println("Enter second complex number:");
jprac_16 number2 = getInput();

jprac_16 sum = number1.add(number2);
jprac_16 difference = number1.subtract(number2);
jprac_16 product = number1.multiply(number2);

System.out.println("Sum: " + sum);
System.out.println("Difference: " + difference);
System.out.println("Product: " + product);
System.out.print("\nName : DHAVAL DESAI  \nID : 23DCS020 ");

}
}
