package algoStudy.week2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//프린터
//https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Programmers42587 {
    public int solution(int[] priorities, int location) {
        //우선순위 제일 높은 순으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //인쇄 대기 목록(location과 우선순위를 저장)
        Queue<int[]> queue = new LinkedList<>();
        int answer=1;
        for (int i = 0; i <priorities.length ; i++) {
            int[] x = new int[2];
            x[0]=i;
            x[1]=priorities[i];
            queue.offer(x);
            pq.offer(priorities[i]);
        }
        while (!queue.isEmpty()&&!pq.isEmpty()){
            //그 다음 뽑힐 문서가 원하는 문서인지 확인
            if(priorities[location]==pq.peek()&&location==queue.peek()[0]){
                break;
            }
            //원하는 문서는 아니지만 다른 문서가 뽑힐 차례면 뽑아줌
            if(queue.peek()[1]==pq.peek()){
                queue.poll();
                pq.poll();
                answer++;
            }else {
                //문서가 뽑히지 않고 순서가 뒤로 밀리는 경우
                queue.offer(queue.poll());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Programmers42587 programmers42587 = new Programmers42587();
        System.out.println(programmers42587.solution(new int[]{2, 1, 3, 2},2));
    }

}
