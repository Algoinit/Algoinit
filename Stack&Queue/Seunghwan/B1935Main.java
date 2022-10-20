package Hash.basicExample.baekjoon7785;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1935Main {
    public static void main(String[] args) {
        B1935 b1935 = new B1935();

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();

        List<Integer> lines = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lines.add(Integer.parseInt(sc.nextLine()));
        }
        b1935.postExpression(str, lines);
    }
}
