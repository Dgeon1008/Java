package castingTest;

public class CastingTask2 {
   public static void main(String[] args) {
//      1번 문제
//      num1 + str1 + str2로 115만들기
      int num11 = 1;
      String str1 = "8.24", str2 = "7.8";
      
      double strD1 = Double.parseDouble(str1);
      double strD2 = Double.parseDouble(str2);
      System.out.printf("%s",num11);
      System.out.println((int)strD1 + (int)strD2);
      
//      2번 문제
//      a, j, k를 연산하여 A, J, K를 출력하기
      System.out.print((char)65);
      System.out.print(",");
      System.out.print((char)74);
      System.out.print(",");
      System.out.println((char)75);
      
//      3번 문제
//      "12.123"
//      "345.789"
//      "6789.456"
//      3개 값을 더해서 123456789를 출력하기
      int num1 = (int)12.123;
      int num2 = (int)345.789;
      int num3 = (int)6789.456;
      System.out.printf("%S", num1);
      System.out.printf("%S", num2);
      System.out.printf("%S", num3);
   }
}
