package com.java4u.interviewbit.arrays;

import java.util.ArrayList;

public class AddOneToNumber {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		
		return null;
	}
	public ArrayList<Integer> addPlusOne(ArrayList<Integer> a, int n){
		if (a.size() == 0) {
			a.set(0, 1);
			return a;
		} else {
			n = a.size();
			int temp = a.get(n);
			if (temp == 9) {

			}
			if (temp < 9) {

			}
			
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		AddOneToNumber solution = new AddOneToNumber();
		solution.plusOne(list);

	}

}
