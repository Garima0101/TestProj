package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 2, 3, 4, 6 };
		System.out.println(twoSum(nums, 9));
	}

	public static List<Integer> twoSum(int[] nums, int target) {
		// List<int[]> arrList = Arrays.asList(nums);
		List<Integer> arrList = new ArrayList<Integer>();
		// int[] arrList = { } ;
		for (int i = 0; i < nums.length; i++) {
			int first = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				int second = nums[j];
				if (target == first + second) {
					arrList.add(i);
					arrList.add(j);

				}

			}

		}

		return arrList;

	}

}
