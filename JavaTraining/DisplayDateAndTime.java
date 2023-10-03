import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayDateAndTime{
    
    //This code simply displays the current date and time using GregorianCalendar class

    public static void main(String[] args){

        int day, month, year;
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();

        //Get the date
        day = date.get(Calendar.DAY_OF_MONTH);
        month = date.get(Calendar.MONTH);
        year = date.get(Calendar.YEAR);
        
        //Get the time
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        //Output
        System.out.println("Current time is: " +day +"/" +(month+1) +"/" +year); //month+1 Because month values start from 0
        System.out.println("Current time is: " +hour +":" +minute +":" +second);
    }
}