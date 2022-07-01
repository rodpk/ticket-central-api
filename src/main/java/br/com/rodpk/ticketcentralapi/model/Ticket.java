package br.com.rodpk.ticketcentralapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.rodpk.ticketcentralapi.to.enums.Level;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "ticket")
@EqualsAndHashCode(callSuper = false)
public class Ticket extends BaseModel {
    

    // all strings will be enums
    @Id 
    @Column(name = "ticket_id") 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;   
    
    @Column(name = "level", nullable = false)
    @Enumerated(EnumType.STRING)
    private Level level;


    private User requester; // requester - solicitante?

    private String classification;

    private String service;

    private String type;

    private String item;

    private String subItem;

    private User owner;
    
    private String deadline;

    private String status;
}
