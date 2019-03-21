package com.hyun.array1;

import java.util.Scanner;

public class ArrayTest_5 {

	public static void main(String[] args) {

		// 학생 수를 입력하세요. 3명
		// 입력한 수 만큼 학생의 이름을 입력하세요.
		// 내가 입력한 학생 수 만큼 이름이 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수를 입력하세요");
		int num = sc.nextInt();

		System.out.println();
		String[] name = new String[num];

		for (int i = 0; i < name.length; i++) {

			System.out.println((i + 1) + "번째 이름을 입력하세요");
			name[i] = sc.next();

		}

		System.out.println();

		// 학생 수 만큼 국어 점수를 입력
		// ooo학생의 국어 점수 입력
		// ooo학생의 국어 점수 입력

		// ooo : 점수
		// ooo : 점수

		// 학생 수 만큼 수학 점수를 입력
		// ooo학생의 국어 점수 입력
		// ooo학생의 국어 점수 입력

		// ooo : 수학 점수
		// ooo : 수학 점수
		
		// 국어점수 반평균
		// 수학점수 반평균

		int[] lang = new int[name.length];
		int[] math = new int[name.length];
		
		double langAvg = 0;
		double mathAvg = 0;
		
		for (int i = 0; i < lang.length; i++) {

			System.out.println(name[i] + " 학생의 국어 점수를 입력하세요");
			lang[i] = sc.nextInt();
			
		}
		
		System.out.println();
		
		for(int i = 0; i < math.length; i++) {
			
			System.out.println(name[i] + " 학생의 수학 점수를 입력하세요");
			math[i] = sc.nextInt();
			
		}

		System.out.println();

		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i] + "학생의 국어점수는 : " + lang[i] + "점, 수학점수는 : " + math[i] + "점 입니다");
			langAvg += lang[i] / num;
			mathAvg += math[i] / num;

		}
		
		
		
		System.out.println("국어점수 반 평균 : " + langAvg);
		System.out.println("수학점수 반 평균 : " + mathAvg);
		
		

	}

}
