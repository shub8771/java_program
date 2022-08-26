public class lab5 {
    int add()
    {
        return (10+10);
    }
    int add(int x,int y)
    {
        return(x+y);
    }
    float add(float a,float b)
    {
        return(a+b);
    }
    public static void main(String[] args) {
     lab5 a=new lab5();
        System.out.println("using default values"+a.add());
        System.out.println("using integer values"+a.add(12,29));
        System.out.println("using double values"+a.add(12.34f,23.24f));
    }
}
