package java_lang_Study;

public class StringBufferTest {

	public static String delChar(String src, String delch) {
		StringBuffer srcsb = new StringBuffer(src.length());
		
		for (int i=0; i<src.length(); i++) {
			char ch = src.charAt(i);
			
			if (delch.indexOf(ch) == -1) {
				srcsb.append(ch);
			}
		}
		
		return srcsb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("(1!2@3^4~5)"+" -> "+ delChar("(1!2@3^4~5)","~!@#$%^&*()"));

	}

}
