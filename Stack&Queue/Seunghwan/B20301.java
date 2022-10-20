package Hash.basicExample.baekjoon7785;

import java.util.*;

public class B20301 {
//    private void reverseQueue(Queue<Integer> queue) {
//        Stack<Integer> stack = new Stack<>();
//        stack.addAll(queue);
//        queue.clear();
//        while(!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//    }

    public int[] reverseJosephus(int N, int K, int M) {
        Deque<Integer> group = new LinkedList<>();
        int[] permutation = new int[N];
        for (int i = 1; i <= N; i++) {
            group.offerFirst(i);
        }

        Iterator<Integer> iterator = group.descendingIterator();
        int i = 0;
        boolean switching = false;
        while (iterator.hasNext() && !group.isEmpty()) {
            for (int j = 0; j < K - 1; j++) {
                if (switching) {
                    int erased = group.removeFirst();
                    group.offerLast(erased);
                } else {
                    int erased = group.removeLast();
                    group.offerFirst(erased);
                }
            }
            if (switching) {
                permutation[i] = group.removeFirst();
            } else permutation[i] = group.removeLast();
            i++;
            if (i % M == 0) switching = !switching;
        }
        return permutation;
    }
}
