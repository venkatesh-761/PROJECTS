import java.io.*;
import java.util.*;
class Arraysum
{
public static void main(String args[])throws IOException
{
System.out.println("enter the size of array");
Scanner vs = new Scanner(System.in);
int n = vs.nextInt();
int a[] = new int[n];
int i,s=0;
double avg;
for(i = 0;i < n;i++)
{
a[i] = vs.nextInt();
s=s+a[i];
}
System.out.println("Sum is: "+s);
avg = s/n;
System.out.println("avg is: "+avg);
}
}