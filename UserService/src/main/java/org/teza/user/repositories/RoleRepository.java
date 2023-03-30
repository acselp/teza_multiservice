package org.teza.user.repositories;

import org.springframework.data.repository.CrudRepository;
import org.teza.user.models.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
