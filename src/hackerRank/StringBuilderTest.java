package hackerRank;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		concatTest();
		appendTest();
	}
	
	public static void concatTest() {
		Runtime.getRuntime().gc();
		System.out.println("String ���꼺�� ���� ����");
		System.out.println("�ִ� �޸� ũ�� :\t" + Runtime.getRuntime().maxMemory()/1024 + " KB");
		System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		long startTime = 0;
		long endTime = 0;
		String result = "";
		
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 100000000; i++) {
			result.concat(String.valueOf(i));
			if (i%10000000 == 0) {
				System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");		
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		System.out.println("����ð� :\t\t" + (endTime - startTime) + " ms");
	}

	public static void appendTest() {
		Runtime.getRuntime().gc();
		System.out.println("\nStringBuilder ���꼺�� ���� ����");
		System.out.println("�ִ� �޸� ũ�� :\t" + Runtime.getRuntime().maxMemory()/1024 + " KB");
		System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		long startTime = 0;
		long endTime = 0;
		StringBuilder result = new StringBuilder();
		
		
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000000; i++) {
			result.append(i);
			if (i%10000000 == 0) {
				System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("���� �޸� ��뷮 :\t" + Runtime.getRuntime().totalMemory()/1024 + " KB");
		System.out.println("����ð� :\t\t" + (endTime - startTime) + " ms");
	}
}
