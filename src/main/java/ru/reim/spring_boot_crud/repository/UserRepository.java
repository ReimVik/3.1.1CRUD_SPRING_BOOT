package ru.reim.spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.reim.spring_boot_crud.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
