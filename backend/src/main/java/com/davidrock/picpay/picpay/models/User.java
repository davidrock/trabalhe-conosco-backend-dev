package com.davidrock.picpay.picpay.models;

import org.springframework.data.annotation.Id;


public class User {

    @Id
    private String Id;
    private String Name;
    private String Nickname;

    public User() {
    }

    public User(String id, String name, String nickname) {
        Id = id;
        Name = name;
        Nickname = nickname;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }
}
