package com.authentication.user.service.config;

import com.authentication.user.service.model.User;

import java.util.Map;

public interface JwtGeneratorInterface {

    Map<String, String> generateToken(User user);

}
