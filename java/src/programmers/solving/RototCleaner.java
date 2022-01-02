package programmers.solving;

public class RototCleaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] office = {{5,-1,4},{6,3,-1},{2,-1,1}};
		String[] move = {"go","go","right","go","right","go","left","go"};
		int v = 1;
		int h = 0;
		System.out.println(solution(office, v, h, move));

	}
	public static int solution(int[][] office, int r, int c, String[] move) {
		int answer = 0;
		int size = office.length;
		char[] direction = {'N', 'W', 'S', 'E'};
		int dirIdx = 0;
		answer += office[r][c];
		office[r][c] = clean();
		for(String command : move) {
			switch(command) {
				case "go":
					int formerR = r;
					int formerC = c;
					
					if (direction[dirIdx] == 'N') {
						if (0 < r) {
							r--;
						}
					} else if (direction[dirIdx] == 'S') {
						if (r < size-1) {
							r++;	
						}
					} else if (direction[dirIdx] == 'W') {
						if (0 < c) {
							c--;	
						}
					} else {
						if (c < size-1) {
							c++;	
						}
					}
					
					if (office[r][c] == -1) {
						r = formerR;
						c = formerC;
					} else {
						answer += office[r][c];
						office[r][c] = clean();
					}
					break;
				default:
					dirIdx = getDirIdx(dirIdx, command);
			}
		}
		return answer;
	}
	
	public static int clean() {
		return 0;
	}
	public static int getDirIdx(int currentDirectionIdx, String command) {
		int directionIdx = currentDirectionIdx;
		if (command.equals("left")) {
			directionIdx++;
		} else {
			directionIdx--;
		}
		if (-1 < directionIdx) {
			directionIdx = directionIdx % 4;
		} else {
			directionIdx = 3;
		}
		return directionIdx;
	}
}
