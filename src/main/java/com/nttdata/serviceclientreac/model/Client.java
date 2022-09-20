package com.nttdata.serviceclientreac.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString(exclude = {"idClient"}) //generate automatic id for client
//@Document(collection = "client")

public class Client {
    @Id
    private String idClient;
    public String dni;
    public String firstName;
    public String lastName;
    private ClientType clientType;
    private LocalDateTime createAt;


    public LocalDateTime getcreateAt() {
        return LocalDateTime.now();
    }
}
