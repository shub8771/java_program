// 8.Write a java program to create a student class with following attributes: Enrollment_id: Name, Mark of sub1, Mark of sub2, mark ofsub3, Total Marks. Total of the three marks must be calculated only when the student passes in all three subjects. The pass mark for each subject is 50. If a candidate fails in any one of the subjects his total mark must be declaredas zero. Using this condition write a constructor for this class. Write separate functions for accepting and displaying student details. In the main method create an array of three student objects and display the details.

import java.util.*;

class student {
    Scanner sc = new Scanner(System.in);
    String E_id;
    String name;
    int s1, s2, s3, total;

    student() {
        readStudentInfo();
    }

    public void readStudentInfo() {
        System.out.println("enter student details");
        System.out.println("E_id no-");
        E_id = sc.next();
        System.out.println("NAME:");
        name = sc.next();
        System.out.println("enter the marks of 3 subjects");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        if (s1 >= 50 && s2 >= 50 && s3 >= 50)
            total = s1 + s2 + s3;
        else
            total = 0;
    }

    public void displayinfo() {
        System.out.println(E_id + "\t\t" + name + "\t\t" + total);
    }
}

public class lab8 {
    public static void main(String args[]) {
        student s[] = new student[3];
        for (int i = 0; i < 3; i++) {
            s[i] = new student();
        }
        System.out.println("student details");
        System.out.println("enrollementNo\tTotal\t\tTotal");
        System.out.println("\n");
        for (int i = 0; i < 3; i++) {
            s[i].displayinfo();
        }
    }
}