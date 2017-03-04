package hu.suprasoft.arraylist;

public class Main {

	public static void main(String[] args) {

		MyArrayList arrayList = new MyArrayList();
		arrayList.add(12);
		arrayList.add(18);

		arrayList.set(0, 100);

		arrayList.add(100);
		arrayList.add(132);
		arrayList.add(1543);
		arrayList.add(1321);
		arrayList.add(60);
		System.out.println(arrayList.size());
		arrayList.removeRange(1, 3);
		System.out.println(arrayList.size());

	}

}
