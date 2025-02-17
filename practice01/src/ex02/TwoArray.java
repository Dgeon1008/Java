package ex02;

public class TwoArray {

//	[출력결과]
//	배열의 행 길이 : 3
//	배열의 열 길이 : 4
//	1 2 3 4 
//	5 6 7 8
//	9 10 11 12

	public TwoArray() {;}
	
	public int[][] getArray() {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		return arr;
	}
	
	public static void main(String[] args) {
		TwoArray twoArray = new TwoArray();
		int[][] arr = twoArray.getArray();
		
		System.out.println("배열의 행 길이 : " + arr.length);
		System.out.println("배열의 열 길이 : " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
