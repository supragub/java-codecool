package hu.suprasoft.arraylist;

import java.util.Arrays;

public class MyArrayList {

	private Integer[] Array;

	public MyArrayList() {
		Array = new Integer[0];
	}

	public void add(Integer number) {
		Array = Arrays.copyOf(Array, Array.length + 1);
		Array[Array.length - 1] = number;
	}

	public Integer get(int index) {

		return Array[index];
	}

	public int indexOf(Integer number) {

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] == number) {
				return i;
			}

		}

		return -1;
	}

	public void remove(int index) {
		Integer[] tempList = new Integer[Array.length - 1];
		int slide = 0;
		for (int i = 0; i < Array.length; i++) {
			if (i != index) {
				tempList[i - slide] = Array[i];
			} else {
				slide += 1;
			}

		}

		Array = tempList;

	}

	public int size() {
		return Array.length;
	}

	public void set(int index, Integer number) {
		Array[index] = number;
	}

	public int lastIndexOf(Integer number) {
		for (int i = Array.length; i > 0; i--) {
			if (Array[i - 1] == number) {
				return i - 1;
			}

		}

		return -1;
	}

	public void removeRange(int firstIndex, int lastIndex) {

		for (int i = firstIndex; i <= lastIndex; i++) {
			remove(firstIndex);
		}
	}
}
