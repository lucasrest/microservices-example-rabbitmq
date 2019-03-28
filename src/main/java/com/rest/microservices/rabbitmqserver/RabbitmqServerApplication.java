package com.rest.microservices.rabbitmqserver;

import com.rest.microservices.rabbitmqserver.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableRabbit
@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties(value = RabbitConfig.class)
public class RabbitmqServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqServerApplication.class, args);
    }

}
