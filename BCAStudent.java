// 11. Create a package‘student.Fulltime.BCA‘in your current working directory a.Create a default

// class student in the above package with the following attributes: Name, age, sex. b. Have methods for storing as well as displaying 
package student.fulltime.bca;
import java.util.Scanner;
public class BCAStudent {

    String name, sex;
    int age;
    Scanner sc = new Scanner(System.in);

public void getdata()
{System.out.println("enter the student name");
        name=sc.nextLine();
        System.out.println("enter the gender");
        sex = sc.nextLine();
        System.out.println("enter the age");
        age=sc.nextInt();

}

public void display()
{
System.out.println("student details are:");
System.out.println("student name:"+name);
System.out.println("student age:"+age);
System.out.println("student sex:"+sex);
}
}

