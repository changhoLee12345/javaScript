package com.yedam.references;

public class ArrayExample {
	public static void main(String[] args) {
		int sum = 0;

		int score1 = 90;
		int score2 = 85;
		int score3 = 80;
		int score4 = 75;
		sum = sum + score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		System.out.println("1) 합계: " + sum);

		sum = 0;
		int[] scores = new int[4];
		scores[0] = 90;
		scores[1] = 85;
		scores[2] = 80;
		scores[3] = 75;

		for (int i = 0; i < 4; i++) {
			sum += scores[i];
		}
		System.out.println("2) 합계: " + sum);
		System.out.println("2) 평균: " + (double) sum / 4);
		double avg = (double) sum / 4;
		System.out.printf("%.2f", avg);

	}
}
