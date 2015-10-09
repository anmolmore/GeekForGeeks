package com.anmol;

import java.util.Scanner;

public class PermutationsOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		recursion(str);
	}
	
	private static String recursion(String str) {
		if(str.length() > 1) {
			char[] items = str.toCharArray();
			for(int i=0;i<items.length;i++) {
				String s = items[i] + recursion(str.substring(i)); 
				System.out.println(s);
			}
			return null;
		}
		else {
			return str;
		}
	}
}
