package com.dio.desafiojavakotlin.repositories;

import com.dio.desafiojavakotlin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
