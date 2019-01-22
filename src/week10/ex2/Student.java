package week10.ex2;

public class Student {
    private String gender;
    private String parentalEducation;
    private Integer mathScore;
    private Integer readingScore;
    private Integer writingScore;

    public Student(String gender, String parentalEducation, Integer mathScore, Integer readingScore, Integer writingScore) {
        this.gender = gender;
        this.parentalEducation = parentalEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalEducation() {
        return parentalEducation;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public Integer getReadingScore() {
        return readingScore;
    }

    public Integer getWritingScore() {
        return writingScore;
    }
}
