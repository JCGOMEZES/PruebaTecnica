package com.pichincha.service;

import com.pichincha.util.EntityBuilder;
import com.pichincha.vo.InboundMessageVO;
import com.pichincha.vo.OutboundMessageVO;
import org.junit.*;

import static org.junit.Assert.assertNotNull;

public class PichinchaServiceTest {

    private PichinchaService testService;

    private void initializeEmployeeService() {
        testService = new PichinchaService();
    }

    @Test
    public void createMessage() {
        initializeEmployeeService();
        InboundMessageVO inboundMessage = buildInboundMessage();
        assertNotNull(testService.createMessage(inboundMessage));
    }

    public OutboundMessageVO buildIOutoundMessage() {
        OutboundMessageVO outboundMessage = EntityBuilder.of(OutboundMessageVO::new, OutboundMessageVO.class)
                            .withModifier(OutboundMessageVO::setMessage, "")
                            .build();
        return outboundMessage;
    }

    public InboundMessageVO buildInboundMessage() {
        InboundMessageVO inboundMessage = EntityBuilder.of(InboundMessageVO::new, InboundMessageVO.class)
                .withModifier(InboundMessageVO::setMessage, "Hello")
                .withModifier(InboundMessageVO::setFrom, "Juan Perez")
                .withModifier(InboundMessageVO::setTo, "Rita Asturia")
                .withModifier(InboundMessageVO::setTimeToLifeSec, 45L)
                .build();
        return inboundMessage;
    }
}
