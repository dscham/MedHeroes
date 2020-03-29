package com.medheroes.app.objects;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Client implements IUser {

    private final EUserType type = EUserType.CLIENT;

    @Id
    @GeneratedValue
    private UUID clientId;
    private String name;
    private String description;
    private String contact;
    @OneToMany(targetEntity = Booking.class, cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Booking> bookings;
}
