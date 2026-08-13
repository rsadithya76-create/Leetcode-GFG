import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();
        
        for (String str : operations) {
            if (str.equals("+")) {
                scores.add(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
            } else if (str.equals("D")) {
                scores.add(scores.get(scores.size() - 1) * 2);
            } else if (str.equals("C")) {
                scores.remove(scores.size() - 1);
            } else {
                scores.add(Integer.parseInt(str));
            }
        }
        
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        
        return totalScore;
    }
}
