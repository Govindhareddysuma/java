/*
Write a java program using the collection to display the following output:

Methods: 

To iterate over the elements of a priority queue, we can use the iterator() method. In order to use this method, we must import the java.util.Iterator package. 


Sample Output: 
PriorityQueue using iterator(): 1, 4, 2,
*/

import java.util.*;
import java.util.Iterator;
public class Main
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> q=new PriorityQueue<Integer>();
        q.add(1);
        q.add(4);
        q.add(2);
        System.out.print("PriorityQueue using iterator()");
        Iterator<Integer> iterator=q.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
        
        
        
    }
}
