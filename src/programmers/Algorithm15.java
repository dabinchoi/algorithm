package programmers;
/*
피보나치수 3
백준2749

문제
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
n=17일때 까지 피보나치 수를 써보면 다음과 같다.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다.

 */
import java.util.Scanner;

public class Algorithm15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long[] list = new long[a + 1];
        int mod = 1000000;
        int period = pisano_period(mod);
        list[0] = 0;
        list[1] = 1;
        for (int i = 2; i < list.length; i++) {
            list[i] = list[i - 2] + list[i - 1];
            list[i] %= mod;
        }
        System.out.println(list[a % period]);
    }

    public static int pisano_period(int m) {
        int period = 0;
        int number1 = 1, number2 = 1;
        do {
            int temp = number1;
            number1 = number2;
            number2 = (temp + number2) % m;
            period++;
        } while (!(number1 == 1 && number2 == 1));
        return period;
    }
}

