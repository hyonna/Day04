package com.hyun.array1;

import java.util.Scanner;

public class ArrayTest_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] ar = { 10, 32, 15, 27, 46, 52 };
		System.out.println("검색할 번호를 입력하세요");
		int count = sc.nextInt();

		if (count > 0 && count < ar.length) {

			System.out.println(ar[count]);
			
		} else {

			System.out.println("없는 번호 입니다");
		}

		// 인덱스 번호를 입력 받아서 해당 인덱스 번호의 값을 출력
		// 다른 번호를 입력하면 없는 번호 입니다를 출력

	}

}
