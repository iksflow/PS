package boj.solving;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date		: 2020. 3. 13.
 * @Problem Type: 
 * @Problem No. : 
 * @Problem Name: 
 * @Elapsed Time: 
 */
public class Main {
    public static void main(String args[]) throws IOException {
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	int size = Integer.parseInt(br.readLine());
//    	char[][] box = new char[size][size];
//    	for (int i = 0; i < size; i++) {
//    		String candies = br.readLine();
//    		for (int j = 0; j < candies.length(); j++) {
//    			box[i][j] = candies.charAt(j);
//    		}
//    	}
//    	System.out.println(solution(box));
    	
        //파일 객체 생성
//        File file = new File("C:\\Users\\pro\\git\\PS\\testcase\\P3085_sample1.txt");
//    	File file = new File("C:\\Users\\pro\\git\\PS\\testcase\\P3085_sample2.txt");
    	File file = new File("C:\\Users\\pro\\git\\PS\\testcase\\P3085_sample3.txt");
        //입력 스트림 생성
        FileReader filereader = new FileReader(file);
        //입력 버퍼 생성
        BufferedReader bufReader = new BufferedReader(filereader);
        int size = Integer.parseInt(bufReader.readLine());

    	char[][] box = new char[size][size];
    	for (int i = 0; i < size; i++) {
    		String candies = bufReader.readLine();
    		for (int j = 0; j < candies.length(); j++) {
    			box[i][j] = candies.charAt(j);
    		}
    	}
    	System.out.println(solution(box));
    	bufReader.close();
		
    }
    public static int solution(char[][] candyBox) {
    	int size = candyBox.length;
    	int maxValue = 0;
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			// 가로로 바꾸기
    			if (j + 1 < size) {
    				swap(candyBox, new int[] {i, j}, new int[] {i, j + 1});
    				int tempMaxValue = check(candyBox, new int[] {i, j}, new int[] {i, j + 1});
    				if (maxValue < tempMaxValue) {
    					maxValue = tempMaxValue;
    				}
    				swap(candyBox, new int[] {i, j}, new int[] {i, j + 1});
    			}
    			// 세로로 바꾸기
    			if (i + 1 < size) {
    				swap(candyBox, new int[] {i, j}, new int[] {i + 1, j});
    				int tempMaxValue = check(candyBox, new int[] {i, j}, new int[] {i + 1, j});
    				if (maxValue < tempMaxValue) {
    					maxValue = tempMaxValue;
    				}
    				swap(candyBox, new int[] {i, j}, new int[] {i + 1, j});
    			}
    			
    		}
    	}
    	
    	return maxValue;
    }
    
    public static void swap(char[][] target, int[] a, int[] b) {
    	char temp = target[a[0]][a[1]];
    	target[a[0]][a[1]] = target[b[0]][b[1]];
    	target[b[0]][b[1]] = temp;
    }
    
    public static int check(char[][] target, int[] a, int[] b) {
    	int size = target.length;
    	int maxValue = 0;
    	// 가로로 바꿨을경우
    	if (a[0] == b[0]) {
    		int cnt = 1;
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[i][a[1]] == target[i + 1][a[1]]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[i][b[1]] == target[i + 1][b[1]]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[a[0]][i] == target[a[0]][i + 1]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
    	} else { // 세로로 바꾸는 경우
    		int cnt = 1;
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[a[0]][i] == target[a[0]][i + 1]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[b[0]][i] == target[b[0]][i + 1]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
        	for (int i = 0; i + 1 < size; i++) {
    			if (target[i][a[1]] == target[i + 1][a[1]]) {
    				cnt++;
    			} else {
    				if (maxValue < cnt) {
    					maxValue = cnt;
    				} 
    				cnt = 1;
    			}
        	}
    		
    	}
    	return maxValue;
    }
}
