package boj.solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Date		: 2020. 3. 13.
 * @Problem Type: 
 * @Problem No. : 
 * @Problem Name: 
 * @Elapsed Time: 
 */
public class Main {
    public static void main(String args[]) throws IOException {
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
		br.close();
    }
    public static int[] solution(int[] heightArr) {
    	int totalHeight = 0;
    	for (int height : heightArr) {
    		totalHeight += height;
    	}
    	for (int i = 0; i < 9; i++) {
    		int copy = totalHeight;
    		copy -= heightArr[i];
    		for (int j = 0; j < 9; j++) {
    			if (j != i) {
    				if ((copy - heightArr[j]) == 100) {
    					heightArr[i] = 0;
    					heightArr[j] = 0;
    					break;
    				}
    			}
    			if (heightArr[i] == 0) {
    				break;
    			}
    		}
    	}
		Arrays.sort(heightArr);
    	return heightArr;
    }
}
