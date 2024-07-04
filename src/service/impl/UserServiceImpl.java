package service.impl;

import dao.impl.UserDaoImpl;
import db.DataBase;
import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl  implements UserService {
    private UserDaoImpl userDao;
    private DataBase dataBase;

    public UserServiceImpl(UserDaoImpl userDao, DataBase dataBase) {
        this.userDao = userDao;
        this.dataBase = dataBase;
    }

    @Override
    public User addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public String updateUser(Long id, User user) {
        return userDao.updateUser(id,user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public String deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User getUserByEmail(String userEmail) {
        return userDao.getUserByEmail(userEmail);
    }
}
