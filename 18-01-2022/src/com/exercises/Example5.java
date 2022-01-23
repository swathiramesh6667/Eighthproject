package com.exercises;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) 
	{
Scanner scanner = new Scanner(System.in);

System.out.println("Enter amount");

int amount = scanner.nextInt();

for(int i=1; i<4; i++)
{
	int loan;
	loan = (amount*10)/100;
	amount = amount-loan;
}
System.out.println(amount);
scanner.close();
	}

}
