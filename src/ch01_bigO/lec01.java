package ch01_bigO;

public class lec01 {

	public static void main(String[] args) {
		printItems(10);
	}

	public static void printItems(int n) { // O(n)
		for (int i = 0; i < n; ++i)
			System.out.println(i);
	}
}
