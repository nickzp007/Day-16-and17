package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	private int arraySize;
	private int result;
	private String wordsArray[];
	Scanner sc = new Scanner(System.in);

	private int userInputArraySize() {
		System.out.println("Enter the number of words you want to input :");
		arraySize = sc.nextInt();
		return arraySize;
	}

	private void storeWordsInArray() {
		System.out.println("Enter the words :");
		wordsArray = new String[arraySize];
		for (int i = 0; i < arraySize; i++) {
			wordsArray[i] = sc.next();
		}
	}

	private void sortArray() {
		Arrays.sort(wordsArray);
	}

	private void printArray() {
		for (int i = 0; i < arraySize; i++)
			System.out.println(wordsArray[i]);
	}

	private int performBinarySearch() {

		System.out.println("Enter word to be searched ");
		// User input is stored in key
		String key = sc.next();

		int low = 0, high = wordsArray.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;

			int result = key.compareTo(wordsArray[mid]);

			if (result == 0)
				return mid;

			if (result > 0)
				return low = mid + 1;
			else
				high = mid - 1;
		}

		return -1; 
	}

	private void printResult() {
		if (result == 0) {
			System.out.println("Word Present");
		} else {
			System.out.println("Word not present");
		}
	}

	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		b.userInputArraySize();
		b.storeWordsInArray();
		b.sortArray();
		b.performBinarySearch();
		b.printResult();
		b.printArray();

	}
}


