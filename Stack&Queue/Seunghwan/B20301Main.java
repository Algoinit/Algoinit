import java.util.*;

public class B20301Main {
    public static void main(String[] args) {
        B20301 b20301 = new B20301();
        Scanner sc = new Scanner(System.in);
        int[] permutation = b20301.reverseJosephus(sc.nextInt(), sc.nextInt(), sc.nextInt());

        for (int num : permutation) {
            System.out.println(num);
        }
    }
}
