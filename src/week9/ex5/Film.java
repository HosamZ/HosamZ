package week9.ex5;

public class Film {
    private String title;
    private Double score;
    private Long voteCount;
    private Integer runTime;
    private Long budget;
    private Long revenue;

    public Film(String title, Double score, Long voteCount, Integer runTime, Long budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runTime = runTime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public Long getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }
}
