package ru.flamexander.spring.security.jwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.flamexander.spring.security.jwt.entities.Role;

import java.util.Optional;

// Здесь юзер РУКОПИСНЫЙ А НЕ спринговский
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}

// дипсикер сказал что можно безопасно поменять CrudRepository на JPA repository
// это нужно для того чтобы