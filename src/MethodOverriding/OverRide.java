package MethodOverriding;

class Tv
{
    public void SwitchOn()
    {
        System.out.println("Tv is On") ;
    }
    public void channelChange()
    {
        System.out.println("Channel is Changed");
    }
}

class SmartTv extends Tv

{
    @Override
    public void SwitchOn()
    {
        System.out.println("smartTv is On") ;
    }

    @Override
    public void channelChange()
    {
        System.out.println("Channel is Changed");
    }
    public void browse()
    {
        System.out.println("Tv is Browsing");
    }

}
public class OverRide {
    public static void main(String[]args)
    {
        Tv t= new SmartTv();
        t.SwitchOn();
        t.channelChange();






    }

}
