package ch01_bigO;

public class lec02 {

	public static void main(String[] args) {
		printItems(10);
	}
	
	public static void printItems(int n) {
		for (int i = 0; i < n; ++i)			// n times
			System.out.println(i);
		for (int j = 0; j < n; ++j)			// n times
			System.out.println(j);
	}
	
	
}
