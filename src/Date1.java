import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date d = new java.util.Date();
        System.out.println(formatter.format(d));
    }
}
