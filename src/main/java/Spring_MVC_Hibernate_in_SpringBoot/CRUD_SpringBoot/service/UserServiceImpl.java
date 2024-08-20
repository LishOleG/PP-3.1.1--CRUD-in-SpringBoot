package Spring_MVC_Hibernate_in_SpringBoot.CRUD_SpringBoot.service;

import Spring_MVC_Hibernate_in_SpringBoot.CRUD_SpringBoot.dao.UserDao;
import Spring_MVC_Hibernate_in_SpringBoot.CRUD_SpringBoot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    //@Transactional
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    @Transactional
    public void update(int id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
