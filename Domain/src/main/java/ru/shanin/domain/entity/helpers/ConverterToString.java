package ru.shanin.domain.entity.helpers;

import com.google.gson.GsonBuilder;

public class ConverterToString {
    public static <T> String makeJsonString(T input){
        return (new GsonBuilder().setPrettyPrinting().create()).toJson(input);
    }
}
