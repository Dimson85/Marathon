package day11.task2;
//Воин атакует Паладина
//Паладин атакует Мага
//Шаман лечит Мага
//Маг атакует Паладина, тип атаки М
//Шаман атакует Воина, тип атаки Ф
//Паладин лечит себя
//Воин атакует Мага 5 раз

public class Task2 {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.toString());
        paladin.physicalAttack(magician);
        System.out.println(magician.toString());
        shaman.healTeammate(magician);
        System.out.println(magician.toString());
        magician.magicalAttack(paladin);
        System.out.println(paladin.toString());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.toString());
        paladin.healHimself();
        System.out.println(paladin.toString());
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            warrior.physicalAttack(magician);
            System.out.println(magician.toString());
        }

    }
}
