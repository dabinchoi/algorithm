package programmers;

/*
문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
* */

import java.util.Scanner;

public class Algorithm04 {
  public String Algorithm04(){
      Scanner scan = new Scanner(System.in);
      System.out.println("길이를 입력");
      int melon = scan.nextInt();

      String temp ="";

      for(int i=0; i<melon; i++) {
          if(i%2==0) {
              temp = temp + "수";
          }else if(i%2==1) {
              temp = temp + "박";
          }
      }

      return temp;
  }

    public static void main(String[] args) {
        Algorithm04 wm = new Algorithm04();
        System.out.println(wm.Algorithm04());
    }
}
