package com.java4u.interviewbit.arrays;

import java.util.ArrayList;
import java.util.List;

//Using Kadane's Algorithm
public class MaxContiguousSum {

	public int maxSubArray(final List<Integer> a) {
		int size = a.size();
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < size; i++) {
			max_ending_here = max_ending_here + a.get(i);
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(2);
		list.add(-2);
		list.add(3);
		MaxContiguousSum soultion = new MaxContiguousSum();
		int result = soultion.maxSubArray(list);
		System.out.println(result);
	}

}
