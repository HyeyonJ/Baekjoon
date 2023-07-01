class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money%5500;
            //10000/5500 = 1몫.. 4500나머지 원이면 한잔!
        return answer;
    }
}