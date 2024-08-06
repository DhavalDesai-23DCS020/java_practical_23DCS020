
// Create a class named 'Rectangle' with two data members
// 'length' and 'breadth' and two methods to print the area and
// perimeter of the rectangle respectively. Its constructor
// having parameters for length and breadth is used to
// initialize length and breadth of the rectangle. Let class
// 'Square' inherit the 'Rectangle' class with its constructor
// having a parameter for its side (suppose s) calling the
// constructor of its parent class as 'super(s,s)'. Print the area
// and perimeter of a rectangle and a square. Also use array
// // of objects.
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
    }
}
class Square extends Rectangle {
    Square(int side) {
        super(side, side);
    }
}
public class jprac_19 {
    public static void main(String[] args) {
        Rectangle[] r = new Rectangle[2];
        r[0] = new Rectangle(2, 3);
        r[1] = new Square(4);
        r[0].area();
        r[0].perimeter();
        r[1].area();
        r[1].perimeter();
        System.out.print("\nName : DHAVAL DESAI  \nID : 23DCS020 ");
    }
}




