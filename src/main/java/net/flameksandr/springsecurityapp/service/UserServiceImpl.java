package net.flameksandr.springsecurityapp.service;

/**
 * Implementation of {@link net.flameksandr.springsecurityapp.service.UserService} interface.
 *
 * @author Aleksandr Philimonov
 * @version 1.0
 */

import net.flameksandr.springsecurityapp.dao.RoleDao;
import net.flameksandr.springsecurityapp.dao.UserDao;
import net.flameksandr.springsecurityapp.model.Role;
import net.flameksandr.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
