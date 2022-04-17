package week1.day2;

import java.util.Arrays;

public class FindIntersection {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int length1 = arr1.length;
		Arrays.sort(arr1);
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		int length2 = arr2.length;
		Arrays.sort(arr2);

		System.out.println("Intersection of two Arrays are ");

		for (int i = 0; i < length1; i++) {

			for (int a = 0; a < length2; a++) {

				if (arr1[i] == arr2[a]) {
					System.out.println(arr1[i]);
				}

			}
		}

	}

}
