package us.cleansite.very.fab.acceptor;

/**
 * Holds configuration for some outer service call
 */
public class Acceptor2 extends AbstractAcceptor {
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer data) {
        this.value = data;
    }

    @Override
    public String toString() {
        return "Acceptor2{auditUUID='" + getAuditUUID() + "';value:'" + value + "'}";
    }
}
