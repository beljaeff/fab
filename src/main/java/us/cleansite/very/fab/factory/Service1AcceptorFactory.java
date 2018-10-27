package us.cleansite.very.fab.factory;

import us.cleansite.very.fab.acceptor.Acceptor1;
import us.cleansite.very.fab.dto.SimpleDto1;

/**
 * Acceptor factory for Service1. Creates acceptors, used
 * in Service1
 */
class Service1AcceptorFactory extends AcceptorFactory {

    public Service1AcceptorFactory(String auditUUID) {
        super(auditUUID);
    }

    public Acceptor1 createAcceptor1(SimpleDto1 dto1) {
        Acceptor1 acceptor1 = new Acceptor1();
        acceptor1.setAuditUUID(getAuditUUID());
        acceptor1.setTitle(dto1.getData());
        return acceptor1;
    }
}
