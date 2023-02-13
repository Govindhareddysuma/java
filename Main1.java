/*
Write a java program using the collection to display the following output:

Methods: 

To remove an element from the top of the stack, we use the pop() method. 
Sample Output: 

Initial Stack: [Dog, Horse, Cat]
Removed Element: Cat*/

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Stack<String> stack=new Stack<>();
        stack.push("Dog");
        stack.push("Horse");
        stack.push("Cat");
        System.out.println("Initial Stack: "+stack);
        String str=stack.pop();
        System.out.println("Removed Element: "+str);
    }
}
