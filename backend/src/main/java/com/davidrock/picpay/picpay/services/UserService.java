package com.davidrock.picpay.picpay.services;

import com.davidrock.picpay.picpay.config.SpringMongoConfig;
import com.davidrock.picpay.picpay.models.Users;
import com.davidrock.picpay.picpay.repository.IUserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    //private IUserRep repository;


    @Override
    public void importUsers() {
        String arquivoCSV = "D:/users2.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] users = linha.split(csvDivisor);

                //System.out.println("País [code= " + users[users.length-2] + " , name=" + users[users.length-1] + "]");

                Users user = new Users(users[users.length-3],users[users.length-2],users[users.length-1]);

                mongoOperation.save(user);

            }

            List<Users> us = mongoOperation.findAll(Users.class);

            for (Users u : us) {
                System.out.println("ID:" + u.getId() + "  --  Name:" + u.getName() + "  --  Nick:" + u.getNickname());
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


    @Override
    public List<Users> findUser(String nome) {
        return null;
    }

    /////////////////////////////////*********///////////////////
    @Override
    public List<Users> findAllUsers() {

        List<Users> users = new ArrayList<>();

        Users u = new Users("000" ,"David", "Almeida");
        Users u2 = new Users("111", "Nathália", "Almeida");
        Users u3 = new Users("222", "Aurora", "Almeida");

        users.add(u);
        users.add(u2);
        users.add(u3);

        return users;
    }

    @Override
    public Users findById(int id) {

        Users u = new Users("333", "Usuário", "Tester");
        return u;
    }


}
