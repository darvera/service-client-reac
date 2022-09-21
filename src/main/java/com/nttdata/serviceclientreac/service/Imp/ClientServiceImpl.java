package com.nttdata.serviceclientreac.service.Imp;

import com.nttdata.serviceclientreac.dao.ClientRepository;
import com.nttdata.serviceclientreac.model.Client;
import com.nttdata.serviceclientreac.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Mono<Client> createBlog(Client client) {
        return null;
    }

    @Override
    public Mono<Client> updateClient(Client client, String idClient) {
        return clientRepository.findById(client.getIdClient())
                .switchIfEmpty(Mono.error(RuntimeException::new))
                .flatMap(v -> clientRepository.save(client));
    }

    @Override
    public Flux<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Mono<Client> findOne(String idClient) {
        return clientRepository.findById(idClient)
                .switchIfEmpty(Mono.error(RuntimeException::new));
    }

    @Override
    public Flux<Client> findByTitle(String title) {
        return null;
    }

    @Override
    public Mono<Void> delete(String id) {
        return clientRepository.findById(id)
                .switchIfEmpty(Mono.error(RuntimeException::new))
                .flatMap(x -> clientRepository.deleteById(id));
    }


}
