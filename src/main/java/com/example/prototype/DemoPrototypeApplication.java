package com.example.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class DemoPrototypeApplication implements CommandLineRunner {
    private final HumanResources humanResources;

    public static void main(String[] args) {
        SpringApplication.run(DemoPrototypeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        humanResources.getWorker("a1").doJob();
        humanResources.getWorker("a2").doJob();
        humanResources.getWorker("a3").doJob();
    }
}
