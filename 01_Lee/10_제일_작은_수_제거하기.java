import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
       int[] answer = {};
        int min = 0;
        int[] temp = arr.clone();
        Arrays.sort(temp);
        min = temp[0];

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++){
            if(min != arr[i]){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }

        return answer;
    }
}
