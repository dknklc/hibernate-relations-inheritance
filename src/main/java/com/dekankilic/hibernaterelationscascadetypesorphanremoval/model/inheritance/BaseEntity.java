package com.dekankilic.hibernaterelationscascadetypesorphanremoval.model.inheritance;

import jakarta.annotation.PreDestroy;
import jakarta.persistence.*;
import java.time.OffsetDateTime;


@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private Boolean deleted;

    @PrePersist
    protected void prePersist(){
        createdAt = OffsetDateTime.now();
        this.deleted = false;
    }

    @PreUpdate
    protected void preUpdate(){
        updatedAt = OffsetDateTime.now();
    }

    @PreDestroy
    protected void preDestroy(){
        this.deleted = true;
    }
}
