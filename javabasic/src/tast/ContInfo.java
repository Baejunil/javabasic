package tast;
import java.util.Optional;

public class ContInfo {
    private Optional<String> phone; // null 일 수 있음
    private Optional<String> adrs;  // null 일 수 있음

    public ContInfo(Optional<String> ph, Optional<String> ad) {
        this.phone = ph;
        this.adrs = ad;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public Optional<String> getAdrs() {
        return adrs;
    }
}
