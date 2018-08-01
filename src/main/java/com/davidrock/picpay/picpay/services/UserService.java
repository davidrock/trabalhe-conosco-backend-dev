package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    @Override
    public List<User> findAllUsers() {

        List<User> users = new ArrayList<>();

        User u = new User("David", "Almeida", 28);
        User u2 = new User("Nathália", "Almeida", 28);
        User u3 = new User("Aurora", "Almeida", 1);

        users.add(u);
        users.add(u2);
        users.add(u3);

        return users;
    }

    @Override
    public User findById(int id) {
        return null;
    }
}
