package us.cleansite.very.fab.service;

import us.cleansite.very.fab.acceptor.Acceptor1;
import us.cleansite.very.fab.dto.SimpleDto1;

/**
 * Service for front backend, which call some backend service,
 * configure it by acceptor, make some business logic
 * and retrieve result data to frontend
 */
public class Service1 extends AbstractService {

    public Service1(String auditUUID) {
        super(auditUUID);
    }

    public void exec(SimpleDto1 dto1) {
        // Get acceptor for calling outer service
        Acceptor1 acceptor = createAcceptor(Acceptor1.class, dto1);
        // Here we call outer service and return result
        System.out.println(acceptor);
    }
}