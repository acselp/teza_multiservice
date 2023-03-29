package org.teza.user.repositories;

import org.springframework.data.repository.CrudRepository;
import org.teza.user.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
