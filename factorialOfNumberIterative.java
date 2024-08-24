/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

	
	static int factorial(int num) {
	     int result = 1;
     for(int i=2; i<=num; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main (String[] args) {
		int number = 5;

		System.out.println(factorial(number));

	}
}
