package com.example.loop.control.instruction;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		 System.out.println("Armstrong numbers between 1 and 500 are:");
		 int n;
		 for(int i=10; i<=500; i++)
			{
			int temp=i;
			int cnt=0;
			int sum=0;
			
			while(temp!=0)
				{
					cnt++;
					temp=temp/10;
				}
					temp=i;
					sum=0;
			 
			while(temp!=0)
				{
					int r=temp%10;
					sum=sum+(int)Math.pow(r,cnt);
					temp=temp/10;
				}
						
			if(sum==i)
				{
					System.out.println("Armstrong number is "+i);
				}
			}
	}
}


