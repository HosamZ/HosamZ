package evaluation.week2Reflection;

public class Letter {

    public String address;
    public Boolean stamped;

    public Letter(String address, Boolean stamped) {
        this.address = address;
        this.stamped = stamped;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getStamped() {
        return stamped;
    }

    public void setStamped(Boolean stamped) {
        this.stamped = stamped;
    }
}
