package Java_SortingAlgo;

import java.util.Scanner;

public class InsertionSort {
	void insert()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] =sc.nextInt();
		}
		
		for(int i =1;i<n;i++)
		{
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		for(int i =0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
	public static void main(String[] args)
	{
		InsertionSort is = new InsertionSort();
		is.insert();
	}
}
