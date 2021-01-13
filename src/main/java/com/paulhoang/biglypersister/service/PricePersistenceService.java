package com.paulhoang.biglypersister.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PricePersistenceService {

  @KafkaListener(topics = "company_price", groupId = "bigly-persister")
  public void persistCompanyPriceData(@Payload String payload) {
    System.out.println(payload);
  }
}
