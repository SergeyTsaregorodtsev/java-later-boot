package ru.practicum.later.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class UserRepositoryImpl {
    private final Map<Long,User> users = new HashMap<>();
    static private long counter;

    //@Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    //@Override
    public User save(User user) {
        user.setId(++counter);
        users.put(counter,user);
        return user;
    }
}
