package com.example.asusx453sa.ridwan_1202154212_modul6;

/**
 * Created by ASUS X453SA on 4/4/2018.
 */

public class User {
    String user;
    String username;
    String email;

    public User(){
    }

    public User(String user, String username, String email){
        this.user = user;
        this.username = username;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
