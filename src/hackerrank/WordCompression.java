package hackerrank;

public class WordCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cabbbacb";
//		String newStr = str.substring(0, 1).concat(str.substring(3, 5)) ;
//		System.out.println(newStr);
		compressor(3, str, 0);
	}
	public static void compressor(int n, String text, int prevLength) {
		char[] textElems = text.toCharArray();
		char prevChar = '0';
		char nextChar = '0';
		int lastIndex = 0;
		int count = 1;
		
		if (text.length() == prevLength || text.length() <= 1) {
			System.out.println(text);
		} else {
			for(int i = 0; i < textElems.length; i++) {
				
				if (i > 0) {
					nextChar = textElems[i];
					if (prevChar == nextChar) {
						count++;
						if (count == n) {
							lastIndex = i;
							break;
						}
					} else {
						count = 1;
					}
				}
				prevChar = textElems[i];
			}
			String compressedText = text.substring(0, lastIndex + 1 - n).concat(text.substring(lastIndex + 1, text.length()));
			compressor(n, compressedText, text.length());
		}
	}
}
