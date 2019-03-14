package programmers;
/*
소수 찾기

문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다.
다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.


 */
import java.util.Scanner;

public class Algorithm08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sosu[] = new int[num];

        int answer = num; //답에 넣고 소수아닌것을 제외

        for(int i=0;i<num;i++){ //입력받기
            sosu[i] = scan.nextInt();
        }
        for(int i=0;i<num;i++){
            if(sosu[i] == 1){     //1일경우 소수아닌것에 포함한다.
                answer -= 1;
            }
            for(int j=2;j<sosu[i];j++){
                if(sosu[i] % j == 0){
                    answer -=1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
