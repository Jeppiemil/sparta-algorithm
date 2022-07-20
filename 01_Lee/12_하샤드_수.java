class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        String digit = Integer.toString(x);
        int[] digitNum = new int[digit.length()];
        int div = 0;
        int share = 0;
        int remainder = 0;
        int addNum = 0;

        for(int i=digit.length()-1; i>=0; i--){
            div = (int)Math.pow(10,i);
            share = x/div;
            remainder = share%10;
            digitNum[digit.length()-1-i] = remainder;
        }
        
        for(int i=0; i<digitNum.length; i++){
            addNum += digitNum[i];
        }

        if(x%addNum != 0){
            answer = false;
        }

        return answer;
    }
}
