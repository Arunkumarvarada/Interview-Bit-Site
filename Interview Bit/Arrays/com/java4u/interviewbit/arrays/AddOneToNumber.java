package com.java4u.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		// the one to be plus
		int carry = 1;
		ArrayList<Integer> result = new ArrayList<Integer>(a);
		int len = a.size();
		for (int i = len - 1; i >= 0; i--) {
			if (carry == 0) {
				// no need to check remaining digits
				break;
			}
			int digit = a.get(i);
			// plus
			int num = digit + carry;
			if (num >= 10) {
				carry = num / 10;
				digit = num % 10;
			} else {
				carry = 0;
				digit = num;
			}
			result.set(i, digit);
		}
		// if 9 9 9
		if (carry != 0) {
			result.add(0, 1);
		}
		// removing leading zeros
		int index = 0;
		while (index < result.size() && result.get(index) == 0) {
			result.remove(index);
		}

		return result;
	}


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(2);
		list.add(3);
		AddOneToNumber solution = new AddOneToNumber();
		list = solution.plusOne(list);
		System.out.println(list.toString());

	}

}
