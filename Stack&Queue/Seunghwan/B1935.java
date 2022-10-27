import java.util.*;

public class B1935 {
    public void postExpression(String str, List<Integer> lines) {
        Stack<Double> thingsToCompute = new Stack<>();

        List<String> operators = new ArrayList<>(Arrays.asList(new String[]{"*","-","/","+"}));
        Map<Character, Double> map = new HashMap<>();
        int order = 0;
        try {
            for (int i = 0; i < str.length(); i++) {
                if (operators.contains(Character.toString(str.charAt(i)))) {
                    double toBeComputedA = thingsToCompute.pop();
                    double toBeComputedB = thingsToCompute.pop();
                    double result = 0.00;

                    switch (str.charAt(i)) {
                        case '*':
                            result = toBeComputedB * toBeComputedA;
                            break;
                        case '+':
                            result = toBeComputedB + toBeComputedA;
                            break;
                        case '-':
                            result = toBeComputedB - toBeComputedA; // 아래에 있는 것에서 위에 있는 것을 뺀다. 스택에서는 위에 있는 것이 더 최근 것이다. 한 줄로 치면 오른쪽이다.
                            break;
                        case '/':
                            result = toBeComputedB / toBeComputedA; // 아래에 있는 것을 위에 있는 것으로 나누어준다.
                            break;
                        default:
                            break;
                    }
                    thingsToCompute.push(result);
                } else {
                    double toAdd;
                    if (map.get(str.charAt(i)) != null) {
                        toAdd = map.get(str.charAt(i));
                    } else {
                        toAdd = (double)lines.get(order);
                        map.put(str.charAt(i), toAdd);
                        order++;
                    }
                    thingsToCompute.push(toAdd);
                }
            }
            System.out.printf("%.2f", thingsToCompute.peek());
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }

}
