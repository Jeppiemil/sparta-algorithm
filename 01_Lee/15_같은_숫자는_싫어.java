import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int prenum = 10; 
        
        ArrayList<Integer> Arrlist = new ArrayList<Integer>();
        
        for(int i = 0 ; i < arr.length ; i++){
           if(prenum != arr[i]){
               Arrlist.add(arr[i]);
               prenum = arr[i];
           }
        }
    
        answer = new int[Arrlist.size()];
        
        for(int j = 0 ; j <answer.length ; j++){
            answer[j] = Arrlist.get(j);
        }
    
        return answer;
    }
}
