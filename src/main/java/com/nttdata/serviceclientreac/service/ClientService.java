package com.nttdata.serviceclientreac.service;

import com.nttdata.serviceclientreac.model.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Client> createBlog(Client client);

    Mono<Client> updateClient(Client client, String idClient);

    Flux<Client> findAll();

    Mono<Client> findOne(String idClient);

    Flux<Client> findByTitle(String lastname);

    Mono<Void> delete(String id);
}
