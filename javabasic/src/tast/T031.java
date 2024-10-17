package tast;

import java.util.ArrayList;
import java.util.List;

public class T031 {
    private String name; // 학생 이름
    private int korean;  // 국어 점수
    private int english; // 영어 점수
    private int math;    // 수학 점수

    public T031(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public double getAverage() {
        return (korean + english + math) / 3.0;
    }

    public static void main(String[] args) {
        List<T031> students = new ArrayList<>();
        students.add(new T031("김", 95, 75, 60));
        students.add(new T031("이", 85, 70, 88));
        students.add(new T031("박", 87, 85, 90));
        students.add(new T031("최", 75, 70, 80));
        students.add(new T031("정", 60, 70, 95));

        // 각 학생의 점수와 평균 출력
        for (T031 student : students) {
            System.out.printf("%s - 평균: %.2f%n", student.getName(), student.getAverage());
        }
        
        // 전체 평균 점수 계산
        double totalAverage = students.stream()
                .mapToDouble(T031::getAverage)
                .average()
                .orElse(0);
        System.out.printf("전체 평균: %.2f%n", totalAverage);
        // 과목별 평균 점수 출력
        double koreanAverage = students.stream()
                .mapToInt(T031::getKorean)
                .average()
                .orElse(0);
        double englishAverage = students.stream()
                .mapToInt(T031::getEnglish)
                .average()
                .orElse(0);
        double mathAverage = students.stream()
                .mapToInt(T031::getMath)
                .average()
                .orElse(0);

        System.out.printf("국어 평균: %.2f, 영어 평균: %.2f, 수학 평균: %.2f%n", 
                          koreanAverage, englishAverage, mathAverage);

        // 과목별 최고 점수 학생 출력
        int highestKorean = students.stream().mapToInt(T031::getKorean).max().orElse(0);
        int highestEnglish = students.stream().mapToInt(T031::getEnglish).max().orElse(0);
        int highestMath = students.stream().mapToInt(T031::getMath).max().orElse(0);

        String topKoreanStudents = students.stream()
                .filter(s -> s.getKorean() == highestKorean)
                .map(T031::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("없음");
        
        String topEnglishStudents = students.stream()
                .filter(s -> s.getEnglish() == highestEnglish)
                .map(T031::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("없음");
        
        String topMathStudents = students.stream()
                .filter(s -> s.getMath() == highestMath)
                .map(T031::getName)
                .reduce((a, b) -> a + ", " + b)
                .orElse("없음");

        System.out.printf("최고 국어 점수 학생: %s%n", topKoreanStudents);
        System.out.printf("최고 영어 점수 학생: %s%n", topEnglishStudents);
        System.out.printf("최고 수학 점수 학생: %s%n", topMathStudents);
    }
}