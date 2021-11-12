package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int SCORE_HEAL_HIMSELF = 25;
    private final int SCORE_HEAL_TEAMMATE = 10;


    public Paladin() {
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + SCORE_HEAL_HIMSELF > 100) {
            health = MAX_HEALTH;
        } else {
            health += SCORE_HEAL_HIMSELF;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + SCORE_HEAL_TEAMMATE > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += SCORE_HEAL_TEAMMATE;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
