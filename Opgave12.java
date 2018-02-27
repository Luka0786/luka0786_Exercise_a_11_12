package Kap11Exercise12;

import java.util.*;

public class Opgave12
{
    /*
    Write a method contains3 that accepts a list of strings as a parameter
    and returns true if any single string occurs at least 3 times in the list,
    and false otherwise. Use a map as auxiliary storage.
    */

    public static void main(String[] args)
    {
        List<String> listOfStrings = new LinkedList<>();
        listOfStrings.add("Majs");
        listOfStrings.add("Majs");
        listOfStrings.add("Majs");
        listOfStrings.add("Ugle");
        listOfStrings.add("Hund");
        listOfStrings.add("Fisk");

        System.out.println(contains3(listOfStrings));
    }

    public static boolean contains3(List<String> stringList)
    {
        //Map("Key", "Value")
        Map<String, Integer> mapHelper = new HashMap<>();
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext())
        {
            String next = iterator.next();

            if (mapHelper.containsKey(next))
            {
                mapHelper.put(next, mapHelper.get(next) + 1);
            }
            else
            {
                mapHelper.put(next, 1);
            }
        }

        if (mapHelper.containsValue(3))
        {
            return true;
        }
        return false;


    }

}
