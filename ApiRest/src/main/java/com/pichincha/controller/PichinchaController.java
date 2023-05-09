package com.pichincha.controller;

import com.pichincha.exception.PichinchaServiceException;
import com.pichincha.vo.InboundMessageVO;
import com.pichincha.vo.OutboundMessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@RequestMapping
public class PichinchaController {

    static final String HEADER_JWT= "X-JWT-KWY";
    static final String HEADER_API_KEY = "X-Parse-REST-API-Key";

    private final com.pichincha.service.PichinchaService pichinchaService;

    @Autowired
    public PichinchaController(com.pichincha.service.PichinchaService pichinchaService) {
        this.pichinchaService = pichinchaService;
    }

    @PostMapping("/DevOps")
    @ResponseStatus(HttpStatus.OK)
    public Mono<OutboundMessageVO> createMessage(@RequestBody final InboundMessageVO request,
                                                 @RequestHeader(HEADER_API_KEY) String apikey,
                                                 @RequestHeader(HEADER_JWT) String jwt) {
        if (apikey.equals("2f5ae96c-b558-4c7b-a590-a501ae1c3f6c") && jwt.equals("2f5ae96c-b558-4c7b-a590-a501ae1c3f6c")) {
            return Mono.just(pichinchaService.createMessage(request));
        } else {
            throw new PichinchaServiceException("Unauthorized");
        }
    }
}
