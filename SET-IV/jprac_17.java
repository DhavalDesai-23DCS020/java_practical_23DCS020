class parent {
    void print()
    {
        System.out.println("This is a Parent Class ");
    }
}
class child extends parent{
    void childclassmethod()
    {
        System.out.println("This is a Child Class ");
    }
}
public class jprac_17 {
    public static void main(String[] args)
    {
        parent p =new parent();
        child c =new child();
        p.print();


    }                           
    
}
