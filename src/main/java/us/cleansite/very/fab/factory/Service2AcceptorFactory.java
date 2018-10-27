package us.cleansite.very.fab.factory;

import us.cleansite.very.fab.acceptor.Acceptor2;
import us.cleansite.very.fab.dto.SimpleDto2;

/**
 * Acceptor factory for Service2. Creates acceptors, used
 * in Service2
 */
class Service2AcceptorFactory extends AcceptorFactory {

    public Service2AcceptorFactory(String auditUUID) {
        super(auditUUID);
    }

    public Acceptor2 createAcceptor2(SimpleDto2 dto2) {
        Acceptor2 acceptor2 = new Acceptor2();
        acceptor2.setAuditUUID(getAuditUUID());
        acceptor2.setValue(dto2.getValue());
        return acceptor2;
    }
}
