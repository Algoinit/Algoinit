import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FailedB1417Queue {
    public int corruptElection(int[] voteInfo) {
        Queue<Integer> corruptionStage = new LinkedList<>();
        int max =0;
        int count = 0;
        corruptionStage.add(voteInfo[0]);
        for (int i = 1; i < voteInfo.length; i++) {
            while (voteInfo[i] > corruptionStage.peek()) {
                voteInfo[i]--;
                corruptionStage.add(corruptionStage.poll()+1);
                max = voteInfo[i];
                count++;
            }
            corruptionStage.add(voteInfo[i]);
        }

        if (max == corruptionStage.peek()) count++;

        return count;
    }
}
