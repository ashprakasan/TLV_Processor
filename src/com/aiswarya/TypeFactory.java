package com.aiswarya;

/**
 * Created by ashprakasan on 03/12/17.
 */
public class TypeFactory {
    static Type createType(String typeName){
        switch(typeName){
            case "UPPRCS":
                return new UpperCaseType();
            case "REPLCE":
                return new ReplaceType();
            default:
                return new InvalidType();
        }
    }
}
