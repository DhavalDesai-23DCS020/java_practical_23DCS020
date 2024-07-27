import java.util.Scanner;

public class jprac_05 {

public static void main(String[] args) {
Scanner ip = new Scanner(System.in);

float[] price = {100, 100, 100, 100, 100};
float totalPrice = 0;
System.out.println("Welcome To Shop!");
float tax = 0;
int a;
do {
System.out.println("Enter product code (1 for motor, 2 for fan, 3 for tube, 4 for wires, 5 for others, 0 to finish):");
a = ip.nextInt();
switch (a) {
case 1:
tax = (price[0] * 8) / 100;
break;
case 2:
tax = (price[1] * 12) / 100;
break;
case 3:
tax = (price[2] * 5) / 100;
break;
case 4:
tax = (price[3] * 7.5f) / 100;
break;
case 5:
tax = (price[4] * 3) / 100;
break;
default:
tax = 0;
break;
}
if (a > 0 && a <= 5) {
totalPrice += price[a - 1] + tax;
} else {
totalPrice += 0;
}
} while (a != 0);

System.out.println("Total Bill: " + totalPrice);
System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");
}
}
