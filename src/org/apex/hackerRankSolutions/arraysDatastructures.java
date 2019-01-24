package org.apex.hackerRankSolutions;

import java.util.Scanner;

/*
Given an array, , of  integers, print each element in reverse order as a single line of space-separated integers.

Note: If you've already solved our C++ domain's Arrays Introduction challenge, you may want to skip this.

Input Format

The first line contains an integer,  (the number of integers in ). 
The second line contains  space-separated integers describing .

Constraints

Output Format

Print all  integers in  in reverse order as a single line of space-separated integers.

Sample Input 1

CopyDownload
Array: arr
1
4
3
2

 
4
1 4 3 2
Sample Output 1

2 3 4 1




*/
public class arraysDatastructures {
	public static void main(String[] args) {
	
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//nextint jdk will wait until the user enters a nw value
		
		int arr[] = new int[n];
		
		for(int arr_i = 0; arr_i<n; arr_i++) {
			
			arr[arr_i] = s.nextInt();
			
		}
		
		
		for(int rev_arr_i = arr.length-1 ; rev_arr_i >= 0; rev_arr_i--) {
			
			System.out.print(arr[rev_arr_i] +"  ");
			
		}
	
		
	}

}
