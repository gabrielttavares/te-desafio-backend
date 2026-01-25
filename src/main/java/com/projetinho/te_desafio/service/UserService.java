package com.projetinho.te_desafio.service;

import com.projetinho.te_desafio.entity.User;
import com.projetinho.te_desafio.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUsers(User user) {
        repository.saveAndFlush(user);
    }
}
