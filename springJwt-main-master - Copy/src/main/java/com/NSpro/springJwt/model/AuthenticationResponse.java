package com.NSpro.springJwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthenticationResponse {
    private String token;
    private String username;
    private int userID;
    private String message;
    private Role role;


    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

}
