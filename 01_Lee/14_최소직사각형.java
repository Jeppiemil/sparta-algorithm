import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] w = {};
        int[] h = {};
        int wChange = 0;
        int hChange = 0;

        ArrayList<Integer> wArr = new ArrayList<>();
        ArrayList<Integer> hArr = new ArrayList<>();

        for(int i=0; i< sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                wChange = sizes[i][0];
                hChange = sizes[i][1];
                wArr.add(hChange);
                hArr.add(wChange);
            } else{
                wArr.add(sizes[i][0]);
                hArr.add(sizes[i][1]);
            }
        }

        Collections.sort(wArr);
        Collections.sort(hArr);
        
        answer = wArr.get(wArr.size()-1) * hArr.get(wArr.size()-1);

        return answer;
    }
}
