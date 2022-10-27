package algoStudy.week2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon1935 {
    public static void main(String[] args) {
        HashMap<Character,Double> hm = new HashMap<>();
        Stack<Double> st = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String postfix = sc.next();
        for(int i=0;i<N;i++){
            hm.put((char)('A'+i),sc.nextDouble());
        }
        for(int i=0;i<postfix.length();i++){
            char next = postfix.charAt(i);
            switch (next){
                case '+':
                    st.push(st.pop()+st.pop());
                    break;
                case '-':
                    st.push(-st.pop()+st.pop());
                    break;
                case '*':
                    st.push(st.pop()*st.pop());
                    break;
                case '/':
                    st.push(1.0/st.pop()*st.pop());
                    break;
                default:
                    st.push(hm.get(next));
                    System.out.println(st.toString());
                    break;
            }
        }
        System.out.printf("%.2f",st.pop());

    }
}
