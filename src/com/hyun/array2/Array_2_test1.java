package com.hyun.array2;

import java.util.Scanner;

public class Array_2_test1 {

	public static void main(String[] args) {

		//데이터 타입
		//기본형
			// int , long , double, float, char, boolean
		
		//참조형
		
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		
		int[] ar2 = new int[2];
		ar2[0] = 1;
		ar2[1] = 2;
		
		ar = ar2;
		
		System.out.println(ar[0]);
		ar[1] = 200;
		
		System.out.println(ar[1]);
		
		ar = new int[2];
		System.out.println(ar[0]);

	}

}
