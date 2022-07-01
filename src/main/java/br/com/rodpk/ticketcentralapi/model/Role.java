package br.com.rodpk.ticketcentralapi.model;

import lombok.Data;

@Data
public class Role {

    private User user;

    private String permissions;


}
