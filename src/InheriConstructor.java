class parent
{
    public parent()
    {
        System.out.println("Parent class");
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("Child constructor ");
    }
}

public class InheriConstructor {
    public static void main (String []args)
    {
        child ch =new child();

    }
}
