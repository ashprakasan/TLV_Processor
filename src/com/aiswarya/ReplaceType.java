package com.aiswarya;

/**
 * Class to handle "REPLCE" type.
 */
public class ReplaceType implements Type {

    @Override
    public String process(String inp) {
        return "REPLCE"+"-"+"THIS STRING";
    }
}
