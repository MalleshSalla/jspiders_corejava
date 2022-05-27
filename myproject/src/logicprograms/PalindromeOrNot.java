package logicprograms;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PalindromeOrNot {

	public static void main(String[] args) {
	
		int[] arr = getArrayElement(3);
		
		boolean flag = true;
		for (int i = 0, j = arr.length-1;i<=j; i++,j--) {
			if (arr[i]!=arr[j]) {
				flag=false;
				break;
			}
		}
		if (flag) {
			System.err.println( Arrays.toString(arr)+" is a palindrome");
		}else {
			System.out.println(Arrays.toString(arr)+" is not a palindrome");
		}
		
	}

	private static int[] getArrayElement(int n) {
		int[] rondomArr = new int[n];
		for (int i = 0; i < rondomArr.length; i++) {
			 rondomArr[i]= ThreadLocalRandom.current().nextInt(1,5);
			 
			
		}
		return rondomArr;
	}

}
