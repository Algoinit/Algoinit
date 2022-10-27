package algoStudy.week2;

import java.util.Scanner;
import java.util.Stack;

//백준 스택 수열
// https://www.acmicpc.net/problem/1874
public class BaekJoon1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int topTmp=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0); //스택에는 1부터 들어가야하므로 0을 넣어줌
        for(int i=0;i<N;i++){ //
            int next = sc.nextInt();
            while(!stack.empty()&&stack.peek()<N){ //스택이 비었거나 숫자가 N을 넘어가면 멈춤
                if(stack.peek()>next){ //현재 제일 위의 수가 수열의 수보다 크면
                    stack.pop(); //수열의 수로 맞춰주기위해 pop(수를 낮춰야함)
                    sb.append('-')
                            .append('\n');
                }
                else if(stack.peek()<next) {
                    stack.push(topTmp + 1);
                    topTmp++;
                    sb.append('+')
                            .append('\n');
                }
                else break; //같으면 break;
            }
            if(stack.empty()||next!=stack.peek()) {
                //같아서 break되거나 while문 조건에서 break되는데 같지 않은 경우
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-')
                    .append('\n');
        }
        System.out.println(sb);

    }
}
