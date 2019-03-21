package com.hyun.array1;

import java.util.Scanner;

public class ArrayTest_4 {
	
	public static void main(String[] args) {
		
		int[] ar = {1, 3, 5};
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println();
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.println(ar[i]);
		}
		
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스 번호를 입력하세요");
		
		int[] ar2 = new int[3];
		
		System.out.println();
		
		for(int i = 0; i < ar2.length; i++) {
			
			ar2[i] = sc.nextInt();
			System.out.println("입력한 인덱스 값은 : " + ar2[i]);
			
		}
		
		
		
	}

}
