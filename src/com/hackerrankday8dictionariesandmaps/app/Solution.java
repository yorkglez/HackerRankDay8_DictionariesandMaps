package com.hackerrankday8dictionariesandmaps.app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution
{
    public static void main(String[] args)
    {
        //Variable declaration
        int dictionaryElements = 0;
        //Object declaration
        HashMap<String,Integer> myMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        //Input elements size
        dictionaryElements = in.nextInt();

        //Add name and number to map
        for(int i = 0; i < dictionaryElements; i++){
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name,phone);
        }

        //Search keys in map
        while(in.hasNext()){
            String s = in.next();
            if(myMap.containsKey(s))
            {
                System.out.println(s+"="+myMap.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }

        //Close input
        in.close();
    }
}
