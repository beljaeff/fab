package us.cleansite.very.fab.acceptor;

/**
 * Abstraction for acceptors. Holds audit context to send it
 * to outer service
 */
public class AbstractAcceptor {
    private String auditUUID;

    public String getAuditUUID() {
        return auditUUID;
    }

    public void setAuditUUID(String auditUUID) {
        this.auditUUID = auditUUID;
    }
}
