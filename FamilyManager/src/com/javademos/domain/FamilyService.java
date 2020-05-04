package com.javademos.domain;

import com.javademos.data.Family;
import com.javademos.data.Person;
import org.jetbrains.annotations.NotNull;

public class FamilyService {
    public FamilyService(){

    }

    public void addMember(@NotNull Family family, @NotNull Person person){
        family.getMembers().add(person);
    }

    public void removeMember(@NotNull Family family, @NotNull Person person){
        if(family.getMembers().contains(person)) {
            family.getMembers().remove(person);
        }
    }

    public Family createFamily(@NotNull String familyName) {
        return new Family(familyName);
    }
}
