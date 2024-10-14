package tast;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; 
        int maxScore = 0; 
        int totalScore = 0; 

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            int score = entry.getValue();
            totalScore += score; 

           
            if (score > maxScore) {
                maxScore = score;
                name = entry.getKey();
            }
        }

        // 평균 점수 계산
        double averageScore = (double) totalScore / map.size();

        // 결과 출력
        System.out.println("평균점수: " + averageScore);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
    }
}