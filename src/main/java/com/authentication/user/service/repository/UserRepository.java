package com.authentication.user.service.repository;

import com.authentication.user.service.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByUserNameAndPassword(String userName, String password);
}
