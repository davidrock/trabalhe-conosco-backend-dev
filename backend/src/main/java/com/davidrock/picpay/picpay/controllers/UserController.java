package com.davidrock.picpay.picpay.controllers;

import com.davidrock.picpay.picpay.models.DefaultResponse;
import com.davidrock.picpay.picpay.models.Users;
import com.davidrock.picpay.picpay.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{nome}", method = RequestMethod.GET)
    public ResponseEntity<List<Users>> findUser(@PathVariable String nome) {
        List<Users> users = userService.findAllUsers();

        if (users.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping(value = "/load/", method = RequestMethod.GET)
    public ResponseEntity<DefaultResponse> load(){

        userService.importUsers();

        DefaultResponse resp = new DefaultResponse("Nomes Carregados com sucesso", true);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

}
