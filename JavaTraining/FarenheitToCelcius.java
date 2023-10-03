import java.util.Scanner;

public class FarenheitToCelcius{

    //This program simply gets an imperial system input of temperature and converts is into metric.

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int decimal = 3; //Default decimal in Celcius temperature shown
    double temperatureFareneheit, temperatureCelcius;
    
        System.out.println("Please give a Farenheit temperature: ");
        if (scanner.hasNextDouble()){
            //Temperature input
            temperatureFareneheit = scanner.nextDouble();
            //Temperature conversion
            temperatureCelcius = ((temperatureFareneheit - 32) / 1.8);
            
            System.out.println("The temperature in Celcius is: ");
               System.out.format("%." +decimal +"f",temperatureCelcius);
        }
        

        
    }
    


}