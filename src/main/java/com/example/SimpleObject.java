package com.example;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class SimpleObject {
    private String demo;

    public SimpleObject(final String _demo) {
        demo = _demo;
    }

    public void setDemo(final String demo) {
        this.demo = demo;
    }

    public String getDemo() {
        return demo;
    }
}
