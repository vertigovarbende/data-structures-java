package ch01_bigO;

public class lec04 {

	public static void main(String[] args) {
		printItems(10);
	}
	
	public static void printItems(int n) {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.println(i + " " + j);
		}
		
		for (int k = 0; k < n; ++k)
			System.out.println(k);
	}
}
