package com.lab.main;

import java.util.Scanner;

import com.lab.merge.*;

import com.lab.service.*;

public class DriverClass {

	public static void main(String[] args) {

		MergeSort msi = new MergeSort();
		CountingNotes countingnotes = new CountingNotes();
		System.out.println("Enter the size of the currency denominations ");
		try (Scanner scanner = new Scanner(System.in)) {
			int size = scanner.nextInt();
			int[] notes = new int[size];
			System.out.println("Enter the currency denomination value");
			for (int i = 0; i < size; i++) {
				notes[i] = scanner.nextInt();
			}
			System.out.println("Enter the amount you want to pay");
			int amount = scanner.nextInt();
			msi.sort(notes, 0, notes.length - 1);
			countingnotes.CountingNotesImplementation(notes, amount);
		}
	}

}
