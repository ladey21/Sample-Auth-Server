package com.dev.sampleauthserver.enums;

public enum Gender {
    MALE("male"),FEMALE("female"),OTHER("other");

    private String value;

    Gender(String value){
        this.value = value;
    }

    public static Gender getGenderFromString(String gender){
        if(gender.equalsIgnoreCase("male")) return Gender.MALE;
        else if(gender.equalsIgnoreCase("female")) return Gender.FEMALE;
        return Gender.OTHER;
    }
}
