package tast;

public class T020_2 {
    private String army; // 출신부대이름
    private String armyclass; // 병과
    private String rank; // 전역계급

    /**
     * @return the army
     */
    public String getArmy() {
        return army;
    }

    /**
     * @param army the army to set
     */
    public void setArmy(String army) {
        this.army = army;
    }

    /**
     * @return the armyclass
     */
    public String getArmyclass() {
        return armyclass;
    }

    /**
     * @param armyclass the armyclass to set
     */
    public void setArmyclass(String armyclass) {
        this.armyclass = armyclass;
    }

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "T020_2 [army=" + army + ", armyclass=" + armyclass + ", rank=" + rank + "]";
    }

    public static void main(String[] args) {
        // T020_2 인스턴스 생성
        T020_2 p1 = new T020_2();
        p1.setArmy("37동원지원단");
        p1.setArmyclass("보병");
        p1.setRank("하사");

        T020_2 p2 = new T020_2();
        p2.setArmy("21사단");
        p2.setArmyclass("포병");
        p2.setRank("중사");

        T020_2 p3 = new T020_2();
        p3.setArmy("5공병여단");
        p3.setArmyclass("공병");
        p3.setRank("하사");

        T020_2[] militaryInfoArr = new T020_2[3];
        militaryInfoArr[0] = p1;
        militaryInfoArr[1] = p2;
        militaryInfoArr[2] = p3;

        for (int i = 0; i < militaryInfoArr.length; i++) {
            System.out.println(militaryInfoArr[i].toString());
        }
    }
}
