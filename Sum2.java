/*Write a program to find the sum of first N natural numbers.

Input & Output Format:

Input consists of one integer.

Output consists of a integer.

Sample Input & Output:

5

15*/

import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum +=i;
        }
        System.out.println(sum);
    }
}
