package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>> tmp = new ArrayList<List<String>>();
	      
	       List<String> ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("ab");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("6");
	       ttt.add("cd");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("ef");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("6");
	       ttt.add("gh");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("4");
	       ttt.add("ij");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("ab");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("6");
	       ttt.add("cd");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("ef");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("6");
	       ttt.add("gh");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("ij");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("4");
	       ttt.add("that");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("3");
	       ttt.add("be");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("0");
	       ttt.add("to");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("1");
	       ttt.add("be");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("5");
	       ttt.add("question");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("1");
	       ttt.add("or");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("2");
	       ttt.add("not");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("4");
	       ttt.add("is");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("2");
	       ttt.add("to");      
	       tmp.add(ttt);
	       ttt = new ArrayList<String>();
	       ttt.add("4");
	       ttt.add("the");      
	       tmp.add(ttt);
	       countSort(tmp);
		
	}
	
	public static int introTutorial(int V, int[] arr) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			if (V == arr[i]) {
				answer = i;
				break;
			}
		}
		
		return answer;
	}
	public static void countSort(List<List<String>> arr) {
		for (int i = 0; i < arr.size()/2; i++) {
			List<String> elem = arr.get(i);
			elem.set(1, "-");
		}
		arr.stream().sorted( (a,b) -> {
			if (Integer.parseInt(a.get(0)) > Integer.parseInt(b.get(0))) {
				return 1;
			} else if(Integer.parseInt(a.get(0)) == Integer.parseInt(b.get(0))) {
				return 0;
			} else {
				return -1;
			}
		}).forEach(a -> System.out.print(a.get(1) + " "));
    }
}
