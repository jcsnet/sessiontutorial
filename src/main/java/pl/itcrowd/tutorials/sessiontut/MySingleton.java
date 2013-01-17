package pl.itcrowd.tutorials.sessiontut;


import javax.annotation.PostConstruct;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

public class MySingleton {

    CustomInterface session;

    @TransactionAttribute(TransactionAttributeType.NEVER )
    @PostConstruct
    public void onCreate()
    {
        session.test();

    }

}
