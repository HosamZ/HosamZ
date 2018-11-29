package week4Java.ex11;

public class HappinessRecord {

    private Integer rank;
    private String country;
    private Double score;


    public HappinessRecord(Integer rank, String country, Double score) {
        this.rank = rank;
        this.country = country;
        this.score = score;
    }

    public Integer getRank() {
        return rank;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return
                "rank=" + rank +
                ", country='" + country + '\'' +
                ", score=" + score ;
    }

    public Double getScore() {
        return score;
    }

}
