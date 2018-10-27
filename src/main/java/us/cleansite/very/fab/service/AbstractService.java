package us.cleansite.very.fab.service;

import us.cleansite.very.fab.factory.AcceptorFactory;

/**
 * Abstraction for service layer. Holds common beans for services
 * and audit context, which have to be send to outer services with acceptor
 */
abstract class AbstractService {
    private String auditUUID;

    AbstractService(String auditUUID) {
        this.auditUUID = auditUUID;
    }

    /**
     * Creates acceptor for calling some outer service
     * @param acceptorClass - acceptor class
     * @param data - data to cofigure outer service call
     * @param <S> - type of dto from which we configure acceptor
     * @param <T> - type of acceptor
     * @return appropriate acceptor
     */
    <S,T> T createAcceptor(Class<T> acceptorClass, S data) {
        return AcceptorFactory.create(getClass(), acceptorClass, auditUUID, data);
    }
}