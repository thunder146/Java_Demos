package com.javademos.data;

public abstract class NamedBase {
    private String name = "";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
