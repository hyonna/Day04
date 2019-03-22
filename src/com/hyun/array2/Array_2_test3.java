package com.hyun.array2;

import java.util.Arrays;

public class Array_2_test3 {

	public static void main(String[] args) {

		int[] point = { 3, 5, 1, 9, 2 };

		int temp;

//		for (int i = 0; i < point.length; i++) {
//
//			for (int j = i + 1; j < point.length; j++) {
//
//				if (point[i] > point[j]) {
//
//					temp = point[i];
//					point[i] = point[j];
//					point[j] = temp;
//
//				}
//
//			}
//
//		}
//
//		for (int i = 0; i < point.length; i++) {
//
//			System.out.println(point[i]);
//
//		}
//		
//		
//		System.out.println();
//
//		for (int i = 0; i < point.length; i++) {
//			for (int j = i+1; j < point.length; j++) {
//
//				if (point[i] < point[j]) {
//
//					temp = point[i];
//					point[i] = point[j];
//					point[j] = temp;
//				}
//			}
//		}
		
		
		Arrays.sort(point);

		for (int i = 0; i < point.length; i++) {

			System.out.println(point[i]);

		}

	}

}
