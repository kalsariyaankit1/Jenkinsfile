import java.io.*;
import java.util.*;

class Matrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		int i,k,j,sum;
		sum=0;
		System.out.println("Enter a :: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("a["+i+"]["+j+"] :: ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter a :: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("b["+i+"]["+j+"] :: ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Multiplication :: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				sum=0;
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("c["+i+"]["+j+"] :: "+c[i][j]);                                                                                                   
			}
		}
	}
}