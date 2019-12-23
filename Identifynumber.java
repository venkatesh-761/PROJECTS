import java.io.*;
import java.util.*;
public class Identifynumber
{
public static void main(String args[])throws IOException
{
Scanner vh = new Scanner(System.in);
System.out.println("enter array size :");
int n = vh.nextInt();
int i = 0,p=0,c=0;
int a[] = new int[n];
for(i = 0;i<n;i++)
{
a[i] = vh.nextInt();
}
System.out.println("enter value to be searched :");
int x = vh.nextInt();
for(i=0;i<n;i++){
if (x==a[i])
{
	p=i;
	c++;
}
}
if(c>0)
System.out.println(p+1);
else
System.out.println("-1");

}
}