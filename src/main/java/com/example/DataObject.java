package com.example;

import java.time.LocalDate;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class DataObject {
    private LocalDate demo;

    public DataObject(final LocalDate _demo) {
        demo = _demo;
    }

    public void setDemo(final LocalDate demo) {
        this.demo = demo;
    }

    public LocalDate getDemo() {
        return demo;
    }
}
