package javaException;

public class TryCatchException {

	public static void main(String[] args) {
//		int number = 10;
//		
//		try {
//			//Nếu đúng thì chjay hết các đoạn code trogn try và k qua catch
//			//Sai thì gặp exception - nhảy qua catch
//			number = number/0;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(number);
//
//		String[] browserName = {"Chrome", "Firefox", "Safari"};
//		browserName[0] = "Edge";
//		try {
//			browserName[3] = "IE";
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		for (String browser : browserName) {
//			System.out.println(browser);
//		}
		
		try {
			int array[] = new int[10];
			array[11] = 30/1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Lỗi truy cập ngoài vùng nhớ");
		}catch (ArithmeticException e) {
			System.out.println("Lỗi chia cho 0");
		}
		
		
		
	}
	public static void sleepInSecond(long timeout) {
		try {
			Thread.sleep(timeout*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
