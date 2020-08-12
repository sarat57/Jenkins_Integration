package Selenium_features.Selenium_web_services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {


		Test test = new Test();
		
		//System.out.println(test.reverse("Sarath"));
		System.out.println(test.reverseString("Sarath"));
	}
	
	
	
	public void sort_array()
	{
		 int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		   int temp;
		   for (int i = 1; i < array.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (array[j] < array [j - 1]) {
		      temp = array[j];
		      array[j] = array[j - 1];
		      array[j - 1] = temp;
		     }
		    }
		   }
		   for(int z=0;z<array.length;z++)
		   {
			   System.out.println(array[z]);
		   }
	}
	
	
	public void sort()
	{

		 int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		 int temp_val;
		 for(int j=1;j<array.length;j++)
		 {
			 
			 for(int z=j;j>0;j--)
			 {
				 if(array[j]<array[j-1])
				 {
					 temp_val=array[j];
					 array[j]=array[j-1];
					 array[j-1]=temp_val;
				 }
			 }
			 
		 }
	}
	
	public void sort_arra()
	{

		 int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
		 
		 for(int i=1;i<array.length;i++)
		 {
			 for(int j=i;j>0;j--)
			 {
				 
			 }
		 }
		
	}
	
	
	public void test()
	{
		
	}
	
	public static double sqroot(double num)
	{
		return Math.sqrt(num);
	}
	
	public static void remove_duplicates_from_array(Integer arr[])
	{
		Set<Integer> myset = new HashSet<Integer>(Arrays.asList(arr));
		for(int k=0;k<arr.length;k++)
		{
myset.add(arr[k]);
		}
		System.out.println(myset.toString());
		
	}
	public static int factorial(int num)
	{
	int count=1;	
		for(int k=num;k>0;k--)
		{
			count =count*k;
		}
		return count;
	}
	
	
	public static int factorial_Rec(int num)
	{
		if(num!=0)
		{
			return num*factorial_Rec( num-1);	
		}
		else
		{
			return 1;
		}
	}
	
	public int fact(int num)
	{
		
		if(num!=0)
		{
		return	num*fact(num-1);
		}
		else
		{
			return 1;
		}
		
	}
	public static void Armstrong_number()
	{
		int number = 153;
		int count;
		int temp_val = 0;
		for(int i=0; number>0;i++)
		{
			int fact = number%10;
			number = number/10;
			count=fact*fact*fact;
			temp_val= temp_val+count;	
		}
		System.out.println(temp_val);
	}
	public static String reverse(String input)
	{
		if(input.isEmpty())
		{
			return input;
		}
		return input.charAt(input.length()-1)+reverse(input.substring(0, input.length()-1));	
	}
	
	public String reverseString(String input)
	{
		if(input.isEmpty())
		{
			return input;
		}
		else
		{
			return input.charAt(input.length()-1)+reverseString(input.substring(0, input.length()-1));
		}
	}
	
	public static void stringpalandrom()
	{
		String name = "SaraS";
		String name2 ="";
		
		for(int k=name.length()-1;k>=0;k--)
		{
			name2= name2+name.charAt(k);
		}
		System.out.println(name2);
		if(name.equalsIgnoreCase(name2))
		{
			System.out.println("Is palandrom");
		}
		else
		{
			System.out.println("Is not palandrom");
		}
	}
	
	public static void array_multiply_non_itself()
	{
	int arr[] = {2,3,5,1,4,3};	
	for(int i=0;i<arr.length;i++)
	{
		int j=1;
	for(int k=0;k<arr.length;k++)
	{
		if(i!=k)
		{
			j=j*arr[k];			
		}
	}
	System.out.println(j);
	}
	}
	
	
	public void arr1()
	{
		int arr[] = {2,3,5,1,4,3};	
		for(int i=0;i<arr.length;i++)
		{
			
			int j =1;
			for(int k=0;k<arr.length;k++)
			{
				if(i!=k)
				{
					j= j*arr[k];
				}
			};	
		}
	}
	
	public static void  greater_num()
	{
		
		int arr[]= {3,1,8,5,54,23,6};
		int greaternum=arr[0];
		for(int k= 1;k<arr.length;k++)
		{
			if(arr[k]>greaternum)
			{
				greaternum=arr[k];
				
			}
		}
		System.out.println(greaternum);
	}
	
	
	
	public void gre()
	{
		int arr[]= {3,1,8,5,54,23,6};
		int greaternum=arr[0];
		for(int k=1;k<arr.length;k++)
		{
			if(arr[k]>greaternum)
			{
				
			}
		}
		
	}
	
	public static void fibonacci_series()
	{
		int N1 =0;
		int N2 =1;
		int N3;
		//0,1,1,2,3,5,8,13,21......
		//int previousvalue =0;

		for(int i=0;i<10;i++)
		{
N3=N1+N2;
System.out.println(N3);
N1=N2;
N2=N3;
		}
	}
	
	
	
	public void fubser()
	{
		
		int a=0;
		int b=1;
		int c;
		
		for(int k=0;k<20;k++)
		{
			c= a+b;
			a=b;
			b=c;
			
			
		}
		
		
		
		
		
	}
		public static void reverse_number() {
		int number = 1234321;
		int reversenumber = 0;
		while (number > 0) {
			int k = number % 10;
			reversenumber = reversenumber * 10 + k;
			number = number / 10;
		}

		System.out.println(reversenumber);
	}

	public static void palindrome() {

		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

	}
	
	
	
	public void pal()
	{
		int num= 2323;
		
		int rem;
		int newnum = 0;
		while(num>0)
		{
			rem= num %10;
			num= num/10;
			
			newnum= (newnum*10)+rem;
			
		}
	}
	
	public static void primeNumber()
	{

		for(int i= 2;i<100;i++)
		{
			boolean primenum= true;
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					primenum=false;
				}	
			}
			if(primenum)
				System.out.println(i);	
		}
		
	}
	
	
	
}

