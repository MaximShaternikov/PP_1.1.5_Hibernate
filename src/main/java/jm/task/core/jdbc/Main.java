package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Mike", "Foster", (byte) 35);
        userService.saveUser("Felix", "Armstrong", (byte) 24);
        userService.saveUser("Mathew", "Jameson", (byte) 41);
        userService.saveUser("Cory", "Barnes", (byte) 15);

        userService.getAllUsers();

        userService.removeUserById(1);

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.toClose();
    }
}
