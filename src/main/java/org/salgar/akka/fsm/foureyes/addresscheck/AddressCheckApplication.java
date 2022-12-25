package org.salgar.akka.fsm.foureyes.addresscheck;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@Slf4j

public class AddressCheckApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AddressCheckApplication.class)
                .registerShutdownHook(true)
                .run(args);
        log.info("Started the application!");
    }
}