package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    public List<User> findUser(String nome) {


        return null;
    }

    @Override
    public List<User> findAllUsers() {

        List<User> users = new ArrayList<>();

        User u = new User("000" ,"David", "Almeida");
        User u2 = new User("111", "Nathália", "Almeida");
        User u3 = new User("222", "Aurora", "Almeida");

        users.add(u);
        users.add(u2);
        users.add(u3);

        return users;
    }

    @Override
    public User findById(int id) {

        User u = new User("333", "Usuário", "Tester");
        return u;
    }
}
