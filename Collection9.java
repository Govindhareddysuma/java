/*
Write a java program using ArrayList to display the following output:

Element at index 2: Cat

Vector: Dog, Horse, Cat,
*/

import java.util.*;
public class collection
{
    public static void main(String args[])
    {
        Vector<String> vec=new Vector<String>();
        vec.add("Dog");
        vec.add("Horse");
        vec.add("Cat");
        String element=vec.get(2);
        System.out.println("Element at index 2: " + element);
        String str=vec.get(0);
        String str1=vec.get(1);
        String str2=vec.get(2);
        System.out.print("Vector: ");
        System.out.print(""+str);
        System.out.print(", "+str1);
        System.out.print(", "+str2);
        System.out.print(",");
        
    }
}
