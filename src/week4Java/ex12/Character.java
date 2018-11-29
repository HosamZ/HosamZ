package week4Java.ex12;

import java.util.Objects;

public class Character {
    private String name;
    private String bookOfDeath;
    private String gender;

    public Character(String name, String bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Character{" + "name='" + name + '\'' + ", bookOfDeath='" + bookOfDeath + '\'' + ", gender='" + gender + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Character)) return false;
        Character character = (Character) o;
        return Objects.equals(getName(), character.getName()) &&
                Objects.equals(getBookOfDeath(), character.getBookOfDeath()) &&
                Objects.equals(getGender(), character.getGender());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBookOfDeath(), getGender());
    }
    public String getName() {
        return name;
    }
    public String getBookOfDeath() {
        return bookOfDeath;
    }
    public String getGender() {
        return gender;
    }
}
