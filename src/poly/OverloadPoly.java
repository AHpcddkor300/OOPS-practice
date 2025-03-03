package poly;
class T
{
    public int max(int a, int b)
    {
        return a>b?a:b ;
    }

    public int max (int a, int b, int c)
    {
        if(a>b&& a>c)
            return a;
        else if (b>c)
            return b;
        return c;

    }
}
public class OverloadPoly {
    public static void  main (String[]args)
    {
        T m = new T();
        m.max(10,5);
        m.max(10, 15, 5);

        System.out.println("Max of 10 and 5: " + m.max(10, 5)); // Using two-argument max
        System.out.println("Max of 10, 15, and 5: " + m.max(10, 15, 5)); // Using three-argument max


    }
}
