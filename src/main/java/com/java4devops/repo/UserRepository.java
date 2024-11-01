package com.java4devops.repo;

import com.java4devops.model.User;

import java.util.List;

/**
 * Created by Anna Tsiunchyk on 10/19/24.
 */
public interface UserRepository {

    User findByUsername(String username);

    void save(String username, String password);

    List<User> findAll();

    User findById(Long id);

}
