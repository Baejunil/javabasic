package tast;
import java.util.Optional;

public class School {
    private String cName;
    private Optional<ContInfo> cInfo; // null 일 수 있음

    public School(String cn, Optional<ContInfo> ci) {
        this.cName = cn;
        this.cInfo = ci;
    }

    public String getCName() {
        return cName;
    }

    public Optional<ContInfo> getCInfo() {
        return cInfo;
    }
}