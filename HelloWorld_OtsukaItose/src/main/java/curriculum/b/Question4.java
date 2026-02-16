package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = { 1, 2, 3, 4, 5 };
		for (int score : scores) {
			System.out.println(score);
		}

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

		int sum = 0;
		int[] numbers2 = { 3, 5, 7, 9, 11 };
		for (int number : numbers2) {
			sum = sum + number;
		}
		System.out.println(sum);

		int[] numbers3 = { 12, 7, 9, 21, 5, 18 };
		int max = numbers3[0];
		int min = numbers3[0];
		for (int i = 1; i < numbers3.length; i++) {
			if (numbers3[i] > max) {
				max = numbers3[i];
			}
			if (numbers3[i] < min) {
				min = numbers3[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		int[] numbers4 = { 1, 2, 3, 4, 5 };
		for (int result : numbers4) {
			System.out.println(result * 2);
		}

		Scanner scanner = new Scanner(System.in);
		int[] numbers5 = { 4, 7, 10, 15, 20 };
		int input = scanner.nextInt();

		boolean isIncluded = false;
		for (int num : numbers5) {
			if (num == input) {
				isIncluded = true;
				break;
			}
		}
		if (isIncluded) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は含まれていません");
		}
		{
			int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
			for (int a = 0; a < array.length; a++) {
				for (int b = 0; b < array[a].length; b++) {
					System.out.print(array[a][b] + " ");
				}
				System.out.println();
			}

			array = new int[][] { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
			sum = 0;
			for (int a = 0; a < array.length; a++) {
				for (int b = 0; b < array[a].length; b++) {
					sum = sum + array[a][b];
				}
			}
			System.out.println(sum);

			{
				array = new int[][] { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
				max = array[0][0];
				min = array[0][0];
				for (int a = 0; a < array.length; a++) {
					for (int b = 0; b < array[a].length; b++) {
						if (array[a][b] > max) {
							max = array[a][b];
						}
						if (array[a][b] < min) {
							min = array[a][b];
						}
					}
				}
				System.out.println(max);
				System.out.println(min);
			}
		}

		{
			int[][][] array = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
			for (int a = 0; a < array.length; a++) {
				for (int b = 0; b < array[a].length; b++) {
					for (int c = 0; c < array[a][b].length; c++) {
						System.out.print(array[a][b][c] + " ");
					}
				}
				System.out.println();
			}

		}

		scanner.close();
	}

}
