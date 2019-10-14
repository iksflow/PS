package hackerRank;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concatTest();
		appendTest();
	}
	
	public static void concatTest() {
		Runtime.getRuntime().gc();
		System.out.println("String 연산성능 측정 시작");
		System.out.println("최대 메모리 크기 :\t" + Runtime.getRuntime().maxMemory()/1024 + " KB");
		System.out.println("시작 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		long startTime = 0;
		long endTime = 0;
		String result = "";
		
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			result.concat(String.valueOf(i));
			if (i%10000000 == 0) {
				System.out.println("현재 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");		
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("최종 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		System.out.println("실행시간 :\t\t" + (endTime - startTime) + " ms");
	}

	public static void appendTest() {
		Runtime.getRuntime().gc();
		System.out.println("\nStringBuilder 연산성능 측정 시작");
		System.out.println("최대 메모리 크기 :\t" + Runtime.getRuntime().maxMemory()/1024 + " KB");
		System.out.println("시작 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		long startTime = 0;
		long endTime = 0;
		StringBuilder result = new StringBuilder();
		
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000000; i++) {
			result.append(i);
			if (i%10000000 == 0) {
				System.out.println("현재 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("최종 메모리 사용량 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		System.out.println("실행시간 :\t\t" + (endTime - startTime) + " ms");
	}
}
