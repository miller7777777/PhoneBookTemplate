package com.company;

/**
 * Created by mille_000 on 07.06.2015.
 */
public class Contact {

    private String name;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Contact(String name, String phone, String email) {

        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}
