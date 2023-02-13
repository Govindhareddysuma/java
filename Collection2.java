/*
Write a java program using ArrayList to display the following output:

ArrayList: [Cow, Cat, Dog]
Accessing individual elements:  
Cow, Cat, Dog,
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Cow");
        al.add("Cat");
        al.add("Dog");
        System.out.println("LinkedList: "+al);
        String element=al.get(0);
        String name=al.get(1);
        String value =al.get(2);
        System.out.println("Accessing individual elements: ");
        System.out.print(""+element);
        System.out.print(", "+name);
        System.out.print(", "+value);
    }
}
