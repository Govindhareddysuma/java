/*Write a program to determine whether n is a factorial number or not. A factorial number is a number that is a factorial of another number.

Input Format:

Input consists of a single integer which corresponds to n.

Output Format:

Output consists of a string - “yes” or “no”

Sample Input 1

6

Sample Output 1

yes

Sample Input 2

12

Sample Output 2

no*/

import java.util.*;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Fact h=new Fact();
        h.fact(n);
    
    }
}
class Fact
{
    public static int fact(int n)
    {
        int f=1,x=0;
        while(f<n)
         {
             x=x+1;
             f=f*x;
         }
         if(f==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        return 0;
    }
}
