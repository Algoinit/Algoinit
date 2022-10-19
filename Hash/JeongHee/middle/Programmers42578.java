package JeongHee.middle;

import java.util.*;

public class Programmers42578 {
    //위장 https://school.programmers.co.kr/learn/courses/30/lessons/42578
    public static int solution(String[][] clothes) {
        HashMap<String,Integer> numOfClothes = new HashMap<>();
        for (String[] clothe : clothes) {
            String category = clothe[1];
            if(numOfClothes.get(category)==null){
                numOfClothes.put(category,1);
                continue;
            }
            numOfClothes.put(category,numOfClothes.get(category)+1);
        }
        int answer=1;
        for (Integer i : numOfClothes.values()) {
            answer*=(i+1);
        }
        return answer-1;

    }

    public static void main(String[] args) {
        String[][] a = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(a));
    }
}
