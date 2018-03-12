package com.practice02.homework;

public class problem03 {
	public static void main(String[] args) {
		char c[]= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','c','i','l'};
		c[4]=',';
		c[7]=',';
		c[9]=',';
		for(int i =0;i<15;i++) {
			System.out.print(c[i]);
		}
	}
}
