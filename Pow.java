/*pow() function is used to calculate the power of any base and it is defined in math header file. Write a program to read X as the base and N as the power and calculate the result (X^N - X to the power of N). 

Input format: 

The first line containing integer denotes the base(X) 

The second line containing integer denotes the power(N) 

Output format: 

Print the power of a number

Sample Input:

 2

 3

 Sample Output:

 8*/
 
 import java.util.Scanner;
import java.lang.Math;
public class Pow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        double z=Math.pow(X,N); 
        System.out.printf("%.0f",z);
    }
}
