package day11.task2;

public class Paladin extends Hero implements Healer {


    public Paladin() {
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if (health + 25 > 100) {
            health = MAX_HEALTH;
        } else {
            health += 25;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + 10 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 10;
        }

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
