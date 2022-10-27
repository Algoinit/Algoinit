package algoStudy.week2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1158 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt(); int K = sc.nextInt();
        for(int i=1;i<=N;i++){
            queue.offer(i);
        }
        int count = K;
        System.out.print("<");
        while(queue.peek()!=null){
            count--;
            int next = queue.poll();
            if(count == 0){
                System.out.print(next);
                if(queue.peek()==null){
                    System.out.print(">");
                    return;
                }
                System.out.print(", ");
                count = K;
                continue;
            }
            queue.offer(next);
        }
    }
}
