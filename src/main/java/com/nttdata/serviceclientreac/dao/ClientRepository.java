package com.nttdata.serviceclientreac.dao;

import com.nttdata.serviceclientreac.model.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends ReactiveMongoRepository<Client, String> {
}
