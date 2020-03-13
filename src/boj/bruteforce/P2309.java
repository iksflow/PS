package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2309 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] heightArr = new int[9]; 
		for (int i = 0; i < 9; i++) {
			heightArr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int height : solution(heightArr)) {
			if (height != 0) {
				System.out.println(height);	
			}
		}
	}

	public static int[] solution(int[] heightArr) {
    	int totalHeight = 0;
    	for (int height : heightArr) {
    		totalHeight += height;
    	}
    	Arrays.sort(heightArr);
    	for (int i = 0; i < 9; i++) {
    		int copy = totalHeight;
    		for (int j = i + 1; j < 9; j++) {
				if ((copy - heightArr[i] - heightArr[j]) == 100) {
					heightArr[i] = 0;
					heightArr[j] = 0;
					return heightArr;
				}
    		}
    	}
    	return heightArr;
    }
}
