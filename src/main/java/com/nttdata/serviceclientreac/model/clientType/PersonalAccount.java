package com.nttdata.serviceclientreac.model.clientType;

import com.nttdata.serviceclientreac.model.Client;
import com.nttdata.serviceclientreac.model.ClientType;
import com.nttdata.serviceclientreac.model.EstrategyForClientType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@ToString(exclude = {"atCreate"})
//@Document(collection = "PersonalAccount") la colleccion se perteneces al Client estaria redundando en
public class PersonalAccount extends Client implements EstrategyForClientType {

    public PersonalAccount(){}
    public PersonalAccount(String dni,
                           String firstname,
                           String lastname){
        this.dni=dni;
        this.firstName=firstname;
        this.lastName=lastname;
        this.setClientType(getType());
    }
    @Override
    public ClientType getType() {
        return ClientType.PersonalAccount;
    }
}
