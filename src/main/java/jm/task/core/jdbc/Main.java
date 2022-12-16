package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
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
