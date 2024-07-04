package service.impl;

import dao.UserDao;
import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

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
        return userDao.updateUser(id, user);
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
