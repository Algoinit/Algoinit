package algoStudy.week2;

import java.util.*;

public class BaekJoon20301Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int M = sc.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        for(int i=1;i<=N;i++){
            deque.offer(i);
        }
        int count = K; int reverseCount = M; boolean reverseCheck = true;
        while(deque.peek()!=null){
            count--;
            int next;
            if(reverseCheck)
                next = deque.pollFirst();
            else
                next = deque.pollLast();
            if(count == 0){
                System.out.println(next);
                reverseCount--;
                if(reverseCount==0){
                    reverseCheck=!reverseCheck;
                    reverseCount=M;
                }
                if(deque.isEmpty()){
                    break;
                }
                count = K;
                continue;
            }
            if(reverseCheck)
                deque.offerLast(next);
            else
                deque.offerFirst(next);

        }
    }
}
