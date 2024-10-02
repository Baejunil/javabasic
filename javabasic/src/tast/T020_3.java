package tast;

public class T020_3 {
    private String hometown; // 고향
    private String residencearea; // 현재 사는 곳
    private String lastgraduateschool; // 최종학력 학교

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the residencearea
     */
    public String getResidencearea() {
        return residencearea;
    }

    /**
     * @param residencearea the residencearea to set
     */
    public void setResidencearea(String residencearea) {
        this.residencearea = residencearea;
    }

    /**
     * @return the lastgraduateschool
     */
    public String getLastgraduateschool() {
        return lastgraduateschool;
    }

    /**
     * @param lastgraduateschool the lastgraduateschool to set
     */
    public void setLastgraduateschool(String lastgraduateschool) {
        this.lastgraduateschool = lastgraduateschool;
    }

    @Override
    public String toString() {
        return "T020_3 [hometown=" + hometown + ", residencearea=" + residencearea + ", lastgraduateschool=" + lastgraduateschool + "]";
    }

    public static void main(String[] args) {
        // T020_3 인스턴스 생성
        T020_3 p1 = new T020_3();
        p1.setHometown("양산");
        p1.setResidencearea("양산");
        p1.setLastgraduateschool("양산남부고등학교");

        T020_3 p2 = new T020_3();
        p2.setHometown("부산");
        p2.setResidencearea("부산 해운대구");
        p2.setLastgraduateschool("부산고등학교");

        T020_3 p3 = new T020_3();
        p3.setHometown("서울");
        p3.setResidencearea("서울 강남구");
        p3.setLastgraduateschool("서울과학고등학교");

        T020_3[] personalInfoArr = new T020_3[3];
        personalInfoArr[0] = p1;
        personalInfoArr[1] = p2;
        personalInfoArr[2] = p3;

        for (int i = 0; i < personalInfoArr.length; i++) {
            System.out.println(personalInfoArr[i].toString());
        }
    }
}
