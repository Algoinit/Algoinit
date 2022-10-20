package Hash.basicExample.baekjoon7785;

import java.util.Scanner;

public class B1158Main {
    public static void main(String[] args) {
        B1158 b1158 = new B1158();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] result = b1158.josephus(N, K);

        System.out.print("<");
        for (int i = 0; i < result.length-1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length-1] + ">");
    }
}
