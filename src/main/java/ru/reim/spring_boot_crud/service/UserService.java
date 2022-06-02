package ru.reim.spring_boot_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.reim.spring_boot_crud.models.User;
import ru.reim.spring_boot_crud.repository.UserRepository;

public interface UserService {
    public User findById(long id);
    public List<User> findAll();
    public User saveUser(User user);
    public void deleteById(long id);
}
