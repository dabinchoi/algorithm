package programmers;
/*
백준 1181번
단어정렬

문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
1.길이가 짧은 것부터
2.길이가 같으면 사전 순으로

입력
첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class Algorithm22 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 중복 제거를 위해 set으로 먼저 input
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < N; i++)
            set.add(br.readLine());

        // List 변환
        ArrayList<String> list = new ArrayList<String>(set);
        // Comparator 클래스를 통하여 custom 정렬
        // 길이에 따라서 먼저 정렬하고 길이가 같으면 사전순으로 정렬
        Collections.sort(list, new Comparator<String>() {
            public int compare(String v1, String v2) {
                if (v1.length() > v2.length())
                    return 1;
                else if (v1.length() < v2.length())
                    return -1;
                else
                    return v1.compareTo(v2);
            }
        });
        for (String s : list)
            System.out.println(s);
    }
}
