/*
Write a java program using the collection to display the following output:

Methods: 

Sample Output: 
Queue: [1, 5, 2]
Accessed Element: 1
Removed Element: 1
Updated Queue: [2, 5]

*/

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Queue<Integer> q=new PriorityQueue<Integer>();
        q.add(1);
        q.add(5);
        q.add(2);
        System.out.println("Queue: "+q);
        int access=q.peek();
        System.out.println("Accessed Element: "+access);
        int element=q.poll();
        System.out.println("Removed Element: "+element);
        System.out.println("Updated Queue: "+q);
        
        
        
    }
}
