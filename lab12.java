public class lab12 {
public static void main(String args[])
{
try
{
int [] array=new int[-10];
}
catch(NegativeArraySizeException obj)
{
obj.printStackTrace();
}
System.out.println("Exception caught and continue execution");
}
}