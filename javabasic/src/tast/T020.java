package tast;

import java.util.Objects;

public class T020 {
    private String age; // 나이
    private String name; // 이름
    private String bday; // 생일

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bday
     */
    public String getBday() {
        return bday;
    }

    /**
     * @param bday the bday to set
     */
    public void setBday(String bday) {
        this.bday = bday;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, bday, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof T020))
            return false;
        T020 other = (T020) obj;
        return Objects.equals(age, other.age) && Objects.equals(bday, other.bday) && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "T020 [Name=" + name + ", Age=" + age + ", Birthday=" + bday + "]";
    }

    public static void main(String[] args) {
        T020 p1 = new T020();
        p1.setName("bae");
        p1.setAge("25");
        p1.setBday("2000-11-07");

        T020 p2 = new T020();
        p2.setName("김자바");
        p2.setAge("28");
        p2.setBday("1997-05-15");

        T020 p3 = new T020();
        p3.setName("김프링");
        p3.setAge("26");
        p3.setBday("1999-02-18");

        T020[] pArr = new T020[3];
        pArr[0] = p1;
        pArr[1] = p2;
        pArr[2] = p3;

        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].toString());
        }
    }
}
