class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long number = num;

        if(number==1){
            count=0;
        }

        while(number>1){
            if(number%2 == 0){
                number /= 2;
            } else{
                number = number*3 + 1;
            }

            if(count>500){
                count=-1;
                break;
            }
            count++;
        }
        answer = count;

        return answer;
    }
}
