/* java program to print Pattern */
import java.util.Scanner;
public class MainPattern
{
    public static void main(String[] args)
    {
        int n;
    Scanner sc = new Scanner(System.in);
  n = sc.nextInt();
 
    for (int i=n; i>=1 ; i--)
    {
    for (int j=1; j<=i; j++)
    {
    System.out.print("* ");
    }
    System.out.println();
       }
     }
  }


Output:
C:\Users\stan>javac MainPattern.java

C:\Users\stan>java MainPattern
5
* * * * *
* * * *
* * *
* *
*
