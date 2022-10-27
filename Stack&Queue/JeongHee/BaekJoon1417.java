package algoStudy.week2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BaekJoon1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N= sc.nextInt();
        int dasom = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < N-1; i++) {
            pq.offer(sc.nextInt());
        }
        while (pq.peek()!=null&&dasom<=pq.peek()){
            pq.offer(pq.poll()-1);
            dasom++;
            answer++;
        }
        System.out.println(answer);
    }
}
