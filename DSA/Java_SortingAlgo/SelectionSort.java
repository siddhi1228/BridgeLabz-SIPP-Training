package Java_SortingAlgo;

import java.util.*;

public class SelectionSort 
{
	void selection()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] =sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}
		}
		for(int i =0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
	public static void main(String[] args)
	{
		SelectionSort ss = new SelectionSort();
		ss.selection();
	}
}
