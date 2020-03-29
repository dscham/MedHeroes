package com.medheroes.app.objects;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private UUID bookingId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Service service;
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    private Instant fromTimestamp;
    private Instant toTimestamp;
}
