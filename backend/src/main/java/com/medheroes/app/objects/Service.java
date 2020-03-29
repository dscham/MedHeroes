package com.medheroes.app.objects;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Service implements IUser {

    private final EUserType type = EUserType.SERVICE;

    @Id
    @GeneratedValue
    private UUID serviceId;

    private String fullName;
    private Instant dateOfBirth;
    private String registeredAddress;
    private String currentAddress;
    private String description;
    private String profession;
    @OneToMany(targetEntity = Availabilty.class, cascade = CascadeType.ALL, mappedBy = "service")
    private Set<Availabilty> availabilties;
    @OneToMany(targetEntity = Booking.class, cascade = CascadeType.ALL, mappedBy = "service")
    private Set<Booking> bookings;
}
