import java.util.List;

public class B1417 {
    public int corruptElection(int[] voteInfo, int count) {

        int max = voteInfo[0];
        int maxIdx = 0;

        for (int i = 0; i < voteInfo.length; i++) {
            int voteNum = voteInfo[i];
            if (voteNum >= max) {
                max = voteNum;
                maxIdx = i;
            }
        }

        if (maxIdx != 0) {
            if (voteInfo[maxIdx] == voteInfo[0]) {
                voteInfo[maxIdx]--;
                voteInfo[0]++;
                count++;
                return count;
            }
            while(voteInfo[maxIdx] > voteInfo[0]) {
                voteInfo[maxIdx]--;
                voteInfo[0]++;
                count++;
            }

        } else return count;

        return corruptElection(voteInfo, count);
    }
}
