package com.nttdata.serviceclientreac.controller;

import com.nttdata.serviceclientreac.model.Client;
import com.nttdata.serviceclientreac.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1/client")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping
    public Flux<Client> findAll() {
        log.debug("findAll Blog");
        return clientService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Client> findById(@PathVariable("id") String idClient){
        return clientService.findOne(idClient);
    }

    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return clientService.delete(id);
    }

    @PutMapping()
    public Mono<Client> update(@RequestBody Client client){
        //return clientService.updateClient(client);
        return null;
    }


}
