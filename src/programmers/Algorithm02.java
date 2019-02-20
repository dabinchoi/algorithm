package programmers;

import java.util.Arrays;
import java.util.Scanner;

/*
백준알고리즘 2309번  일곱 난쟁이
아홉 명중에 일곱 명을 고르는 것은
아홉 명 중에 두명을 고르는 것과 같다.
난쟂ㅇ이의 수를 N이라고 했을 때
두 명ㅇ즐 고르는 경우의 수 :N^2라고 할 수 있다.
나머지 난쟁잉의 키의 합을 고르는 시간 복잡도 :O

ex)입력 : 20 7 23 19 10 15 25 8 13
 출력 : 7 8 10 13 19 20 23
*/
public class Algorithm02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 9;
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);//배열 정렬
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                if(sum -a[i] -a[j] ==100){
                    for(int k=0; k<n; k++){
                        if(i == k || j ==k) continue;
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
