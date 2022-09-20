package com.nttdata.serviceclientreac.model.clientType;

import com.nttdata.serviceclientreac.model.Client;
import com.nttdata.serviceclientreac.model.ClientType;
import com.nttdata.serviceclientreac.model.EstrategyForClientType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@ToString(exclude = {"atCreate"})
//@Document(collection = "enterprise_account") // <<--- el padre lle
public class EnterpriseAccount extends Client implements EstrategyForClientType {
//    public class EnterpriseAccount extends Client{ error for relationship

    String ruc;
    String description;
    public EnterpriseAccount(){}
    public EnterpriseAccount(String dni,
                             String firstname,
                             String lastname,
                             String ruc,
                             String description){
        this.dni=dni;
        this.firstName=firstname;
        this.lastName=lastname;
        this.ruc=ruc;
        this.description=description;
        this.setClientType(getType());
    }

    @Override
    public ClientType getType() {
        return ClientType.EnterpriseAccount;
    }

}
