public class Hero {
    private String name;
    private double hp;
    private double atk;

    // Default constructor
    public Hero() {}

    // Constructor with name, hp, and atk parameters
    public Hero(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }
}