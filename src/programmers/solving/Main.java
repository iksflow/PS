package programmers.solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		System.out.println(solution(num));
		br.close();
    }
    public static int solution(int n) {
    	int result = 0;
    	return result;
    }
}
