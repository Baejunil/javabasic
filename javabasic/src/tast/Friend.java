package tast;

import java.util.Optional;

public class Friend {
    private String name;
    private Optional<School> scl; // null 일 수 있음

    public Friend(String n, Optional<School> s) {
        this.name = n;
        this.scl = s;
    }

    public String getName() {
        return name;
    }

    public Optional<School> getscl() {
        return scl;
    }
}
