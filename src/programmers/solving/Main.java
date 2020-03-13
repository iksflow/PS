package programmers.solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		System.out.println(solution(2, 4, 2, 1));
		br.close();
    }
    /*
     * 1진수 : 1 1 1 1 1 1 1 1 1 1 1 1
     * 2진수 : 0 1 1 0 1 1 1 0 0 1 0 1
     * 3진수 : 0 1 2 1 0 1 1 1 2 2 0 2 1 2 2
     * 
     */
    public static String solution(int n, int t, int m, int p) {
    	StringBuffer answer = new StringBuffer();
    	int max = t * m;
    	int startNum = 0;
    	if (n == 2) {
    		while(answer.length() < max) {
    			answer.append(Integer.toBinaryString(startNum));
    			startNum++;
    		}
    	}
    	
    	System.out.println("문자열: " + answer);
    	return answer.toString();
    }
}
