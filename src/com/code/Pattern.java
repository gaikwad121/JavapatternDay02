package com.code;

public class Pattern {

	public static void main(String[] args) {
		LeftTriangle(4);
		Triangle(4);
		NoRight(5);
		triangle(6);
		Alphabate(5);
		Alpha(7);
		RevTriangle(6);
		Reverse();
		Flyds();
		Dimands(6);
	}
	/*10
	     * 
	    * * 
	   * * * 
	  * * * * 
	 * * * * * 
	* * * * * * 
	 * * * * * 
	  * * * * 
	   * * * 
	    * * 
	     * 
*/
	static void Dimands(int n ){
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
	System.out.print(" ");	
	}
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
	}
	/* 09
	
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15
	*/
	static void Flyds() {
		int count=1;
	for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
	System.out.print(count+" ");	
	count++;
	}
	System.out.println();
	}
	}
	 
	/* 08
	    * 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
	 */

	static void Reverse() {
	for(int i=1;i<=5;i++) {
	for(int j=1;j<=5-i;j++ ) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
	}
	
	// 07
	/*
	******
	*****
	****
	***
	**
	*
*/
	static void RevTriangle(int n) {
	for(int i=n;i>=1;i--) {
	for(int j=1;j<=i;j++) {
	System.out.print("*");
	}
	System.out.println();
	}
	}
	// 06
	/*
	A 
	B B 
	C C C 
	D D D D */
	static void Alpha(int n) {
		int a=65;
		for(int i=0;i<4;i++){
		for(int j=0;j<=i;j++){
		System.out.print((char)a+" ");
		}
		a++;
		System.out.println();
		}}
	// 05
	/*
	 
A
AB
ABC
ABCD
ABCDE
	 
	 */
	static void Alphabate(int n) {
	for(int i=1;i<=n;i++) {
	 char ch='A';
	 for(int j=1;j<=i;j++) {
		System.out.print((char)(ch));
		ch++;
	 }
	 System.out.println();
	}
	}
	// 04
	/*
123456
12345
1234
123
12
1
	 */
	static void triangle(int n) {
		for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
		System.out.print(j);
		}
		System.out.println();
		}
	}
	
	/* 03	 
1
12
123
1234
12345 
	 */
	static void NoRight(int n) {
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print(j);
		}
		System.out.println();
		}
	}
	/*02 Left Tringle Pattern
	*
  **
 ***
****

*/
	
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
	/* 01
	 
   * 
  * * 
 * * * 
* * * * 

	 */
static void Triangle(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
		
	}
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
}

}


















