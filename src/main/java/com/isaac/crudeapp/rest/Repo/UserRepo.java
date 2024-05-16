package com.isaac.crudeapp.rest.Repo;

import com.isaac.crudeapp.rest.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
