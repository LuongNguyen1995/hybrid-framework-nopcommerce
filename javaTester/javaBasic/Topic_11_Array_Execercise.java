package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array_Execercise {

	@Test
	public void TC_01() {
		int arr[] = {2,7,6,8,9};
		int maxArr = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxArr) {
				maxArr = arr[i];
			}
			
		}
		System.out.println("TC_01 : Giá trị lớn nhất của phần tử này là : "+maxArr);
	}
	
	@Test
	public void TC_02() {
		int arr[] = {2,7,6,8,9};
		int tong = arr[0] + arr[4];
		System.out.println("TC_02 : Tổng phần tử đầu tiên và cuối cùng là : "+tong);
	}
	
	@Test
	public void TC_03() {
		int arr[] = {2,7,6,8,9,16,17,20};
		System.out.println("TC_03 : Các số chẵn trong mảng là :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}
	
	@Test
	public void TC_04() {
		System.out.println("\n");
		int arr[] = {3,-7,2,5,9,-6,10,12};
		int tongLe = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==1 && arr[i]>0) {
				tongLe+=arr[i];
			}
			
		}
		System.out.println("TC_04 : Tổng các số lẻ dương là : "+tongLe);
	}
	
	@Test
	public void TC_05() {
		int arr[] = {3,-7,2,5,9,-6,10,12};
		System.out.println("TC_05 : Các số trong khoảng 0-10 là : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>=0 && arr[i] <=10) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}
	
	@Test
	public void TC_06() {
		System.out.println("\n");
		int arr[] = {3,5,7,30,10,5,8,23,0,-5};
		int tong = 0;
		float trungBinhCong = 0;
		for (int i = 0; i < arr.length; i++) {
			tong+=arr[i];
			
		}
		trungBinhCong = tong/arr.length;
		System.out.println("TC_06 : Tổng của các phần tử trong mảng : "+tong);
		System.out.println("TC_06 : Trung bình cộng của các phần tử trong mảng : "+trungBinhCong);
	}
	
	// Topic_07
	int id;
	String name;
	int age;
	int score;
	
	public Topic_11_Array_Execercise(int id, String name, int age, int score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void displayed() {
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Score : "+score);
	}
	
	public static void main(String[] args) {
		Topic_11_Array_Execercise[] hocSinh = new Topic_11_Array_Execercise[3];
		hocSinh[0] = new Topic_11_Array_Execercise(10,"Luong", 25, 9);
		hocSinh[1] = new Topic_11_Array_Execercise(11,"Phuong", 20, 7);
		hocSinh[2] = new Topic_11_Array_Execercise(12,"Ngan", 20, 6);
		for (int i = 0; i < hocSinh.length; i++) {
			hocSinh[i].displayed();
			
		}
	}
		
	
	
}
