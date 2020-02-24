package hackerrank.sorting;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
		insertionSort1(10, array);
	}
	public static void insertionSort1(int n, int[] arr) {
		if (arr.length > 1) {
			if (n > 1 && arr[n - 1] < arr[n - 2]) {
				int temp = arr[n - 1];
				arr[n - 1] = arr[n - 2];
				for(int i : arr) {
					System.out.print(i + " ");	
				}
				System.out.println();
				arr[n - 2] = temp;
				insertionSort1(n - 1, arr);
			} else {
				for(int i : arr) {
					System.out.print(i + " ");	
				}
			}
		} else {
			for(int i : arr) {
				System.out.print(i + " ");	
			}
		}
	}
}
