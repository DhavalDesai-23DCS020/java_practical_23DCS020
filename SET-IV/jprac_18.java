import java.util.*;
class Member{
    String name;
    int age;
    long  phone_number;
    String address;
    double salary;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the member : ");
        name=sc.nextLine();
        System.out.println("Enter the age of the member : ");
        age=sc.nextInt();
        System.out.println("Enter the phone number of the member : ");
        phone_number=sc.nextLong();
        System.out.println("Enter the address of the member : ");
        address=sc.next();
        System.out.println("Enter the salary of the member : ");
        salary=sc.nextDouble();
    }
    public void printdata()
    {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("phone number : " + phone_number);
        System.out.println("address : " + address);
        printsalary(salary);
    }
    
    public void printsalary(double salary)
    {
        System.out.println("salary : " + salary);

    }
}
class Employee extends Member{
    String designation;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the designation of the employee : ");
        designation=sc.nextLine();
    }
}
class Manager{
    String department;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the department of the manager : ");
        department=sc.nextLine();
    }
}
public class jprac_18 {
    public static void main(String[] args) {
        Member m = new Member();
        Employee e = new Employee();
        Manager mg = new Manager();
        m.getdata();
        m.printdata();
        // e.getdata();
        // mg.getdata();
    }
    
}
