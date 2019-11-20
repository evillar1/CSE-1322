import java.util.*;

public class TimeConversion24
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter time in 24-hour notation in hh:mm format: ");
    String input = sc.next();

    input = input.trim();

    int idx = input.indexOf(":");

    // begin outer-try block
    try {
    // begin inner-try block
      try {
        if (idx == -1)
          // that means input has no colon
          throw new TimeFormatException("You entered gibberish..");

        // catching NumberFormatException exception in the inner catch block
        int hour = Integer.parseInt(input.substring(0, idx));
        int min = Integer.parseInt(input.substring(idx+1));

        //input is in the form "xx:yy" where xx and yy are hour and min
        if (hour < 0 || hour > 24)
          throw new TimeFormatException("There is no such" +
                       " hour as " + hour);

        if (min < 0 || min > 60)
          throw new TimeFormatException("There is no such" +
                       " min as " + min);

        // Determine if it's an AM or a PM.
        boolean pm = false;
        if (hour >= 12) {
          pm = true;
          hour = hour - 12;
        }

        // Display the 12-hour notation to the output.
        System.out.print("This is the same as " + hour + ":" + min);
        System.out.println( (pm) ? " PM" : " AM");

      } // end inner-try
      catch(NumberFormatException e)
      {
        // inner-catch in turn throws a TimeFormatException,
        // to be caught in the outer-catch.
        throw new TimeFormatException("Inner exception");
      }

    } // end outer-try
    catch (TimeFormatException e)
    {
      //outer-catch
      System.out.println(e.getMessage());
    }


    System.out.println("======== Good bye =======");
  } 