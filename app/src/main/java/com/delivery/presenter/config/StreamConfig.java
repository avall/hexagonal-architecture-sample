package com.delivery.presenter.config;

import java.util.function.Consumer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StreamConfig {

        @Bean("execute-consumer")
        public Consumer<String> consume() {
            return data -> {
                System.out.println("Received: " + data);
            };
        }
}
