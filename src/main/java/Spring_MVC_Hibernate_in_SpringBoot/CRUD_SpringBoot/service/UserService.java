package Spring_MVC_Hibernate_in_SpringBoot.CRUD_SpringBoot.service;


import Spring_MVC_Hibernate_in_SpringBoot.CRUD_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User showUser(int id);

    void update(int id, User user);

    void delete(int id);
}
