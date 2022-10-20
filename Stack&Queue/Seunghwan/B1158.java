package Hash.basicExample.baekjoon7785;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1158 {
    public int[] recursiveJosephus(Queue<Integer> sequence, int[] permutation, int N, int K) {
        if (sequence.isEmpty()) {
            for (int i = 1; i <= N; i++) {
                sequence.add(i);
            }
        }

        if (sequence.size() < 2) {
            permutation[N-1] = sequence.poll();
            return permutation;
        }

        if (sequence.size() == 2) {
            permutation[N-2] = sequence.poll();
            permutation[N-1] = sequence.poll();
            return permutation;
        }

        for (int i = 0; i < K - 1; i++) {
            sequence.add(sequence.poll());
        }
        int kThNum = sequence.poll();
        permutation[N-sequence.size()-1] = kThNum;

        return recursiveJosephus(sequence, permutation, N, K);
    }

    public int[] josephus(int N, int K) {
        Queue<Integer> sequence = new LinkedList<>();

        int[] permutation = new int[N];

        int personNum = 1;

        while (personNum <= N) {
            sequence.add(personNum++);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K-1; j++) {
                sequence.add(sequence.poll());
            }
            int kThNum = sequence.poll();
            permutation[N-sequence.size()-1] = kThNum;
        }

        return permutation;
    }

}
