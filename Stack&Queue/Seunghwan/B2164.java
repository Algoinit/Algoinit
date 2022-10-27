package Hash.basicExample.baekjoon7785;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {
    public void cardTower(int N) {
        Queue<Integer> cardDeck = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            cardDeck.add(i);
        }

        while(cardDeck.size() > 1) {
            cardDeck.remove();
            cardDeck.add(cardDeck.poll());
        }

        System.out.println(cardDeck.peek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        B2164 b2164 = new B2164();
        b2164.cardTower(input);
    }
}
