package com.example;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkiverse.loggingjson.providers.KeyValueStructuredArgument;
import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class AppLifecycleBean {
    private static final Logger logger = LoggerFactory.getLogger(AppLifecycleBean.class);

    void onStart(@Observes final StartupEvent ev) {
        logger.info("The application is starting...");
        logger.info("Testing JSON logging", KeyValueStructuredArgument.kv("simpleobject", new SimpleObject("testing")));
        logger.info("Testing JSON logging",
                KeyValueStructuredArgument.kv("demoobject", new DataObject(LocalDate.now())));
    }

    void onStop(@Observes final ShutdownEvent ev) {
        logger.info("The application is stopping...");
    }
}