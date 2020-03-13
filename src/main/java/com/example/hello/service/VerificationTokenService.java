package com.example.hello.service;

import com.example.hello.model.VerificationToken;

public interface VerificationTokenService {
    VerificationToken findByToken(String token);

    void save(VerificationToken token);
}