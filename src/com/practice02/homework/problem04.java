package com.practice02.homework;

import java.util.Scanner;

public class problem04 {
	public static void main(String[] args) {
		System.out.println("숫자입력하세요");
		int money[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int coin[] = new int [money.length ];
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		for (int i = 0; i < money.length; i++) {
			if (money[i] <= num1) {
				coin[i] = num1 / money[i];
				num1 = num1 % money[i];
			}
			System.out.println(money[i] + "원:" + coin[i] + "개");
		}
	}
}
