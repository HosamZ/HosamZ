package week10.ex1;

public class Pokemon {
    private Integer evoultionClass;
    private String name;
    private String type1;
    private String type2;
    private Integer total;
    private Integer hp;
    private Integer attack;
    private Integer defence;
    private Integer spAtk;
    private Integer spDef;
    private Integer speed;
    private Integer generation;
    private String legendary;

    public Pokemon(Integer evoultionClass, String name, String type1, String type2, Integer total, Integer hp, Integer attack, Integer defence, Integer spAtk, Integer spDef, Integer speed, Integer generation, String legendary) {
        this.evoultionClass = evoultionClass;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public Integer getEvoultionClass() {
        return evoultionClass;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getSpAtk() {
        return spAtk;
    }

    public Integer getSpDef() {
        return spDef;
    }

    public Integer getSpeed() {
        return speed;
    }

    public Integer getGeneration() {
        return generation;
    }

    public String getLegendary() {
        return legendary;
    }
}
