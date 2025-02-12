package lambdaExpert;

import java.util.Scanner;

public class MyMath {
//	연산자 1개를 전달 받으면 알맞게 연산하도록 람다식을 구혐
	public static Calc caculater(String oper) {
		return null;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       String[] array = null;
	       String[] array2 = null;
	       String inputCalc = sc.nextLine();
	       array = inputCalc.split("\\+|\\-");
	       array2 = inputCalc.split("");
	       	       
	       for(String i: array2) {
	    	   System.out.println(i);
	    	   
	       }
	        
	       


//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과값 출력		
				
	}
}
