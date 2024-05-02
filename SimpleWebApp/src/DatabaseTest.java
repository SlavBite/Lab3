/*
import java.util.List;

import model.UserEntity;

public class DatabaseTest {

    public static void main(String[] args) {
        // Создаем экземпляр UserDao
        UserDao userDao = new UserDao();

        // Получаем список всех пользователей из базы данных
        UserEntity user = userDao.getUserById(1);

        // Выводим информацию о каждом пользователе

        System.out.println("ID: " + user.getIdUser());
        System.out.println("Name: " + user.getName());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Email: " + user.getEmail());
        System.out.println("-------------------------");


        UserDao userDao2 = new UserDao();

        // Создаем нового пользователя
        UserEntity newUser = new UserEntity();
        newUser.setName("Новый пользователь");
        newUser.setPassword("пароль");
        newUser.setEmail("новый@example.com");

        // Сохраняем пользователя в базе данных
        userDao2.saveUser(newUser);

        System.out.println("Пользователь успешно добавлен в базу данных!");

    }
}
 */