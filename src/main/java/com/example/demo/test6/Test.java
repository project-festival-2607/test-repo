package com.example.demo.test6;

public class Test {

  // 작업 1: 정수 a, b를 더하는 함수 add() 구현하기
  //        구현을 마친 후 커밋 메시지를 "feat: add() 함수 구현" 으로 입력 후 commit

  static int add(int a, int b) {
    return 0;   // 여기를 구현하기
  }

  // 작업 2: 양의 정수 a, b의 최대공약수를 구하는 함수 gcd() 수정하기
  //        수정을 마친 후 커밋 메시지를 "fix: gcd() 함수 수정" 으로 입력 후 commit
  static int gcd(int a, int b) {
    if (b == 0) return a;
    if (a < b) return gcd(b, a);
    return gcd(b, a % b);     // a % a를 a % b로 수정
  }

  public static void main(String[] args){
    System.out.printf("add(1, 3) = %d%n", add(1, 3));
    System.out.printf("gcd(72, 90) = %d%n", gcd(72, 90));

//    예상 출력:
//    > Task :com.example.demo.test6.Test.main()
//    add(1, 3) = 4
//    gcd(72, 90) = 18
  }

}
