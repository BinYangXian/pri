package day7.debugger;

public class Test4Debugger2 {

	public static void main(String[] args) {
		
		test1();
		
	}
	public static void test1(){
		
		d1(1);
		
	}
	
	private static void d1(long i) {
		dome1();
	}
	private static void dome1() {
		System.out.println("hello1");
		/**
		 * 越界异常
		 **/
		int idx = getIdx();
		String s1 = getString3();
		s1.charAt(idx);
		System.out.println("hello2");
		/**
		 * 空指针异常
		 **/
		String s2 = getString1();
		s2.length();
		System.out.println("hello3");
	}

	private static String getString3() {
		return "hello";
	}
//	private static void d1(int i) {}
	private static int getIdx() {
		int idx = 4;
		int idx2 = ++idx;
		idx2 = idx2 - 1 | 33 & 3311;
		idx2++;
		return idx2;
	}

	private static String getString1() {
		String s = getString2();
		return s;
	}

	private static String getString2() {
		return "多多";
	}
}
