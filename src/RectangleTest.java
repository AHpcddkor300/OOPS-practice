class Rect
{
    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;

    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        return length==breadth;
    }
}
public class RectangleTest {
    public static void main (String []args)
    {
        Rect re= new Rect();
        re.breadth=10.5;
        re.length=10.5;
        System.out.println("Area "+re.area());
        System.out.println("Peimeter "+re.perimeter());
        System.out.println("It is Square "+re.isSquare());

    }
}
