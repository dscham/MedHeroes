package com.medheroes.app.repos;

import com.medheroes.app.objects.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IClientRepository extends CrudRepository<Client, UUID> {
}
