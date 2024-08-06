package es.nextdigital.demo.service;

import java.util.List;

import es.nextdigital.demo.entity.User;

public interface UserService {

	List<User> getAllUsers();

	User getUserById(Long id);

	User saveUser(User user);

}