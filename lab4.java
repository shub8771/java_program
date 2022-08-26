import java.util.Scanner;

class payoutOfBoundsException extends Exception
{
    payoutOfBoundsException(String msg)
    {
        System.out.println("pay out of bounds exception"+msg);
    }
}
public class lab4 {
    public static void main(String[] args)throws payoutOfBoundsException
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the employee salary");
        int pay=sc.nextInt();
        if(pay<10000||pay>50000)
        {
            throw new payoutOfBoundsException("salary not in valid range");
        }
        else
            System.out.println("Employee is eligible for 30% hike");
    }
}
