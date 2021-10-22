package day7;
// Создать класс Player по вышеописанному шаблону. В методе main() создать объект класса Random,
// который будет генерировать случайные числа. Создать 6 игроков, передавая им в качестве аргумента
// в конструктор случайно сгенерированные числа от 90 до 100. Вызвать метод info().
// При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rndm = new Random();
        Player p1 = new Player(rndm.nextInt(11) + 90);
        Player p2 = new Player(rndm.nextInt(11) + 90);
        Player p3 = new Player(rndm.nextInt(11) + 90);
        Player p4 = new Player(rndm.nextInt(11) + 90);
        Player p5 = new Player(rndm.nextInt(11) + 90);
        Player p6 = new Player(rndm.nextInt(11) + 90);

        Player.info();
    }
}
