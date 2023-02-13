/*
Write a java program using ArrayList to display the following output:

ArrayList: [Dog, Cat, Horse]
Updated ArrayList: [Dog, Cat]
Removed Element: Horse
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Dog");
        al.add("Cat");
        al.add("Horse");
        System.out.println("ArrayList: "+al);
        String str=al.remove(2);
        System.out.println("Updated ArrayList: "+al);
        System.out.println("Removed Element: "+str);
        
    }
}
