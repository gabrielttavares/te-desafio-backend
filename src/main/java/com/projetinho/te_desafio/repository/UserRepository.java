package com.projetinho.te_desafio.repository;

import com.projetinho.te_desafio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
