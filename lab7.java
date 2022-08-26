
//replace lab7 to student
class student {
    static String collegename="PES";
    int rollno;
    String name;
    student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    void display()
    {
        System.out.println(collegename+" "+rollno+""+name);
    }
}
public class lab7{
    public static void main(String args[])
    {
        System.out.println("objects sharing static variable :collegename");
        student s1=new student(101,"suhas");
        student s2=new student(102,"mohan");
        s1.display();
        s2.display();
        System.out.println("static variable changed by one of the object");
        student.collegename="BMS";
        s1.display();
        s2.display();
    }
}
