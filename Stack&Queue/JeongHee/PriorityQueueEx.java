package algoStudy.week2;
import java.util.Collections;
import java.util.Comparator;


import java.util.PriorityQueue; //힙을 이용해 구현되어 있음


public class PriorityQueueEx {
    static class Student implements Comparable<Student>{
        //Comparable 이라는 인터페이스를 상속받는 클래스. 자기 자신과 <Student>형의 매개변수 객체를 비교한다.
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student target) {
            return this.age <= target.age ? 1: -1;
            //양수: 크다 /0. 같다 /음수:작다
            //age가 클수록 compareTo에 의해 작은 수로 인식됨
            //priority queue에서는 age를 기준으로 내림차순으로 정렬됨
        }
    }
    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();
        Student a=new Student("A",10);
        Student b=new Student("B", 5);
        Student c=new Student("C",7);
        pq.offer(a);
        pq.offer(b);
        pq.offer(c);
        if(pq.peek()!=null){
            System.out.println(pq.peek().name); //A
        }
        pq.poll();
        if(pq.peek()!=null){
            System.out.println(pq.peek().name); //C
        }




        PriorityQueue<int[]> arrPq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]>o2[1]?-1:1;
            }
        });
        int arr1[]={5,1};
        int arr2[]={5,3};
        arrPq.offer(arr1);
        arrPq.offer(arr2);
        System.out.println(arrPq.peek()[1]);




        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer(2);
        priorityQueue.offer(5);
        priorityQueue.offer(1);

        //System.out.println(priorityQueue.peek()); //5가 출력됨

    }


}
