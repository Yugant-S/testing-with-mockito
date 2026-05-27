package org.testing.repository;

import org.testing.model.User;

public interface UserRepository {
    User findById(Long id);
}
