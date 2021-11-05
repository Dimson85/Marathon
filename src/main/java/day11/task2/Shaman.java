package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {

    public int magicAtt;
    private final int scoreHealHimself = 50;
    private final int scoreHealTeammate = 30;

    public Shaman() {
        this.physAtt = 10;
        this.magicAtt = 15;
        this.physDef = 20;
        this.magicDef = 20;
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
    public void magicalAttack(Hero hero) {
        if (hero.health - magicAtt * (1 - hero.magicDef / 100) < 0) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health = (int) (hero.health - magicAtt * (1 - hero.magicDef / 100));
        }
    }



    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
