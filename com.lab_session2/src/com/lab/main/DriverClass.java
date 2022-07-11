package com.lab.main;

import com.lab.services.*;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(" Enter the size of the transaction array ");
			int size = scanner.nextInt();
			int[] transactionArr = new int[size];
			System.out.println("Enter the values of array");
			for (int i = 0; i < transactionArr.length; i++) {
				System.out.println(" Enter the value of number " + (i + 1) + " transaction");
				transactionArr[i] = scanner.nextInt();
			}
			System.out.println("Enter the total no of targets that needs to be achieved");
			int target = scanner.nextInt();
			for (int i = 0; i < target; i++) {
				System.out.println("Enter the value of target");
				int targetValue = scanner.nextInt();
				MoneyService moneyservice = new MoneyService();
				moneyservice.inspect(transactionArr, targetValue);
				System.out.println();
			}
		}
	}
}
