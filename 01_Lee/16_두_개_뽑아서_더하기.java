import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int index = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 0;

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                temp = numbers[i]+numbers[j];
                if(arr.indexOf(temp)<0){
                    arr.add(temp);
                }
            }
        }
        answer = new int[arr.size()];

        for(int num : arr){
            answer[index++] = num;
        }

        Arrays.sort(answer);

        return answer;
    }
}
