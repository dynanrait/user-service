package com.authentication.user.service.service;

import com.authentication.user.service.dto.UserRequest;
import com.authentication.user.service.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {

    void saveUser(UserRequest userRequest);

    User getUserByNameAndPassword(String name, String password) throws UsernameNotFoundException;
}
