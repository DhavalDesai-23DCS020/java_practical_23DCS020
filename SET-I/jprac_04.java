import java.util.Scanner;

public class jprac_04 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the number of days you have expenses for: ");
int numberOfDays = scanner.nextInt();

double[] dailyExpenses = new double[numberOfDays];

for (int i = 0; i < numberOfDays; i++) {
System.out.print("Enter expense for day " + (i + 1) + ": ");
dailyExpenses[i] = scanner.nextDouble();
}

double totalExpenses = calculateTotalExpenses(dailyExpenses);

System.out.println("Total Expenses for the Month: " + totalExpenses + "/- Rs.");

System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");
}

public static double calculateTotalExpenses(double[] expenses) {
double total = 0;
for (int i = 0; i < expenses.length; i++) {
total += expenses[i];
}
return total;
}
}
