package programmers;

import java.util.Scanner;

/*
백준 10430
나머지

문제
(A+B)%C는 (A%C + B%C)%C 와 같을까?
(A×B)%C는 (A%C × B%C)%C 와 같을까?
세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
 */
public class Algorithm11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (2 < a && 2 <= b && c <= 10000) {
            int num1 = (a + b) % c;
            int num2 = (a % c + b % c) % c;
            int num3 = (a * b) % c;
            int num4 = (a % c * b % c) % c;
            System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);

        }

    }
}
