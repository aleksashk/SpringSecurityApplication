package net.flameksandr.springsecurityapp.service;

import net.flameksandr.springsecurityapp.model.User;

/**
 * Service class for {@link net.flameksandr.springsecurityapp.model.User}
 *
 * @author Aleksandr Philimonov
 * @version 1.0
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
