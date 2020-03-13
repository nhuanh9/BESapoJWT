package com.example.hello.service;


import com.example.hello.model.Role;

public interface RoleService {
    Iterable<Role> findAll();


    void save(Role role);

    Role findByName(String name);
}
