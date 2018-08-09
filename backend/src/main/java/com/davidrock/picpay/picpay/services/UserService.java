package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.models.User;
import com.davidrock.picpay.picpay.repository.IUserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRep repository;

    @Override
    public List<User> findUser(String nome) {


        return null;
    }


    @Override
    public void importUsers() {
        String arquivoCSV = "D:/users2.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] users = linha.split(csvDivisor);

                //System.out.println("País [code= " + users[users.length-2] + " , name=" + users[users.length-1] + "]");

                User user = new User(users[users.length-3],users[users.length-2],users[users.length-1]);

                repository.save(user);

                List<User> us = repository.findAll();

                for (User u : us) {
                    System.out.println("ID:" + u.getId() + "  --  Name:" + u.getName() + "  --  Nick:" + u.getNickname());
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }















    /////////////////////////////////*********///////////////////
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
