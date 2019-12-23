import java.io.*;
import java.util.*;
public class FirstandSecondLargest
{
public static void main(String args[])throws IOException
{
Scanner vs = new Scanner(System.in);
int n = vs.nextInt();
int a[] = new int[n];
for(int i=0;i<n;i++)
{
a[i] = vs.nextInt();
}
Arrays.sort(a);
System.out.println("first smallest:"+a[0]+" "+a[1]+" "+a[n-1]+" "+a[n-2]);
}
}