package boj.solving;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			System.out.println("i print: " + i);
			for (int j = 0; j < 9; j++) {
				if (j == 3) {
					break;
				}
				System.out.println(j);
			}
		}
	}
}
