import java .io.*;
import java.util.*;
public class Maxmin
{
public static void main(String args[])throws IOException
{
System.out.println("enter the size of the array");
Scanner vh = new Scanner(System.in);
int n = vh.nextInt();
int a[] = new int[n];
int i;
for(i=0;i<n;i++)
{
a[i] = vh.nextInt();
}
int max = 0, min = a[0];
for(i = 0;i<a.length;i++)
{
if (a[i]>max)
max = a[i];
}
System.out.println("max is :"+max);
for(i=0;i<a.length;i++)
{
if (a[i]<min)
min = a[i];
}
System.out.println("min is :"+min);
}
}
