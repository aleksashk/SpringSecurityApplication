package net.flameksandr.springsecurityapp.service;

/**
 * Service for security
 * @author Aleksandr Philimonov
 * @version 1.0
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username,String password);
}
