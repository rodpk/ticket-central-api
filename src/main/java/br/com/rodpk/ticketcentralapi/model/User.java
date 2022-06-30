package br.com.rodpk.ticketcentralapi.model;

import lombok.Data;

@Data
public class User {
    
    private String hash;

    private String name;

    private String email;

    private String password;

    private String role;
}
