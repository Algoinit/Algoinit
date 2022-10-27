import java.util.Scanner;

public class B1417PriorityQueueMain {
    public static void main(String[] args) {
        B1417PriorityQueue b1417PriorityQueue = new B1417PriorityQueue();
        Scanner sc = new Scanner(System.in);
        int[] testVoteInfo = new int[sc.nextInt()];

        for (int i = 0; i < testVoteInfo.length; i++) {
            testVoteInfo[i] = sc.nextInt();
        }

        System.out.println(b1417PriorityQueue.corruptElection(testVoteInfo));
    }
}
