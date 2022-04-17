package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(numbers);
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
