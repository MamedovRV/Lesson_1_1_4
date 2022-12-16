package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String HOST = "jdbc:mysql://127.0.0.1:3306/users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Cvtybnmgfhjkm1!";

    public static void main(String[] args) throws SQLException {
        List<User> result = new ArrayList<>();
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Petr", "Vasilev", (byte)97);
        userService.saveUser("Vasiliy", "Vasilev", (byte)78);
        userService.saveUser("James", "Vasilev", (byte)9);
        userService.saveUser("Anna", "Vasileva", (byte)108);

        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
