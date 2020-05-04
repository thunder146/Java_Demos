package com.javademos.data;

public abstract class NamedBase {
    private String name;

    public NamedBase(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
