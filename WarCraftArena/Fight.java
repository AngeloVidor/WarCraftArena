package WarCraftArena;

public class Fight {
    private String name;
    private int life;

    public Fight(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void reduceLife(int damage) {
        life -= damage;
    }

    public void increaseLife(int amount) {
        life += amount;
    }
}
