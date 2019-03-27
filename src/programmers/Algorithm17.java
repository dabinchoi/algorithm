package programmers;
/*
소트인사이드
백준1427번

문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

 */
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.next();

        int size = a.length();
        char[] arr = new char[size];

        for (int i=0;i<a.length();i++){
            arr[i] = a.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0;i--)
            System.out.print(arr[i]);
    }
}
