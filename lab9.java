// 9.In a college first year class are having the following attributesName of the class (BCA, BCom, BSc), Name of the staff No of the students in the class, Array of students in the class 10. Define a class called first year with above attributes and define a suitable constructor. Also write a method called best Student () which process a first-year object and return the student with the highest total mark. In the main method define a first-year object and find the best student of this class 





// 10.Write a Java program to define a class called employee with the name and date of appointment. Create ten employee objects as an array and sort them as per their date of appointment. ie, print them as per their seniority. 
import java.util.Date;
class employee
{
String name;
Date appdate;
public employee(String nm,Date apdt)
{
name=nm;
appdate=apdt;
}
public void display()
{
System.out.println("employee name:"+name+" appoinment date:"+ appdate.getDate()+"/"+appdate.getMonth()+"/"+appdate.getYear());
}
}
class lab9
{
public static void main(String as[])
{
employee emp[]=new employee[10];
emp[0]=new employee("shaha PD",new Date(1999,05,22));
emp[1]=new employee("Patil AS",new Date(2000,01,12));
emp[2]=new employee("Phadake PV",new Date(2009,04,25));
emp[3]=new employee("Shinde SS",new Date(2005,02,19));
emp[4]=new employee("Shrivastav RT",new Date(2010,01,01));
emp[5]=new employee("Amitha S",new Date(2005,04,20));
emp[6]=new employee("Bhoomika S",new Date(2000,04,10));
emp[7]=new employee("Karan",new Date(2002,06,5));
emp[8]=new employee("Avinash",new Date(2001,02,9));
emp[9]=new employee("Ravi V",new Date(2010,9,23));
System.out.println("List of employees");
for(int i=0;i<emp.length;i++)
emp[i].display();
for(int i=0;i<emp.length;i++)
{
for(int j=0;j<emp.length;j++)
{
if(emp[i].appdate.after(emp[j].appdate))
{
employee t=emp[i];
emp[i]=emp[j];
emp[j]=t;
}
}
}
System.out.println("List of employees seniority wise");
for(int i=0;i<emp.length;i++)
emp[i].display();
}
}