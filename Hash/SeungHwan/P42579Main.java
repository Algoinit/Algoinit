package Hash.basicExample.baekjoon7785;

import java.util.Arrays;

public class P42579Main {

    public static void main(String[] args) {
        P42579 test = new P42579();
        String[] genresTest = {"classic", "pop", "classic", "classic", "pop", "pop", "classic", "rock", "rock", "rock"};
        int[] playsTest = {500, 600, 150, 800, 2500, 2500, 600, 700, 500, 400};

        test.setGenres(genresTest);
        test.setPlays(playsTest);

        test.register();

        System.out.println(Arrays.toString(test.leaveValid()));
    }
}
