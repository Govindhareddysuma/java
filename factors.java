/*
Write a program that can compute the factors of a given number. The results should be printed in a comma-separated sequence on a single line.

Input :

10

output :

1 2 5
*/


import java.util.Scanner;
public class factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        int n=sc.nextInt();
        for( int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                x=i;
                System.out.print(" "+x);
            }
        }
    }
}
