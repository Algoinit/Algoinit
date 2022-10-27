import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    /* Stack follows LIFO order.
     * You may push numbers 1 to n and pop such that
     * sequence is built. If every time a value is pushed
     * numbers are in ascending order, (the value on top is the maximum number)
     * define a method that judges whether a given sequence may be created using
     * stack data structure and if possible in what order push and pops are processed. */

    public void createSequence(int seqLength, int[] sequence) {
        Stack<Integer> pushAndPop = new Stack<>();
        List<String> savedOperators = new ArrayList<>();
        int cnt = 0;

        for (int i = 1; i <= seqLength; i++) {
            pushAndPop.push(i);
            savedOperators.add("+");
            while (cnt < seqLength && !pushAndPop.empty() && sequence[cnt] == pushAndPop.peek()) {
                pushAndPop.pop();
                savedOperators.add("-");
                cnt++;
            }
        }
        if (!pushAndPop.empty()) System.out.println("NO");
        else for (String savedOperator : savedOperators) {
                System.out.println(savedOperator);
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] sequence = new int[size];

        for (int i = 0; i < size; i++) {
            sequence[i] = sc.nextInt();
        }

        B1874 b1874 = new B1874();

        b1874.createSequence(size, sequence);
    }
}
