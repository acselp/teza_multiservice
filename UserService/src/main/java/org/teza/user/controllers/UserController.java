package org.teza.user.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.teza.user.dto.UserDto;
import org.teza.user.exceptions.UserNotFoundException;
import org.teza.user.models.User;
import org.teza.user.repositories.UserRepository;

import java.sql.SQLIntegrityConstraintViolationException;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private UserRepository _userRepo;

    @GetMapping("/all")
    public Iterable<User> getAll() throws JsonProcessingException {
        return _userRepo.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) throws UserNotFoundException {
        return _userRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user) {
        _userRepo.save(user);

        return user.getId();
    }

    @PutMapping("/update")
    public int updateUser(@RequestBody User user) throws UserNotFoundException {
        User user2 = _userRepo.findById(user.getId())
                .orElseThrow(() -> new UserNotFoundException(user.getId()));
        user.setCreatedAt(user2.getCreatedAt());
        _userRepo.save(user);

        return user.getId();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        _userRepo.deleteById(id);
    }
}
