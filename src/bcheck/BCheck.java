package bcheck;

import java.util.Scanner;

public class BCheck {

	public static void checkBit(int number,int index)
	{
		if((number & (1 << index)) == 0)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int index = scanner.nextInt();
		checkBit(number,index);
		
	}
}
