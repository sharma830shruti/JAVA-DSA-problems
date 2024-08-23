/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {

	
	static boolean isPalindrome(int num)
	{  int reverse = 0;
        int temp = num;
        
		while(temp != 0) {
		int lastDigit = temp % 10;
		reverse = reverse * 10 + lastDigit;
		temp = temp / 10;
		}	
        return reverse==num;
	}

	public static void main (String[] args) {
		int number = 4553;

		System.out.println(isPalindrome(number));

	}
}
