
// Assume you want to capture shapes, which can be either
// circles (with a radiusand a color) or rectangles (with a
// length, width, and color). You also want to be able to
// create signs (to post in the campus center, for example),
// each of which has a shape (for the background of the sign)
// and the text (a String) to put on the sign. Create classes
// and interfaces for circles, rectangles, shapes, and signs.
// Write a program that illustrates the significance of
// interface default method.

interface Shape{
    void print();
}
class Circle implements Shape{
    int radius;
    String color;
    Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public void print(){
        System.out.println("Radius : "+radius+" Color : "+color);
    }
}
class Rectangle implements Shape{
    int length;
    int width;
    String color;
    Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }
    public void print(){
        System.out.println("Length : "+length+" Width : "+width+" Color : "+color);
    }
}
class Sign{
    Shape s;
    String text;
    Sign(Shape s, String text){
        this.s = s;
        this.text = text; 
    }
    void print(){
        s.print();
        System.out.println("Text : "+text);
    }
}
public class jprac_23{
    public static void main(String[] args) {
        Circle c = new Circle(10, "Red");
        Rectangle r = new Rectangle(10, 20, "Blue");
        Sign s = new Sign(c, "Circle Sign");
        s.print();
        Sign s1 = new Sign(r, "Rectangle Sign");
        s1.print();
 
    }
}


