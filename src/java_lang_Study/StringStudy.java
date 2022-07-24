package java_lang_Study;

public class StringStudy {
	public static int count(String src, String target) {
		int pos = 0;
		int count = 0;
		
		for (int i = 0; i < src.length(); i++) {
			pos = src.indexOf(target, pos);

			if (pos != -1) {
				count++;
				pos += target.length();
			} else {
				break;				
			}
		}
		
		return count;
	}
	
	public static String fillZero(String src, int length) {
		
		if (src == null || src.length() <= 0)
			return src;
		else if (length <= 0)
			return "";
		else if (src.length() > length)
			return src.substring(0,length+1);

		
		char[] tmp = new char[length];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = '0';
		}
		
		System.arraycopy(src.toCharArray(), 0, tmp, length-src.length(), src.length());
		
		return new String(tmp);
	}
	
	public static boolean contains(String src, String target) {
		
		return src.indexOf(target) != -1;
		
//		if (src.indexOf(target) >= 0)
//			return true;
//		else {
//			return false;
//		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("count method :");
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
		System.out.println();
		
		System.out.println("contains method :");
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
		
		System.out.println();
		
		System.out.println("fillZero method :");
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}
