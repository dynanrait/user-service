package com.authentication.user.service.service.Impl;

import com.authentication.user.service.dto.UserRequest;
import com.authentication.user.service.model.User;
import com.authentication.user.service.repository.UserRepository;
import com.authentication.user.service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Slf4j
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void saveUser(UserRequest userRequest) {
        User users = User.builder().userName(userRequest.getUserName())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
        log.error(" ================ prepare save =========== ");
        userRepository.save(users);
    }

    @Override
    public User getUserByNameAndPassword(String name, String password) throws UsernameNotFoundException {
        User user = userRepository.findByUserNameAndPassword(name, password);
        if(user == null){
            throw new UsernameNotFoundException("Invalid id and password");
        }
        return user;
    }
}
