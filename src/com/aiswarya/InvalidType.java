package com.aiswarya;

/**
 * Created by ashprakasan on 03/12/17.
 * Class to handle Invalid tag input.
 */
public class InvalidType implements Type {
    @Override
    public String process(String inp) {
        return "Type not valid";
    }
}
