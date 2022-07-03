package br.com.rodpk.ticketcentralapi.to;

public record UserRequest(
    String name,
    String email,
    String password,
    String role
) { }
