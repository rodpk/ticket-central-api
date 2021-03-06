package br.com.rodpk.ticketcentralapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Getter;

@Getter
@MappedSuperclass
public class BaseModel {

    @Column(name = "created_at", columnDefinition = "TIMESTAMP", nullable = false)
    LocalDateTime createdAt;

    @Column(name = "updated_at", columnDefinition = "TIMESTAMP")
    LocalDateTime updatedAt;

    @Column(name = "active", nullable = false)
    boolean active = true;

    @PrePersist
    private void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.active = true;
    }

    @PreUpdate
    private void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
