package com.iheb.users.service;

import com.iheb.users.entities.Role;
import com.iheb.users.entities.User;
import com.iheb.users.service.register.RegistationRequest;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
    List<User> findAllUsers();
    User registerUser(RegistationRequest request);
    public void sendEmailUser(User u, String code);

    public User validateToken(String code);
}
