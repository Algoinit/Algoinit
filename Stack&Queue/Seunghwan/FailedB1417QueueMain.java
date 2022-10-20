package Hash.basicExample.baekjoon7785;

public class FailedB1417QueueMain {
    public static void main(String[] args) {
        int[] testVoteInfo = {5, 10, 7, 3, 8};
        FailedB1417Queue b1417Queue = new FailedB1417Queue();

        System.out.println(b1417Queue.corruptElection(testVoteInfo));
    }
}
