/*
Write a program using ArrayList to print the follwoing output:
ArrayList: [Cat, Dog, Cow]
Element at index 1: Dog
*/

import java.util.*;
public class Array2
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add("Cat");
        al.add("Dog");
        al.add("Cow");
        System.out.println("ArrayList: "+al);
        System.out.println("Element at index 1: "+al.get(1));
    }
}
