package com.pichincha.service;

import com.pichincha.vo.InboundMessageVO;
import com.pichincha.vo.OutboundMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PichinchaService implements Serializable {

    @Autowired
    public PichinchaService() {}

    public OutboundMessageVO createMessage(InboundMessageVO message) throws com.pichincha.exception.PichinchaServiceException {
        return new OutboundMessageVO("Hello " + message.getFrom() + " your message will be send");
    }
}
