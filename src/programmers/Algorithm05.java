package programmers;
/*

소수 찾기

문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.

 */
public class Algorithm05 {
    int Algorithm05(int n){
        int result = 0;
        loop1:
        for(int i=2;i<=n;i++) {
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    continue loop1;
                }
            }
            result++;
        }
        // 함수를 완성하세요.
        return result;
    }

    public static void main(String[] args) {
        Algorithm05 prime = new Algorithm05();
        System.out.println(prime.Algorithm05(10));
    }
}