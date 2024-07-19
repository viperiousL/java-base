package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int i = scanner.nextInt();
		System.out.println("请输入第二个数字");
		int j = scanner.nextInt();
		System.out.println(i + j);
	}
} 