/**
 * Created by linetdsouza on 2/27/16.
 * Circles friends
 * image 4
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int friendCircles(String[] friends)
    {
        //TreeSet was selected because it can have unique values only
        TreeSet circleOfFriends;
        int count = 0;
        //below treeset will contain all friends which are already a part of another group
        TreeSet allTraversedFriends = new TreeSet();
        for (int i = 0; i<friends.length; i++)
        {
           Integer iObj = new Integer(i);
           if (!allTraversedFriends.contains(iObj)) {
               circleOfFriends = new TreeSet();
               recursiveFunction(i, friends, circleOfFriends);
               // Add all circles friends to the traversed friends group so that we dont traverse them again
               allTraversedFriends.addAll(circleOfFriends);
               count++;
           }
        }
        return count;
    }

    // recursively call this function for each person's friends
    static void recursiveFunction(int oneperson, String[] friends, TreeSet circleOfFriends)
    {
        // convert int to Integer to Tree Set
        Integer ObjPerson = new Integer(oneperson);
        if (circleOfFriends.contains(ObjPerson))
            return;

        circleOfFriends.add(oneperson);
        for (int j = 0; j<friends[oneperson].length(); j++)
        {
            char friendValue = friends[oneperson].charAt(j);
            if (friendValue == 'Y') {
                recursiveFunction(j, friends, circleOfFriends);
            }
        }
        return;
    }

    public static void main(String args[]) {
        int friends_size = 4;
        String[] friends = new String[friends_size];
        int i = 0;

        friends[0] = "YYNN";
        friends[1] = "YYYN";
        friends[2] = "NYYN";
        friends[3] = "NNNN";


        int res = friendCircles(friends);
        System.out.println("output " + res);
    }


}
