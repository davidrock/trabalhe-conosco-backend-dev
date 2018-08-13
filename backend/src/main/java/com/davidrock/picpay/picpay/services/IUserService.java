package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.models.Users;

import java.util.List;

public interface IUserService {
    List<Users> findUser(String nome);
    List<Users> findAllUsers();
    Users findById(int id);
    void importUsers();
}
