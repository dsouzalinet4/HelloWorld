/**
 * Created by linetdsouza on 2/28/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution2 {


    static int KDifference(int[] a, int k) {

        int count = 0;
        System.out.println("length :"  + a.length + "array " + a);
        for (int i = 0 ; i < a.length; i++)
        {
            for (int j=i+1; j < a.length; j++)
            {
                int diff = Math.abs(a[i] - a[j]);
                if (diff == k)
                    count++;
            }
        }
        return count;

    }

    public static void main(String args[])
    {
        System.out.println("hello world");
        int[] a = {1,5,7,8};
        int res = KDifference(a, 2);
        System.out.println("res :" + res);
    }
}
