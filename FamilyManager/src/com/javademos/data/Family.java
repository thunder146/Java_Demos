package com.javademos.data;

import java.util.ArrayList;
import java.util.List;

public class Family extends NamedBase{

    private List<Person> members = new ArrayList<>();

    public Family(String familyName){
        super(familyName);
    }

    public List<Person> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "members=" + members +
                '}';
    }
}
