package web.Spring_Boot_311.service;

import web.Spring_Boot_311.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    Optional<User> findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}