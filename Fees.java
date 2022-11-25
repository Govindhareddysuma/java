/*Write a program to determine the fee amount to be collected from a student. The input to the program are the type of the student, tuition fee, bus fee, hostel fee.

Refer the table below for fee details.

Student Type

Student Type denoted as

Fee Details

Merit Seat Day Scholar

MSDS

Tuition fee + Bus fee

Merit Seat Hosteller

MSH

Tuition fee + Hostel fee

Management Seat Day Scholar

MGSDS

150% of Tuition fee + Bus fee

Management Seat Hosteller

MGSH

150% of Tuition fee + Hostel fee

 

Input and Output Format:

Input consists of a string (student type), tuition fee (float), bus fee (float) and hostel fee (float). All floating point numbers are displayed correct to 2 decimal places.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output:

Enter the student type

MSH

Enter tuition fee

40000

Enter hostel fee

50000

The fees to be paid by the student is Rs.90000.00

*/

import java.util.Scanner;
public class Fee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d,e,f,g,h,i;
        System.out.println("Enter the student type");
        String t=sc.next();
        switch(t)
        {
            case "MSDS":
                System.out.println("Enter tuition fee");
                 b=sc.nextFloat();
                System.out.println("Enter bus fee");
                c=sc.nextFloat();
                System.out.printf("The fees to be paid by the student is Rs.%.2f",b+c);
                break;
            case "MSH":
                System.out.println("Enter tuition fee");
                d=sc.nextFloat(); 
                System.out.println("Enter hostel fee");
                e=sc.nextFloat(); 
                System.out.printf("The fees to be paid by the student is Rs.%.2f",d+e);
                break;
            case "MGSDS":
                System.out.println("Enter tuition fee");
                f=sc.nextFloat(); 
                System.out.println("Enter bus fee");
                g=sc.nextFloat(); 
                 f=(150*f)/100;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",f+g);
                break;
            case "MGSH":
                System.out.println("Enter tuition fee");
                h=sc.nextFloat(); 
                System.out.println("Enter hostel fee");
                i=sc.nextFloat();
                 h=(150*h)/100;
                System.out.printf("The fees to be paid by the student is Rs.%.2f",h+i);
                break;
                
                
        }
    }
}
