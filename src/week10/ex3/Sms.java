package week10.ex3;

import java.util.Objects;

public class Sms {

    private String label;
    private String text;

    public Sms(String label, String text) {
        this.label = label;
        this.text = text;
    }

    public String getLabel() {
        return label;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sms)) return false;
        Sms sms = (Sms) o;
        return Objects.equals(getLabel(), sms.getLabel()) &&
                Objects.equals(getText(), sms.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getText());
    }
}
