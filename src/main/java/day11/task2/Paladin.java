package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int scoreHealHimself = 25;
    private final int scoreHealTeammate = 10;


    public Paladin() {
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + scoreHealHimself > 100) {
            health = MAX_HEALTH;
        } else {
            health += scoreHealHimself;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + scoreHealTeammate > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += scoreHealTeammate;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
