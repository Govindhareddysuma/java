/*
Write a java program using the collection to display the following output:

Methods: 

remove() - removes the specified element from the queue
poll() - returns and removes the head of the queue

Sample Output: 
PriorityQueue: [1, 4, 2]
Is the element 2 removed? true
Removed Element Using poll(): 1
*/

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        q.add(1);
        q.add(4);
        q.add(2);
        System.out.println("PriorityQueue: "+q);
        System.out.println("Is the element 2 removed? "+q.remove(2));
        System.out.println("Removed Element Using poll(): "+q.poll());
        
        
        
    }
}
