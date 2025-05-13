package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList;

    private static UserService instance;

    private UserService() {
        userList = new ArrayList<>();
    }

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }






}
