package org.teza.user.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.teza.user.exceptions.RoleNotFoundException;
import org.teza.user.exceptions.UserNotFoundException;
import org.teza.user.models.Role;
import org.teza.user.models.User;
import org.teza.user.repositories.RoleRepository;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/roles")
public class RoleController {

    private RoleRepository _roleRepo;

    @GetMapping("/all")
    public Iterable<Role> getAllRoles() {
        return _roleRepo.findAll();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable int id) {
        return _roleRepo.findById(id).get();
    }

    @PostMapping("/add")
    public int createRole(@RequestBody Role role) {
        _roleRepo.save(role);

        return role.getId();
    }

    @PutMapping("/update")
    public int updateUser(@RequestBody Role role) throws RoleNotFoundException {
        _roleRepo.save(role);

        return role.getId();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRole(@PathVariable int id) {
        _roleRepo.deleteById(id);
    }

}
