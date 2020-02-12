import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorldForJenkins
{
    public static void main(String[] args) {
        System.out.println("Hello world from Jenkins");
        System.out.println("Current time is: " + curTime());

    }

    public static String curTime(){
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        return df.format(dateobj);
    }
}
