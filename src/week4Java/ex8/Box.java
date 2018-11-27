package week4Java.ex8;

import java.util.Objects;

public class Box {
    private String content;

    public Box(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "content=" + content  ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Box)) return false;
        Box box = (Box) o;
        return Objects.equals(content, box.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
}
