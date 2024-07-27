import java.util.*;

class Employee {
private String fname;
private String lname;
private Double Sal;

Employee(String fs, String ls, double sl) {
fname = fs;
lname = ls;
Sal = sl;
}

void putfs() {
System.out.println("" + fname);
}

void putls() {
System.out.println("" + lname);

}

void putsal() {
System.out.println("" + Sal);
}

public void setFname(String fname) {
this.fname = fname;
}

public void setLname(String lname) {
this.lname = lname;
}

public void setSal(Double sal) {
this.Sal = sal;
}

public String getFname() {
return fname;
}

public String getLname() {
return lname;
}

public Double getSal() {
return Sal;
}
}

public class jprac_13{
public static void main(String[] args) {

Employee emp1 = new Employee("John", "Doe", 3000.0);
Employee emp2 = new Employee("Jane", "Doe", 4000.0);

System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s yearly salary: " + (emp1.getSal() * 12));
System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s yearly salary: " + (emp2.getSal() * 12));

emp1.setSal(emp1.getSal() * 1.10);
emp2.setSal(emp2.getSal() * 1.10);

System.out.println(emp1.getFname() + " " + emp1.getLname() + "'s yearly salary after 10% raise: " + (emp1.getSal() * 12));
System.out.println(emp2.getFname() + " " + emp2.getLname() + "'s yearly salary after 10% raise: " + (emp2.getSal() * 12));
System.out.print("\nName : DHAVAL DESAI  \nID : 23DCS020 ");

}
}
