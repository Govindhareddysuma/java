/*
Write a java program using ArrayList to display the following output:

LinkedList: [Dog, Cat, Cow]
Updated LinkedList: [Dog, Horse, Cat, Cow]
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        LinkedList<String> al=new LinkedList<>();
        al.add("Dog");
        al.add("Cat");
        al.add("Cow");
        System.out.println("LinkedList: "+al);
        al.add(1,"Horse");
        System.out.println("Updated LinkedList:"+al);
    }
}
