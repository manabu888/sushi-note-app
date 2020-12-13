package com.lazyhippos.todolistapp.domain.service;

import com.lazyhippos.todolistapp.application.resource.UserRequest;
import com.lazyhippos.todolistapp.domain.model.RoleName;
import com.lazyhippos.todolistapp.domain.model.Users;
import com.lazyhippos.todolistapp.domain.repository.UserJpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    private final UserJpaRepository userJpaRepository;
    private final PasswordEncoder passwordEncoder;

    UserService(UserJpaRepository userJpaRepository, PasswordEncoder passwordEncoder){
        this.userJpaRepository = userJpaRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(UserRequest request, LocalDateTime now){
        String encryptedPassword = passwordEncoder
                .encode(request.getPassword());
        Users newUser = new Users(
                request.getUserId(),
                request.getDisplayName(),
                request.getEmailAddress(),
                encryptedPassword,
                true,
                now,
                now,
                RoleName.USER
        );
        userJpaRepository.save(newUser);
    }

    public Users retrieveAuthorProfile(String userId) {
        return userJpaRepository.getOne(userId);
    }

    public Boolean isUserIdExist(String userId) {
        return userJpaRepository.existsById(userId);
    }
}
