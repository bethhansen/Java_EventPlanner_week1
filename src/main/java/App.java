import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hi, Welcome to our event handling application. We are here to help you with all your special event handling needs.");
        System.out.println("How many guest will be attending your event?");
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String stringNumber = bufferedReader.readLine();
            Integer yourNumber = Integer.parseInt(stringNumber);
            Integer yourDoubledNumber = yourNumber * 15;

            System.out.println("This is out beginning price per person: $" + yourDoubledNumber + ". As we add choices, your price per person will flucuate.");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}