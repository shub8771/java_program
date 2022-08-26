import java.util.Calendar;
public class lab2 {
    public static void main(String[] args) {
        Calendar ca= Calendar.getInstance();
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("current month"+month[ca.get(Calendar.MONTH)]);
        System.out.println("Current month="+month[ca.get(Calendar.MONTH)]);
    }
}
