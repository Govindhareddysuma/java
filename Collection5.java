/*
Write a java program using ArrayList to display the following output:

LinkedList: [Python, Java, JavaScript]
Element at index 1: Java
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<>();
        al.add("Python");
        al.add("Java");
        al.add("Javascript");
        System.out.println("LinkedList: "+al);
        String str=al.get(1);
        System.out.println("Element at index 1: " + str);
    }
}
