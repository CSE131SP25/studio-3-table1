package studio3;

import java.util.Scanner;

public class Eratosthenes {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the max integer you would like?");
		int n = in.nextInt();
		int[] arr = new int[n - 1];
		int counter = 2;
		
		
		for(int i = 0; i < n - 1; i++) //making the unedited list of numbers
		{
			arr[i] = i + 2;
		}
		
		
		System.out.print("1 ");
		for(int i = 0; i < n - 1; i++) //printing unedited list
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(" ");
		
		while(counter <= 5) //making counter increase
		{
			for(int i = counter; i < n - 1; i = i + counter) //moving however much the counter equals
			{
			
				
				arr[i] = 0;
				
			}
			counter++;
		}

		
		System.out.print("1 ");
		for(int i = 0; i < n - 1; i++)
		{
			if(arr[i] != 0) //wont print if value is 0
			{
				System.out.print(arr[i] + " ");
			}
		}
		
	}

}
