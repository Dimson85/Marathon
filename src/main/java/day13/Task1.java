package day13;
//В методе main() этого класса необходимо создать трех пользователей.
//Затем необходимо:
//Отправить 2 сообщения от пользователя 1 пользователю 2
//Отправить 3 сообщения от пользователя 2 пользователю 1
//Отправить 3 сообщения от пользователя 3 пользователю 1
//Отправить 3 сообщения от пользователя 1 пользователю 3
//Отправить 1 сообщение от пользователя 3 пользователю 1
//
//Сообщения могут быть любыми.
//После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().

import java.util.Date;

import static day13.MessageDatabase.showDialog;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("Tom");
        User u2 = new User("Dima");
        User u3 = new User("Roman");

        u1.sendMessage(u2,"Hello, my friend!");
        u1.sendMessage(u2,"How are you?");

        u2.sendMessage(u1,"Hello!");
        u2.sendMessage(u1,"Tom");
        u2.sendMessage(u1,"Were are you?");

        u3.sendMessage(u1,"Hi!");
        u3.sendMessage(u1,"What time?");
        u3.sendMessage(u1,"When you come?");

        u1.sendMessage(u3,"Hello!");
        u1.sendMessage(u3,"My friend!");
        u1.sendMessage(u3,"12:30");

        u3.sendMessage(u1,"Thanks!");

        showDialog(u1,u3);

        Message message = new Message(u1,u2, "hvkhgcc jhvkgv jhv");
        System.out.println();
        System.out.println(message.toString());


    }

}
