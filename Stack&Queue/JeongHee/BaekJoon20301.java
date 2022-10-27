package algoStudy.week2;

import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon20301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        Deque<Integer> deque = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=N;i++){
            deque.offer(i);
        }
        int count = K; int reverseCount = M; boolean reverse = true;
        while(deque.peek()!=null){
            count--;
            int next;
            if(reverse)
                next = deque.pollFirst();
            else
                next = deque.pollLast();
            if(count == 0){
                sb.append(next)
                  .append("\n");
                reverseCount--;
                if(reverseCount==0){
                    reverse=!reverse;
                    reverseCount=M;
                }
                if((reverse&&deque.peekFirst()==null)||((!reverse)&&deque.peekLast()==null)){
                    break;
                }
                count = K;
                continue;
            }
            if(reverse)
                deque.offerLast(next);
            else
                deque.offerFirst(next);


        }
        System.out.println(sb);
    }
}
