package com.dustyding.microservice.cunrrencyexchangeserver;

import java.math.BigDecimal;

public class ExchangeValue {
    private String from, to;
    private Long id;
    private BigDecimal conversionMultiple;
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(String from, String to, Long id, BigDecimal conversionMultiple) {
        this.from = from;
        this.to = to;
        this.id = id;
        this.conversionMultiple = conversionMultiple;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
