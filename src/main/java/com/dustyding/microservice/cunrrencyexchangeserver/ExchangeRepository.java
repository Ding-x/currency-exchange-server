package com.dustyding.microservice.cunrrencyexchangeserver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<ExchangeValue,Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
