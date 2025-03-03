package poly;
class Supper
{
    public void display()
    {
        System.out.println("Supper Dispplay kor");
    }
}
class subb extends Supper
{
    public void display()
    {
        System.out.println("Subb display kor");
    }
}
public class overridePOly {
    public static void main (String[]args)
    {
        Supper s = new subb();
        s.display();
    }
}

