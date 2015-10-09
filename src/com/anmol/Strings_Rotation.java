package com.anmol;

import java.util.Scanner;

/**
 * A Program to check if strings are rotations of each other or not
 * @author anmmore
 *
 */
public class Strings_Rotation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first string : ");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter the second string : ");
		String str2 = scanner.nextLine();
		
		checkStringRotationUsingConcat(str1, str2);
		checkStringRotationUsingIndexPosition(str1, str2);
	}
	
	private static void checkStringRotationUsingConcat(String str1, String str2) {
		String temp = str1.concat(str1);
		
		if(temp.contains(str2) && str1.length()==str2.length()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
	private static void checkStringRotationUsingIndexPosition(String str1, String str2) {
		char str2_firstChar = str2.charAt(0);
		int index_secondChar = str1.indexOf(str2_firstChar);
		int flag = 0;
		if(index_secondChar!= -1) {
			index_secondChar++;
			for(int i=1; i<=str2.length(); i++) {
				if(index_secondChar <= str1.length()) {
					if(str1.charAt(index_secondChar-1) == str2.charAt(i)) {
						index_secondChar++;
						continue;
					}
					else {
						flag = 1;
						break;
					}
				}
				else {
					if(str1.charAt(index_secondChar - str1.length()) == str2.charAt(i)) {
						index_secondChar++;
						continue;
					}
					else {
						flag = 1;
						break;
					}
				}
			}
		}
		if(flag == 1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}

}
