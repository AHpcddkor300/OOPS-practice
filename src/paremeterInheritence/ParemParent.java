package paremeterInheritence;

class parent
{
    public parent()
    {
        System.out.println("Non parem parent");
    }
    parent(int x)
    {
        System.out.println("parem parent"+ x);
    }
}
class child extends parent
{
    child()
    {
        System.out.println("non parem child");
    }
    child(int y)
    {
        System.out.println("parem child"+y);
    }
    child(int x, int y)
    {
        super(x);
        System.out.println("2 param of child"+y);

    }
}
public class ParemParent {
    public static void main (String []args)
    {
        child d = new child(10,20);

    }
}
