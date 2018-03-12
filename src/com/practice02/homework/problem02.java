package com.practice02.homework;

import java.util.Scanner;

public class problem02 {
	public static void main(String[] args) {
		int[] data=new int[5];
		int sum=0;
		int avg=0;
		for(int i=0;i<5;i++) {
			Scanner sc1 = new Scanner(System.in);
			int num1 = sc1.nextInt();
			data[i]=num1;
			sum=sum+data[i];
		}
		avg=sum/5;
		System.out.println("평균은"+avg);
	}
}
