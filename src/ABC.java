/**
 * Created by linetdsouza on 1/31/16.
 */

import java.util.Scanner;
import java.util.regex.*;

         class MyRegex extends ABC
        {
            public static String pattern;
            public MyRegex (String it)
            {
                pattern = it;
            }

            public static boolean isMatches()
            {
  String regex = "^(([0-9]?\\d|[01]\\d\\d|2[0-5][0-5]|2[0-4]\\d).){3}([0-9]?\\d|[01]\\d\\d|2[0-5][0-5]|2[0-4]\\d)$";
                return (pattern.matches(regex));
            }

        }

public class ABC {



    public static void main(String []argh) {
        /*Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String iP = in.next();
            MyRegex mr = new MyRegex(iP);
            System.out.println(mr.isMatches());
        }*/
        MyRegex mr = new MyRegex("45.34.56.23");
        System.out.println( mr.isMatches());
    }

}
