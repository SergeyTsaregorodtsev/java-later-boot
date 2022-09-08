package ru.practicum.later.user;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User save(User user);
}
