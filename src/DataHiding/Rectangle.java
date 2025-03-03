package DataHiding;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth (double b)
    {
        breadth =b;
    }
    public double area ()
    {
        return getBreadth()*getLength();
    }
    public double perimeter ()
    {
        return 2*(length+breadth);
    }
    public  boolean isSquare ()
    {
        if (length==breadth)
            return true;
        else
            return false;

    }
    public static void main (String []args)
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        r.setLength(length);

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        r.setBreadth(breadth);

        System.out.println("Area: "+ r.area());
        System.out.println("Perimeter: "+r.perimeter());
        System.out.println("it is a square: " +r.isSquare());
        System.out.println("Length: "+r.getLength());
        System.out.println("Breadth: "+r.getBreadth());

    }
}
