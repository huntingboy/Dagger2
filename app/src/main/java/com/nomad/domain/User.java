package com.nomad.domain;

import javax.inject.Inject;

public class User {
    public String name;

    @Inject
   public User() {
        this.name = "nomad";
    }

    public User(String name) {
        this.name = name;
    }
}
