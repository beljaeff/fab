package us.cleansite.very.fab.service;

import us.cleansite.very.fab.acceptor.Acceptor2;
import us.cleansite.very.fab.dto.SimpleDto2;

/**
 * Service for front backend, which call some backend service,
 * configure it by acceptor, make some business logic
 * and retrieve result data to frontend
 */
public class Service2 extends AbstractService {

    public Service2(String auditUUID) {
        super(auditUUID);
    }

    public void call(SimpleDto2 dto2) {
        // Get acceptor for calling another outer service
        Acceptor2 acceptor = createAcceptor(Acceptor2.class, dto2);
        // Here we call some backend service with acceptor
        System.out.println(acceptor);
    }
}
