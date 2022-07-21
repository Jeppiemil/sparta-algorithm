package programmers;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/67256
 * 문제 분석
 * 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 리턴
 * */
public class 키패드누르기 {
    public static void main(String[] args) {
        Solution08 p = new Solution08();
        p.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right");
    }
}


class Solution08 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int left=10, right=12;
        int L_dis, R_dis;
        for(int n : numbers) {
            L_dis = 0; R_dis = 0;
            if(n == 1 || n == 4 || n == 7) {
                sb.append("L");
                left = n;

            }else if(n == 3 || n == 6 || n == 9) {
                sb.append("R");
                right = n;

            }else {
                if(n==0) n += 11;
                L_dis = (Math.abs(n-left))/3 + (Math.abs(n-left))%3;
                R_dis = (Math.abs(right-n))/3 + (Math.abs(right-n))%3;
                if(L_dis == R_dis) {
                    if(hand.equals("right")) {
                        sb.append("R");
                        right = n;
                    }else {
                        sb.append("L");
                        left = n;
                    }
                }else if(L_dis > R_dis) {
                    sb.append("R");
                    right = n;
                }else {
                    sb.append("L");
                    left = n;
                }
            }
        }
        return sb.toString();
    }
}


