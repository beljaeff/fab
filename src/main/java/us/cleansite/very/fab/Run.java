package us.cleansite.very.fab;

import us.cleansite.very.fab.dto.SimpleDto1;
import us.cleansite.very.fab.dto.SimpleDto2;
import us.cleansite.very.fab.service.Service1;
import us.cleansite.very.fab.service.Service2;

import java.util.UUID;

public class Run {
    public static void main(String[] args) {
        Service1 service1 = new Service1(UUID.randomUUID().toString());
        SimpleDto1 dto1 = new SimpleDto1();
        dto1.setData("str");
        service1.exec(dto1);

        Service2 service2 = new Service2(UUID.randomUUID().toString());
        SimpleDto2 dto2 = new SimpleDto2();
        dto2.setValue(1000);
        service2.call(dto2);
    }
}