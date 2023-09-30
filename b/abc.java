package b;

import java.util.Arrays;

public class abc {
	public static int[] findMissingNumbers(int[] input) {
		// Khởi tạo biến missingNumbers
		int[] missingNumbers = new int[input.length + 1];
		for (int i = 1; i <= input.length; i++) {
			missingNumbers[i] = i;
		}

		// Sắp xếp mảng input
		Arrays.sort(input);

		// Tìm các số thiếu
		for (int i = 0; i < input.length; i++) {
			if (missingNumbers[i] != input[i]) {
				missingNumbers[i] = -1;
			}
		}

		// In ra các số thiếu
		for (int i = 0; i < missingNumbers.length; i++) {
			if (missingNumbers[i] == -1) {
				System.out.println(i);
			}
		}

		return missingNumbers;
	}

	public static void main(String[] args) {
		int[] input = { 10, 11, 9, 12, 14, 13, 15, 17, 16 };
		
		System.out.println(findMissingNumbers(input));
	}
}
