// package br.com.rodpk.ticketcentralapi.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.EnumType;
// import javax.persistence.Enumerated;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// import br.com.rodpk.ticketcentralapi.to.enums.Level;
// import lombok.Data;
// import lombok.EqualsAndHashCode;

// @Data
// @Entity
// @Table(name = "ticket")
// @EqualsAndHashCode(callSuper = false)
// public class Ticket extends BaseModel {
    

//     // all strings will be enums
//     @Id 
//     @Column(name = "ticket_id") 
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Integer id;   
    
//     @Column(name = "level", nullable = false)
//     @Enumerated(EnumType.STRING)
//     private Level level;


//     private User requester; // requester - solicitante?

//     // history
//         // requester should see change?
//         // time invested
//         // details
//         // owner
//         // receive updates?
//         // status - need one status that pause deadline

//     String location;

//     //Team team;

//     // each team has it's own services

//     // each service has it's own activities

//     // each service has its own itens

//     // each item has its own subitens

//     // file(s)

//     // details


//     private User owner;
    
//     private String deadline;

//     private String status;
// }
