class Student
{
    public int roll;
    public String name;
    public String courseName;
    public int mark1, mark2, mark3;

    public int total()
    {
        return mark1+mark2+mark3;
    }
    public double average ()
    {
        return Math.round((double) total() / 3 * 100.0) / 100.0;
    }
    public char grade ()
    {
        if (average()>=80)
            return 'A';
        else
            return 'B';
    }
    public String details()
    {
        return "Roll Number: "+roll+"\n"+ "Name: "+name+"\n"+"Course: "+courseName+"\n";

    }
}
public class StudentResult {
    public static void main (String []args)
    {
        Student s = new Student();
        s.roll=1;
        s.name="cina";
        s.courseName="CSE";
        s.mark1 = 70;
        s.mark2 =80;
        s.mark3 =65;

        System.out.println("Total: "+ s.total());
        System.out.println("Average: "+s.average());
        System.out.println("Grade: "+s.grade());
        System.out.println("Details: "+s.details());



    }
}
