public class Hero {
    private String name;
    private double hp;
    private double atk;

    // Default constructor
    public Hero() {}

    // Constructor dengan name, hp, and atk parameters
    public Hero(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    // Getters dan Setters
    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }
}