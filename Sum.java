/*Write a program to find the sum of digits in a given number. Program to find the sum of digits of the given number is discussed here. 
For example, let the input number be 719. The sum of digits of 719 = 7 + 1 + 9 = 17
Input & Output Format:

Input consists of one integer.

Output consists of sum of digits.

Sample Input:

719

Sample Output:

17*/


import java.util.Scanner;
public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,s=0;
        while(a>0)
        {
            r=a%10;
            s=s+r;
            a=a/10;
        }
        System.out.println(s);
    }
}
