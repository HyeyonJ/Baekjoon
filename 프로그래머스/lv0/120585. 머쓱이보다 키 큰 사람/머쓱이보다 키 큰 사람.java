class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        // array = [149, 180, 192, 170]
        // height = 167
        //int[] index = new int[array.length];
        
        for(int i = 0; i<array.length; i++){
            if(array[i]<= height){
                answer = answer;
            } else {
                answer = answer + 1;
            }
        }
        
        return answer;
        // answer = 3
    }
}