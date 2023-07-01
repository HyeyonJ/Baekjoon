class Solution {
    public int solution(int[] array, int n) {
        //array = [1,2,3,1,1] -> n = 1 , answer = 3
        int answer = 0;
        
        for(int i = 0; i <array.length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}