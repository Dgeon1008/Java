package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
//		1) 자료형 배열명 = {값1, 값2, ...}
//		2) 자료형 배열명 = new 자료형[칸수]  
//		new연산자는 동적할당시킬 수 있게 heap영역에 올려라
//		3) 자료형 배열명 = null;
//		배열명 = new 자료형[칸수];
		
//		JVM이 관리하는 주소값 (해시태그)
//		int[] arr1 = {10, 20, 30};
//		System.out.println(arr1[1]);
		
		int[] arr2 = {1, 2, 3, 4, 5};
		
//		for(int i=0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		for(int i=0; i<arr2.length;i++) {
			arr2[i] = 5 - i;
			System.out.println(arr2[i]);
		}
		
		
		
		
	}
}
