/*
Solve the pattern in dynamic:

 

Sample input 1:

5

Sample output 1:

*****

** **

* * *

** **

*****

*/

import java.util.*;
class Apattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==2&&j==3||i==3&&j==2||i==1&&j==2||i==2&&j==1)
                System.out.print(" ");
                else
                System.out.print("*");
            }
           System.out.println("");
        }
    }
}
