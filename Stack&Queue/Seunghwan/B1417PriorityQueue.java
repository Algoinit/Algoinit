import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class B1417PriorityQueue {
    public int corruptElection(int[] voteInfo) {
        if (voteInfo.length == 1) return 0;
        Queue<Integer> corruptionStage = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 1; i < voteInfo.length; i++) {
            corruptionStage.offer(voteInfo[i]);
        }
        int count = 0;
        while (corruptionStage.peek() >= voteInfo[0]) { // 자신이 최대값보다 작거나 같을 동안에는
            corruptionStage.offer(corruptionStage.poll() - 1); // 지금까지의 최대를 제거하고 그 것보다 1 작은 값을 넣어준다.
            voteInfo[0]++; // 자신은 1을 더해 올려준다.
            // 이런 식으로 반복하면 결국 매 반복 시마다 그 때의 최대값을 찾아서 1을 빼준 뒤 자신에게 1을 더함으로서 경쟁자들을 차례대로 매수를 통해 제거한다.

            count++;
        }

        return count;
    }
}
