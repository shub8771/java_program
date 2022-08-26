class addsub
{
    int n1,n2;
    public addsub(int x,int y)
    {
        n1=x;
        n2=y;
    }
    public int add()
    {
        return(n1+n2);
    }
    public int sub()
    {
        return(n1-n2);
    }
}
class muldev extends addsub
{
public muldev(int x,int y)
{
    super(x,y);
}
public int mul()
{
    return (n1*n2);
}
public int div()
{
    return(n1/n2);
}
}
public class lab6 {
    public static void main(String[] args) {
        muldev a=new muldev(15,5);
        System.out.println("sum="+a.add());
        System.out.println("difference="+a.sub());
        System.out.println("multiply"+a.mul());
        System.out.println("division"+a.div());
    }

}
