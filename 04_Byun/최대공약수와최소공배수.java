package programmers;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * 문제 분석
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환
 * */
public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        Solution07 p = new Solution07();
        p.solution(3, 12);
    }
}


class Solution07 {
    public int[] solution(int n, int m) {
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return new int[]{a, n * m / a};
    }
}

