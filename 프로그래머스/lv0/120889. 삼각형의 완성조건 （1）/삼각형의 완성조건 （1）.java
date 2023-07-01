import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //sides = [3, 5, 4] 9 + 16 = 25
        int answer = 0;
        Arrays.sort(sides);
        
        if(sides[2] < (sides[0] + sides[1])){
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}