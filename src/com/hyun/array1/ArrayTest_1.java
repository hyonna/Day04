package com.hyun.array1;

import java.util.Scanner;

public class ArrayTest_1 {

	public static void main(String[] args) {

		//배열
		//여러 데이터의 묶음
		//하나의 변수로 여러개의 데이터를 다루고자 할때
		//같은 데이터 타입만 묶음
		//배열 생성시 몇개를 만들지를 미리 생성
		//만들어진 배열의 크기는 수정이 불가
		
		int a = 10;
		int b = 20;
		
		//메모리 영역
		//static , stack , heap
		
		
		int[] ar2 = new int[2];
		
		
		
		//배열 선언
		//모을 데이터 타입 변수명 [];
		//모을 데이터 타입 [] 변수명;
		
		//정수형 데이터
		
		int[] ar = new int[3];
		System.out.println(ar);
		ar[0] = 'a';
		ar[1] = 20; //인덱스 번호를 사용
		ar[2] = (int)3.2;
		
		System.out.println(ar[0]);

		System.out.println(ar[1]);

		System.out.println(ar[2]);
		System.out.println();
		
		//문자 5개를 담을 배열을 선언하고
		//각각 문자를 입력하고 출력
		
		char[] arr = new char [5];
		
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		arr[4] = 'e';
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// Stack : 지역변수
		// Static : 클래스변스
		// Heap : 멤버변수
		
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		Scanner[] scs = new Scanner[3];
		scs[0] = sc;
		scs[1] = sc2;
		scs[2] = sc3;
		
		
		
		
	}

}
