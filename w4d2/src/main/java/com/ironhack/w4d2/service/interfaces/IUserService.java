package com.ironhack.w4d2.service.interfaces;

import com.ironhack.w4d2.model.Role;
import com.ironhack.w4d2.model.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

}
