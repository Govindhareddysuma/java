/*Write a program to generate the first n terms in the series --- 3, 9, 27, 81,...,... 

Input format: 

The input containing an integer which denotes 'n' 

Output format: 

Print the series and refer the sample output for formatting

Sample Input & Output:

5

3 9 27 81 243 */


import java.util.Scanner;
public class Series3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
            b=b*3;
            System.out.println(""+b);
        }
    }
}
