/*Write a program to generate the following series --- 6,11,21,36,56,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting.

Sample Input:

5

Sample Output:

6 11 21 36 56 */


import java.util.Scanner;
public class Series2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=6;
        int c=5;
        for(int i=1;i<=a;i++)
         {
             System.out.println("" +b);
             b=b+c;
             c=c+5;
         }
    }
}
