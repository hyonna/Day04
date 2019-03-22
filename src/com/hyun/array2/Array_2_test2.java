package com.hyun.array2;

import java.util.Scanner;

public class Array_2_test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 총 심판 5명
		// 점수는 정수로 입력받기
		// 평균을 구하는데, 최소점수, 최고점수를 제외한 점수

		int[] point = new int[5];

		
		int total = 0;
		double avg = 0;

		for (int i = 0; i < point.length; i++) {

			System.out.println((i + 1) + "번 점수를 입력하세요");
			point[i] = sc.nextInt();

			total += point[i];
		}

		int max = point[0]; // 최대값
		int min = point[0]; // 최소값
		
		
		for (int i = 1; i < point.length; i++) {

			if (max < point[i]) {

				max = point[i];

			}
			
			
			if (min > point[i]) {

				min = point[i];

			}

			
			
		}

		avg = (double)(total - (max + min)) / (point.length-2);
		

		System.out.println("총점 : " + total + " 점");

		System.out.println("최대값 : " + max + " 점");
		System.out.println("최소값 : " + min + " 점");
		System.out.printf("최대값과 최소값을 뺀 펑균 : %.2f 점",avg);

	}

}
