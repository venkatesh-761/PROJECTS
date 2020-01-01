import java.io.*;
import java.util.*;
public class HallowRhombus
{
	public static void main(String[] args)
	{
		// Number of rows
		final int n;
                Scanner vh = new Scanner(System.in);
                n = vh.nextInt();
		for (int i = 1; i <= n; i++)
		{
			// Print space
			for (int j = i; j < n; j++)
                       {
				System.out.print(' ');
			}

			for (int j = 1; j <= n; j++)
			{
				// Print '*' for boundaries
				if (i == 1 || i == n || j == 1 || j == n)
                                   {
					System.out.print('*');
				}
				else 
                                {
					System.out.print(' ');
				}
			}

			// Move to the next row
			System.out.print(System.lineSeparator());
		}
	}
}