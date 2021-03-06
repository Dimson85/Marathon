package day11.task2;

public class Magician extends Hero implements MagicAttack {

   public  int magicAtt = 20;

    public Magician() {
        physDef = 0;
        magicDef = 80;
        physAtt = 5;

    }


    @Override
    public void magicalAttack(Hero hero) {
        double percent = 1 - hero.magicDef / 100;
        if (hero.health - magicAtt * percent < 0) {
            hero.health = MIN_HEALTH;

        } else {
            hero.health = (int) (hero.health - magicAtt * percent);
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
