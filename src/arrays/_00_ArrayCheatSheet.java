package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value
		names[2] = "x";
		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 6. make an array of 50 integers
		int[] nums = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int z = 0; z < nums.length; z++) {
			int x = r.nextInt(49);
			nums[z] = x;
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int c = nums[0];
		int b = nums[49];
		for (int m = 1; m < nums.length; m++) {
			if (nums[m] < c) {
				c = nums[m];
				System.out.println(c);
			}

			// 9 print the entire array to see if step 8 was correct
			System.out.println(nums[m]);

			// 10. print the largest number in the array.
			if (nums[m] > b) {
				b = nums[m];
				System.out.print(b);
			}
		}
	}
}
