package com.example.asusx453sa.ridwan_1202154212_modul6;

/**
 * Created by ASUS X453SA on 4/4/2018.
 */

public class Comment {
    String id;
    String username;
    String comment;

    public Comment(){
    }

    public Comment(String id, String username, String comment){
        this.id = id;
        this.username = username;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}
