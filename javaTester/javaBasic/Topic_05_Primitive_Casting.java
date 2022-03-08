package javaBasic;

public class Topic_05_Primitive_Casting {

	public static void main(String[] args) {
		//Ngầm định = không mất dữ liệu
		byte bNumber = 126;
		short sNumber = bNumber;
		int iNumber = sNumber;
		long lNumber = iNumber;
		float fNumber = lNumber;
		double dNumber = fNumber;
		
		System.out.println(bNumber);
		System.out.println(sNumber);
		System.out.println(iNumber);
		System.out.println(lNumber);
		System.out.println(fNumber);
		System.out.println(dNumber);
			
		
		//Tường minh (Cast), có thể mất dữ liệu
		double dNumber1 = 578497238;
		System.out.println(dNumber1);
		
		float fNumber1 = (float) dNumber1;
		System.out.println(fNumber1);
		
		long lNumber1 = (long) fNumber1;
		System.out.println(lNumber1);
		int iNumber1 = (int) lNumber1;
		System.out.println(iNumber1);
		short sNumber1 = (short) iNumber1;
		System.out.println(sNumber1);
		byte bNumber1 = (byte) sNumber1;
		System.out.println(bNumber1);
	}

}
