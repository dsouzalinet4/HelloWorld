/**
 * Created by linetdsouza on 2/28/16.
 */
public class Solution3 {

    static String isitpossible(int a, int b, int c, int d) {

        if ( RecursiveIsPossible(a,b,c,d) == true)

            return "YES";
        else
            return "NO";

    }

    static boolean RecursiveIsPossible(int a, int b, int c, int d)
    {
        if (a > c || b > d)
            return false;

        if (a == c && b == d)
            return true;

        return RecursiveIsPossible(a + b, b, c, d) || RecursiveIsPossible(a, a + b, c, d);
        //return false;
    }


    public static void main(String args[])
    {
        System.out.println(isitpossible(1, 4, 9, 14));
    }

}