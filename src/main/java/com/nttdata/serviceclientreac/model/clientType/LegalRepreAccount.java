package com.nttdata.serviceclientreac.model.clientType;

import com.nttdata.serviceclientreac.model.Client;
import com.nttdata.serviceclientreac.model.ClientType;
import com.nttdata.serviceclientreac.model.EstrategyForClientType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@ToString(exclude = { "atCreate"})
//@Document(collection = "legalrepre_account")
public class LegalRepreAccount extends Client implements EstrategyForClientType {
    private String ruc;
    //private List<Client> clients;

    private String firma;
    private String description;
    public  LegalRepreAccount(){}
    public  LegalRepreAccount(String dni,
                              String firstname,
                              String lastname,
                              String ruc,
                              String description,
                              String firma){
        this.dni=dni;
        this.firstName=firstname;
        this.lastName=lastname;

        this.ruc=ruc;
        this.description=description;
        this.firma=firma;
        this.setClientType(getType());
    }
    @Override
    public ClientType getType() {
        return ClientType.LegalRepreAccount;
    }

}
