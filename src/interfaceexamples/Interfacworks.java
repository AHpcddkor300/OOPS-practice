package interfaceexamples;
interface Check
{
    void method1();
    void method2();

}
class amar implements Check
{
    public void method1()
    {
        System.out.println("Amaar mehtod class");
    }
    public void method2()
    {
        System.out.println("Amar method 2");

    }
}
public class Interfacworks {
    public static void main(String []args)
    {
        Check t=new amar();
        t.method1();
        t.method2();

    }

}
