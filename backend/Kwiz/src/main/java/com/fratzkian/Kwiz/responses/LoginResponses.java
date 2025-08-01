package com.fratzkian.Kwiz.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponses {
    private String token;
    private long expiresIn;

    public LoginResponses(String token, long expiresIn) {
        this.token = token;
        this.expiresIn = expiresIn;
    }
}

