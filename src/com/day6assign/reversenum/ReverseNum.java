package com.day6assign.reversenum;

import java.util.Scanner;

public class ReverseNum {
public static void main(String[] args) {
	int rem;
	int rev=0,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
    num=sc.nextInt();
	while(num!=0)
	{
	rem = num%10;
	rev =(rev*10)+rem;
	num = num/10;
	}
	System.out.println("reverse of a number is "+rev);
	sc.close();
}
}
