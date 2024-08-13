// 1.Write a Java programming to create a banking system
// with three classes - Bank, Account, SavingsAccount,
// and CurrentAccount. The bank should have a list of
// accounts and methods for adding them. Accounts should
// be an interface with methods to deposit, withdraw,
// calculate interest, and view balances. SavingsAccount
// and CurrentAccount should implement the Account
// interface and have their own
// unique methods. [L:A]

interface Account{
    void deposit();
    void withdraw();
    void calculateInterest();
    void viewBalance();
}
class Bank{
    Account a;
    void addAccount(Account a){
        this.a = a;
    }
}
class SavingsAccount implements Account{
    public void deposit(){
        System.out.println("Deposit in Savings Account");
    }
    public void withdraw(){
        System.out.println("Withdraw from Savings Account");
    }
    public void calculateInterest(){
        System.out.println("Calculate Interest in Savings Account");
    }
    public void viewBalance(){
        System.out.println("View Balance in Savings Account");
    }
}
class CurrentAccount implements Account{
    public void deposit(){
        System.out.println("Deposit in Current Account");
    }
    public void withdraw(){
        System.out.println("Withdraw from Current Account");
    }
    public void calculateInterest(){
        System.out.println("Calculate Interest in Current Account");
    }
    public void viewBalance(){
        System.out.println("View Balance in Current Account");
    }
}
public class jsupply_2{
    public static void main(String[] args) {
        Bank b = new Bank();
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();
        b.addAccount(s);
        b.addAccount(c);
        s.deposit();
        s.withdraw();
        s.calculateInterest();
        s.viewBalance();
        c.deposit();
        c.withdraw();
        c.calculateInterest();
        c.viewBalance();
    }
}
