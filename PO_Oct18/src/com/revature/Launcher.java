package com.revature;

public class Launcher {
	

	public static String atbash(String str) {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if (alpha.indexOf(Character.toLowerCase(c)) > -1) {
						int n = Math.subtractExact(25, alpha.indexOf(Character.toLowerCase(c)));
						if (Character.isUpperCase(c)) 
								sb.append(Character.toUpperCase(alpha.charAt(n)));
						else 
								sb.append(alpha.charAt(n));
				} else {
						sb.append(c);
				}
		}
		return sb.toString();
		
	}
	public static void main(String[] args) {

		System.out.println(atbash("apple"));
		System.out.println(atbash("Hello World"));
		System.out.println(atbash("Christmas is the 25th of December"));
	}

}
