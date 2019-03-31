package programmers;
/*
한수
백준1065번

문제
어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
 */

import java.util.Scanner;

public class Algorithm21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int b = 0;

        if (x < 100) {
            System.out.println(x);
            return;
        }
        b = 99;

        for (int i = 100; i <= x; i++) {
            int a = i / 100;
            int c = (i / 10) % 10;
            int d = i % 10;
            if (a - c == c - d)
                b++;
        }
        System.out.println(b);
        scan.close();
    }
}
