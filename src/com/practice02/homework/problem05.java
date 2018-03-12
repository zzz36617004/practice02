package com.practice02.homework;

public class problem05 {
	public static void main(String[] args) {
		
	int data[]=new int[6];
		for(int i=0;i<6;i++) {
			data[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<6;j++) {
			if(data[i]==data[j]&&i!=j) {				
				i--;
			}
			else {continue;}
			}

		}
		for(int i=0;i<6;i++) {
			System.out.println(data[i]);
		}
		
}

}