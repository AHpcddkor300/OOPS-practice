package abstractworks;
abstract class sup  //abstract  class
{
    public sup ()//constructor
    {
        System.out.println("super constructor"  );

    }

    public void method () //conrete class
    {
        System.out.println("Method of super");

    }
    abstract public void method2(); //abstract method
}
class sub extends sup
{
    @Override
    public void method2()
    {
        System.out.println("sub method2");

    }
}
public class abstractexamples {
    public static void main (String[]args)
    {
        sup s=new sub(); //polyorphism
        s.method();
        s.method2();

    }
}
