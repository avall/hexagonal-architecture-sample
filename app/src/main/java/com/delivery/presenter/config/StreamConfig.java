package com.delivery.presenter.config;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StreamConfig {

        @Bean
        public Consumer<String> consumer() {
            return event -> {
                System.out.println("Event Received: " + event);
            };
        }
}
