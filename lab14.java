
public
class lab14 {
public static void main(String args[])
{
String city=null;
try
{
if(city.equals("BANGLORE"))
System.out.println("Equal");
else
System.out.println("not equal");
}
catch(NullPointerException e)
{
System.out.println("Null pointer exception ");
}
finally
{
System.out.println("finally block will be executed");
}
}
}