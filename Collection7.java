/*
Write a java program using ArrayList to display the following output:

LinkedList: [Java, Python, JavaScript, Kotlin]
Removed Element: Python
New LinkedList: [Java, JavaScript, Kotlin]
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
        al.add("Kotlin");
        System.out.println("LinkedList: "+al);
        String str=al.remove(1);
        System.out.println("Removed Element: "+str);
        System.out.println("New LinkedList: "+al);
    }
}
