package com.aiswarya;

/**
 * Created by ashprakasan on 03/12/17.
 */
public class UpperCaseType implements Type {

    @Override
    public String process(String inp) {
        return "UPPRCS"+"-"+inp.toUpperCase();
    }
}
