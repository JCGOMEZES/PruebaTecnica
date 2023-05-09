package com.pichincha.vo;

import lombok.*;

import java.io.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InboundMessageVO implements Serializable {
    private String message;
    private String to;
    private String from;
    private Long timeToLifeSec;
}
