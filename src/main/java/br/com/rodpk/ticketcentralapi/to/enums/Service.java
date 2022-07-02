package br.com.rodpk.ticketcentralapi.to.enums;

import java.time.LocalDateTime;

public enum Service {
    INCIDENT(LocalDateTime.now().plusDays(2)),
    SOLICITATION(LocalDateTime.now().plusDays(3));

    private LocalDateTime deadline;

    Service(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime deadline() {
        return this.deadline;
    }
}
