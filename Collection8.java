/*
Write a java program using ArrayList to display the following output:

Vector: [Dog, Horse, Cat]
New Vector: [Crocodile, Dog, Horse, Cat]*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        Vector<String> vec=new Vector<String>();
        vec.add("Dog");
        vec.add("Horse");
        vec.add("Cat");
        System.out.println("Vector: "+vec);
        vec.add(0,"Crocodile");
        System.out.println("New Vector: "+vec);
        
    }
}
