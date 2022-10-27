package algoStudy.week2;


import java.util.Scanner;
import java.util.Stack;

public class Programmers12909 {

    public boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                stack.push(1);
            else{
                if(stack.empty())
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.empty();
    }
    public boolean solution2(String s){
        while(s.contains("()")){
            s= s.replaceAll("\\(\\)","");
        }
        return s.length() == 0;
    }

    public boolean solution3(String s){
        while(s.contains("()")){
            String[] splitted = s.split("\\(\\)");
            s = String.join("",splitted);

        }
        return s.length() == 0;
    }

    public boolean solutionForAllBrackets(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length();i++){
            char nextpop = 0;
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    st.push(s.charAt(i));
                    continue;
                case ')':
                    nextpop = '(';
                    break;
                case '}':
                    nextpop = '{';
                    break;
                case ']':
                    nextpop = '[';
                    break;
                default:
                    continue;
            }
            if(st.empty())
                return false;
            if(st.peek()!=nextpop)
                return false;
            st.pop();
        }
        return st.empty();
    }

    public static void main(String[] args) {
        Programmers12909 ps = new Programmers12909();
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            s = sc.nextLine();
            if(s.equals(".")) break;
            System.out.println(ps.solutionForAllBrackets(s)?"yes":"no");
        }

    }

}
