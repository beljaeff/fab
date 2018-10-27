package us.cleansite.very.fab.acceptor;

/**
 * Holds configuration for some outer service call
 */
public class Acceptor1 extends AbstractAcceptor {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Acceptor1{auditUUID='" + getAuditUUID() + "';title='" + title + "'}";
    }
}
