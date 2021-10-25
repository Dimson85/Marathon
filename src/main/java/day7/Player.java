package day7;
//Дворовый футбол.
//Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player) содержит
// следующие поля:
//Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор
//Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и
// “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров.
//Статическое поле countPlayers, которое считает количество игроков на футбольном поле
// (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
//Геттеры для полей “выносливость” и “количество игроков”.

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina > 1) {
            stamina = stamina - 1;
        }
        if (stamina == MIN_STAMINA) {
            countPlayers = countPlayers - 1;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) +
                    " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
//info() - выводит сообщение в зависимости от количества игроков на поле.
// Если игроков меньше 6, то выводит сообщение: “Команды неполные.
// На поле еще есть ... свободных мест”, иначе: “На поле нет свободных мест”.
// Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.