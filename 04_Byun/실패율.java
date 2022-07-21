package programmers;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 * 문제 분석
 * 각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 리턴
 */
public class 실패율 {
    public static void main(String[] args) {
        Solution09 p = new Solution09();
        p.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3});
    }
}


class Solution09 {
    public int[] solution(int N, int[] stages) {
        int[] check = new int[N];
        double[] rate = new double[N];
        int[] answer = new int[N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i + 1) {
                    check[i]++;
                }
            }
        }

        int denominator = stages.length;
        for (int i = 0; i < check.length; i++) {
            int numerator = check[i];
            if (denominator == 0) {
                rate[i] = 0;
            } else {
                rate[i] = (double) numerator / denominator;
            }
            denominator -= check[i];
        }

        double max = 0;
        int target = 1;
        for (int i = 0; i < rate.length; i++) {
            max = rate[0];
            target = 1;
            for (int j = 0; j < rate.length; j++) {
                if (rate[j] > max) {
                    max = rate[j];
                    target = j + 1;
                }
            }
            rate[target - 1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}



