package day13;
//Строковое поле “имя пользователя” (англ. username)
//Список, параметризованный классом User, с названием “подписки” (англ. subscriptions).
// В этом списке должны храниться те пользователи, на которых подписан пользователь.
//Конструктор:
//Должен принимать в качестве аргумента только имя пользователя. Также, должен инициализировать поле “подписки”
// пустым списком.
//
//Методы:
//Геттеры на все поля
//
//public void subscribe(User user) - подписывает пользователя на пользователя user
//
//public boolean isSubscribed(User user) - возвращает True, если пользователь подписан на пользователя
// user и False, если не подписан.
//
//public boolean isFriend(User user) - возвращает True, если пользователь user является другом и False,
// если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
//
//public void sendMessage(User user, String text) - отправляет сообщение с текстом text пользователю user.
// Здесь должен использоваться статический метод из MessageDatabase.
//
//public String toString() - возвращает строковое представление пользователя (имя пользователя).

import java.util.ArrayList;
import java.util.List;

import static day13.MessageDatabase.addNewMessage;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        for (User u1 : subscriptions) {
            if (u1.equals(user)) {
                return;
            }
        }
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
       return subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
       return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }
    public void sendMessage(User user, String text){
        addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return  username;
    }
}
