package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.models.User;

import java.util.List;

public interface IUserService {
    List<User> findUser(String nome);
    List<User> findAllUsers();
    User findById(int id);
}
