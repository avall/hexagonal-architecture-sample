package com.delivery.presenter.binding;


import java.io.Serializable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PublisherService {

  private final StreamBridge streamBridge;

  public void send(Serializable event, String binding) {
    log.debug("sending {}", event);
    Message<Serializable> msg = MessageBuilder.withPayload(event).build();
    streamBridge.send(binding, msg);
  }
}
