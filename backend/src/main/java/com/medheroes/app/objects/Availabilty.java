package com.medheroes.app.objects;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
public class Availabilty {

    @Id
    @GeneratedValue
    public UUID availabiltyId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service service;

    private Instant fromTimestamp;
    private Instant toTimestamp;
}
