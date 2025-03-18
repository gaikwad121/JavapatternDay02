package com.code;

public class Pattern {

	public static void main(String[] args) {
		LeftTriangle(4);
	}
	//01 Left Tringle Pattern
	
	static void LeftTriangle(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
	}
	}

}
