class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 2016년 1월 1일은 금요일이므로 dateName[0]이 "FRI"부터 시작
        String[] dateName = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        // 2016년 1월부터 12월까지 일 수를 배열 dateNum에 담음
        // 2016년 윤년이므로 2월은 29일까지 있음
        int[] dayNum = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // dayTotal은 1월부터 a월까지의 총 day 수  
        int dayTotal = 0;
        // 배열의 index는 0부터 시작하므로 a-1 적용
        for (int i = 0; i < a - 1; i++) {
            // 1월부터 a월까지의 총 day 수를 for문을 돌면서 dayTotal에 입력     
            dayTotal += dayNum[i];
         }
        
        // 입력한 2016년 a월 b일에서 b-1을 dayTotal에 더함
        // 배열 dateName의 인덱스는 0부터 시작하므로 b-1을 더함
        dayTotal += (b - 1);
        // 한 주는 7일이므로 7로 나눈 나머지에 해당하는 인덱스를 dateName에 입력
        answer = dateName[dayTotal % 7];
 
        return answer;
    }
}
