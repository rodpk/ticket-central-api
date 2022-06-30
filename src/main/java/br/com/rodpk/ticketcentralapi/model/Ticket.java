package br.com.rodpk.ticketcentralapi.model;

import lombok.Data;

@Data
public class Ticket {
    

    // all strings will be enums

    private Integer id;
    
    private String level;

    private String requester; // requester - solicitante?

    private String classification;

    private String service;

    private String type;

    private String item;

    private String subItem;

    private String owner;
    
    private String deadline;

    private String status;
}
