package web.service;

import web.entity.Role;
import web.entity.User;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserService {
    List<User> getAllUser();
    User getUserById(long id);
    void createUser(User user);
    void updateUser(User user);
    void delete(long id);
    Optional<User> findByLogin(String login);

}