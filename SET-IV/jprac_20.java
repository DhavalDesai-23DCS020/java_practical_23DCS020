// Create a class named 'Shape' with a method to print "This
// is This is shape". Then create two other classes named
// 'Rectangle', 'Circle' inheriting the Shape class, both
// having a method to print "This is rectangular shape" and
// "This is circular shape" respectively. Create a subclass
// 'Square' of 'Rectangle' having a method to print "Square
// is a rectangle". Now call the method of 'Shape' and
// 'Rectangle' class by the object of 'Square' class.

class Shape{
    public void printS()
    {
        System.out.println("This is This shape");
    }
}
class Rectangle extends Shape{
    public void printR()
    {
        System.out.println("This is Rectangle shape");
    }
}
class Circle extends Shape{
    public void printC()
    {
        System.out.println("This is Circle shape");
    }
}
class Square extends Rectangle{
    public void printSq()
    {
        printS();
        printR();
        System.out.println("Square is Reactangle ");
    }
}
public class jprac_20 {
    public static void main(String[] args)
    {
        Shape s = new Shape();
        Square A =new Square();
        A.printSq();
    }

    
}
