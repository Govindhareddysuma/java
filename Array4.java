/*
Write a program using ArrayList to print the follwoing output:
ArrayList: [Java, Kotlin, C++]
Modified ArrayList: [Java, Kotlin, JavaScript]
*/

import java.util.*;
public class Array4
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("Java");
        al.add("Kotlin");
        al.add("C++");
        System.out.println("ArrayList: "+al);
        al.remove("C++");
        al.add("JavaScript");
        System.out.println("Modified ArrayList: "+al);
        
    }
}
