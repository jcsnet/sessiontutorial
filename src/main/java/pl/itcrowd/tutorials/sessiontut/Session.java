package pl.itcrowd.tutorials.sessiontut;


import javax.annotation.Resource;
import javax.ejb.*;
import java.util.logging.Logger;

@Stateless
public class Session implements CustomInterface {

    private static final Logger LOGGER = Logger.getLogger(MySingleton.class.getCanonicalName());

    @Resource
    SessionContext sessionContext;

    public void test()
    {
       LOGGER.info("getInvokedBusinessInterface :" + sessionContext.getInvokedBusinessInterface());
        //return interface pl.itcrowd.tutorials.ejb.CustomInterface

//        LOGGER.info("wasCancelCalled :" + sessionContext.wasCancelCalled()); //This throws NPE

        LOGGER.info("getCallerPrincipal :" + sessionContext.getCallerPrincipal());
        // return anonymous

        LOGGER.info("getContextData : " + sessionContext.getContextData());
        // return getContextData : {}

        LOGGER.info("getTimerService : " + sessionContext.getTimerService());
        // return org.jboss.as.ejb3.timerservice.TimerServiceImpl@13437ab2
    }

}
