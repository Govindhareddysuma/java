/*
Write a program to get store the User's data in a 2D array and print it.

Sample Input: 

Enter Elements1

2

3

4

5

6

7

8

9

Sample Output:

Printing Elements...



1       2       3

4       5       6

7       8       9
*/

import java.util.Scanner;
public class Storeprint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=3,c=3;
         System.out.println("Enter Elements");
        int a[][]=new int[b][c];
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing Elements...");
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
             System.out.println("\n");
        } 
    }
}
