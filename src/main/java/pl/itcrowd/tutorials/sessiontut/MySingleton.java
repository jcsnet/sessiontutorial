package pl.itcrowd.tutorials.sessiontut;

import javax.annotation.PostConstruct;
import javax.ejb.*;


import java.util.logging.Logger;

@Startup
@Singleton
public class MySingleton{

    private static final Logger LOGGER = Logger.getLogger(MySingleton.class.getCanonicalName());

    @EJB
    CustomInterface session;

    @TransactionAttribute(TransactionAttributeType.NEVER )
    @PostConstruct
    public void onCreate()
    {
        session.test();
    }
}