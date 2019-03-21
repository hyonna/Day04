package com.hyun.array1;

import java.util.Scanner;

public class ArrayTest_6 {

	public static void main(String[] args) {

		// 1. 학생등록
		// 학생 수를 입력
		// 학생 번호를 입력(학생 수 만큼)
		// 학생 이름 입력
		// 학생 국어 점수 입력
		// 학생 수학 점수 입력
		// 학생 영어 점수 입력
		//

		// 2. 전체 정보 조회
		// 학생 번호, 이름, 국어, 영어, 수학 점수 출력

		// 3. 학생 정보 검색
		// 검색할 학생의 번호를 입력 받아서 그 학생의 정보만 출력

		// 4. 프로그램 종료

		Scanner sc = new Scanner(System.in);

		boolean menu = true;

		while (menu) {

			System.out.println("************");
			System.out.println("1. 학 생 등 록 ");
			System.out.println("2. 전 체 정 보 조 회");
			System.out.println("3. 학 생 정 보 검 색");
			System.out.println("4. 프로그램 종료");
			System.out.println("************");

			int select = sc.nextInt();

			int num = 0;
			

			if (select == 1) {

				System.out.println("학생 수를 입력하세요.");
				num = sc.nextInt();

				System.out.println();
				
				int[] sNum = new int[num];
				String[] name = new String[sNum.length];
				int[] kor = new int[sNum.length];
				int[] math = new int[sNum.length];
				int[] eng = new int[sNum.length];

				for (int i = 0; i < sNum.length; i++) {

					sNum[i] = i;
					System.out.println((i + 1) + "번째 학생의 이름을 입력하세요");
					name[i] = sc.next();

				}

				System.out.println();

				for (int i = 0; i < sNum.length; i++) {

					System.out.println(name[i] + "학생의 국어 점수를 입력하세요");
					kor[i] = sc.nextInt();
					

					System.out.println(name[i] + "학생의 수학 점수를 입력하세요");
					math[i] = sc.nextInt();
					

					System.out.println(name[i] + "학생의 영어 점수를 입력하세요");
					eng[i] = sc.nextInt();
					System.out.println();

				}

				System.out.println();

				for (int i = 0; i < sNum.length; i++) {

					System.out.println(name[i] + "의 국어점수는  : " + kor[i] + "점, 수학점수는 : " + math[i] + "점, 영어 점수는 : " + eng[i] + "점");

				}

			} else {
					
					
					break;
			}
			
			
			
			
		} //while문 끝
		
		
		
		

	}

}
