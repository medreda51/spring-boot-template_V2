package es.nextdigital.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.nextdigital.demo.entity.User;
import es.nextdigital.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
	public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
	public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
	public User saveUser(User user) {
        return userRepository.save(user);
    }
}
