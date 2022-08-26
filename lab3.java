public class lab3 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try
        {
            System.out.println(a/b);
        }catch(ArithmeticException e)
        {
            System.out.println("division by zero is not possible");
        }
    }
}
