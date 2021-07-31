package com.day6assign.primenum;

import java.util.Scanner;

public class PrimeNum {
public static void main(String[] args) {
	int num,b=1,count=0; 
    Scanner SC =new Scanner(System.in); 
    System.out.println("Enter the Number"); 
    num =SC.nextInt(); 
     while(b<= num) 
        { 
            if((num%b)==0) 
               count=count+1; 
               b++; 
        } 
        if(count==2) 
        {	
            System.out.println(num +" is a prime number"); 
        }
        else 
        {
     	   System.out.println(num +" is not a prime number"); 
        }
         SC.close();
}
}
