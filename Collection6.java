/*
Write a java program using ArrayList to display the following output:

LinkedList: [Java, Python, JavaScript, Java]
Updated LinkedList: [Java, Python, JavaScript, Kotlin]
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<>();
        al.add("Java");
        al.add("Python");
        al.add("JavaScript");
        al.add("Java");
        System.out.println("LinkedList: "+al);
        al.add(4,"Kotlin");
        System.out.println("Updated LinkedList: "+al);
    }
}
