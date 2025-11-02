package Java_Private.Lesson3.Homework.model;

import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String phonenumber;

    public User() {
    }

    public User(String username, String password, String email, String phonenumber) {
        this.id= UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return  " Id: " + id +   " Username : " + username +   " Password :" + password +   " Phonenumber : " + phonenumber +  " Email : " + email ;
    }
}
