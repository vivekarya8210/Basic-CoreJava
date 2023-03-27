package com.nt.prac3;

import java.util.*;

public class MyComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {

		/*
		 * 1st way
		 *
		 * 
		 * if(i1<i2) {
		 * 
		 * return -1;
		 * 
		 * } else if(i1>i2) {
		 * 
		 * return 1;
		 * 
		 * } else return 0;
		 * 
		 */

		// 2nd Way

		return (i1 < i2) ? -1 : (i1 > i2) ? 1 : 0;

	}
}
