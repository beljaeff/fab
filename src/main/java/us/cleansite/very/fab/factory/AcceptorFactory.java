package us.cleansite.very.fab.factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Abstraction for acceptor factories.
 * Each acceptor factory class name have to consist of two parts:
 *  - first part is a service class name this factory maintain;
 *  - second part is a "AcceptorFactory" keyword.
 * Each create acceptor method name have to consist of two parts:
 *  - first part is a "create" keyword;
 *  - second part is a acceptor class name method creates.
 */
public class AcceptorFactory {

    /**
     * Postfix to concrete factory for concrete service
     */
    private static final String CLASS_POSTFIX = "AcceptorFactory";

    /**
     * Prefix for method creates acceptor
     */
    private static final String METHOD_PREFIX = "create";

    private String auditUUID;

    AcceptorFactory(String auditUUID) {
        this.auditUUID = auditUUID;
    }

    String getAuditUUID() {
        return auditUUID;
    }

    /**
     * Interface for creating acceptor
     * @param serviceClass - class for a service requests acceptor
     * @param acceptorClass - acceptor class
     * @param auditUUID - current audit context UUID
     * @param data - necessary data for acceptor creating
     * @param <R> - data type
     * @param <S> - acceptor type
     * @param <T> - service type
     * @return created acceptor
     */
    public static <R,S,T> S create(Class<T> serviceClass, Class<S> acceptorClass, String auditUUID, R data) {
        try {
            // Get a class for a concrete acceptor factory
            Class<?> factoryClass = Class.forName(AcceptorFactory.class.getPackageName() + "." +
                    serviceClass.getSimpleName() + CLASS_POSTFIX);
            // Create concrete acceptor factory
            Object factory = factoryClass.getConstructor(String.class).newInstance(auditUUID);
            // Get a method name which can create acceptor
            String methodName = METHOD_PREFIX + acceptorClass.getSimpleName();
            // Create acceptor via calling this method
            Object acceptor = factoryClass.getMethod(methodName, data.getClass()).invoke(factory, data);
            return acceptorClass.cast(acceptor);
        }
        catch (ClassNotFoundException|NoSuchMethodException|InstantiationException|IllegalAccessException|InvocationTargetException e) {
            throw new IllegalArgumentException(e);
        }
    }
}