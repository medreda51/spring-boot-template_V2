package es.nextdigital.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.nextdigital.demo.entity.User;
import es.nextdigital.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
    @Autowired
    private UserService userServiceImpl;

    @GetMapping
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userServiceImpl.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userServiceImpl.saveUser(user);
    }
}

