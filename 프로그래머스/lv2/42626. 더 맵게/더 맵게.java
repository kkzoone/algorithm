import java.util.PriorityQueue;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        
        for(int a : scoville){
            que.offer(a);
        }
        while(que.peek() < K) {
            if (que.size() == 1)
                return -1;
            int a = que.poll();
            int b = que.poll();
            
            int result = a + (b*2);
            que.offer(result);
            answer++;
        }
        return answer;
    }
}