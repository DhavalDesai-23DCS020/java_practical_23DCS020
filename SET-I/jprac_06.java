import java.util.Scanner;

public class jprac_06 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of days for your exercise routine: ");
int n = scanner.nextInt();


int firstTerm = 0, secondTerm = 1;

System.out.println("Your exercise routine duration for " + n + " days:");

for (int i = 1; i <= n; ++i) {
System.out.println("Day " + i + ": " + firstTerm + " minutes");

int nextTerm = firstTerm + secondTerm;
firstTerm = secondTerm;
secondTerm = nextTerm;
}
System.out.print("\nName : DHAVAL DESAI \nID : 23DCS020 ");
}
}
