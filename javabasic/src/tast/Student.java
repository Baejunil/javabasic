package tast;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(studentNum); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; // null 체크 및 클래스 체크
        
        Student other = (Student) obj; 
        return studentNum == other.studentNum; 
    }
}