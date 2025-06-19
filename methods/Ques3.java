package methods;

import java.util.*;

public class Ques3 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sum(n);
		sc.close();
	}
	public static void sum(int n)
	{
		int sum = 0;
		for(int i = 0;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println("sum of n natural numbers are = "+sum);
	}
}
