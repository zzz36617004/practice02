package com.practice02.homework;

public class problem01 {
	public static void main(String[] args) {
		int[] data= {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int count=0;
		int sum=0;
		for(int i=0;i<13;i++) {
			if(data[i]%3==0) {
				count++;
				sum=data[i]+sum;
			}
		}
		System.out.println("3의 배수개수=>"+count);

		System.out.print("3의 배수합=>"+sum);
	}
}
