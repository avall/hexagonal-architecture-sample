package com.delivery.presenter;

import java.util.TimeZone;
import java.util.function.Consumer;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {
    "com.delivery.core.usecases",
    "com.delivery.core.mappers",
    "com.delivery.presenter",
    "com.delivery.presenter.mappers",
    "com.delivery.database"} ,
    exclude = {RabbitAutoConfiguration.class}
)
public class Application {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Consumer<String> log() {
        return data -> {
            System.out.println("Received: " + data);
        };
    }
}
