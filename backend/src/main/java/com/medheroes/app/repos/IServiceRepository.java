package com.medheroes.app.repos;

import com.medheroes.app.objects.Service;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface IServiceRepository extends CrudRepository<Service, UUID> {
}
