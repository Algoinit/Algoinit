import java.util.*;

public class P42587 {

    /* Normal printers print out documents in time order. This leads to a problem where important documents are printed later.
     * This kind of problems can be prevented by printing first documents with higher priority. This newly developed printer
     * as always pops document out from queue as listed. But instead of printing right away, it checks whether the priority of
     * current document is higher than every other documents. If it is higher, then it is printed, otherwise it is allocated
     * at the end of the queue. */

    public int solution(int[] priorities, int location) {
        Queue<Integer> mainPrintQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int document : priorities) {
            mainPrintQueue.add(document);
        }

        int idx = 0;
        int order = 0;
        int i = 0;
//        for (int i = 0; i < priorities.length; i++) {
        while (!mainPrintQueue.isEmpty()) {
            if (i == priorities.length) i = 0;
            if (priorities[i] < mainPrintQueue.peek()) {
                if (idx > 0) idx--;

                if (i == location) idx = priorities.length;
            } else if (priorities[i] == mainPrintQueue.peek()) {
                mainPrintQueue.remove();
                order++;
                if (i == location) return order;
            }
            i++;
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 5;

        P42587 p42587 = new P42587();
        System.out.println(p42587.solution(priorities, location));
    }
}
