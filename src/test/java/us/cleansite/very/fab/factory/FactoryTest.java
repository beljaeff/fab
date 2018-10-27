package us.cleansite.very.fab.factory;

import org.junit.Test;
import us.cleansite.very.fab.acceptor.Acceptor1;
import us.cleansite.very.fab.acceptor.Acceptor2;
import us.cleansite.very.fab.dto.SimpleDto1;
import us.cleansite.very.fab.dto.SimpleDto2;
import us.cleansite.very.fab.service.Service1;
import us.cleansite.very.fab.service.Service2;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class FactoryTest {

    @Test
    public void service1Test() {
        String data = "data";
        String uuid = "uuid";
        SimpleDto1 dto1 = new SimpleDto1();
        dto1.setData(data);
        Acceptor1 acceptor1 = AcceptorFactory.create(Service1.class, Acceptor1.class, uuid, dto1);
        assertNotNull(acceptor1);
        assertEquals(acceptor1.getClass(), Acceptor1.class);
        assertEquals(acceptor1.getTitle(), data);
        assertEquals(acceptor1.getAuditUUID(), uuid);
    }

    @Test
    public void service2Test() {
        Integer value = 1000;
        String uuid = "uuid";
        SimpleDto2 dto2 = new SimpleDto2();
        dto2.setValue(value);
        Acceptor2 acceptor2 = AcceptorFactory.create(Service2.class, Acceptor2.class, uuid, dto2);
        assertNotNull(acceptor2);
        assertEquals(acceptor2.getClass(), Acceptor2.class);
        assertEquals(acceptor2.getValue(), value);
        assertEquals(acceptor2.getAuditUUID(), uuid);
    }
}
