package day11.task2;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;

    int health;
    double physDef;
    double magicDef;
    int physAtt;
    public Hero () {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double percent = 1 - hero.physDef / 100;
        if (hero.health - physAtt * percent < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = (int) (hero.health - physAtt * percent);
        }
    }

}
