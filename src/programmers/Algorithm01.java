package programmers;

/*

직사각형 별찍기

이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
        별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

        n과 m은 각각 1000 이하인 자연수입니다.

        ex 5   3w

        *****
        *****
        *****
*/



import java.util.Scanner;

public class Algorithm01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i = 0; i<b; i++){
            for(int j =0; j<a; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
