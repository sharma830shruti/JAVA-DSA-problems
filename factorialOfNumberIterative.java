/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {

	
	static int factorial(int num) {
	      if(num==0)
	        return 1;
		
		return num * factorial(num - 1);
	}

	public static void main (String[] args) {
		int number = 5;
     System.out.println(factorial(number));
	    
	}
}
